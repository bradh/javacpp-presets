// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// #else
// #endif

// Arena allocator. Arena allocation replaces ordinary (heap-based) allocation
// with new/delete, and improves performance by aggregating allocations into
// larger blocks and freeing allocations all at once. Protocol messages are
// allocated on an arena by using Arena::CreateMessage<T>(Arena*), below, and
// are automatically freed when the arena is destroyed.
//
// This is a thread-safe implementation: multiple threads may allocate from the
// arena concurrently. Destruction is not thread-safe and the destructing
// thread must synchronize with users of the arena first.
//
// An arena provides two allocation interfaces: CreateMessage<T>, which works
// for arena-enabled proto2 message types as well as other types that satisfy
// the appropriate protocol (described below), and Create<T>, which works for
// any arbitrary type T. CreateMessage<T> is better when the type T supports it,
// because this interface (i) passes the arena pointer to the created object so
// that its sub-objects and internal allocations can use the arena too, and (ii)
// elides the object's destructor call when possible. Create<T> does not place
// any special requirements on the type T, and will invoke the object's
// destructor when the arena is destroyed.
//
// The arena message allocation protocol, required by CreateMessage<T>, is as
// follows:
//
// - The type T must have (at least) two constructors: a constructor with no
//   arguments, called when a T is allocated on the heap; and a constructor with
//   a Arena* argument, called when a T is allocated on an arena. If the
//   second constructor is called with a NULL arena pointer, it must be
//   equivalent to invoking the first (no-argument) constructor.
//
// - The type T must have a particular type trait: a nested type
//   |InternalArenaConstructable_|. This is usually a typedef to |void|. If no
//   such type trait exists, then the instantiation CreateMessage<T> will fail
//   to compile.
//
// - The type T *may* have the type trait |DestructorSkippable_|. If this type
//   trait is present in the type, then its destructor will not be called if and
//   only if it was passed a non-NULL arena pointer. If this type trait is not
//   present on the type, then its destructor is always called when the
//   containing arena is destroyed.
//
// - One- and two-user-argument forms of CreateMessage<T>() also exist that
//   forward these constructor arguments to T's constructor: for example,
//   CreateMessage<T>(Arena*, arg1, arg2) forwards to a constructor T(Arena*,
//   arg1, arg2).
//
// This protocol is implemented by all arena-enabled proto2 message classes as
// well as protobuf container types like RepeatedPtrField and Map. The protocol
// is internal to protobuf and is not guaranteed to be stable. Non-proto types
// should not rely on this protocol.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Arena extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Arena(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Arena(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Arena position(long position) {
        return (Arena)super.position(position);
    }

  // Arena constructor taking custom options. See ArenaOptions below for
  // descriptions of the options available.
  public Arena(@Const @ByRef ArenaOptions options) { super((Pointer)null); allocate(options); }
  private native void allocate(@Const @ByRef ArenaOptions options);

  // Block overhead.  Use this as a guide for how much to over-allocate the
  // initial block if you want an allocation of size N to fit inside it.
  //
  // WARNING: if you allocate multiple objects, it is difficult to guarantee
  // that a series of allocations will fit in the initial block, especially if
  // Arena changes its alignment guarantees in the future!
  @MemberGetter public static native @Cast("const size_t") long kBlockOverhead();
  public static final long kBlockOverhead = kBlockOverhead();

  // Default constructor with sensible default options, tuned for average
  // use-cases.
  public Arena() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void Init(@Const @ByRef ArenaOptions options);

  // API to create proto2 message objects on the arena. If the arena passed in
  // is NULL, then a heap allocated object is returned. Type T must be a message
  // defined in a .proto file with cc_enable_arenas set to true, otherwise a
  // compilation error will occur.
  //
  // RepeatedField and RepeatedPtrField may also be instantiated directly on an
  // arena with this method.
  //
  // This function also accepts any type T that satisfies the arena message
  // allocation protocol, documented above.

  // API to create any objects on the arena. Note that only the object will
  // be created on the arena; the underlying ptrs (in case of a proto2 message)
  // will be still heap allocated. Proto messages should usually be allocated
  // with CreateMessage<T>() instead.
  //
  // Note that even if T satisfies the arena message construction protocol
  // (InternalArenaConstructable_ trait and optional DestructorSkippable_
  // trait), as described above, this function does not follow the protocol;
  // instead, it treats T as a black-box type, just as if it did not have these
  // traits. Specifically, T's constructor arguments will always be only those
  // passed to Create<T>() -- no additional arena pointer is implicitly added.
  // Furthermore, the destructor will always be called at arena destruction time
  // (unless the destructor is trivial). Hence, from T's point of view, it is as
  // if the object were allocated on the heap (except that the underlying memory
  // is obtained from the arena).

  // Create an array of object type T on the arena *without* invoking the
  // constructor of T. If `arena` is null, then the return value should be freed
  // with `delete[] x;` (or `::operator delete[](x);`).
  // To ensure safe uses, this function checks at compile time
  // (when compiled as C++11) that T is trivially default-constructible and
  // trivially destructible.

  // Returns the total space allocated by the arena, which is the sum of the
  // sizes of the underlying blocks. This method is relatively fast; a counter
  // is kept as blocks are allocated.
  public native @Cast("google::protobuf::uint64") long SpaceAllocated();
  // Returns the total space used by the arena. Similar to SpaceAllocated but
  // does not include free space and block overhead. The total space returned
  // may not include space used by other threads executing concurrently with
  // the call to this method.
  public native @Cast("google::protobuf::uint64") long SpaceUsed();
  // DEPRECATED. Please use SpaceAllocated() and SpaceUsed().
  //
  // Combines SpaceAllocated and SpaceUsed. Returns a pair of
  // <space_allocated, space_used>.
  public native @ByVal LongLongPair SpaceAllocatedAndUsed();

  // Frees all storage allocated by this arena after calling destructors
  // registered with OwnDestructor() and freeing objects registered with Own().
  // Any objects allocated on this arena are unusable after this call. It also
  // returns the total space used by the arena which is the sums of the sizes
  // of the allocated blocks. This method is not thread-safe.
  public native @Cast("google::protobuf::uint64") long Reset();

  // Adds |object| to a list of heap-allocated objects to be freed with |delete|
  // when the arena is destroyed or reset.

  // Adds |object| to a list of objects whose destructors will be manually
  // called when the arena is destroyed or reset. This differs from Own() in
  // that it does not free the underlying memory with |delete|; hence, it is
  // normally only used for objects that are placement-newed into
  // arena-allocated memory.

  // Adds a custom member function on an object to the list of destructors that
  // will be manually called when the arena is destroyed or reset. This differs
  // from OwnDestructor() in that any member function may be specified, not only
  // the class destructor.
  public static class Destruct_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Destruct_Pointer(Pointer p) { super(p); }
      protected Destruct_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0);
  }
  public native void OwnCustomDestructor(Pointer object,
                                               Destruct_Pointer destruct);

  // Retrieves the arena associated with |value| if |value| is an arena-capable
  // message, or NULL otherwise. If possible, the call resolves at compile time.
  // Note that we can often devirtualize calls to `value->GetArena()` so usually
  // calling this method is unnecessary.

  // Helper typetraits that indicates support for arenas in a type T at compile
  // time. This is public only to allow construction of higher-level templated
  // utilities.
  //
  // is_arena_constructable<T>::value is true if the message type T has arena
  // support enabled, and false otherwise.
  //
  // is_destructor_skippable<T>::value is true if the message type T has told
  // the arena that it is safe to skip the destructor, and false otherwise.
  //
  // This is inside Arena because only Arena has the friend relationships
  // necessary to see the underlying generated code traits.
}
