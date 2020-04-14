// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_pngencoder_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_pngencoder_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_pngencoder_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_pngencoder_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_pngencoder_options_t position(long position) {
        return (sk_pngencoder_options_t)super.position(position);
    }

    public native @Cast("sk_pngencoder_filterflags_t") int fFilterFlags(); public native sk_pngencoder_options_t fFilterFlags(int setter);
    public native int fZLibLevel(); public native sk_pngencoder_options_t fZLibLevel(int setter);
    public native @Cast("sk_transfer_function_behavior_t") int fUnpremulBehavior(); public native sk_pngencoder_options_t fUnpremulBehavior(int setter);
    public native Pointer fComments(); public native sk_pngencoder_options_t fComments(Pointer setter);
}
