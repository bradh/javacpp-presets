// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Metadata related to an image. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2ImageMetadata extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2ImageMetadata() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2ImageMetadata(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2ImageMetadata(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2ImageMetadata position(long position) {
            return (fc2ImageMetadata)super.position(position);
        }
    
        /** Embedded timestamp. */
        public native @Cast("unsigned int") int embeddedTimeStamp(); public native fc2ImageMetadata embeddedTimeStamp(int setter);
        /** Embedded gain. */
        public native @Cast("unsigned int") int embeddedGain(); public native fc2ImageMetadata embeddedGain(int setter);
        /** Embedded shutter. */
        public native @Cast("unsigned int") int embeddedShutter(); public native fc2ImageMetadata embeddedShutter(int setter);
        /** Embedded brightness. */
        public native @Cast("unsigned int") int embeddedBrightness(); public native fc2ImageMetadata embeddedBrightness(int setter);
        /** Embedded exposure. */
        public native @Cast("unsigned int") int embeddedExposure(); public native fc2ImageMetadata embeddedExposure(int setter);
        /** Embedded white balance. */
        public native @Cast("unsigned int") int embeddedWhiteBalance(); public native fc2ImageMetadata embeddedWhiteBalance(int setter);
        /** Embedded frame counter. */
        public native @Cast("unsigned int") int embeddedFrameCounter(); public native fc2ImageMetadata embeddedFrameCounter(int setter);
        /** Embedded strobe pattern. */
        public native @Cast("unsigned int") int embeddedStrobePattern(); public native fc2ImageMetadata embeddedStrobePattern(int setter);
        /** Embedded GPIO pin state. */
        public native @Cast("unsigned int") int embeddedGPIOPinState(); public native fc2ImageMetadata embeddedGPIOPinState(int setter);
        /** Embedded ROI position. */
        public native @Cast("unsigned int") int embeddedROIPosition(); public native fc2ImageMetadata embeddedROIPosition(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2ImageMetadata reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
