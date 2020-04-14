// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class BinaryKernel
 *  \brief An array-valued function of a two input arguments */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BinaryKernel extends OpKernel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BinaryKernel(Pointer p) { super(p); }

  public native @ByVal Status Call(FunctionContext ctx, @Const @ByRef Datum left, @Const @ByRef Datum right,
                        Datum out);
}
