// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Randomly shuffles a tensor along its first dimension.
 * 
 *    The tensor is shuffled along dimension 0, such that each {@code value[j]} is mapped
 *    to one and only one {@code output[i]}. For example, a mapping that might occur for a
 *    3x2 tensor is:
 * 
 *  <pre>{@code
 *  [[1, 2],       [[5, 6],
 *   [3, 4],  ==>   [1, 2],
 *   [5, 6]]        [3, 4]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * value: The tensor to be shuffled.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either {@code seed} or {@code seed2} are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: A second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output}: A tensor of same shape and type as {@code value}, shuffled along its first
 *  dimension. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomShuffle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomShuffle(Pointer p) { super(p); }

  /** Optional attribute setters for RandomShuffle */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If either {@code seed} or {@code seed2} are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** A second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public RandomShuffle(@Const @ByRef Scope scope, @ByVal Input value) { super((Pointer)null); allocate(scope, value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value);
  public RandomShuffle(@Const @ByRef Scope scope, @ByVal Input value,
                @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, value, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
                @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native RandomShuffle operation(Operation setter);
  public native @ByRef Output output(); public native RandomShuffle output(Output setter);
}
