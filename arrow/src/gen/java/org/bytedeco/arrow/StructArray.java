// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Struct

/** Concrete Array class for struct data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StructArray extends Array {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructArray(Pointer p) { super(p); }


  public StructArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  
  ///
  public StructArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                @Const @ByRef ArrayVector children,
                @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, children, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                @Const @ByRef ArrayVector children,
                @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public StructArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                @Const @ByRef ArrayVector children) { super((Pointer)null); allocate(type, length, children); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                @Const @ByRef ArrayVector children);

  /** \brief Return a StructArray from child arrays and field names.
   * 
   *  The length and data type are automatically inferred from the arguments.
   *  There should be at least one child array. */
  
  ///
  public static native @ByVal StructArrayResult Make(
        @Const @ByRef ArrayVector children,
        @Const @ByRef StringVector field_names,
        @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
        @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public static native @ByVal StructArrayResult Make(
        @Const @ByRef ArrayVector children,
        @Const @ByRef StringVector field_names);

  /** \brief Return a StructArray from child arrays and fields.
   * 
   *  The length is automatically inferred from the arguments.
   *  There should be at least one child array.  This method does not
   *  check that field types and child array types are consistent. */
  public static native @ByVal StructArrayResult Make(
        @Const @ByRef ArrayVector children,
        @Const @ByRef FieldVector fields,
        @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
        @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public static native @ByVal StructArrayResult Make(
        @Const @ByRef ArrayVector children,
        @Const @ByRef FieldVector fields);

  public native @Const StructType struct_type();

  // Return a shared pointer in case the requestor desires to share ownership
  // with this array.  The returned array has its offset, length and null
  // count adjusted.
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array field(int pos);

  /** Returns null if name not found */
  
  ///
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array GetFieldByName(@StdString String name);
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array GetFieldByName(@StdString BytePointer name);

  /** \brief Flatten this array as a vector of arrays, one for each field
   * 
   *  @param pool [in] The pool to allocate null bitmaps from, if necessary
   *  @param out [out] The resulting vector of arrays */
  public native @ByVal Status Flatten(MemoryPool pool, ArrayVector out);
}
