// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Assign {@code value} to the sliced l-value reference of {@code input}.
 * 
 *  The values of {@code value} are assigned to the positions in the tensor {@code input} that
 *  are selected by the slice parameters. The slice parameters {@code begin} {@code end}
 *  {@code strides} etc. work exactly as in {@code StridedSlice}.
 * 
 *  NOTE this op currently does not support broadcasting and so {@code value}'s shape
 *  must be exactly the shape produced by the slice of {@code input}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorStridedSliceUpdate extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorStridedSliceUpdate(Pointer p) { super(p); }

  /** Optional attribute setters for TensorStridedSliceUpdate */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to 0 */
    public native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long begin_mask_(); public native Attrs begin_mask_(long setter);
    public native @Cast("tensorflow::int64") long end_mask_(); public native Attrs end_mask_(long setter);
    public native @Cast("tensorflow::int64") long ellipsis_mask_(); public native Attrs ellipsis_mask_(long setter);
    public native @Cast("tensorflow::int64") long new_axis_mask_(); public native Attrs new_axis_mask_(long setter);
    public native @Cast("tensorflow::int64") long shrink_axis_mask_(); public native Attrs shrink_axis_mask_(long setter);
  }
  public TensorStridedSliceUpdate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input begin, @ByVal Input end, @ByVal Input strides, @ByVal Input value) { super((Pointer)null); allocate(scope, input, begin, end, strides, value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input begin, @ByVal Input end, @ByVal Input strides, @ByVal Input value);
  public TensorStridedSliceUpdate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input begin, @ByVal Input end, @ByVal Input strides, @ByVal Input value, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, begin, end, strides, value, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ByVal Input begin, @ByVal Input end, @ByVal Input strides, @ByVal Input value, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native TensorStridedSliceUpdate operation(Operation setter);
  public native @ByRef Output output(); public native TensorStridedSliceUpdate output(Output setter);
}
