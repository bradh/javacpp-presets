// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Concrete Array class for large variable-size binary data */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeBinaryArray extends BaseLargeBinaryArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeBinaryArray(Pointer p) { super(p); }

  public LargeBinaryArray(@Const @SharedPtr @ByRef ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@Const @SharedPtr @ByRef ArrayData data);

  public LargeBinaryArray(@Cast("int64_t") long length, @Const @SharedPtr @ByRef ArrowBuffer value_offsets,
                     @Const @SharedPtr @ByRef ArrowBuffer data,
                     @Const @SharedPtr @ByRef(nullValue = "std::shared_ptr<arrow::Buffer>(nullptr)") ArrowBuffer null_bitmap,
                     @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(length, value_offsets, data, null_bitmap, null_count, offset); }
  private native void allocate(@Cast("int64_t") long length, @Const @SharedPtr @ByRef ArrowBuffer value_offsets,
                     @Const @SharedPtr @ByRef ArrowBuffer data,
                     @Const @SharedPtr @ByRef(nullValue = "std::shared_ptr<arrow::Buffer>(nullptr)") ArrowBuffer null_bitmap,
                     @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public LargeBinaryArray(@Cast("int64_t") long length, @Const @SharedPtr @ByRef ArrowBuffer value_offsets,
                     @Const @SharedPtr @ByRef ArrowBuffer data) { super((Pointer)null); allocate(length, value_offsets, data); }
  private native void allocate(@Cast("int64_t") long length, @Const @SharedPtr @ByRef ArrowBuffer value_offsets,
                     @Const @SharedPtr @ByRef ArrowBuffer data);
}
