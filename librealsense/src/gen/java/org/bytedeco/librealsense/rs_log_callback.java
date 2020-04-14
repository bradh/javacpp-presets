// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_log_callback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_log_callback(Pointer p) { super(p); }

    public native void on_event(@Cast("rs_log_severity") int severity, @Cast("const char*") BytePointer message);
    public native void on_event(@Cast("rs_log_severity") int severity, String message);
    public native void release();
}
