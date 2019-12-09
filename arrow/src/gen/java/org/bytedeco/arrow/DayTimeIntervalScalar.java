// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DayTimeIntervalScalar extends PrimitiveScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DayTimeIntervalScalar(Pointer p) { super(p); }

  public native @ByRef DayTimeIntervalType.DayMilliseconds value(); public native DayTimeIntervalScalar value(DayTimeIntervalType.DayMilliseconds setter);
  public DayTimeIntervalScalar(@ByVal DayTimeIntervalType.DayMilliseconds value,
                          @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("bool") boolean is_valid/*=true*/) { super((Pointer)null); allocate(value, type, is_valid); }
  private native void allocate(@ByVal DayTimeIntervalType.DayMilliseconds value,
                          @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("bool") boolean is_valid/*=true*/);
  public DayTimeIntervalScalar(@ByVal DayTimeIntervalType.DayMilliseconds value,
                          @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@ByVal DayTimeIntervalType.DayMilliseconds value,
                          @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
}
