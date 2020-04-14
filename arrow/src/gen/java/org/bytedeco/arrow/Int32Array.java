// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::NumericArray<arrow::Int32Type>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Int32Array extends PrimitiveArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int32Array(Pointer p) { super(p); }


  public Int32Array(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  // Only enable this constructor without a type argument for types without additional
  // metadata

  public native @Cast("const arrow::NumericArray<arrow::Int32Type>::value_type*") IntPointer raw_values();

  public native @Cast("arrow::NumericArray<arrow::Int32Type>::value_type") int Value(@Cast("int64_t") long i);

  // For API compatibility with BinaryArray etc.
  public native @Cast("arrow::NumericArray<arrow::Int32Type>::value_type") int GetView(@Cast("int64_t") long i);
}
