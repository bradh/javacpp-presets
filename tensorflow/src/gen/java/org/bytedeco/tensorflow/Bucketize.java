// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Bucketizes 'input' based on 'boundaries'.
 * 
 *  For example, if the inputs are
 *      boundaries = [0, 10, 100]
 *      input = [[-5, 10000]
 *               [150,   10]
 *               [5,    100]]
 * 
 *  then the output will be
 *      output = [[0, 3]
 *                [3, 2]
 *                [1, 3]]
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Any shape of Tensor contains with int or float type.
 *  * boundaries: A sorted list of floats gives the boundary of the buckets.
 * 
 *  Returns:
 *  * {@code Output}: Same shape with 'input', each value of input replaced with bucket index.
 * 
 *  \compatibility(numpy)
 *  Equivalent to np.digitize.
 *  \end_compatibility */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Bucketize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Bucketize(Pointer p) { super(p); }

  public Bucketize(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice FloatPointer boundaries) { super((Pointer)null); allocate(scope, input, boundaries); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice FloatPointer boundaries);
  public Bucketize(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice FloatBuffer boundaries) { super((Pointer)null); allocate(scope, input, boundaries); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice FloatBuffer boundaries);
  public Bucketize(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice float... boundaries) { super((Pointer)null); allocate(scope, input, boundaries); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @ArraySlice float... boundaries);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Bucketize operation(Operation setter);
  public native @ByRef Output output(); public native Bucketize output(Output setter);
}
