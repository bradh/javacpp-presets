// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;

@Opaque @Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_source extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public rs2_source() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs2_source(Pointer p) { super(p); }
}
