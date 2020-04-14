// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

            @Namespace("ngraph::op::util") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class oi_pair extends Pointer {
                static { Loader.load(); }
                /** Default native constructor. */
                public oi_pair() { super((Pointer)null); allocate(); }
                /** Native array allocator. Access with {@link Pointer#position(long)}. */
                public oi_pair(long size) { super((Pointer)null); allocateArray(size); }
                /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                public oi_pair(Pointer p) { super(p); }
                private native void allocate();
                private native void allocateArray(long size);
                @Override public oi_pair position(long position) {
                    return (oi_pair)super.position(position);
                }
            
                public native @Cast("size_t") long output(); public native oi_pair output(long setter);
                public native @Cast("size_t") long input(); public native oi_pair input(long setter);
                public native @Cast("bool") boolean destructive(); public native oi_pair destructive(boolean setter);
            }
