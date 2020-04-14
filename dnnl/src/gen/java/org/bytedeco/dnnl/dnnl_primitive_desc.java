// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \struct dnnl_primitive_desc
 *  \brief An opaque structure to describe a primitive descriptor. */
@Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_primitive_desc extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_primitive_desc() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_primitive_desc(Pointer p) { super(p); }
}
