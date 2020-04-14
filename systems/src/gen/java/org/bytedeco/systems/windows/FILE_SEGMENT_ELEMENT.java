// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



//
// Define segement buffer structure for scatter/gather read/write.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_SEGMENT_ELEMENT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_SEGMENT_ELEMENT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_SEGMENT_ELEMENT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_SEGMENT_ELEMENT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_SEGMENT_ELEMENT position(long position) {
        return (FILE_SEGMENT_ELEMENT)super.position(position);
    }

    public native @Cast("PVOID64") Pointer Buffer(); public native FILE_SEGMENT_ELEMENT Buffer(Pointer setter);
    public native @Cast("ULONGLONG") long Alignment(); public native FILE_SEGMENT_ELEMENT Alignment(long setter);
}
