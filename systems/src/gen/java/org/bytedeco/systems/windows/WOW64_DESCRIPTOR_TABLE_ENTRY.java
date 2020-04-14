// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WOW64_DESCRIPTOR_TABLE_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WOW64_DESCRIPTOR_TABLE_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WOW64_DESCRIPTOR_TABLE_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WOW64_DESCRIPTOR_TABLE_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WOW64_DESCRIPTOR_TABLE_ENTRY position(long position) {
        return (WOW64_DESCRIPTOR_TABLE_ENTRY)super.position(position);
    }

    public native @Cast("DWORD") int Selector(); public native WOW64_DESCRIPTOR_TABLE_ENTRY Selector(int setter);
    public native @ByRef WOW64_LDT_ENTRY Descriptor(); public native WOW64_DESCRIPTOR_TABLE_ENTRY Descriptor(WOW64_LDT_ENTRY setter);
}
