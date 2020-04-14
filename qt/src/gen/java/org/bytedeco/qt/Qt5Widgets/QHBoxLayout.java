// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;


@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QHBoxLayout extends QBoxLayout {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QHBoxLayout(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QHBoxLayout(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QHBoxLayout position(long position) {
        return (QHBoxLayout)super.position(position);
    }

    public QHBoxLayout() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QHBoxLayout(QWidget parent) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent);
}
