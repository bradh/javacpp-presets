// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qstring.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QString extends AbstractQString {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QString(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QString(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QString position(long position) {
        return (QString)super.position(position);
    }


    public QString() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public QString(@Const @ByRef QString arg0) { super((Pointer)null); allocate(arg0); }
    @NoException private native void allocate(@Const @ByRef QString arg0);
    public native @ByRef @Name("operator =") @NoException QString put(@Const @ByRef QString arg0);
    public native @NoException void swap(@ByRef QString other);
    public native int size();
    public native int count();
    public native int length();
    public native @Cast("bool") boolean isEmpty();
    public native void resize(int size);
    public native void truncate(int pos);
    public native void chop(int n);

    public native @Name("capacity") int _capacity();
    public native void reserve(int size);
    public native void squeeze();

    public native void detach();
    public native @Cast("bool") boolean isDetached();
    public native @Cast("bool") boolean isSharedWith(@Const @ByRef QString other);
    public native void clear();
    
    

    
    
    
    

     public native @ByVal QString arg(long a);
    
    
    
     public native @ByVal QString arg(int a);
    
     public native @ByVal QString arg(short a);
    
     public native @ByVal QString arg(double a);
     public native @ByVal QString arg(@Cast("char") byte a);
    
// #if QT_STRINGVIEW_LEVEL < 2
     public native @ByVal QString arg(@Const @ByRef QString a);
// #endif
    
    
// #if QT_STRINGVIEW_LEVEL < 2
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4, @Const @ByRef QString a5);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4, @Const @ByRef QString a5, @Const @ByRef QString a6);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4, @Const @ByRef QString a5, @Const @ByRef QString a6,
                @Const @ByRef QString a7);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4, @Const @ByRef QString a5, @Const @ByRef QString a6,
                @Const @ByRef QString a7, @Const @ByRef QString a8);
     public native @ByVal QString arg(@Const @ByRef QString a1, @Const @ByRef QString a2, @Const @ByRef QString a3,
                @Const @ByRef QString a4, @Const @ByRef QString a5, @Const @ByRef QString a6,
                @Const @ByRef QString a7, @Const @ByRef QString a8, @Const @ByRef QString a9);

// #if QT_DEPRECATED_SINCE(5, 14)
    public native @ByRef QString vsprintf(@Cast("const char*") BytePointer format, @ByVal @Cast("va_list*") Pointer ap);
    public native @ByRef QString vsprintf(String format, @ByVal @Cast("va_list*") Pointer ap);
    public native @ByRef QString sprintf(@Cast("const char*") BytePointer format);
    public native @ByRef QString sprintf(String format);
// #endif
    public static native @ByVal QString vasprintf(@Cast("const char*") BytePointer format, @ByVal @Cast("va_list*") Pointer ap);
    public static native @ByVal QString vasprintf(String format, @ByVal @Cast("va_list*") Pointer ap);
    public static native @ByVal QString asprintf(@Cast("const char*") BytePointer format);
    public static native @ByVal QString asprintf(String format);
// #if QT_STRINGVIEW_LEVEL < 2
    public native int indexOf(@Const @ByRef QString s, int from/*=0*/, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native int indexOf(@Const @ByRef QString s);
// #endif
     // ### Qt6: qsizetype
// #if QT_STRINGVIEW_LEVEL < 2
    public native int lastIndexOf(@Const @ByRef QString s, int from/*=-1*/, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native int lastIndexOf(@Const @ByRef QString s);
// #endif

     // ### Qt6: qsizetype
// #if QT_STRINGVIEW_LEVEL < 2
    public native @Cast("bool") boolean contains(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @Cast("bool") boolean contains(@Const @ByRef QString s);
// #endif
    public native int count(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native int count(@Const @ByRef QString s);

// #ifndef QT_NO_REGEXP
// #endif

// #if QT_CONFIG(regularexpression) // ### Qt 6: merge overloads // ### Qt 6: merge overloads // ### Qt 6: merge overloads
// #endif

    public enum SectionFlag {
        SectionDefault            (0x00),
        SectionSkipEmpty          (0x01),
        SectionIncludeLeadingSep  (0x02),
        SectionIncludeTrailingSep (0x04),
        SectionCaseInsensitiveSeps(0x08);

        public final int value;
        private SectionFlag(int v) { this.value = v; }
        private SectionFlag(SectionFlag e) { this.value = e.value; }
        public SectionFlag intern() { for (SectionFlag e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
//     #define Q_DECLARE_FLAGS(arg0, arg1)(SectionFlags, SectionFlag)
    public native @ByVal QString section(@Const @ByRef QString in_sep, int start);
// #ifndef QT_NO_REGEXP
// #endif
// #if QT_CONFIG(regularexpression)
// #endif
     public native @ByVal QString left(int n);
     public native @ByVal QString right(int n);
     public native @ByVal QString mid(int _position, int n/*=-1*/);
public native @ByVal QString mid(int _position);
     public native @ByVal QString chopped(int n);


    
    
    

// #if QT_STRINGVIEW_LEVEL < 2
    public native @Cast("bool") boolean startsWith(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @Cast("bool") boolean startsWith(@Const @ByRef QString s);
// #endif
    

// #if QT_STRINGVIEW_LEVEL < 2
    public native @Cast("bool") boolean endsWith(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @Cast("bool") boolean endsWith(@Const @ByRef QString s);
// #endif
    

    public native @Cast("bool") boolean isUpper();
    public native @Cast("bool") boolean isLower();

     public native @ByVal QString leftJustified(int width);
     public native @ByVal QString rightJustified(int width);

// #if defined(Q_COMPILER_REF_QUALIFIERS) && !defined(QT_COMPILING_QSTRING_COMPAT_CPP) && !defined(Q_CLANG_QDOC)
// #else
     public native @ByVal QString toLower();
     public native @ByVal QString toUpper();
     public native @ByVal QString toCaseFolded();
     public native @ByVal QString trimmed();
     public native @ByVal QString simplified();
// #endif
     public native @ByVal QString toHtmlEscaped();
    public native @ByRef QString insert(int i, @Const @ByRef QString s);
    public native @ByRef QString append(@Const @ByRef QString s);
    public native @ByRef QString prepend(@Const @ByRef QString s);
    public native @ByRef @Name("operator +=") QString addPut(@Const @ByRef QString s);

    public native @ByRef QString remove(int i, int len);
    public native @ByRef QString remove(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @ByRef QString remove(@Const @ByRef QString s);
    public native @ByRef QString replace(int i, int len, @Const @ByRef QString after);
    public native @ByRef QString replace(@Const @ByRef QString before, @Const @ByRef QString after,
                         CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @ByRef QString replace(@Const @ByRef QString before, @Const @ByRef QString after);
// #ifndef QT_NO_REGEXP
// #endif
// #if QT_CONFIG(regularexpression)
// #endif

    /** enum QString::SplitBehavior */
    public static final int KeepEmptyParts = 0, SkipEmptyParts = 1;

    
    
    
    
// #ifndef QT_NO_REGEXP
    
    
// #endif
// #if QT_CONFIG(regularexpression)
    
    

    
    
    
    
// #ifndef QT_NO_REGEXP
    
    
// #endif
// #ifndef QT_NO_REGULAREXPRESSION
    
    
// #endif


    /** enum QString::NormalizationForm */
    public static final int
        NormalizationForm_D = 0,
        NormalizationForm_C = 1,
        NormalizationForm_KD = 2,
        NormalizationForm_KC = 3;
     public native @ByVal QString normalized(@Cast("QString::NormalizationForm") int mode);

     public native @ByVal QString repeated(int times);

    public native @Cast("const unsigned short*") ShortPointer utf16();

// #if defined(Q_COMPILER_REF_QUALIFIERS) && !defined(QT_COMPILING_QSTRING_COMPAT_CPP) && !defined(Q_CLANG_QDOC)
// #else
     public native @ByVal QByteArray toLatin1();
     public native @ByVal QByteArray toUtf8();
     public native @ByVal QByteArray toLocal8Bit();
// #endif
    

    // note - this are all inline so we can benefit from strlen() compile time optimizations
    public static native @ByVal QString fromLatin1(@Cast("const char*") BytePointer str, int size/*=-1*/);
    public static native @ByVal QString fromLatin1(@Cast("const char*") BytePointer str);
    public static native @ByVal QString fromLatin1(String str, int size/*=-1*/);
    public static native @ByVal QString fromLatin1(String str);
    public static native @ByVal QString fromUtf8(@Cast("const char*") BytePointer str, int size/*=-1*/);
    public static native @ByVal QString fromUtf8(@Cast("const char*") BytePointer str);
    public static native @ByVal QString fromUtf8(String str, int size/*=-1*/);
    public static native @ByVal QString fromUtf8(String str);
    public static native @ByVal QString fromLocal8Bit(@Cast("const char*") BytePointer str, int size/*=-1*/);
    public static native @ByVal QString fromLocal8Bit(@Cast("const char*") BytePointer str);
    public static native @ByVal QString fromLocal8Bit(String str, int size/*=-1*/);
    public static native @ByVal QString fromLocal8Bit(String str);
    public static native @ByVal QString fromLatin1(@Const @ByRef QByteArray str);
    public static native @ByVal QString fromUtf8(@Const @ByRef QByteArray str);
    public static native @ByVal QString fromLocal8Bit(@Const @ByRef QByteArray str);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") ShortPointer arg0, int size/*=-1*/);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") ShortPointer arg0);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") ShortBuffer arg0, int size/*=-1*/);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") ShortBuffer arg0);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") short[] arg0, int size/*=-1*/);
    public static native @ByVal QString fromUtf16(@Cast("const unsigned short*") short[] arg0);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") IntPointer arg0, int size/*=-1*/);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") IntPointer arg0);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") IntBuffer arg0, int size/*=-1*/);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") IntBuffer arg0);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") int[] arg0, int size/*=-1*/);
    public static native @ByVal QString fromUcs4(@Cast("const unsigned int*") int[] arg0);

// #if defined(Q_COMPILER_UNICODE_STRINGS)
// #endif

// #if QT_DEPRECATED_SINCE(5, 0)
// #endif

    public native int toWCharArray(@Cast("wchar_t*") CharPointer array);
    public native int toWCharArray(@Cast("wchar_t*") IntPointer array);
     public static native @ByVal QString fromWCharArray(@Cast("const wchar_t*") CharPointer string, int size/*=-1*/);
public static native @ByVal QString fromWCharArray(@Cast("const wchar_t*") CharPointer string);
public static native @ByVal QString fromWCharArray(@Cast("const wchar_t*") IntPointer string, int size/*=-1*/);
public static native @ByVal QString fromWCharArray(@Cast("const wchar_t*") IntPointer string);
    public native @ByRef QString setUtf16(@Cast("const unsigned short*") ShortPointer utf16, int size);
    public native @ByRef QString setUtf16(@Cast("const unsigned short*") ShortBuffer utf16, int size);
    public native @ByRef QString setUtf16(@Cast("const unsigned short*") short[] utf16, int size);

// #if QT_STRINGVIEW_LEVEL < 2
    public native @NoException int compare(@Const @ByRef QString s, CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public native @NoException int compare(@Const @ByRef QString s);
// #endif

    public static native @NoException int compare(@Const @ByRef QString s1, @Const @ByRef QString s2,
                                  CaseSensitivity cs/*=Qt::CaseSensitive*/);
    public static native @NoException int compare(@Const @ByRef QString s1, @Const @ByRef QString s2);

    public native int localeAwareCompare(@Const @ByRef QString s);
    public static native int localeAwareCompare(@Const @ByRef QString s1, @Const @ByRef QString s2);

    // ### Qt6: make inline except for the long long versions
    public native short toShort(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native short toShort();
    public native short toShort(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned short") short toUShort(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned short") short toUShort();
    public native @Cast("unsigned short") short toUShort(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native int toInt(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native int toInt();
    public native int toInt(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned int") int toUInt(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned int") int toUInt();
    public native @Cast("unsigned int") int toUInt(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native long toLong(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native long toLong();
    public native long toLong(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned long") long toULong(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned long") long toULong();
    public native @Cast("unsigned long") long toULong(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native long toLongLong(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native long toLongLong();
    public native long toLongLong(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned long long") long toULongLong(@Cast("bool*") BoolPointer ok/*=nullptr*/, int base/*=10*/);
    public native @Cast("unsigned long long") long toULongLong();
    public native @Cast("unsigned long long") long toULongLong(@Cast("bool*") boolean[] ok/*=nullptr*/, int base/*=10*/);
    public native float toFloat(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native float toFloat();
    public native float toFloat(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native double toDouble(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native double toDouble();
    public native double toDouble(@Cast("bool*") boolean[] ok/*=nullptr*/);

    public native @ByRef QString setNum(short arg0, int base/*=10*/);
    public native @ByRef QString setNum(short arg0);
    public native @ByRef QString setNum(int arg0, int base/*=10*/);
    public native @ByRef QString setNum(int arg0);
    public native @ByRef QString setNum(long arg0, int base/*=10*/);
    public native @ByRef QString setNum(long arg0);
    public native @ByRef QString setNum(float arg0, @Cast("char") byte f/*='g'*/, int prec/*=6*/);
    public native @ByRef QString setNum(float arg0);
    public native @ByRef QString setNum(double arg0, @Cast("char") byte f/*='g'*/, int prec/*=6*/);
    public native @ByRef QString setNum(double arg0);

    public static native @ByVal QString number(int arg0, int base/*=10*/);
    public static native @ByVal QString number(int arg0);
    public static native @ByVal QString number(long arg0, int base/*=10*/);
    public static native @ByVal QString number(long arg0);
    public static native @ByVal QString number(double arg0, @Cast("char") byte f/*='g'*/, int prec/*=6*/);
    public static native @ByVal QString number(double arg0);

    
    
    
    
    
    

    // ASCII compatibility
// #if defined(QT_RESTRICTED_CAST_FROM_ASCII)
    
    
// #endif
// #if !defined(QT_NO_CAST_FROM_ASCII) && !defined(QT_RESTRICTED_CAST_FROM_ASCII)
// #endif

    // STL compatibility
    public native void push_back(@Const @ByRef QString s);
    public native void push_front(@Const @ByRef QString s);
    public native void shrink_to_fit();

    public static native @ByVal QString fromStdString(@StdString BytePointer s);
    public static native @ByVal QString fromStdString(@StdString String s);
    public native @StdString String toStdString();
    public static native @ByVal QString fromStdWString(@StdWString CharPointer s);
    public static native @ByVal QString fromStdWString(@StdWString IntPointer s);
    public native @StdWString CharPointer toStdWString();

// #if defined(Q_STDLIB_UNICODE_STRINGS) || defined(Q_QDOC)
// #endif

// #if defined(Q_OS_DARWIN) || defined(Q_QDOC)
// #endif
    // compatibility
// #if QT_DEPRECATED_SINCE(5, 9)
// #endif
    public native @Cast("bool") boolean isNull();


    public native @Cast("bool") boolean isSimpleText();
    public native @Cast("bool") boolean isRightToLeft();

    public QString(int size, @Cast("Qt::Initialization") int arg1) { super((Pointer)null); allocate(size, arg1); }
    private native void allocate(int size, @Cast("Qt::Initialization") int arg1);
    
    public native @Cast("QString::DataPtr*") @ByRef PointerPointer data_ptr();
}
