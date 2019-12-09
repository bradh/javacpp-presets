// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StringDictionaryBuilder extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StringDictionaryBuilder() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringDictionaryBuilder(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringDictionaryBuilder(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StringDictionaryBuilder position(long position) {
        return (StringDictionaryBuilder)super.position(position);
    }

}
