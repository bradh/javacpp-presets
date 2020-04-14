// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Inserts a dimension of 1 into a tensor's shape.
 * 
 *  Given a tensor {@code input}, this operation inserts a dimension of 1 at the
 *  dimension index {@code axis} of {@code input}'s shape. The dimension index {@code axis} starts at
 *  zero; if you specify a negative number for {@code axis} it is counted backward from
 *  the end.
 * 
 *  This operation is useful if you want to add a batch dimension to a single
 *  element. For example, if you have a single image of shape {@code [height, width,
 *  channels]}, you can make it a batch of 1 image with {@code expand_dims(image, 0)},
 *  which will make the shape {@code [1, height, width, channels]}.
 * 
 *  Other examples:
 * 
 *  <pre>{@code
 *  # 't' is a tensor of shape [2]
 *  shape(expand_dims(t, 0)) ==> [1, 2]
 *  shape(expand_dims(t, 1)) ==> [2, 1]
 *  shape(expand_dims(t, -1)) ==> [2, 1]
 * 
 *  # 't2' is a tensor of shape [2, 3, 5]
 *  shape(expand_dims(t2, 0)) ==> [1, 2, 3, 5]
 *  shape(expand_dims(t2, 2)) ==> [2, 3, 1, 5]
 *  shape(expand_dims(t2, 3)) ==> [2, 3, 5, 1]
 *  }</pre>
 * 
 *  This operation requires that:
 * 
 *  {@code -1-input.dims() <= dim <= input.dims()}
 * 
 *  This operation is related to {@code squeeze()}, which removes dimensions of
 *  size 1.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * axis: 0-D (scalar). Specifies the dimension index at which to
 *  expand the shape of {@code input}. Must be in the range
 *  {@code [-rank(input) - 1, rank(input)]}.
 * 
 *  Returns:
 *  * {@code Output}: Contains the same data as {@code input}, but its shape has an additional
 *  dimension of size 1 added. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExpandDims extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExpandDims(Pointer p) { super(p); }

  public ExpandDims(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input axis) { super((Pointer)null); allocate(scope, input, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input axis);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ExpandDims operation(Operation setter);
  public native @ByRef Output output(); public native ExpandDims output(Output setter);
}
