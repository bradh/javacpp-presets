// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// FixedSizeBinaryBuilder

@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeBinaryBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeBinaryBuilder(Pointer p) { super(p); }


  public FixedSizeBinaryBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                                    MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                                    MemoryPool pool/*=arrow::default_memory_pool()*/);
  public FixedSizeBinaryBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @ByVal Status Append(@Cast("const uint8_t*") BytePointer value);
  public native @ByVal Status Append(@Cast("const uint8_t*") ByteBuffer value);
  public native @ByVal Status Append(@Cast("const uint8_t*") byte[] value);

  public native @ByVal Status Append(String value);

  public native @ByVal Status AppendValues(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") BytePointer data, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") ByteBuffer data, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") byte[] data, @Cast("int64_t") long length);

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native void UnsafeAppend(@Cast("const uint8_t*") BytePointer value);
  public native void UnsafeAppend(@Cast("const uint8_t*") ByteBuffer value);
  public native void UnsafeAppend(@Cast("const uint8_t*") byte[] value);

  public native void UnsafeAppendNull();

  public native void Reset();
  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);
  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr FixedSizeBinaryArray out);

  /** @return size of values buffer so far */
  public native @Cast("int64_t") long value_data_length();

  
  ///
  public native int byte_width();

  /** Temporary access to a value.
   * 
   *  This pointer becomes invalid on the next modifying operation. */
  
  ///
  public native @Cast("const uint8_t*") BytePointer GetValue(@Cast("int64_t") long i);

  /** Temporary access to a value.
   * 
   *  This view becomes invalid on the next modifying operation. */

  public static native @Cast("const int64_t") long memory_limit();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
