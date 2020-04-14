// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class NotExpression extends NotExpressionImpl {
    static { Loader.load(); }
    /** Default native constructor. */
    public NotExpression() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NotExpression(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NotExpression(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NotExpression position(long position) {
        return (NotExpression)super.position(position);
    }


  public native @StdString String ToString();

  public native @SharedPtr @ByVal Expression Assume(@Const @ByRef Expression given);

  public native @ByVal DataTypeResult Validate(@Const @ByRef Schema schema);
}
