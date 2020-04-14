// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Sparse update '*var' as FOBOS algorithm with fixed learning rate.
 * 
 *  That is for rows we have grad for, we update var as follows:
 *  prox_v = var - alpha * grad
 *  var = sign(prox_v)/(1+alpha*l2) * max{|prox_v|-alpha*l1,0}
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * alpha: Scaling factor. Must be a scalar.
 *  * l1: L1 regularization. Must be a scalar.
 *  * l2: L2 regularization. Must be a scalar.
 *  * grad: The gradient.
 *  * indices: A vector of indices into the first dimension of var and accum.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, the subtraction will be protected by a lock;
 *  otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceSparseApplyProximalGradientDescent extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceSparseApplyProximalGradientDescent(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceSparseApplyProximalGradientDescent */
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
  
    /** If True, the subtraction will be protected by a lock;
     *  otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ResourceSparseApplyProximalGradientDescent(@Const @ByRef Scope scope,
                                             @ByVal Input var,
                                             @ByVal Input alpha,
                                             @ByVal Input l1,
                                             @ByVal Input l2,
                                             @ByVal Input grad,
                                             @ByVal Input indices) { super((Pointer)null); allocate(scope, var, alpha, l1, l2, grad, indices); }
  private native void allocate(@Const @ByRef Scope scope,
                                             @ByVal Input var,
                                             @ByVal Input alpha,
                                             @ByVal Input l1,
                                             @ByVal Input l2,
                                             @ByVal Input grad,
                                             @ByVal Input indices);
  public ResourceSparseApplyProximalGradientDescent(@Const @ByRef Scope scope,
                                             @ByVal Input var,
                                             @ByVal Input alpha,
                                             @ByVal Input l1,
                                             @ByVal Input l2,
                                             @ByVal Input grad,
                                             @ByVal Input indices, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, alpha, l1, l2, grad, indices, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                             @ByVal Input var,
                                             @ByVal Input alpha,
                                             @ByVal Input l1,
                                             @ByVal Input l2,
                                             @ByVal Input grad,
                                             @ByVal Input indices, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceSparseApplyProximalGradientDescent operation(Operation setter);
}
