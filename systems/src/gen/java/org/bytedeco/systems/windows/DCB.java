// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class DCB extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DCB() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DCB(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DCB(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DCB position(long position) {
        return (DCB)super.position(position);
    }

    public native @Cast("DWORD") int DCBlength(); public native DCB DCBlength(int setter);      /* sizeof(DCB)                     */
    public native @Cast("DWORD") int BaudRate(); public native DCB BaudRate(int setter);       /* Baudrate at which running       */
    public native @Cast("DWORD") @NoOffset int fBinary(); public native DCB fBinary(int setter);     /* Binary Mode (skip EOF check)    */
    public native @Cast("DWORD") @NoOffset int fParity(); public native DCB fParity(int setter);     /* Enable parity checking          */
    public native @Cast("DWORD") @NoOffset int fOutxCtsFlow(); public native DCB fOutxCtsFlow(int setter); /* CTS handshaking on output       */
    public native @Cast("DWORD") @NoOffset int fOutxDsrFlow(); public native DCB fOutxDsrFlow(int setter); /* DSR handshaking on output       */
    public native @Cast("DWORD") @NoOffset int fDtrControl(); public native DCB fDtrControl(int setter);  /* DTR Flow control                */
    public native @Cast("DWORD") @NoOffset int fDsrSensitivity(); public native DCB fDsrSensitivity(int setter); /* DSR Sensitivity              */
    public native @Cast("DWORD") @NoOffset int fTXContinueOnXoff(); public native DCB fTXContinueOnXoff(int setter); /* Continue TX when Xoff sent */
    public native @Cast("DWORD") @NoOffset int fOutX(); public native DCB fOutX(int setter);       /* Enable output X-ON/X-OFF        */
    public native @Cast("DWORD") @NoOffset int fInX(); public native DCB fInX(int setter);        /* Enable input X-ON/X-OFF         */
    public native @Cast("DWORD") @NoOffset int fErrorChar(); public native DCB fErrorChar(int setter);  /* Enable Err Replacement          */
    public native @Cast("DWORD") @NoOffset int fNull(); public native DCB fNull(int setter);       /* Enable Null stripping           */
    public native @Cast("DWORD") @NoOffset int fRtsControl(); public native DCB fRtsControl(int setter);  /* Rts Flow control                */
    public native @Cast("DWORD") @NoOffset int fAbortOnError(); public native DCB fAbortOnError(int setter); /* Abort all reads and writes on Error */
    public native @Cast("DWORD") @NoOffset int fDummy2(); public native DCB fDummy2(int setter);     /* Reserved                        */
    public native @Cast("WORD") short wReserved(); public native DCB wReserved(short setter);       /* Not currently used              */
    public native @Cast("WORD") short XonLim(); public native DCB XonLim(short setter);          /* Transmit X-ON threshold         */
    public native @Cast("WORD") short XoffLim(); public native DCB XoffLim(short setter);         /* Transmit X-OFF threshold        */
    public native @Cast("BYTE") byte ByteSize(); public native DCB ByteSize(byte setter);        /* Number of bits/byte, 4-8        */
    public native @Cast("BYTE") byte Parity(); public native DCB Parity(byte setter);          /* 0-4=None,Odd,Even,Mark,Space    */
    public native @Cast("BYTE") byte StopBits(); public native DCB StopBits(byte setter);        /* 0,1,2 = 1, 1.5, 2               */
    public native @Cast("char") byte XonChar(); public native DCB XonChar(byte setter);         /* Tx and Rx X-ON character        */
    public native @Cast("char") byte XoffChar(); public native DCB XoffChar(byte setter);        /* Tx and Rx X-OFF character       */
    public native @Cast("char") byte ErrorChar(); public native DCB ErrorChar(byte setter);       /* Error replacement char          */
    public native @Cast("char") byte EofChar(); public native DCB EofChar(byte setter);         /* End of Input character          */
    public native @Cast("char") byte EvtChar(); public native DCB EvtChar(byte setter);         /* Received Event character        */
    public native @Cast("WORD") short wReserved1(); public native DCB wReserved1(short setter);      /* Fill for now.                   */
}
