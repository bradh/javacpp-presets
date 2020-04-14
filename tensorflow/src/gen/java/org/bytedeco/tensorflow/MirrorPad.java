// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Pads a tensor with mirrored values.
 * 
 *  This operation pads a {@code input} with mirrored values according to the {@code paddings}
 *  you specify. {@code paddings} is an integer tensor with shape {@code [n, 2]}, where n is
 *  the rank of {@code input}. For each dimension D of {@code input}, {@code paddings[D, 0]} indicates
 *  how many values to add before the contents of {@code input} in that dimension, and
 *  {@code paddings[D, 1]} indicates how many values to add after the contents of {@code input}
 *  in that dimension. Both {@code paddings[D, 0]} and {@code paddings[D, 1]} must be no greater
 *  than {@code input.dim_size(D)} (or {@code input.dim_size(D) - 1}) if {@code copy_border} is true
 *  (if false, respectively).
 * 
 *  The padded size of each dimension D of the output is:
 * 
 *  {@code paddings(D, 0) + input.dim_size(D) + paddings(D, 1)}
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 't' is [[1, 2, 3], [4, 5, 6]].
 *  # 'paddings' is [[1, 1]], [2, 2]].
 *  # 'mode' is SYMMETRIC.
 *  # rank of 't' is 2.
 *  pad(t, paddings) ==> [[2, 1, 1, 2, 3, 3, 2]
 *                        [2, 1, 1, 2, 3, 3, 2]
 *                        [5, 4, 4, 5, 6, 6, 5]
 *                        [5, 4, 4, 5, 6, 6, 5]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The input tensor to be padded.
 *  * paddings: A two-column matrix specifying the padding sizes. The number of
 *  rows must be the same as the rank of {@code input}.
 *  * mode: Either {@code REFLECT} or {@code SYMMETRIC}. In reflect mode the padded regions
 *  do not include the borders, while in symmetric mode the padded regions
 *  do include the borders. For example, if {@code input} is {@code [1, 2, 3]} and {@code paddings}
 *  is {@code [0, 2]}, then the output is {@code [1, 2, 3, 2, 1]} in reflect mode, and
 *  it is {@code [1, 2, 3, 3, 2]} in symmetric mode.
 * 
 *  Returns:
 *  * {@code Output}: The padded tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MirrorPad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MirrorPad(Pointer p) { super(p); }

  public MirrorPad(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input paddings, @StringPiece BytePointer mode) { super((Pointer)null); allocate(scope, input, paddings, mode); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input paddings, @StringPiece BytePointer mode);
  public MirrorPad(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input paddings, @StringPiece String mode) { super((Pointer)null); allocate(scope, input, paddings, mode); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input paddings, @StringPiece String mode);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MirrorPad operation(Operation setter);
  public native @ByRef Output output(); public native MirrorPad output(Output setter);
}
