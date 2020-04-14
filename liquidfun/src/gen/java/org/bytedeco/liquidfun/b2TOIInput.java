// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Input parameters for b2TimeOfImpact */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2TOIInput extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2TOIInput() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2TOIInput(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2TOIInput(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2TOIInput position(long position) {
        return (b2TOIInput)super.position(position);
    }

	public native @ByRef b2DistanceProxy proxyA(); public native b2TOIInput proxyA(b2DistanceProxy setter);
	public native @ByRef b2DistanceProxy proxyB(); public native b2TOIInput proxyB(b2DistanceProxy setter);
	public native @ByRef b2Sweep sweepA(); public native b2TOIInput sweepA(b2Sweep setter);
	public native @ByRef b2Sweep sweepB(); public native b2TOIInput sweepB(b2Sweep setter);
	public native @Cast("float32") float tMax(); public native b2TOIInput tMax(float setter);		// defines sweep interval [0, tMax]
}
