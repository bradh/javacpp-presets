// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Date32Scalar extends BaseDate32Scalar {
    static { Loader.load(); }

  
    
      
      
        public Date32Scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
        private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    
    
      public Date32Scalar(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
      private native void allocate(@Cast("arrow::TemporalScalar<arrow::Date32Type>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
  
    public Date32Scalar(@Cast("arrow::DateScalar<arrow::Date32Type>::ValueType") int value) { super((Pointer)null); allocate(value); }
    private native void allocate(@Cast("arrow::DateScalar<arrow::Date32Type>::ValueType") int value);
    public Date32Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Date32Scalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Date32Scalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Date32Scalar position(long position) {
        return (Date32Scalar)super.position(position);
    }

}
