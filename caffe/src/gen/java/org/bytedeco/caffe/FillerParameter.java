// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FillerParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FillerParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FillerParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FillerParameter position(long position) {
        return (FillerParameter)super.position(position);
    }

  public FillerParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FillerParameter(@Const @ByRef FillerParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FillerParameter from);

  public native @ByRef @Name("operator =") FillerParameter put(@Const @ByRef FillerParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef FillerParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FillerParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(FillerParameter other);
  

  // implements Message ----------------------------------------------

  public native final FillerParameter New();

  public native final FillerParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef FillerParameter from);
  public native void MergeFrom(@Const @ByRef FillerParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::FillerParameter::VarianceNorm") int FAN_IN();
  public static final int FAN_IN = FAN_IN();
  @MemberGetter public static native @Cast("const caffe::FillerParameter::VarianceNorm") int FAN_OUT();
  public static final int FAN_OUT = FAN_OUT();
  @MemberGetter public static native @Cast("const caffe::FillerParameter::VarianceNorm") int AVERAGE();
  public static final int AVERAGE = AVERAGE();
  public static native @Cast("bool") boolean VarianceNorm_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::FillerParameter::VarianceNorm") int VarianceNorm_MIN();
  public static final int VarianceNorm_MIN = VarianceNorm_MIN();
  @MemberGetter public static native @Cast("const caffe::FillerParameter::VarianceNorm") int VarianceNorm_MAX();
  public static final int VarianceNorm_MAX = VarianceNorm_MAX();
  @MemberGetter public static native int VarianceNorm_ARRAYSIZE();
  public static final int VarianceNorm_ARRAYSIZE = VarianceNorm_ARRAYSIZE();
  public static native @Const EnumDescriptor VarianceNorm_descriptor();
  public static native @StdString BytePointer VarianceNorm_Name(@Cast("caffe::FillerParameter::VarianceNorm") int value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString BytePointer name,
        @Cast("caffe::FillerParameter::VarianceNorm*") IntPointer value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString String name,
        @Cast("caffe::FillerParameter::VarianceNorm*") IntBuffer value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString BytePointer name,
        @Cast("caffe::FillerParameter::VarianceNorm*") int[] value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString String name,
        @Cast("caffe::FillerParameter::VarianceNorm*") IntPointer value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString BytePointer name,
        @Cast("caffe::FillerParameter::VarianceNorm*") IntBuffer value);
  public static native @Cast("bool") boolean VarianceNorm_Parse(@StdString String name,
        @Cast("caffe::FillerParameter::VarianceNorm*") int[] value);

  // accessors -------------------------------------------------------

  // optional string type = 1 [default = "constant"];
  public native @Cast("bool") boolean has_type();
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @StdString BytePointer type();
  public native void set_type(@StdString BytePointer value);
  public native void set_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type();
  public native void set_allocated_type(@StdString @Cast({"char*", "std::string*"}) BytePointer type);

  // optional float value = 2 [default = 0];
  public native @Cast("bool") boolean has_value();
  public native void clear_value();
  @MemberGetter public static native int kValueFieldNumber();
  public static final int kValueFieldNumber = kValueFieldNumber();
  public native float value();
  public native void set_value(float value);

  // optional float min = 3 [default = 0];
  public native @Cast("bool") boolean has_min();
  public native void clear_min();
  @MemberGetter public static native int kMinFieldNumber();
  public static final int kMinFieldNumber = kMinFieldNumber();
  public native float min();
  public native void set_min(float value);

  // optional float mean = 5 [default = 0];
  public native @Cast("bool") boolean has_mean();
  public native void clear_mean();
  @MemberGetter public static native int kMeanFieldNumber();
  public static final int kMeanFieldNumber = kMeanFieldNumber();
  public native float mean();
  public native void set_mean(float value);

  // optional .caffe.FillerParameter.VarianceNorm variance_norm = 8 [default = FAN_IN];
  public native @Cast("bool") boolean has_variance_norm();
  public native void clear_variance_norm();
  @MemberGetter public static native int kVarianceNormFieldNumber();
  public static final int kVarianceNormFieldNumber = kVarianceNormFieldNumber();
  public native @Cast("caffe::FillerParameter_VarianceNorm") int variance_norm();
  public native void set_variance_norm(@Cast("caffe::FillerParameter_VarianceNorm") int value);

  // optional int32 sparse = 7 [default = -1];
  public native @Cast("bool") boolean has_sparse();
  public native void clear_sparse();
  @MemberGetter public static native int kSparseFieldNumber();
  public static final int kSparseFieldNumber = kSparseFieldNumber();
  public native @Cast("google::protobuf::int32") int sparse();
  public native void set_sparse(@Cast("google::protobuf::int32") int value);

  // optional float max = 4 [default = 1];
  public native @Cast("bool") boolean has_max();
  public native void clear_max();
  @MemberGetter public static native int kMaxFieldNumber();
  public static final int kMaxFieldNumber = kMaxFieldNumber();
  public native float max();
  public native void set_max(float value);

  // optional float std = 6 [default = 1];
  public native @Cast("bool") boolean has_std();
  public native void clear_std();
  @MemberGetter public static native int kStdFieldNumber();
  public static final int kStdFieldNumber = kStdFieldNumber();
  public native float std();
  public native void set_std(float value);
}
