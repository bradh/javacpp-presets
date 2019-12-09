// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::NumericBuilder<arrow::Int16Type>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int16Builder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int16Builder(Pointer p) { super(p); }


  public Int16Builder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool);

  /** Append a single scalar and increase the size if necessary. */
  public native @ByVal Status Append(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type") short val);

  /** Write nulls as uint8_t* (0 value indicates null) into pre-allocated memory
   *  The memory at the corresponding data slot is set to 0 to prevent
   *  uninitialized memory access */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  /** \brief Append a single null element */
  public native @ByVal Status AppendNull();

  public native @Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type") short GetValue(@Cast("int64_t") long index);

  public native void Reset();

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  public native @Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @ByRef @Name("operator []") ShortPointer get(@Cast("int64_t") long index);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous C array of values
   *  @param length [in] the number of values to append
   *  @param valid_bytes [in] an optional sequence of bytes where non-zero
   *  indicates a valid (non-null) value
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortPointer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortPointer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortBuffer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortBuffer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") short[] values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") short[] values, @Cast("int64_t") long length);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous C array of values
   *  @param length [in] the number of values to append
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortPointer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") ShortBuffer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type*") short[] values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of values
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector ShortPointer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector ShortBuffer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector short[] values,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector ShortPointer values);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector ShortBuffer values);
  public native @ByVal Status AppendValues(@Cast("arrow::NumericBuilder<arrow::Int16Type>::value_type*") @StdVector short[] values);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int16Type>::ArrayType*") @SharedPtr ShortPointer out);
  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int16Type>::ArrayType*") @SharedPtr ShortBuffer out);
  public native @ByVal Status Finish(@Cast("arrow::NumericBuilder<arrow::Int16Type>::ArrayType*") @SharedPtr short[] out);

  /** \brief Append a sequence of elements in one shot
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *  @return Status */

  /** \brief Append a sequence of elements in one shot, with a specified nullmap
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *  @param valid_begin [in] InputIterator with elements indication valid(1)
   *   or null(0) values.
   *  @return Status */

  // Same as above, with a pointer type ValidIter

  /** Append a single scalar under the assumption that the underlying Buffer is
   *  large enough.
   * 
   *  This method does not capacity-check; make sure to call Reserve
   *  beforehand. */
  public native void UnsafeAppend(@Cast("const arrow::NumericBuilder<arrow::Int16Type>::value_type") short val);

  public native void UnsafeAppendNull();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
