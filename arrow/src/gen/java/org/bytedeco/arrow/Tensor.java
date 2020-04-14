// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace internal

@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Tensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tensor(Pointer p) { super(p); }

  /** \brief Create a Tensor with full parameters
   * 
   *  This factory function will return Status::Invalid when the parameters are
   *  inconsistent
   * 
   *  @param type [in] The data type of the tensor values
   *  @param data [in] The buffer of the tensor content
   *  @param shape [in] The shape of the tensor
   *  @param strides [in] The strides of the tensor
   *             (if this is empty, the data assumed to be row-major)
   *  @param dim_names [in] The names of the tensor dimensions */
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector LongPointer shape, @Cast("int64_t*") @StdVector LongPointer strides/*={}*/,
        @Const @ByRef(nullValue = "std::vector<std::string>({})") StringVector dim_names);
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector LongPointer shape);
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("int64_t*") @StdVector LongBuffer strides/*={}*/,
        @Const @ByRef(nullValue = "std::vector<std::string>({})") StringVector dim_names);
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector LongBuffer shape);
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector long[] shape, @Cast("int64_t*") @StdVector long[] strides/*={}*/,
        @Const @ByRef(nullValue = "std::vector<std::string>({})") StringVector dim_names);
  public static native @ByVal TensorResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
        @Cast("int64_t*") @StdVector long[] shape);

  /** Constructor with no dimension names or strides, data assumed to be row-major */
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape) { super((Pointer)null); allocate(type, data, shape); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape) { super((Pointer)null); allocate(type, data, shape); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape) { super((Pointer)null); allocate(type, data, shape); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape);

  /** Constructor with non-negative strides */
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape, @Cast("int64_t*") @StdVector LongPointer strides) { super((Pointer)null); allocate(type, data, shape, strides); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape, @Cast("int64_t*") @StdVector LongPointer strides);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("int64_t*") @StdVector LongBuffer strides) { super((Pointer)null); allocate(type, data, shape, strides); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("int64_t*") @StdVector LongBuffer strides);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape, @Cast("int64_t*") @StdVector long[] strides) { super((Pointer)null); allocate(type, data, shape, strides); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape, @Cast("int64_t*") @StdVector long[] strides);

  /** Constructor with non-negative strides and dimension names */
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape, @Cast("int64_t*") @StdVector LongPointer strides,
           @Const @ByRef StringVector dim_names) { super((Pointer)null); allocate(type, data, shape, strides, dim_names); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongPointer shape, @Cast("int64_t*") @StdVector LongPointer strides,
           @Const @ByRef StringVector dim_names);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("int64_t*") @StdVector LongBuffer strides,
           @Const @ByRef StringVector dim_names) { super((Pointer)null); allocate(type, data, shape, strides, dim_names); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector LongBuffer shape, @Cast("int64_t*") @StdVector LongBuffer strides,
           @Const @ByRef StringVector dim_names);
  public Tensor(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape, @Cast("int64_t*") @StdVector long[] strides,
           @Const @ByRef StringVector dim_names) { super((Pointer)null); allocate(type, data, shape, strides, dim_names); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @SharedPtr ArrowBuffer data,
           @Cast("int64_t*") @StdVector long[] shape, @Cast("int64_t*") @StdVector long[] strides,
           @Const @ByRef StringVector dim_names);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
  public native @SharedPtr ArrowBuffer data();

  public native @Cast("const uint8_t*") BytePointer raw_data();
  public native @Cast("uint8_t*") BytePointer raw_mutable_data();

  public native @Cast("int64_t*") @StdVector LongPointer shape();
  public native @Cast("int64_t*") @StdVector LongPointer strides();

  public native int ndim();

  public native @Const @ByRef StringVector dim_names();
  public native @StdString String dim_name(int i);

  /** Total number of value cells in the tensor */
  public native @Cast("int64_t") long size();

  /** Return true if the underlying data buffer is mutable */
  public native @Cast("bool") boolean is_mutable();

  /** Either row major or column major */
  public native @Cast("bool") boolean is_contiguous();

  /** AKA "C order" */
  public native @Cast("bool") boolean is_row_major();

  /** AKA "Fortran order" */
  public native @Cast("bool") boolean is_column_major();

  public native @Cast("arrow::Type::type") int type_id();

  public native @Cast("bool") boolean Equals(@Const @ByRef Tensor other, @Const @ByRef(nullValue = "arrow::EqualOptions::Defaults()") EqualOptions arg1);
  public native @Cast("bool") boolean Equals(@Const @ByRef Tensor other);

  /** Compute the number of non-zero values in the tensor */
  public native @ByVal Status CountNonZero(@Cast("int64_t*") LongPointer result);
  public native @ByVal Status CountNonZero(@Cast("int64_t*") LongBuffer result);
  public native @ByVal Status CountNonZero(@Cast("int64_t*") long[] result);

  /** Return the offset of the given index on the given strides */
  public static native @Cast("int64_t") long CalculateValueOffset(@Cast("int64_t*") @StdVector LongPointer strides,
                                        @Cast("int64_t*") @StdVector LongPointer index);
  public static native @Cast("int64_t") long CalculateValueOffset(@Cast("int64_t*") @StdVector LongBuffer strides,
                                        @Cast("int64_t*") @StdVector LongBuffer index);
  public static native @Cast("int64_t") long CalculateValueOffset(@Cast("int64_t*") @StdVector long[] strides,
                                        @Cast("int64_t*") @StdVector long[] index);

  /** Returns the value at the given index without data-type and bounds checks */
}
