// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OperatorProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperatorProto position(long position) {
        return (OperatorProto)super.position(position);
    }

  public OperatorProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OperatorProto(@Const @ByRef OperatorProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OperatorProto from);

  public native @ByRef @Name("operator =") OperatorProto put(@Const @ByRef OperatorProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef OperatorProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OperatorProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(OperatorProto other);
  

  // implements Message ----------------------------------------------

  public native OperatorProto New();

  public native OperatorProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OperatorProto from);
  public native void MergeFrom(@Const @ByRef OperatorProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string op_type = 1;
  public native @Cast("bool") boolean has_op_type();
  public native void clear_op_type();
  @MemberGetter public static native int kOpTypeFieldNumber();
  public static final int kOpTypeFieldNumber = kOpTypeFieldNumber();
  public native @StdString BytePointer op_type();
  public native void set_op_type(@StdString BytePointer value);
  public native void set_op_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_op_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_op_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_op_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_op_type();
  public native void set_allocated_op_type(@StdString @Cast({"char*", "std::string*"}) BytePointer op_type);

  // optional string doc_string = 10;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  @MemberGetter public static native int kDocStringFieldNumber();
  public static final int kDocStringFieldNumber = kDocStringFieldNumber();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional int64 since_version = 2;
  public native @Cast("bool") boolean has_since_version();
  public native void clear_since_version();
  @MemberGetter public static native int kSinceVersionFieldNumber();
  public static final int kSinceVersionFieldNumber = kSinceVersionFieldNumber();
  public native @Cast("google::protobuf::int64") long since_version();
  public native void set_since_version(@Cast("google::protobuf::int64") long value);

  // optional .onnx.OperatorStatus status = 3;
  public native @Cast("bool") boolean has_status();
  public native void clear_status();
  @MemberGetter public static native int kStatusFieldNumber();
  public static final int kStatusFieldNumber = kStatusFieldNumber();
  public native @Cast("onnx::OperatorStatus") int status();
  public native void set_status(@Cast("onnx::OperatorStatus") int value);
}
