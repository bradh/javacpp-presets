// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

/* Description of a system of ODEs.
 *
 * y' = f(t,y) = dydt(t, y)
 *
 * The system is specified by giving the right-hand-side
 * of the equation and possibly a jacobian function.
 *
 * Some methods require the jacobian function, which calculates
 * the matrix dfdy and the vector dfdt. The matrix dfdy conforms
 * to the GSL standard, being a continuous range of floating point
 * values, in row-order.
 *
 * As with GSL function objects, user-supplied parameter
 * data is also present. 
 */
  @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_odeiv2_system extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public gsl_odeiv2_system() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public gsl_odeiv2_system(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public gsl_odeiv2_system(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public gsl_odeiv2_system position(long position) {
          return (gsl_odeiv2_system)super.position(position);
      }
  
  public static class Function_double_DoublePointer_DoublePointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Function_double_DoublePointer_DoublePointer_Pointer(Pointer p) { super(p); }
      protected Function_double_DoublePointer_DoublePointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(double t, @Const DoublePointer y, DoublePointer dydt, Pointer params);
  }
  public native Function_double_DoublePointer_DoublePointer_Pointer function(); public native gsl_odeiv2_system function(Function_double_DoublePointer_DoublePointer_Pointer setter);
  public static class Jacobian_double_DoublePointer_DoublePointer_DoublePointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Jacobian_double_DoublePointer_DoublePointer_DoublePointer_Pointer(Pointer p) { super(p); }
      protected Jacobian_double_DoublePointer_DoublePointer_DoublePointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(double t, @Const DoublePointer y, DoublePointer dfdy, DoublePointer dfdt,
                     Pointer params);
  }
  public native Jacobian_double_DoublePointer_DoublePointer_DoublePointer_Pointer jacobian(); public native gsl_odeiv2_system jacobian(Jacobian_double_DoublePointer_DoublePointer_DoublePointer_Pointer setter);
  public native @Cast("size_t") long dimension(); public native gsl_odeiv2_system dimension(long setter);
  public native Pointer params(); public native gsl_odeiv2_system params(Pointer setter);
}
