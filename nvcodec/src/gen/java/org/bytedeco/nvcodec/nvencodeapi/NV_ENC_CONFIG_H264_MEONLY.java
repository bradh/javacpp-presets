// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_CONFIG_H264_MEONLY
 * H264 encoder configuration parameters for ME only Mode
 * 
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CONFIG_H264_MEONLY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CONFIG_H264_MEONLY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CONFIG_H264_MEONLY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CONFIG_H264_MEONLY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CONFIG_H264_MEONLY position(long position) {
        return (NV_ENC_CONFIG_H264_MEONLY)super.position(position);
    }
    @Override public NV_ENC_CONFIG_H264_MEONLY getPointer(long i) {
        return new NV_ENC_CONFIG_H264_MEONLY((Pointer)this).position(position + i);
    }

    /** [in]: Disable Motion Estimation on 16x16 blocks*/
    public native @Cast("uint32_t") @NoOffset int disablePartition16x16(); public native NV_ENC_CONFIG_H264_MEONLY disablePartition16x16(int setter);
    /** [in]: Disable Motion Estimation on 8x16 blocks*/
    public native @Cast("uint32_t") @NoOffset int disablePartition8x16(); public native NV_ENC_CONFIG_H264_MEONLY disablePartition8x16(int setter);
    /** [in]: Disable Motion Estimation on 16x8 blocks*/
    public native @Cast("uint32_t") @NoOffset int disablePartition16x8(); public native NV_ENC_CONFIG_H264_MEONLY disablePartition16x8(int setter);
    /** [in]: Disable Motion Estimation on 8x8 blocks*/
    public native @Cast("uint32_t") @NoOffset int disablePartition8x8(); public native NV_ENC_CONFIG_H264_MEONLY disablePartition8x8(int setter);
    /** [in]: Disable Intra search during Motion Estimation*/
    public native @Cast("uint32_t") @NoOffset int disableIntraSearch(); public native NV_ENC_CONFIG_H264_MEONLY disableIntraSearch(int setter);
    /** [in]: Enable Stereo Mode for Motion Estimation where each view is independently executed*/
    public native @Cast("uint32_t") @NoOffset int bStereoEnable(); public native NV_ENC_CONFIG_H264_MEONLY bStereoEnable(int setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reserved(); public native NV_ENC_CONFIG_H264_MEONLY reserved(int setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_CONFIG_H264_MEONLY reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_CONFIG_H264_MEONLY reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
