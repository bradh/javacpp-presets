// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BinaryDictionary32Builder extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BinaryDictionary32Builder() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BinaryDictionary32Builder(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BinaryDictionary32Builder(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BinaryDictionary32Builder position(long position) {
        return (BinaryDictionary32Builder)super.position(position);
    }

}
