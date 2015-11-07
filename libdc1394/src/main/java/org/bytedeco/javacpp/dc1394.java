// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class dc1394 extends org.bytedeco.javacpp.presets.dc1394 {
    static { Loader.load(); }

// Parsed from <dc1394/dc1394.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Written by
 *   Gord Peters <GordPeters@smarttech.com>,
 *   Chris Urmson <curmson@ri.cmu.edu>
 *   Damien Douxchamps <ddouxchamps@users.sf.net>
 *   Dan Dennedy <ddennedy@users.sf.net>
 *   David Moore <dcm@acm.org>
 *   ... and many ohters (see the AUTHORS file)
 *
 * Copyright (C) 2000-2001 SMART Technologies Inc.
 * Copyright (C) 2001-2004 Universite catholique de Louvain
 * Copyright (C) 2000 Carnegie Mellon University
 * Copyright (C) 2006- Massachussets Institute of Technology
 * Copyright (C) 2004- Nara Institute of Science and Technology
 * All files are also Copyright (C) their respective author(s)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #ifndef __DC1394_H__
// #define __DC1394_H__


/** \file dc1394/dc1394.h
    \brief Main include file, which include all others.
<p>
    More details soon
*/

/* Include all public header files:*/
// #include <dc1394/types.h>
// #include <dc1394/camera.h>
// #include <dc1394/control.h>
// #include <dc1394/capture.h>
// #include <dc1394/conversions.h>
// #include <dc1394/format7.h>
// #include <dc1394/iso.h>
// #include <dc1394/log.h>
// #include <dc1394/register.h>
// #include <dc1394/video.h>
// #include <dc1394/utils.h>

// #endif


// Parsed from <dc1394/types.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * A few type definitions
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #ifndef __DC1394_TYPES_H__
// #define __DC1394_TYPES_H__

/** \file dc1394/types.h
    \brief Various types that must be defined here
<p>
    More details soon
*/

// #include <stdint.h>

/**
 * Enumeration of video modes. Note that the notion of IIDC "format" is not present here, except in the format_7 name.
 */
/** enum dc1394video_mode_t */
public static final int
    DC1394_VIDEO_MODE_160x120_YUV444= 64,
    DC1394_VIDEO_MODE_320x240_YUV422 = 65,
    DC1394_VIDEO_MODE_640x480_YUV411 = 66,
    DC1394_VIDEO_MODE_640x480_YUV422 = 67,
    DC1394_VIDEO_MODE_640x480_RGB8 = 68,
    DC1394_VIDEO_MODE_640x480_MONO8 = 69,
    DC1394_VIDEO_MODE_640x480_MONO16 = 70,
    DC1394_VIDEO_MODE_800x600_YUV422 = 71,
    DC1394_VIDEO_MODE_800x600_RGB8 = 72,
    DC1394_VIDEO_MODE_800x600_MONO8 = 73,
    DC1394_VIDEO_MODE_1024x768_YUV422 = 74,
    DC1394_VIDEO_MODE_1024x768_RGB8 = 75,
    DC1394_VIDEO_MODE_1024x768_MONO8 = 76,
    DC1394_VIDEO_MODE_800x600_MONO16 = 77,
    DC1394_VIDEO_MODE_1024x768_MONO16 = 78,
    DC1394_VIDEO_MODE_1280x960_YUV422 = 79,
    DC1394_VIDEO_MODE_1280x960_RGB8 = 80,
    DC1394_VIDEO_MODE_1280x960_MONO8 = 81,
    DC1394_VIDEO_MODE_1600x1200_YUV422 = 82,
    DC1394_VIDEO_MODE_1600x1200_RGB8 = 83,
    DC1394_VIDEO_MODE_1600x1200_MONO8 = 84,
    DC1394_VIDEO_MODE_1280x960_MONO16 = 85,
    DC1394_VIDEO_MODE_1600x1200_MONO16 = 86,
    DC1394_VIDEO_MODE_EXIF = 87,
    DC1394_VIDEO_MODE_FORMAT7_0 = 88,
    DC1394_VIDEO_MODE_FORMAT7_1 = 89,
    DC1394_VIDEO_MODE_FORMAT7_2 = 90,
    DC1394_VIDEO_MODE_FORMAT7_3 = 91,
    DC1394_VIDEO_MODE_FORMAT7_4 = 92,
    DC1394_VIDEO_MODE_FORMAT7_5 = 93,
    DC1394_VIDEO_MODE_FORMAT7_6 = 94,
    DC1394_VIDEO_MODE_FORMAT7_7 = 95;
public static final int DC1394_VIDEO_MODE_MIN =            DC1394_VIDEO_MODE_160x120_YUV444;
public static final int DC1394_VIDEO_MODE_MAX =       DC1394_VIDEO_MODE_FORMAT7_7;
public static final int DC1394_VIDEO_MODE_NUM =      (DC1394_VIDEO_MODE_MAX - DC1394_VIDEO_MODE_MIN + 1);

/* Special min/max are defined for Format_7 */
public static final int DC1394_VIDEO_MODE_FORMAT7_MIN =       DC1394_VIDEO_MODE_FORMAT7_0;
public static final int DC1394_VIDEO_MODE_FORMAT7_MAX =       DC1394_VIDEO_MODE_FORMAT7_7;
public static final int DC1394_VIDEO_MODE_FORMAT7_NUM =      (DC1394_VIDEO_MODE_FORMAT7_MAX - DC1394_VIDEO_MODE_FORMAT7_MIN + 1);

/**
 * Enumeration of colour codings. For details on the data format please read the IIDC specifications.
 */
/** enum dc1394color_coding_t */
public static final int
    DC1394_COLOR_CODING_MONO8= 352,
    DC1394_COLOR_CODING_YUV411 = 353,
    DC1394_COLOR_CODING_YUV422 = 354,
    DC1394_COLOR_CODING_YUV444 = 355,
    DC1394_COLOR_CODING_RGB8 = 356,
    DC1394_COLOR_CODING_MONO16 = 357,
    DC1394_COLOR_CODING_RGB16 = 358,
    DC1394_COLOR_CODING_MONO16S = 359,
    DC1394_COLOR_CODING_RGB16S = 360,
    DC1394_COLOR_CODING_RAW8 = 361,
    DC1394_COLOR_CODING_RAW16 = 362;
public static final int DC1394_COLOR_CODING_MIN =     DC1394_COLOR_CODING_MONO8;
public static final int DC1394_COLOR_CODING_MAX =     DC1394_COLOR_CODING_RAW16;
public static final int DC1394_COLOR_CODING_NUM =    (DC1394_COLOR_CODING_MAX - DC1394_COLOR_CODING_MIN + 1);

/**
 * RAW sensor filters. These elementary tiles tesselate the image plane in RAW modes. RGGB should be interpreted in 2D as
 *
 *    RG
 *    GB
 *
 * and similarly for other filters.
 */
/** enum dc1394color_filter_t */
public static final int
    DC1394_COLOR_FILTER_RGGB = 512,
    DC1394_COLOR_FILTER_GBRG = 513,
    DC1394_COLOR_FILTER_GRBG = 514,
    DC1394_COLOR_FILTER_BGGR = 515;
public static final int DC1394_COLOR_FILTER_MIN =        DC1394_COLOR_FILTER_RGGB;
public static final int DC1394_COLOR_FILTER_MAX =        DC1394_COLOR_FILTER_BGGR;
public static final int DC1394_COLOR_FILTER_NUM =       (DC1394_COLOR_FILTER_MAX - DC1394_COLOR_FILTER_MIN + 1);

/**
 * Byte order for YUV formats (may be expanded to RGB in the future)
 *
 * IIDC cameras always return data in UYVY order, but conversion functions can change this if requested.
 */
/** enum dc1394byte_order_t */
public static final int
    DC1394_BYTE_ORDER_UYVY= 800,
    DC1394_BYTE_ORDER_YUYV = 801;
public static final int DC1394_BYTE_ORDER_MIN =        DC1394_BYTE_ORDER_UYVY;
public static final int DC1394_BYTE_ORDER_MAX =        DC1394_BYTE_ORDER_YUYV;
public static final int DC1394_BYTE_ORDER_NUM =       (DC1394_BYTE_ORDER_MAX - DC1394_BYTE_ORDER_MIN + 1);

/**
 * A struct containing a list of color codings
 */
public static class dc1394color_codings_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394color_codings_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394color_codings_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394color_codings_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394color_codings_t position(int position) {
        return (dc1394color_codings_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394color_codings_t num(int num);
    public native @Cast("dc1394color_coding_t") int codings(int i); public native dc1394color_codings_t codings(int i, int codings);
    @MemberGetter public native @Cast("dc1394color_coding_t*") IntPointer codings();
}

/**
 * A struct containing a list of video modes
 */
public static class dc1394video_modes_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394video_modes_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394video_modes_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394video_modes_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394video_modes_t position(int position) {
        return (dc1394video_modes_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394video_modes_t num(int num);
    public native @Cast("dc1394video_mode_t") int modes(int i); public native dc1394video_modes_t modes(int i, int modes);
    @MemberGetter public native @Cast("dc1394video_mode_t*") IntPointer modes();
}

/**
 * Yet another boolean data type
 */
/** enum dc1394bool_t */
public static final int
    DC1394_FALSE= 0,
    DC1394_TRUE = 1;

/**
 * Yet another boolean data type, a bit more oriented towards electrical-engineers
 */
/** enum dc1394switch_t */
public static final int
    DC1394_OFF= 0,
    DC1394_ON = 1;


// #endif


// Parsed from <dc1394/log.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Error logging functions
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net> and
 *            Rudolf Leitgeb
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA
 */

/***************************************************************************
 * logging facility for libdc1394
 *
 * These functions provide the logging of error, warning and debug messages
 * They allow registering of custom logging functions or the use
 * of the builtin loggers which redirect the output to stderr.
 * Three log levels are supported:
 * error:   Indicates that an error has been detected which mandates
 *          shutdown of the program as soon as feasible
 * warning: Indicates that something happened which prevents libdc1394
 *          from working but which could possibly be resolved by the
 *          application or the user: plugging in a camera, resetting the
 *          firewire bus, ....
 * debug:   A sort of way point for the library. This log level is supposed
 *          to report that a specific function has been entered or has
 *          passed a certain stage. This log level is turned off by default
 *          and may produce a lot of output during regular operation.
 *          The main purpose for this log level is for debugging libdc1394
 *          and for generating meaningful problem reports.
 ***************************************************************************/

// #include <dc1394/dc1394.h>

// #ifndef __DC1394_LOG_H__
// #define __DC1394_LOG_H__

/** \file dc1394/log.h
    \brief Functions to log errors, warning and debug messages
    @author Damien Douxchamps: coding
    @author Rudolf Leitgeb: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

/**
 * Error codes returned by most libdc1394 functions.
 *
 * General rule: 0 is success, negative denotes a problem.
 */
/** enum dc1394error_t */
public static final int
    DC1394_SUCCESS                     = 0,
    DC1394_FAILURE                     = -1,
    DC1394_NOT_A_CAMERA                = -2,
    DC1394_FUNCTION_NOT_SUPPORTED      = -3,
    DC1394_CAMERA_NOT_INITIALIZED      = -4,
    DC1394_MEMORY_ALLOCATION_FAILURE   = -5,
    DC1394_TAGGED_REGISTER_NOT_FOUND   = -6,
    DC1394_NO_ISO_CHANNEL              = -7,
    DC1394_NO_BANDWIDTH                = -8,
    DC1394_IOCTL_FAILURE               = -9,
    DC1394_CAPTURE_IS_NOT_SET          = -10,
    DC1394_CAPTURE_IS_RUNNING          = -11,
    DC1394_RAW1394_FAILURE             = -12,
    DC1394_FORMAT7_ERROR_FLAG_1        = -13,
    DC1394_FORMAT7_ERROR_FLAG_2        = -14,
    DC1394_INVALID_ARGUMENT_VALUE      = -15,
    DC1394_REQ_VALUE_OUTSIDE_RANGE     = -16,
    DC1394_INVALID_FEATURE             = -17,
    DC1394_INVALID_VIDEO_FORMAT        = -18,
    DC1394_INVALID_VIDEO_MODE          = -19,
    DC1394_INVALID_FRAMERATE           = -20,
    DC1394_INVALID_TRIGGER_MODE        = -21,
    DC1394_INVALID_TRIGGER_SOURCE      = -22,
    DC1394_INVALID_ISO_SPEED           = -23,
    DC1394_INVALID_IIDC_VERSION        = -24,
    DC1394_INVALID_COLOR_CODING        = -25,
    DC1394_INVALID_COLOR_FILTER        = -26,
    DC1394_INVALID_CAPTURE_POLICY      = -27,
    DC1394_INVALID_ERROR_CODE          = -28,
    DC1394_INVALID_BAYER_METHOD        = -29,
    DC1394_INVALID_VIDEO1394_DEVICE    = -30,
    DC1394_INVALID_OPERATION_MODE      = -31,
    DC1394_INVALID_TRIGGER_POLARITY    = -32,
    DC1394_INVALID_FEATURE_MODE        = -33,
    DC1394_INVALID_LOG_TYPE            = -34,
    DC1394_INVALID_BYTE_ORDER          = -35,
    DC1394_INVALID_STEREO_METHOD       = -36,
    DC1394_BASLER_NO_MORE_SFF_CHUNKS   = -37,
    DC1394_BASLER_CORRUPTED_SFF_CHUNK  = -38,
    DC1394_BASLER_UNKNOWN_SFF_CHUNK    = -39;
public static final int DC1394_ERROR_MIN =  DC1394_BASLER_UNKNOWN_SFF_CHUNK;
public static final int DC1394_ERROR_MAX =  DC1394_SUCCESS;
public static final int DC1394_ERROR_NUM = (DC1394_ERROR_MAX-DC1394_ERROR_MIN+1);

/**
 * Types of logging messages
 *
 * Three types exist:
 * - ERROR for real, hard, unrecoverable errors that will result in the program terminating.
 * - WARNING for things that have gone wrong, but are not requiring a termination of the program.
 * - DEBUG for debug messages that can be very verbose but may help the developers to fix bugs.
 */
/** enum dc1394log_t */
public static final int
    DC1394_LOG_ERROR= 768,
    DC1394_LOG_WARNING = 769,
    DC1394_LOG_DEBUG = 770;
public static final int DC1394_LOG_MIN =               DC1394_LOG_ERROR;
public static final int DC1394_LOG_MAX =               DC1394_LOG_DEBUG;
public static final int DC1394_LOG_NUM =              (DC1394_LOG_MAX - DC1394_LOG_MIN + 1);

// #if ! defined (_MSC_VER)
/* Error logging/checking macros. Logs an error string on stderr and exit current function
   if error is positive. Neg errors are messages and are thus ignored */

/* Some macros to log errors, etc... conditionally */
// #define DC1394_WRN(err,message)
//   do {
//     if ((err>0)||(err<=-DC1394_ERROR_NUM))
//       err=DC1394_INVALID_ERROR_CODE;
// 
//     if (err!=DC1394_SUCCESS) {
//       dc1394_log_warning("%s: in %s (%s, line %d): %s\n",
//       dc1394_error_get_string(err),
//           __FUNCTION__, __FILE__, __LINE__, message);
//     }
//   } while (0);

// #define DC1394_ERR(err,message)
//   do {
//     if ((err>0)||(err<=-DC1394_ERROR_NUM))
//       err=DC1394_INVALID_ERROR_CODE;
// 
//     if (err!=DC1394_SUCCESS) {
//       dc1394_log_error("%s: in %s (%s, line %d): %s\n",
//       dc1394_error_get_string(err),
//           __FUNCTION__, __FILE__, __LINE__, message);
//       return;
//     }
//   } while (0);

// #define DC1394_ERR_RTN(err,message)
//   do {
//     if ((err>0)||(err<=-DC1394_ERROR_NUM))
//       err=DC1394_INVALID_ERROR_CODE;
// 
//     if (err!=DC1394_SUCCESS) {
//       dc1394_log_error("%s: in %s (%s, line %d): %s\n",
//       dc1394_error_get_string(err),
//           __FUNCTION__, __FILE__, __LINE__, message);
//       return err;
//     }
//   } while (0);

// #define DC1394_ERR_CLN(err,cleanup,message)
//   do {
//     if ((err>0)||(err<=-DC1394_ERROR_NUM))
//       err=DC1394_INVALID_ERROR_CODE;
// 
//     if (err!=DC1394_SUCCESS) {
//       dc1394_log_error("%s: in %s (%s, line %d): %s\n",
//       dc1394_error_get_string(err),
//           __FUNCTION__, __FILE__, __LINE__, message);
//       cleanup;
//       return;
//     }
//   } while (0);

// #define DC1394_ERR_CLN_RTN(err,cleanup,message)
//   do {
//     if ((err>0)||(err<=-DC1394_ERROR_NUM))
//       err=DC1394_INVALID_ERROR_CODE;
// 
//     if (err!=DC1394_SUCCESS) {
//       dc1394_log_error("%s: in %s (%s, line %d): %s\n",
//       dc1394_error_get_string(err),
//           __FUNCTION__, __FILE__, __LINE__, message);
//       cleanup;
//       return err;
//     }
//   } while (0);


// #endif /* _MSC_VER */

// #ifdef __cplusplus
// #endif

/**
 * dc1394_log_register_handler: register log handler for reporting error, warning or debug statements
 * Passing NULL as argument turns off this log level.
 * @param [in] log_handler: pointer to a function which takes a character string as argument
 *             type: the type of log
 * @param [in] type: message type (\a debug, \a err or \a warning)
 * @param [in] message: log message
 */
public static class Log_handler_int_BytePointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Log_handler_int_BytePointer_Pointer(Pointer p) { super(p); }
    protected Log_handler_int_BytePointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("dc1394log_t") int type,
                                          @Cast("const char*") BytePointer message, Pointer user);
}
public static native @Cast("dc1394error_t") int dc1394_log_register_handler(@Cast("dc1394log_t") int type, Log_handler_int_BytePointer_Pointer log_handler, Pointer user);
public static class Log_handler_int_String_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Log_handler_int_String_Pointer(Pointer p) { super(p); }
    protected Log_handler_int_String_Pointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("dc1394log_t") int type,
                                          String message, Pointer user);
}
public static native @Cast("dc1394error_t") int dc1394_log_register_handler(@Cast("dc1394log_t") int type, Log_handler_int_String_Pointer log_handler, Pointer user);

/**
 * dc1394_log_set_default_handler: set the log handler to the default handler
 * At boot time, debug logging is OFF (handler is NULL). Using this function for the debug statements
 * will start logging of debug statements usng the default handler.
 */
public static native @Cast("dc1394error_t") int dc1394_log_set_default_handler(@Cast("dc1394log_t") int type);

/**
 * dc1394_log_error: logs a fatal error condition to the registered facility
 * This function shall be invoked if a fatal error condition is encountered.
 * The message passed as argument is delivered to the registered error reporting
 * function registered before.
 * @param [in] format,...: error message to be logged, multiple arguments allowed (printf style)
 */
public static native void dc1394_log_error(@Cast("const char*") BytePointer format);
public static native void dc1394_log_error(String format);

/**
 * dc1394_log_warning: logs a nonfatal error condition to the registered facility
 * This function shall be invoked if a nonfatal error condition is encountered.
 * The message passed as argument is delivered to the registered warning reporting
 * function registered before.
 * @param [in] format,...: warning message to be logged, multiple arguments allowed (printf style)
 */
public static native void dc1394_log_warning(@Cast("const char*") BytePointer format);
public static native void dc1394_log_warning(String format);

/**
 * dc1394_log_debug: logs a debug statement to the registered facility
 * This function shall be invoked if a debug statement is to be logged.
 * The message passed as argument is delivered to the registered debug reporting
 * function registered before ONLY IF the environment variable DC1394_DEBUG has been set before the
 * program starts.
 * @param [in] format,...: debug statement to be logged, multiple arguments allowed (printf style)
 */
public static native void dc1394_log_debug(@Cast("const char*") BytePointer format);
public static native void dc1394_log_debug(String format);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/camera.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #include <dc1394/log.h>
// #include <stdio.h>

// #ifndef __DC1394_CAMERA_H__
// #define __DC1394_CAMERA_H__

/** \file dc1394/camera.h
    \brief Basic system and camera functions
    @author Damien Douxchamps: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

/**
 * List of IIDC versions
 *
 * Currently, the following versions exist: 1.04, 1.20, PTGREY, 1.30 and 1.31 (1.32 coming soon)
 * Observing other versions means that there's a bug crawling somewhere.
 */
/** enum dc1394iidc_version_t */
public static final int
    DC1394_IIDC_VERSION_1_04 = 544,
    DC1394_IIDC_VERSION_1_20 = 545,
    DC1394_IIDC_VERSION_PTGREY = 546,
    DC1394_IIDC_VERSION_1_30 = 547,
    DC1394_IIDC_VERSION_1_31 = 548,
    DC1394_IIDC_VERSION_1_32 = 549,
    DC1394_IIDC_VERSION_1_33 = 550,
    DC1394_IIDC_VERSION_1_34 = 551,
    DC1394_IIDC_VERSION_1_35 = 552,
    DC1394_IIDC_VERSION_1_36 = 553,
    DC1394_IIDC_VERSION_1_37 = 554,
    DC1394_IIDC_VERSION_1_38 = 555,
    DC1394_IIDC_VERSION_1_39 = 556;
public static final int DC1394_IIDC_VERSION_MIN =        DC1394_IIDC_VERSION_1_04;
public static final int DC1394_IIDC_VERSION_MAX =        DC1394_IIDC_VERSION_1_39;
public static final int DC1394_IIDC_VERSION_NUM =       (DC1394_IIDC_VERSION_MAX - DC1394_IIDC_VERSION_MIN + 1);

/**
 * Enumeration of power classes
 *
 * This is currently not used in libdc1394.
 */
/** enum dc1394power_class_t */
public static final int
    DC1394_POWER_CLASS_NONE= 608,
    DC1394_POWER_CLASS_PROV_MIN_15W = 609,
    DC1394_POWER_CLASS_PROV_MIN_30W = 610,
    DC1394_POWER_CLASS_PROV_MIN_45W = 611,
    DC1394_POWER_CLASS_USES_MAX_1W = 612,
    DC1394_POWER_CLASS_USES_MAX_3W = 613,
    DC1394_POWER_CLASS_USES_MAX_6W = 614,
    DC1394_POWER_CLASS_USES_MAX_10W = 615;
public static final int DC1394_POWER_CLASS_MIN =       DC1394_POWER_CLASS_NONE;
public static final int DC1394_POWER_CLASS_MAX =       DC1394_POWER_CLASS_USES_MAX_10W;
public static final int DC1394_POWER_CLASS_NUM =      (DC1394_POWER_CLASS_MAX - DC1394_POWER_CLASS_MIN + 1);

/**
 * Enumeration of PHY delays
 *
 * This is currently not used in libdc1394.
 */
/** enum dc1394phy_delay_t */
public static final int
    DC1394_PHY_DELAY_MAX_144_NS= 640,
    DC1394_PHY_DELAY_UNKNOWN_0 = 641,
    DC1394_PHY_DELAY_UNKNOWN_1 = 642,
    DC1394_PHY_DELAY_UNKNOWN_2 = 643;
public static final int DC1394_PHY_DELAY_MIN =         DC1394_PHY_DELAY_MAX_144_NS;
public static final int DC1394_PHY_DELAY_MAX =         DC1394_PHY_DELAY_UNKNOWN_0;
public static final int DC1394_PHY_DELAY_NUM =        (DC1394_PHY_DELAY_MAX - DC1394_PHY_DELAY_MIN + 1);

/**
 * Camera structure
 *
 * This structure represents the camera in libdc1394. It contains a number of useful static information, such as model/vendor names,
 * a few capabilities, some ROM offsets, a unique identifier, etc... 
 */
public static class dc1394camera_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394camera_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394camera_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394camera_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394camera_t position(int position) {
        return (dc1394camera_t)super.position(position);
    }

    /* system/firmware information */
    public native @Cast("uint64_t") long guid(); public native dc1394camera_t guid(long guid);
    public native int unit(); public native dc1394camera_t unit(int unit);
    public native @Cast("uint32_t") int unit_spec_ID(); public native dc1394camera_t unit_spec_ID(int unit_spec_ID);
    public native @Cast("uint32_t") int unit_sw_version(); public native dc1394camera_t unit_sw_version(int unit_sw_version);
    public native @Cast("uint32_t") int unit_sub_sw_version(); public native dc1394camera_t unit_sub_sw_version(int unit_sub_sw_version);
    public native @Cast("uint32_t") int command_registers_base(); public native dc1394camera_t command_registers_base(int command_registers_base);
    public native @Cast("uint32_t") int unit_directory(); public native dc1394camera_t unit_directory(int unit_directory);
    public native @Cast("uint32_t") int unit_dependent_directory(); public native dc1394camera_t unit_dependent_directory(int unit_dependent_directory);
    public native @Cast("uint64_t") long advanced_features_csr(); public native dc1394camera_t advanced_features_csr(long advanced_features_csr);
    public native @Cast("uint64_t") long PIO_control_csr(); public native dc1394camera_t PIO_control_csr(long PIO_control_csr);
    public native @Cast("uint64_t") long SIO_control_csr(); public native dc1394camera_t SIO_control_csr(long SIO_control_csr);
    public native @Cast("uint64_t") long strobe_control_csr(); public native dc1394camera_t strobe_control_csr(long strobe_control_csr);
    public native @Cast("uint64_t") long format7_csr(int i); public native dc1394camera_t format7_csr(int i, long format7_csr);
    @MemberGetter public native @Cast("uint64_t*") LongPointer format7_csr();
    public native @Cast("dc1394iidc_version_t") int iidc_version(); public native dc1394camera_t iidc_version(int iidc_version);
    public native @Cast("char*") BytePointer vendor(); public native dc1394camera_t vendor(BytePointer vendor);
    public native @Cast("char*") BytePointer model(); public native dc1394camera_t model(BytePointer model);
    public native @Cast("uint32_t") int vendor_id(); public native dc1394camera_t vendor_id(int vendor_id);
    public native @Cast("uint32_t") int model_id(); public native dc1394camera_t model_id(int model_id);
    public native @Cast("dc1394bool_t") int bmode_capable(); public native dc1394camera_t bmode_capable(int bmode_capable);
    public native @Cast("dc1394bool_t") int one_shot_capable(); public native dc1394camera_t one_shot_capable(int one_shot_capable);
    public native @Cast("dc1394bool_t") int multi_shot_capable(); public native dc1394camera_t multi_shot_capable(int multi_shot_capable);
    public native @Cast("dc1394bool_t") int can_switch_on_off(); public native dc1394camera_t can_switch_on_off(int can_switch_on_off);
    public native @Cast("dc1394bool_t") int has_vmode_error_status(); public native dc1394camera_t has_vmode_error_status(int has_vmode_error_status);
    public native @Cast("dc1394bool_t") int has_feature_error_status(); public native dc1394camera_t has_feature_error_status(int has_feature_error_status);
    public native int max_mem_channel(); public native dc1394camera_t max_mem_channel(int max_mem_channel);

    /* not used, for future use: */
    public native @Cast("uint32_t") int flags(); public native dc1394camera_t flags(int flags);

}

/**
 * A unique identifier for a functional camera unit
 *
 * Since a single camera can contain several functional units (think stereo cameras), the GUID is not enough to identify an IIDC camera.
 * The unit number must also be used, hence this struct. 
 */
public static class dc1394camera_id_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394camera_id_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394camera_id_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394camera_id_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394camera_id_t position(int position) {
        return (dc1394camera_id_t)super.position(position);
    }

    public native @Cast("uint16_t") short unit(); public native dc1394camera_id_t unit(short unit);
    public native @Cast("uint64_t") long guid(); public native dc1394camera_id_t guid(long guid);
}

/**
 * A list of cameras
 *
 * Usually returned by dc1394_camera_eumerate(). 
 */
public static class dc1394camera_list_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394camera_list_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394camera_list_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394camera_list_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394camera_list_t position(int position) {
        return (dc1394camera_list_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394camera_list_t num(int num);
    public native dc1394camera_id_t ids(); public native dc1394camera_list_t ids(dc1394camera_id_t ids);
}

@Opaque public static class dc1394_t extends Pointer {
    /** Empty constructor. */
    public dc1394_t() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394_t(Pointer p) { super(p); }
}

// #ifdef __cplusplus
// #endif

/***************************************************************************
     General system functions
 ***************************************************************************/

/**
 * Creates a new context in which cameras can be searched and used. This should be called before using any other libdc1394 function. 
 */
public static native dc1394_t dc1394_new();

/**
 * Liberates a context. Last function to use in your program. After this, no libdc1394 function can be used.
 */
public static native void dc1394_free(dc1394_t dc1394);

/**
 * Sets and gets the broadcast flag of a camera. If the broadcast flag is set,
 * all devices on the bus will execute the command. Useful to sync ISO start
 * commands or setting a bunch of cameras at the same time. Broadcast only works
 * with identical devices (brand/model). If the devices are not identical your
 * mileage may vary. Some cameras may not answer broadcast commands at all. Also,
 * this only works with cameras on the SAME bus (IOW, the same port).
 */
public static native @Cast("dc1394error_t") int dc1394_camera_set_broadcast(dc1394camera_t camera, @Cast("dc1394bool_t") int pwr);
public static native @Cast("dc1394error_t") int dc1394_camera_get_broadcast(dc1394camera_t camera, @Cast("dc1394bool_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_camera_get_broadcast(dc1394camera_t camera, @Cast("dc1394bool_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_camera_get_broadcast(dc1394camera_t camera, @Cast("dc1394bool_t*") int[] pwr);

/**
 * Resets the IEEE1394 bus which camera is attached to.  Calling this function is
 * "rude" to other devices because it causes them to re-enumerate on the bus and
 * may cause a temporary disruption in their current activities.  Thus, use it
 * sparingly.  Its primary use is if a program shuts down uncleanly and needs to
 * free leftover ISO channels or bandwidth.  A bus reset will free those things
 * as a side effect.
 */
public static native @Cast("dc1394error_t") int dc1394_reset_bus(dc1394camera_t camera);
public static native @Cast("dc1394error_t") int dc1394_read_cycle_timer(dc1394camera_t camera,
        @Cast("uint32_t*") IntPointer cycle_timer, @Cast("uint64_t*") LongPointer local_time);
public static native @Cast("dc1394error_t") int dc1394_read_cycle_timer(dc1394camera_t camera,
        @Cast("uint32_t*") IntBuffer cycle_timer, @Cast("uint64_t*") LongBuffer local_time);
public static native @Cast("dc1394error_t") int dc1394_read_cycle_timer(dc1394camera_t camera,
        @Cast("uint32_t*") int[] cycle_timer, @Cast("uint64_t*") long[] local_time);

/**
 * Gets the IEEE 1394 node ID of the camera.
 */
public static native @Cast("dc1394error_t") int dc1394_camera_get_node(dc1394camera_t camera, @Cast("uint32_t*") IntPointer node,
        @Cast("uint32_t*") IntPointer generation);
public static native @Cast("dc1394error_t") int dc1394_camera_get_node(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer node,
        @Cast("uint32_t*") IntBuffer generation);
public static native @Cast("dc1394error_t") int dc1394_camera_get_node(dc1394camera_t camera, @Cast("uint32_t*") int[] node,
        @Cast("uint32_t*") int[] generation);


/***************************************************************************
     Camera functions
 ***************************************************************************/

/**
 * Returns the list of cameras available on the computer. If present, multiple cards will be probed
 */
public static native @Cast("dc1394error_t") int dc1394_camera_enumerate(dc1394_t dc1394, @Cast("dc1394camera_list_t**") PointerPointer list);
public static native @Cast("dc1394error_t") int dc1394_camera_enumerate(dc1394_t dc1394, @ByPtrPtr dc1394camera_list_t list);

/**
 * Frees the memory allocated in dc1394_enumerate_cameras for the camera list
 */
public static native void dc1394_camera_free_list(dc1394camera_list_t list);

/**
 * Create a new camera based on a GUID (Global Unique IDentifier)
 */
public static native dc1394camera_t dc1394_camera_new(dc1394_t dc1394, @Cast("uint64_t") long guid);

/**
 * Create a new camera based on a GUID and a unit number (for multi-unit cameras)
 */
public static native dc1394camera_t dc1394_camera_new_unit(dc1394_t dc1394, @Cast("uint64_t") long guid, int unit);

/**
 * Frees a camera structure
 */
public static native void dc1394_camera_free(dc1394camera_t camera);

/**
 * Print various camera information, such as GUID, vendor, model, supported IIDC specs, etc...
 */
public static native @Cast("dc1394error_t") int dc1394_camera_print_info(dc1394camera_t camera, @Cast("FILE*") Pointer fd);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/control.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Generic camera control functions
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #include <dc1394/log.h>

// #ifndef __DC1394_CONTROL_H__
// #define __DC1394_CONTROL_H__

/** \file dc1394/control.h
    \brief Diverse controls of camera features
    @author Gord Peters: main writer
    @author Chris Urmson: some additions
    @author Damien Douxchamps: some additions
    @author Peter Antoniac: documentation maintainer
    @author Rudolf Leitgeb: documentation writer
<p>
    This is the main include file of the library. It lists most of the library
    functions, enumerations and data structures.
*/

/**
 * Enumeration of trigger modes
 */
/** enum dc1394trigger_mode_t */
public static final int
    DC1394_TRIGGER_MODE_0= 384,
    DC1394_TRIGGER_MODE_1 = 385,
    DC1394_TRIGGER_MODE_2 = 386,
    DC1394_TRIGGER_MODE_3 = 387,
    DC1394_TRIGGER_MODE_4 = 388,
    DC1394_TRIGGER_MODE_5 = 389,
    DC1394_TRIGGER_MODE_14 = 390,
    DC1394_TRIGGER_MODE_15 = 391;
public static final int DC1394_TRIGGER_MODE_MIN =     DC1394_TRIGGER_MODE_0;
public static final int DC1394_TRIGGER_MODE_MAX =     DC1394_TRIGGER_MODE_15;
public static final int DC1394_TRIGGER_MODE_NUM =    (DC1394_TRIGGER_MODE_MAX - DC1394_TRIGGER_MODE_MIN + 1);

/**
 * Enumeration of camera features
 */
/** enum dc1394feature_t */
public static final int
    DC1394_FEATURE_BRIGHTNESS= 416,
    DC1394_FEATURE_EXPOSURE = 417,
    DC1394_FEATURE_SHARPNESS = 418,
    DC1394_FEATURE_WHITE_BALANCE = 419,
    DC1394_FEATURE_HUE = 420,
    DC1394_FEATURE_SATURATION = 421,
    DC1394_FEATURE_GAMMA = 422,
    DC1394_FEATURE_SHUTTER = 423,
    DC1394_FEATURE_GAIN = 424,
    DC1394_FEATURE_IRIS = 425,
    DC1394_FEATURE_FOCUS = 426,
    DC1394_FEATURE_TEMPERATURE = 427,
    DC1394_FEATURE_TRIGGER = 428,
    DC1394_FEATURE_TRIGGER_DELAY = 429,
    DC1394_FEATURE_WHITE_SHADING = 430,
    DC1394_FEATURE_FRAME_RATE = 431,
    DC1394_FEATURE_ZOOM = 432,
    DC1394_FEATURE_PAN = 433,
    DC1394_FEATURE_TILT = 434,
    DC1394_FEATURE_OPTICAL_FILTER = 435,
    DC1394_FEATURE_CAPTURE_SIZE = 436,
    DC1394_FEATURE_CAPTURE_QUALITY = 437;
public static final int DC1394_FEATURE_MIN =           DC1394_FEATURE_BRIGHTNESS;
public static final int DC1394_FEATURE_MAX =           DC1394_FEATURE_CAPTURE_QUALITY;
public static final int DC1394_FEATURE_NUM =          (DC1394_FEATURE_MAX - DC1394_FEATURE_MIN + 1);

/**
 * Enumeration of trigger sources
 */
/** enum dc1394trigger_source_t */
public static final int
    DC1394_TRIGGER_SOURCE_0= 576,
    DC1394_TRIGGER_SOURCE_1 = 577,
    DC1394_TRIGGER_SOURCE_2 = 578,
    DC1394_TRIGGER_SOURCE_3 = 579,
    DC1394_TRIGGER_SOURCE_SOFTWARE = 580;
public static final int DC1394_TRIGGER_SOURCE_MIN =      DC1394_TRIGGER_SOURCE_0;
public static final int DC1394_TRIGGER_SOURCE_MAX =      DC1394_TRIGGER_SOURCE_SOFTWARE;
public static final int DC1394_TRIGGER_SOURCE_NUM =     (DC1394_TRIGGER_SOURCE_MAX - DC1394_TRIGGER_SOURCE_MIN + 1);

/**
 * External trigger polarity
 */
/** enum dc1394trigger_polarity_t */
public static final int
    DC1394_TRIGGER_ACTIVE_LOW= 704,
    DC1394_TRIGGER_ACTIVE_HIGH = 705;
public static final int DC1394_TRIGGER_ACTIVE_MIN =    DC1394_TRIGGER_ACTIVE_LOW;
public static final int DC1394_TRIGGER_ACTIVE_MAX =    DC1394_TRIGGER_ACTIVE_HIGH;
public static final int DC1394_TRIGGER_ACTIVE_NUM =   (DC1394_TRIGGER_ACTIVE_MAX - DC1394_TRIGGER_ACTIVE_MIN + 1);

/**
 * Control modes for a feature (excl. absolute control)
 */
/** enum dc1394feature_mode_t */
public static final int
    DC1394_FEATURE_MODE_MANUAL= 736,
    DC1394_FEATURE_MODE_AUTO = 737,
    DC1394_FEATURE_MODE_ONE_PUSH_AUTO = 738;
public static final int DC1394_FEATURE_MODE_MIN =      DC1394_FEATURE_MODE_MANUAL;
public static final int DC1394_FEATURE_MODE_MAX =      DC1394_FEATURE_MODE_ONE_PUSH_AUTO;
public static final int DC1394_FEATURE_MODE_NUM =     (DC1394_FEATURE_MODE_MAX - DC1394_FEATURE_MODE_MIN + 1);

/**
 * List of feature modes
 */
public static class dc1394feature_modes_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394feature_modes_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394feature_modes_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394feature_modes_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394feature_modes_t position(int position) {
        return (dc1394feature_modes_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394feature_modes_t num(int num);
    public native @Cast("dc1394feature_mode_t") int modes(int i); public native dc1394feature_modes_t modes(int i, int modes);
    @MemberGetter public native @Cast("dc1394feature_mode_t*") IntPointer modes();
}

/**
 * List of trigger modes
 */
public static class dc1394trigger_modes_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394trigger_modes_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394trigger_modes_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394trigger_modes_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394trigger_modes_t position(int position) {
        return (dc1394trigger_modes_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394trigger_modes_t num(int num);
    public native @Cast("dc1394trigger_mode_t") int modes(int i); public native dc1394trigger_modes_t modes(int i, int modes);
    @MemberGetter public native @Cast("dc1394trigger_mode_t*") IntPointer modes();
}

/**
 * List of trigger sources
 */
public static class dc1394trigger_sources_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394trigger_sources_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394trigger_sources_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394trigger_sources_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394trigger_sources_t position(int position) {
        return (dc1394trigger_sources_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394trigger_sources_t num(int num);
    public native @Cast("dc1394trigger_source_t") int sources(int i); public native dc1394trigger_sources_t sources(int i, int sources);
    @MemberGetter public native @Cast("dc1394trigger_source_t*") IntPointer sources();
}

/**
 * A structure containing all information about a feature.
 *
 * Some fields are only valid for some features (e.g. trigger, white balance,...)
 */
public static class dc1394feature_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394feature_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394feature_info_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394feature_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394feature_info_t position(int position) {
        return (dc1394feature_info_t)super.position(position);
    }

    public native @Cast("dc1394feature_t") int id(); public native dc1394feature_info_t id(int id);
    public native @Cast("dc1394bool_t") int available(); public native dc1394feature_info_t available(int available);
    public native @Cast("dc1394bool_t") int absolute_capable(); public native dc1394feature_info_t absolute_capable(int absolute_capable);
    public native @Cast("dc1394bool_t") int readout_capable(); public native dc1394feature_info_t readout_capable(int readout_capable);
    public native @Cast("dc1394bool_t") int on_off_capable(); public native dc1394feature_info_t on_off_capable(int on_off_capable);
    public native @Cast("dc1394bool_t") int polarity_capable(); public native dc1394feature_info_t polarity_capable(int polarity_capable);
    public native @Cast("dc1394switch_t") int is_on(); public native dc1394feature_info_t is_on(int is_on);
    public native @Cast("dc1394feature_mode_t") int current_mode(); public native dc1394feature_info_t current_mode(int current_mode);
    public native @ByRef dc1394feature_modes_t modes(); public native dc1394feature_info_t modes(dc1394feature_modes_t modes);
    public native @ByRef dc1394trigger_modes_t trigger_modes(); public native dc1394feature_info_t trigger_modes(dc1394trigger_modes_t trigger_modes);
    public native @Cast("dc1394trigger_mode_t") int trigger_mode(); public native dc1394feature_info_t trigger_mode(int trigger_mode);
    public native @Cast("dc1394trigger_polarity_t") int trigger_polarity(); public native dc1394feature_info_t trigger_polarity(int trigger_polarity);
    public native @ByRef dc1394trigger_sources_t trigger_sources(); public native dc1394feature_info_t trigger_sources(dc1394trigger_sources_t trigger_sources);
    public native @Cast("dc1394trigger_source_t") int trigger_source(); public native dc1394feature_info_t trigger_source(int trigger_source);
    public native @Cast("uint32_t") int min(); public native dc1394feature_info_t min(int min);
    public native @Cast("uint32_t") int max(); public native dc1394feature_info_t max(int max);
    public native @Cast("uint32_t") int value(); public native dc1394feature_info_t value(int value);
    public native @Cast("uint32_t") int BU_value(); public native dc1394feature_info_t BU_value(int BU_value);
    public native @Cast("uint32_t") int RV_value(); public native dc1394feature_info_t RV_value(int RV_value);
    public native @Cast("uint32_t") int B_value(); public native dc1394feature_info_t B_value(int B_value);
    public native @Cast("uint32_t") int R_value(); public native dc1394feature_info_t R_value(int R_value);
    public native @Cast("uint32_t") int G_value(); public native dc1394feature_info_t G_value(int G_value);
    public native @Cast("uint32_t") int target_value(); public native dc1394feature_info_t target_value(int target_value);

    public native @Cast("dc1394switch_t") int abs_control(); public native dc1394feature_info_t abs_control(int abs_control);
    public native float abs_value(); public native dc1394feature_info_t abs_value(float abs_value);
    public native float abs_max(); public native dc1394feature_info_t abs_max(float abs_max);
    public native float abs_min(); public native dc1394feature_info_t abs_min(float abs_min);

}

/**
 * The list of features
 */
public static class dc1394featureset_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394featureset_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394featureset_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394featureset_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394featureset_t position(int position) {
        return (dc1394featureset_t)super.position(position);
    }

    public native @ByRef dc1394feature_info_t feature(int i); public native dc1394featureset_t feature(int i, dc1394feature_info_t feature);
    @MemberGetter public native dc1394feature_info_t feature();
}

// #ifdef __cplusplus
// #endif

/***************************************************************************
     Features
 ***************************************************************************/

/**
 * Collects the available features for the camera described by node and stores them in features.
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_all(dc1394camera_t camera, dc1394featureset_t features);

/**
 * Stores the bounds and options associated with the feature described by feature->feature_id
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get(dc1394camera_t camera, dc1394feature_info_t feature);

/**
 * Displays the bounds and options of the given feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_print(dc1394feature_info_t feature, @Cast("FILE*") Pointer fd);

/**
 * Displays the bounds and options of every feature supported by the camera
 */
public static native @Cast("dc1394error_t") int dc1394_feature_print_all(dc1394featureset_t features, @Cast("FILE*") Pointer fd);

/**
 * Gets the whitebalance values
 */
public static native @Cast("dc1394error_t") int dc1394_feature_whitebalance_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntPointer u_b_value, @Cast("uint32_t*") IntPointer v_r_value);
public static native @Cast("dc1394error_t") int dc1394_feature_whitebalance_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer u_b_value, @Cast("uint32_t*") IntBuffer v_r_value);
public static native @Cast("dc1394error_t") int dc1394_feature_whitebalance_get_value(dc1394camera_t camera, @Cast("uint32_t*") int[] u_b_value, @Cast("uint32_t*") int[] v_r_value);

/**
 * Sets the whitebalance values
 */
public static native @Cast("dc1394error_t") int dc1394_feature_whitebalance_set_value(dc1394camera_t camera, @Cast("uint32_t") int u_b_value, @Cast("uint32_t") int v_r_value);

/**
 * Gets the temperature values (target and current)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_temperature_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntPointer target_temperature, @Cast("uint32_t*") IntPointer temperature);
public static native @Cast("dc1394error_t") int dc1394_feature_temperature_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer target_temperature, @Cast("uint32_t*") IntBuffer temperature);
public static native @Cast("dc1394error_t") int dc1394_feature_temperature_get_value(dc1394camera_t camera, @Cast("uint32_t*") int[] target_temperature, @Cast("uint32_t*") int[] temperature);

/**
 * Sets the temperature values (target only) FIXME: COULD BE DROPPED? already in the standard feature_set_value()?
 */
public static native @Cast("dc1394error_t") int dc1394_feature_temperature_set_value(dc1394camera_t camera, @Cast("uint32_t") int target_temperature);

/**
 * Gets the white shading values
 */
public static native @Cast("dc1394error_t") int dc1394_feature_whiteshading_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntPointer r_value, @Cast("uint32_t*") IntPointer g_value, @Cast("uint32_t*") IntPointer b_value);
public static native @Cast("dc1394error_t") int dc1394_feature_whiteshading_get_value(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer r_value, @Cast("uint32_t*") IntBuffer g_value, @Cast("uint32_t*") IntBuffer b_value);
public static native @Cast("dc1394error_t") int dc1394_feature_whiteshading_get_value(dc1394camera_t camera, @Cast("uint32_t*") int[] r_value, @Cast("uint32_t*") int[] g_value, @Cast("uint32_t*") int[] b_value);

/**
 * Sets the white shading values
 */
public static native @Cast("dc1394error_t") int dc1394_feature_whiteshading_set_value(dc1394camera_t camera, @Cast("uint32_t") int r_value, @Cast("uint32_t") int g_value, @Cast("uint32_t") int b_value);

/**
 * Gets the value of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_get_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_get_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") int[] value);

/**
 * Sets the value of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_set_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t") int value);

/**
 * Tells whether a feature is present or not
 */
public static native @Cast("dc1394error_t") int dc1394_feature_is_present(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_present(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_present(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") int[] value);

/**
 * Tells whether a feature is readable or not
 */
public static native @Cast("dc1394error_t") int dc1394_feature_is_readable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_readable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_readable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") int[] value);

/**
 * Gets the boundaries of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") IntPointer min, @Cast("uint32_t*") IntPointer max);
public static native @Cast("dc1394error_t") int dc1394_feature_get_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") IntBuffer min, @Cast("uint32_t*") IntBuffer max);
public static native @Cast("dc1394error_t") int dc1394_feature_get_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("uint32_t*") int[] min, @Cast("uint32_t*") int[] max);

/**
 * Tells whether a feature is switcheable or not (ON/OFF)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_is_switchable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_switchable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_is_switchable(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") int[] value);

/**
 * Gets the power status of a feature (ON or OFF)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_power(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_feature_get_power(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_feature_get_power(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") int[] pwr);

/**
 * Sets the power status of a feature (ON or OFF)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_set_power(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the list of control modes for a feature (manual, auto, etc...)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_modes(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, dc1394feature_modes_t modes);

/**
 * Gets the current control modes for a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_mode(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394feature_mode_t*") IntPointer mode);
public static native @Cast("dc1394error_t") int dc1394_feature_get_mode(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394feature_mode_t*") IntBuffer mode);
public static native @Cast("dc1394error_t") int dc1394_feature_get_mode(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394feature_mode_t*") int[] mode);

/**
 * Sets the current control modes for a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_set_mode(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394feature_mode_t") int mode);

/**
 * Tells whether a feature can be controlled in absolute mode
 */
public static native @Cast("dc1394error_t") int dc1394_feature_has_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_has_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_has_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394bool_t*") int[] value);

/**
 * Gets the absolute boundaries of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, FloatPointer min, FloatPointer max);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, FloatBuffer min, FloatBuffer max);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_boundaries(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, float[] min, float[] max);

/**
 * Gets the absolute value of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, FloatPointer value);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, FloatBuffer value);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, float[] value);

/**
 * Sets the absolute value of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_set_absolute_value(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, float value);

/**
 * Gets the status of absolute control of a feature
 */
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_feature_get_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t*") int[] pwr);

/**
 * Sets the feature in absolute control mode (ON/OFF)
 */
public static native @Cast("dc1394error_t") int dc1394_feature_set_absolute_control(dc1394camera_t camera, @Cast("dc1394feature_t") int feature, @Cast("dc1394switch_t") int pwr);

/***************************************************************************
     Trigger
 ***************************************************************************/

/**
 * Sets the polarity of the external trigger
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_set_polarity(dc1394camera_t camera, @Cast("dc1394trigger_polarity_t") int polarity);

/**
 * Gets the polarity of the external trigger
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_polarity(dc1394camera_t camera, @Cast("dc1394trigger_polarity_t*") IntPointer polarity);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_polarity(dc1394camera_t camera, @Cast("dc1394trigger_polarity_t*") IntBuffer polarity);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_polarity(dc1394camera_t camera, @Cast("dc1394trigger_polarity_t*") int[] polarity);

/**
 * Tells whether the external trigger can change its polarity or not.
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_has_polarity(dc1394camera_t camera, @Cast("dc1394bool_t*") IntPointer polarity_capable);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_has_polarity(dc1394camera_t camera, @Cast("dc1394bool_t*") IntBuffer polarity_capable);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_has_polarity(dc1394camera_t camera, @Cast("dc1394bool_t*") int[] polarity_capable);

/**
 * Switch between internal and external trigger
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_set_power(dc1394camera_t camera, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the status of the external trigger
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") int[] pwr);

/**
 * Sets the external trigger mode
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_set_mode(dc1394camera_t camera, @Cast("dc1394trigger_mode_t") int mode);

/**
 * Gets the external trigger mode
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_mode(dc1394camera_t camera, @Cast("dc1394trigger_mode_t*") IntPointer mode);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_mode(dc1394camera_t camera, @Cast("dc1394trigger_mode_t*") IntBuffer mode);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_mode(dc1394camera_t camera, @Cast("dc1394trigger_mode_t*") int[] mode);

/**
 * Sets the external trigger source
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_set_source(dc1394camera_t camera, @Cast("dc1394trigger_source_t") int source);

/**
 * Gets the external trigger source
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_source(dc1394camera_t camera, @Cast("dc1394trigger_source_t*") IntPointer source);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_source(dc1394camera_t camera, @Cast("dc1394trigger_source_t*") IntBuffer source);
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_source(dc1394camera_t camera, @Cast("dc1394trigger_source_t*") int[] source);

/**
 * Gets the list of available external trigger source
 */
public static native @Cast("dc1394error_t") int dc1394_external_trigger_get_supported_sources(dc1394camera_t camera, dc1394trigger_sources_t sources);

/**
 * Turn software trigger on or off
 */
public static native @Cast("dc1394error_t") int dc1394_software_trigger_set_power(dc1394camera_t camera, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the state of software trigger
 */
public static native @Cast("dc1394error_t") int dc1394_software_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_software_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_software_trigger_get_power(dc1394camera_t camera, @Cast("dc1394switch_t*") int[] pwr);

/***************************************************************************
     PIO, SIO and Strobe Functions
 ***************************************************************************/

/**
 * Sends a quadlet on the PIO (output)
 */
public static native @Cast("dc1394error_t") int dc1394_pio_set(dc1394camera_t camera, @Cast("uint32_t") int value);

/**
 * Gets the current quadlet at the PIO (input)
 */
public static native @Cast("dc1394error_t") int dc1394_pio_get(dc1394camera_t camera, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_pio_get(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_pio_get(dc1394camera_t camera, @Cast("uint32_t*") int[] value);

/***************************************************************************
     Other functionalities
 ***************************************************************************/

/**
 * reset a camera to factory default settings
 */
public static native @Cast("dc1394error_t") int dc1394_camera_reset(dc1394camera_t camera);

/**
 * turn a camera on or off
 */
public static native @Cast("dc1394error_t") int dc1394_camera_set_power(dc1394camera_t camera, @Cast("dc1394switch_t") int pwr);

/**
 * Download a camera setup from the memory.
 */
public static native @Cast("dc1394error_t") int dc1394_memory_busy(dc1394camera_t camera, @Cast("dc1394bool_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_memory_busy(dc1394camera_t camera, @Cast("dc1394bool_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_memory_busy(dc1394camera_t camera, @Cast("dc1394bool_t*") int[] value);

/**
 * Uploads a camera setup in the memory.
 *
 * Note that this operation can only be performed a certain number of
 * times for a given camera, as it requires reprogramming of an EEPROM.
 */
public static native @Cast("dc1394error_t") int dc1394_memory_save(dc1394camera_t camera, @Cast("uint32_t") int channel);

/**
 * Tells whether the writing of the camera setup in memory is finished or not.
 */
public static native @Cast("dc1394error_t") int dc1394_memory_load(dc1394camera_t camera, @Cast("uint32_t") int channel);


// #ifdef __cplusplus
// #endif

// #endif /* __DC1394_CONTROL_H__ */


// Parsed from <dc1394/capture.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */


// #include <dc1394/log.h>
// #include <dc1394/video.h>

// #ifndef __DC1394_CAPTURE_H__
// #define __DC1394_CAPTURE_H__

/** \file dc1394/capture.h
    \brief Capture functions
    @author Damien Douxchamps: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

/**
 * The capture policy.
 *
 * Can be blocking (wait for a frame forever) or polling (returns if no frames is in the ring buffer)
 */
/** enum dc1394capture_policy_t */
public static final int
    DC1394_CAPTURE_POLICY_WAIT= 672,
    DC1394_CAPTURE_POLICY_POLL = 673;
public static final int DC1394_CAPTURE_POLICY_MIN =    DC1394_CAPTURE_POLICY_WAIT;
public static final int DC1394_CAPTURE_POLICY_MAX =    DC1394_CAPTURE_POLICY_POLL;
public static final int DC1394_CAPTURE_POLICY_NUM =   (DC1394_CAPTURE_POLICY_MAX - DC1394_CAPTURE_POLICY_MIN + 1);

/**
* typedef for the callback param for dc1394_capture_set_callback
*/

public static class dc1394capture_callback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    dc1394capture_callback_t(Pointer p) { super(p); }
    protected dc1394capture_callback_t() { allocate(); }
    private native void allocate();
    public native void call(dc1394camera_t arg0, Pointer arg1);
}


/**
 * Capture flags. Currently limited to switching automatic functions on/off: channel allocation, bandwidth allocation and automatic
 * starting of ISO transmission
 */
public static final int DC1394_CAPTURE_FLAGS_CHANNEL_ALLOC =   0x00000001;
public static final int DC1394_CAPTURE_FLAGS_BANDWIDTH_ALLOC = 0x00000002;
public static final int DC1394_CAPTURE_FLAGS_DEFAULT =         0x00000004; /* a reasonable default value: do bandwidth and channel allocation */
public static final int DC1394_CAPTURE_FLAGS_AUTO_ISO =        0x00000008; /* automatically start iso before capture and stop it after */

// #ifdef __cplusplus
// #endif

/***************************************************************************
     Capture Functions
 ***************************************************************************/

/**
 * Setup the capture, using a ring buffer of a certain size (num_dma_buffers) and certain options (flags)
 */
public static native @Cast("dc1394error_t") int dc1394_capture_setup(dc1394camera_t camera, @Cast("uint32_t") int num_dma_buffers, @Cast("uint32_t") int flags);

/**
 * Stop the capture
 */
public static native @Cast("dc1394error_t") int dc1394_capture_stop(dc1394camera_t camera);

/**
 * Gets a file descriptor to be used for select(). Must be called after dc1394_capture_setup().
 */
public static native int dc1394_capture_get_fileno(dc1394camera_t camera);

/**
 * Captures a video frame. The returned struct contains the image buffer, among others. This image buffer SHALL NOT be freed, as it represents an area
 * in the memory that belongs to the system. 
 */
public static native @Cast("dc1394error_t") int dc1394_capture_dequeue(dc1394camera_t camera, @Cast("dc1394capture_policy_t") int policy, @Cast("dc1394video_frame_t**") PointerPointer frame);
public static native @Cast("dc1394error_t") int dc1394_capture_dequeue(dc1394camera_t camera, @Cast("dc1394capture_policy_t") int policy, @ByPtrPtr dc1394video_frame_t frame);

/**
 * Returns a frame to the ring buffer once it has been used.
 */
public static native @Cast("dc1394error_t") int dc1394_capture_enqueue(dc1394camera_t camera, dc1394video_frame_t frame);

/**
 * Returns DC1394_TRUE if the given frame (previously dequeued) has been
 * detected to be corrupt (missing data, corrupted data, overrun buffer, etc.).
 * Note that certain types of corruption may go undetected in which case
 * DC1394_FALSE will be returned.  The ability to detect corruption also
 * varies between platforms.  Note that corrupt frames still need to be
 * enqueued with dc1394_capture_enqueue() when no longer needed by the user.
 */
public static native @Cast("dc1394bool_t") int dc1394_capture_is_frame_corrupt(dc1394camera_t camera,
        dc1394video_frame_t frame);

/**
 * Set a callback if supported by the platform (OS X only for now).
 */
public static native void dc1394_capture_set_callback(dc1394camera_t camera,
        dc1394capture_callback_t callback, Pointer user_data);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/conversions.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Color conversion functions, including Bayer pattern decoding
 *
 * Written by Damien Douxchamps and Frederic Devernay
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #include <dc1394/log.h>

// #ifndef __DC1394_CONVERSIONS_H__
// #define __DC1394_CONVERSIONS_H__

/** \file dc1394/conversions.h
    \brief functions to convert video formats
    @author Damien Douxchamps: coding
    @author Frederic Devernay: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

// #define restrict __restrict

/**
 * A list of de-mosaicing techniques for Bayer-patterns.
 *
 * The speed of the techniques can vary greatly, as well as their quality.
 */
/** enum dc1394bayer_method_t */
public static final int
    DC1394_BAYER_METHOD_NEAREST= 0,
    DC1394_BAYER_METHOD_SIMPLE = 1,
    DC1394_BAYER_METHOD_BILINEAR = 2,
    DC1394_BAYER_METHOD_HQLINEAR = 3,
    DC1394_BAYER_METHOD_DOWNSAMPLE = 4,
    DC1394_BAYER_METHOD_EDGESENSE = 5,
    DC1394_BAYER_METHOD_VNG = 6,
    DC1394_BAYER_METHOD_AHD = 7;
public static final int DC1394_BAYER_METHOD_MIN =      DC1394_BAYER_METHOD_NEAREST;
public static final int DC1394_BAYER_METHOD_MAX =      DC1394_BAYER_METHOD_AHD;
public static final int DC1394_BAYER_METHOD_NUM =     (DC1394_BAYER_METHOD_MAX-DC1394_BAYER_METHOD_MIN+1);

/**
 * A list of known stereo-in-normal-video modes used by manufacturers like Point Grey Research and Videre Design.
 */
/** enum dc1394stereo_method_t */
public static final int
    DC1394_STEREO_METHOD_INTERLACED= 0,
    DC1394_STEREO_METHOD_FIELD = 1;
public static final int DC1394_STEREO_METHOD_MIN =     DC1394_STEREO_METHOD_INTERLACED;
public static final int DC1394_STEREO_METHOD_MAX =     DC1394_STEREO_METHOD_FIELD;
public static final int DC1394_STEREO_METHOD_NUM =    (DC1394_STEREO_METHOD_MAX-DC1394_STEREO_METHOD_MIN+1);


// color conversion functions from Bart Nabbe.
// corrected by Damien: bad coeficients in YUV2RGB
public static native void YUV2RGB(int y, int u, int v, @ByRef IntPointer r, @ByRef IntPointer g, @ByRef IntPointer b);
public static native void YUV2RGB(int y, int u, int v, @ByRef IntBuffer r, @ByRef IntBuffer g, @ByRef IntBuffer b);
public static native void YUV2RGB(int y, int u, int v, @ByRef int[] r, @ByRef int[] g, @ByRef int[] b);


public static native void RGB2YUV(int r, int g, int b, @ByRef IntPointer y, @ByRef IntPointer u, @ByRef IntPointer v);
public static native void RGB2YUV(int r, int g, int b, @ByRef IntBuffer y, @ByRef IntBuffer u, @ByRef IntBuffer v);
public static native void RGB2YUV(int r, int g, int b, @ByRef int[] y, @ByRef int[] u, @ByRef int[] v);

// #ifdef __cplusplus
// #endif

/**********************************************************************
 *  CONVERSION FUNCTIONS TO YUV422, MONO8 and RGB8
 **********************************************************************/

/**
 * Converts an image buffer to YUV422
 */
public static native @Cast("dc1394error_t") int dc1394_convert_to_YUV422(@Cast("uint8_t*") BytePointer src, @Cast("uint8_t*") BytePointer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                         @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_YUV422(@Cast("uint8_t*") ByteBuffer src, @Cast("uint8_t*") ByteBuffer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                         @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_YUV422(@Cast("uint8_t*") byte[] src, @Cast("uint8_t*") byte[] dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                         @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);

/**
 * Converts an image buffer to MONO8
 */
public static native @Cast("dc1394error_t") int dc1394_convert_to_MONO8(@Cast("uint8_t*") BytePointer src, @Cast("uint8_t*") BytePointer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                        @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_MONO8(@Cast("uint8_t*") ByteBuffer src, @Cast("uint8_t*") ByteBuffer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                        @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_MONO8(@Cast("uint8_t*") byte[] src, @Cast("uint8_t*") byte[] dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                        @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);

/**
 * Converts an image buffer to RGB8
 */
public static native @Cast("dc1394error_t") int dc1394_convert_to_RGB8(@Cast("uint8_t*") BytePointer src, @Cast("uint8_t*") BytePointer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                       @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_RGB8(@Cast("uint8_t*") ByteBuffer src, @Cast("uint8_t*") ByteBuffer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                       @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_convert_to_RGB8(@Cast("uint8_t*") byte[] src, @Cast("uint8_t*") byte[] dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("uint32_t") int byte_order,
                       @Cast("dc1394color_coding_t") int source_coding, @Cast("uint32_t") int bits);

/**********************************************************************
 *  CONVERSION FUNCTIONS FOR STEREO IMAGES
 **********************************************************************/

/**
 * changes a 16bit stereo image (8bit/channel) into two 8bit images on top of each other
 */
public static native @Cast("dc1394error_t") int dc1394_deinterlace_stereo(@Cast("uint8_t*") BytePointer src, @Cast("uint8_t*") BytePointer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height);
public static native @Cast("dc1394error_t") int dc1394_deinterlace_stereo(@Cast("uint8_t*") ByteBuffer src, @Cast("uint8_t*") ByteBuffer dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height);
public static native @Cast("dc1394error_t") int dc1394_deinterlace_stereo(@Cast("uint8_t*") byte[] src, @Cast("uint8_t*") byte[] dest, @Cast("uint32_t") int width, @Cast("uint32_t") int height);

/************************************************************************************************
 *                                                                                              *
 *      Color conversion functions for cameras that can output raw Bayer pattern images (color  *
 *  codings DC1394_COLOR_CODING_RAW8 and DC1394_COLOR_CODING_RAW16).                            *
 *                                                                                              *
 *  Credits and sources:                                                                        *
 *  - Nearest Neighbor : OpenCV library                                                         *
 *  - Bilinear         : OpenCV library                                                         *
 *  - HQLinear         : High-Quality Linear Interpolation For Demosaicing Of Bayer-Patterned   *
 *                       Color Images, by Henrique S. Malvar, Li-wei He, and Ross Cutler,       *
 *                          in Proceedings of the ICASSP'04 Conference.                            *
 *  - Edge Sense II    : Laroche, Claude A. "Apparatus and method for adaptively interpolating  *
 *                       a full color image utilizing chrominance gradients"                    *
 *                          U.S. Patent 5,373,322. Based on the code found on the website          *
 *                       http://www-ise.stanford.edu/~tingchen/ Converted to C and adapted to   *
 *                       all four elementary patterns.                                          *
 *  - Downsample       : "Known to the Ancients"                                                *
 *  - Simple           : Implemented from the information found in the manual of Allied Vision  *
 *                       Technologies (AVT) cameras.                                            *
 *  - VNG              : Variable Number of Gradients, a method described in                    *
 *                       http://www-ise.stanford.edu/~tingchen/algodep/vargra.html              *
 *                       Sources import from DCRAW by Frederic Devernay. DCRAW is a RAW         *
 *                       converter program by Dave Coffin. URL:                                 *
 *                       http://www.cybercom.net/~dcoffin/dcraw/                                *
 *  - AHD              : Adaptive Homogeneity-Directed Demosaicing Algorithm, by K. Hirakawa    *
 *                       and T.W. Parks, IEEE Transactions on Image Processing, Vol. 14, Nr. 3, *
 *                       March 2005, pp. 360 - 369.                                             *
 *                                                                                              *
 ************************************************************************************************/

/**
 * Perform de-mosaicing on an 8-bit image buffer
 */
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_8bit(@Cast("const uint8_t*") BytePointer bayer, @Cast("uint8_t*") BytePointer rgb,
                           @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                           @Cast("dc1394bayer_method_t") int method);
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_8bit(@Cast("const uint8_t*") ByteBuffer bayer, @Cast("uint8_t*") ByteBuffer rgb,
                           @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                           @Cast("dc1394bayer_method_t") int method);
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_8bit(@Cast("const uint8_t*") byte[] bayer, @Cast("uint8_t*") byte[] rgb,
                           @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                           @Cast("dc1394bayer_method_t") int method);

/**
 * Perform de-mosaicing on an 16-bit image buffer
 */
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_16bit(@Cast("const uint16_t*") ShortPointer bayer, @Cast("uint16_t*") ShortPointer rgb,
                            @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                            @Cast("dc1394bayer_method_t") int method, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_16bit(@Cast("const uint16_t*") ShortBuffer bayer, @Cast("uint16_t*") ShortBuffer rgb,
                            @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                            @Cast("dc1394bayer_method_t") int method, @Cast("uint32_t") int bits);
public static native @Cast("dc1394error_t") int dc1394_bayer_decoding_16bit(@Cast("const uint16_t*") short[] bayer, @Cast("uint16_t*") short[] rgb,
                            @Cast("uint32_t") int width, @Cast("uint32_t") int height, @Cast("dc1394color_filter_t") int tile,
                            @Cast("dc1394bayer_method_t") int method, @Cast("uint32_t") int bits);


/**********************************************************************************
 *  Frame based conversions
 **********************************************************************************/

/**
 * Converts the format of a video frame.
 *
 * To set the format of the output, simply set the values of the corresponding fields in the output frame
 */
public static native @Cast("dc1394error_t") int dc1394_convert_frames(dc1394video_frame_t in, dc1394video_frame_t out);

/**
 * De-mosaicing of a Bayer-encoded video frame
 *
 * To set the format of the output, simply set the values of the corresponding fields in the output frame
 * @param in is a pointer to the bayer video frame that is to be converted
 * @param out is a pointer to the frame to be converted to.  If there is memory allocated to the image field, 
 *      then it will be adjusted accordingly by this function.  If there is no memory allocated to the image
 *      field, then ensure that out->image == NULL and out->allocated_image_bytes == 0
 * @param method is the bayer method to interpolate the frame.
 */
public static native @Cast("dc1394error_t") int dc1394_debayer_frames(dc1394video_frame_t in, dc1394video_frame_t out, @Cast("dc1394bayer_method_t") int method);

/**
 * De-interlacing of stereo data for cideo frames
 *
 * To set the format of the output, simply set the values of the corresponding fields in the output frame
 */
public static native @Cast("dc1394error_t") int dc1394_deinterlace_stereo_frames(dc1394video_frame_t in, dc1394video_frame_t out, @Cast("dc1394stereo_method_t") int method);

// #ifdef __cplusplus
// #endif

// #endif /* _DC1394_CONVERSIONS_H */




// Parsed from <dc1394/format7.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Format_7 functions
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA
 */

// #include <dc1394/log.h>
// #include <dc1394/video.h>

// #ifndef __DC1394_FORMAT7_H__
// #define __DC1394_FORMAT7_H__

/** \file dc1394/format7.h
    \brief Functions to control Format_7 (aka scalable format, ROI)
<p>
    More details soon
*/

/**
 * A struct containing information about a mode of Format_7, the scalable image format.
 */
public static class dc1394format7mode_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394format7mode_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394format7mode_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394format7mode_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394format7mode_t position(int position) {
        return (dc1394format7mode_t)super.position(position);
    }

    public native @Cast("dc1394bool_t") int present(); public native dc1394format7mode_t present(int present);

    public native @Cast("uint32_t") int size_x(); public native dc1394format7mode_t size_x(int size_x);
    public native @Cast("uint32_t") int size_y(); public native dc1394format7mode_t size_y(int size_y);
    public native @Cast("uint32_t") int max_size_x(); public native dc1394format7mode_t max_size_x(int max_size_x);
    public native @Cast("uint32_t") int max_size_y(); public native dc1394format7mode_t max_size_y(int max_size_y);

    public native @Cast("uint32_t") int pos_x(); public native dc1394format7mode_t pos_x(int pos_x);
    public native @Cast("uint32_t") int pos_y(); public native dc1394format7mode_t pos_y(int pos_y);

    public native @Cast("uint32_t") int unit_size_x(); public native dc1394format7mode_t unit_size_x(int unit_size_x);
    public native @Cast("uint32_t") int unit_size_y(); public native dc1394format7mode_t unit_size_y(int unit_size_y);
    public native @Cast("uint32_t") int unit_pos_x(); public native dc1394format7mode_t unit_pos_x(int unit_pos_x);
    public native @Cast("uint32_t") int unit_pos_y(); public native dc1394format7mode_t unit_pos_y(int unit_pos_y);

    public native @ByRef dc1394color_codings_t color_codings(); public native dc1394format7mode_t color_codings(dc1394color_codings_t color_codings);
    public native @Cast("dc1394color_coding_t") int color_coding(); public native dc1394format7mode_t color_coding(int color_coding);

    public native @Cast("uint32_t") int pixnum(); public native dc1394format7mode_t pixnum(int pixnum);

    public native @Cast("uint32_t") int packet_size(); public native dc1394format7mode_t packet_size(int packet_size); /* in bytes */
    public native @Cast("uint32_t") int unit_packet_size(); public native dc1394format7mode_t unit_packet_size(int unit_packet_size);
    public native @Cast("uint32_t") int max_packet_size(); public native dc1394format7mode_t max_packet_size(int max_packet_size);

    public native @Cast("uint64_t") long total_bytes(); public native dc1394format7mode_t total_bytes(long total_bytes);

    public native @Cast("dc1394color_filter_t") int color_filter(); public native dc1394format7mode_t color_filter(int color_filter);

}

/**
 * A struct containing the list of Format_7 modes.
 * FIXME: this may become very big if format_7 pages are used in IIDC 1.32. It would be better to use a "num" and an allocated list.
 */
public static class dc1394format7modeset_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394format7modeset_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394format7modeset_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394format7modeset_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394format7modeset_t position(int position) {
        return (dc1394format7modeset_t)super.position(position);
    }

    public native @ByRef dc1394format7mode_t mode(int i); public native dc1394format7modeset_t mode(int i, dc1394format7mode_t mode);
    @MemberGetter public native dc1394format7mode_t mode();
}

/* Parameter flags for dc1394_setup_format7_capture() */
public static final int DC1394_QUERY_FROM_CAMERA = -1;
public static final int DC1394_USE_MAX_AVAIL =     -2;
public static final int DC1394_USE_RECOMMENDED =   -3;

// #ifdef __cplusplus
// #endif

/***************************************************************************
     Format_7 (scalable image format)
 ***************************************************************************/

/* image size */

/**
 * Gets the maximal image size for a given mode.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_max_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer h_size,@Cast("uint32_t*") IntPointer v_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_max_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer h_size,@Cast("uint32_t*") IntBuffer v_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_max_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] h_size,@Cast("uint32_t*") int[] v_size);

/**
 * Gets the unit sizes for a given mode. The image size can only be a multiple of the unit size, and cannot be smaller than it.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer h_unit, @Cast("uint32_t*") IntPointer v_unit);
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer h_unit, @Cast("uint32_t*") IntBuffer v_unit);
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] h_unit, @Cast("uint32_t*") int[] v_unit);

/**
 * Gets the current image size.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer width, @Cast("uint32_t*") IntPointer height);
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer width, @Cast("uint32_t*") IntBuffer height);
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] width, @Cast("uint32_t*") int[] height);

/**
 * Sets the current image size
 */
public static native @Cast("dc1394error_t") int dc1394_format7_set_image_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t") int width, @Cast("uint32_t") int height);

/* image position */

/**
 * Gets the current image position
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer left, @Cast("uint32_t*") IntPointer top);
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer left, @Cast("uint32_t*") IntBuffer top);
public static native @Cast("dc1394error_t") int dc1394_format7_get_image_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] left, @Cast("uint32_t*") int[] top);

/**
 * Sets the current image position
 */
public static native @Cast("dc1394error_t") int dc1394_format7_set_image_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t") int left, @Cast("uint32_t") int top);

/**
 * Gets the unit positions for a given mode. The image position can only be a multiple of the unit position (zero is acceptable).
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer h_unit_pos, @Cast("uint32_t*") IntPointer v_unit_pos);
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer h_unit_pos, @Cast("uint32_t*") IntBuffer v_unit_pos);
public static native @Cast("dc1394error_t") int dc1394_format7_get_unit_position(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] h_unit_pos, @Cast("uint32_t*") int[] v_unit_pos);

/* color coding */

/**
 * Gets the current color coding
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_coding(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntPointer color_coding);
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_coding(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntBuffer color_coding);
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_coding(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") int[] color_coding);

/**
 * Gets the list of color codings available for this mode
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_codings(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, dc1394color_codings_t codings);

/**
 * Sets the current color coding
 */
public static native @Cast("dc1394error_t") int dc1394_format7_set_color_coding(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t") int color_coding);

/**
 * Gets the current color filter
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_filter(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_filter_t*") IntPointer color_filter);
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_filter(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_filter_t*") IntBuffer color_filter);
public static native @Cast("dc1394error_t") int dc1394_format7_get_color_filter(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_filter_t*") int[] color_filter);

/* packet */

/**
 * Get the parameters of the packet size: its maximal size and its unit size. The packet size is always a multiple of the unit bytes and cannot be zero.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_parameters(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer unit_bytes, @Cast("uint32_t*") IntPointer max_bytes);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_parameters(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer unit_bytes, @Cast("uint32_t*") IntBuffer max_bytes);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_parameters(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] unit_bytes, @Cast("uint32_t*") int[] max_bytes);

/**
 * Gets the current packet size
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer packet_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer packet_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] packet_size);

/**
 * Sets the current packet size
 */
public static native @Cast("dc1394error_t") int dc1394_format7_set_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t") int packet_size);

/**
 * Gets the recommended packet size. Ignore if zero.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_recommended_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer packet_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_recommended_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer packet_size);
public static native @Cast("dc1394error_t") int dc1394_format7_get_recommended_packet_size(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] packet_size);

/**
 * Gets the number of packets per frame.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_packets_per_frame(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer ppf);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packets_per_frame(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer ppf);
public static native @Cast("dc1394error_t") int dc1394_format7_get_packets_per_frame(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] ppf);

/* other */

/**
 * Gets the data depth (e.g. 12, 13, 14 bits/pixel)
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_data_depth(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer data_depth);
public static native @Cast("dc1394error_t") int dc1394_format7_get_data_depth(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer data_depth);
public static native @Cast("dc1394error_t") int dc1394_format7_get_data_depth(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] data_depth);

/**
 * Gets the frame interval in float format
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_frame_interval(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, FloatPointer interval);
public static native @Cast("dc1394error_t") int dc1394_format7_get_frame_interval(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, FloatBuffer interval);
public static native @Cast("dc1394error_t") int dc1394_format7_get_frame_interval(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, float[] interval);

/**
 * Gets the number of pixels per image frame
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_pixel_number(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntPointer pixnum);
public static native @Cast("dc1394error_t") int dc1394_format7_get_pixel_number(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") IntBuffer pixnum);
public static native @Cast("dc1394error_t") int dc1394_format7_get_pixel_number(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint32_t*") int[] pixnum);

/**
 * Get the total number of bytes per frame. This includes padding (to reach an entire number of packets)
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_total_bytes(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint64_t*") LongPointer total_bytes);
public static native @Cast("dc1394error_t") int dc1394_format7_get_total_bytes(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint64_t*") LongBuffer total_bytes);
public static native @Cast("dc1394error_t") int dc1394_format7_get_total_bytes(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("uint64_t*") long[] total_bytes);

/* These functions get the properties of (one or all) format7 mode(s) */

/**
 * Gets the properties of all Format_7 modes supported by the camera.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_modeset(dc1394camera_t camera, dc1394format7modeset_t info);

/**
 * Gets the properties of a Format_7 mode
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_mode_info(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, dc1394format7mode_t f7_mode);

/**
 * Joint function that fully sets a certain ROI taking all parameters into account.
 * Note that this function does not SWITCH to the video mode passed as argument, it mearly sets it
 */
public static native @Cast("dc1394error_t") int dc1394_format7_set_roi(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t") int color_coding,
                                     int packet_size, int left, int top, int width, int height);

/**
 * Joint function that fully gets a certain ROI taking all parameters into account.
 */
public static native @Cast("dc1394error_t") int dc1394_format7_get_roi(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntPointer color_coding,
                                     @Cast("uint32_t*") IntPointer packet_size, @Cast("uint32_t*") IntPointer left, @Cast("uint32_t*") IntPointer top, @Cast("uint32_t*") IntPointer width, @Cast("uint32_t*") IntPointer height);
public static native @Cast("dc1394error_t") int dc1394_format7_get_roi(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntBuffer color_coding,
                                     @Cast("uint32_t*") IntBuffer packet_size, @Cast("uint32_t*") IntBuffer left, @Cast("uint32_t*") IntBuffer top, @Cast("uint32_t*") IntBuffer width, @Cast("uint32_t*") IntBuffer height);
public static native @Cast("dc1394error_t") int dc1394_format7_get_roi(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") int[] color_coding,
                                     @Cast("uint32_t*") int[] packet_size, @Cast("uint32_t*") int[] left, @Cast("uint32_t*") int[] top, @Cast("uint32_t*") int[] width, @Cast("uint32_t*") int[] height);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/iso.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Functions for the manual allocations of ISO ressources.
 *
 * Written by David Moore <dcm@acm.org>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #ifndef __DC1394_ISO_H__
// #define __DC1394_ISO_H__

/** \file dc1394/iso.h
    \brief Functions to manually manage the ISO resources (channels and bandwidth)
    @author Damien Douxchamps: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

// #include <dc1394/log.h>

// #ifdef __cplusplus
// #endif

/**
 * dc1394_iso_set_persist
 * @param camera A camera handle.
 *
 * Calling this function will cause isochronous channel and bandwidth
 * allocations to persist beyond the lifetime of this dc1394camera_t
 * instance.  Normally (when this function is not called), any allocations
 * would be automatically released upon freeing this camera or a
 * premature shutdown of the application (if possible).  For this function
 * to be used, it must be called prior to any allocations or an error will
 * be returned.
 *
 * @return \a DC1394_SUCCESS if the operation succeeded.
 * \a DC1394_FUNCTION_NOT_SUPPORTED if the current platform/driver does not
 * allow persistent allocations.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_set_persist(dc1394camera_t camera);

/**
 * dc1394_iso_allocate_channel:
 * @param camera A camera handle.
 * @param channels_allowed A bitmask of acceptable channels for the allocation.
 *   The LSB corresponds to channel 0 and the MSB corresponds to channel
 *   63.  Only channels whose bit is set will be considered for the allocation.
 *   If \a channels_allowed = 0, the complete set of channels supported by
 *   this camera will be considered for the allocation.
 * @param channel The allocated channel number is returned here.
 *
 * Allocates an isochronous channel.  This
 * function may be called multiple times, each time allocating an additional
 * channel.  The channel is automatically re-allocated if there is a bus
 * reset.  The channel is automatically released when this dc1394camera_t
 * is freed or if the application shuts down prematurely.  If the channel
 * needs to persist beyond the lifetime of this application, call
 * \a dc1394_iso_set_persist() first.  Note that this function does _not_
 * automatically program \a camera to use the allocated channel for isochronous
 * streaming.  You must do that manually using \a dc1394_video_set_iso_channel().
 *
 * @return \a DC1394_SUCCESS if the operation succeeded.  The allocated
 * channel is stored in \a channel. \a DC1394_FUNCTION_NOT_SUPPORTED if the
 * current driver/platform does not allow channel allocation.
 * \a DC1394_NO_ISO_CHANNEL if none of the requested channels are available.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_allocate_channel(dc1394camera_t camera,
    @Cast("uint64_t") long channels_allowed, IntPointer channel);
public static native @Cast("dc1394error_t") int dc1394_iso_allocate_channel(dc1394camera_t camera,
    @Cast("uint64_t") long channels_allowed, IntBuffer channel);
public static native @Cast("dc1394error_t") int dc1394_iso_allocate_channel(dc1394camera_t camera,
    @Cast("uint64_t") long channels_allowed, int[] channel);

/**
 * dc1394_iso_release_channel:
 * @param camera A camera handle.
 * @param channel The channel number to release.
 *
 * Releases a previously allocated channel.  It is acceptable to release
 * channels that were allocated by a different process or host.  If
 * attempting to release a channel that is already released, the function
 * will succeed.
 *
 * @return \a DC1394_SUCCESS if the operation succeeded.
 * \a DC1394_FUNCTION_NOT_SUPPORTED if the current driver/platform does not
 * allow channel release.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_release_channel(dc1394camera_t camera,
    int channel);

/**
 * dc1394_iso_allocate_bandwidth:
 * @param camera A camera handle.
 * @param bandwidth_units The number of isochronous bandwidth units to allocate.
 *
 * Allocates isochronous bandwidth.  This functions allocates bandwidth
 * _in addition_ to any previous allocations.  It may be called multiple
 * times.  The bandwidth is automatically re-allocated if there is a bus
 * reset.  The bandwidth is automatically released if this camera is freed
 * or the application shuts down prematurely.  If the bandwidth needs to
 * persist beyond the lifetime of this application, call
 * \a dc1394_iso_set_persist() first.
 *
 * @return \a DC1394_SUCCESS if the operation succeeded.
 * \a DC1394_FUNCTION_NOT_SUPPORTED if the current driver/platform does not
 * allow bandwidth allocation. \a DC1394_NO_BANDWIDTH if there is not enough
 * available bandwidth to support the allocation.  In this case,
 * no bandwidth is allocated.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_allocate_bandwidth(dc1394camera_t camera,
    int bandwidth_units);

/**
 * dc1394_iso_release_bandwidth:
 * @param camera A camera handle.
 * @param bandwidth_units The number of isochronous bandwidth units to free.
 *
 * Releases previously allocated isochronous bandwidth.  Each \a dc1394camera_t
 * keeps track of a running total of bandwidth that has been allocated.
 * Released bandwidth is subtracted from this total for the sake of
 * automatic re-allocation and automatic release on shutdown.  It is also
 * acceptable for a camera to release more bandwidth than it has allocated
 * (to clean up for another process for example).  In this case, the
 * running total of bandwidth is not affected.  It is acceptable to
 * release more bandwidth than is allocated in total for the bus.  In this
 * case, all bandwidth is released and the function succeeds.
 *
 * @return \a DC1394_SUCCESS if the operation succeeded.
 * \a DC1394_FUNCTION_NOT_SUPPORTED if the current driver/platform does not
 * allow bandwidth release.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_release_bandwidth(dc1394camera_t camera,
    int bandwidth_units);

/**
 * dc1394_iso_release_all:
 * @param camera A camera handle.
 *
 * Releases all channels and bandwidth that have been previously allocated
 * for this dc1394camera_t.  Note that this information can only be tracked
 * per process, and there is no knowledge of allocations for this camera
 * by previous processes.  To release resources in such a case, the manual
 * release functions \a dc1394_iso_release_channel() and
 * \a dc1394_iso_release_bandwidth() must be used.
 *
 * @return \a DC1394_SUCCESS if the operation succeeded. \a DC1394_FAILURE
 * if some resources were not able to be released.
 */
public static native @Cast("dc1394error_t") int dc1394_iso_release_all(dc1394camera_t camera);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/register.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Low-level register access functions
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #ifndef __DC1394_REGISTER_H__
// #define __DC1394_REGISTER_H__

/** \file dc1394/register.h
    \brief Functions to directly access camera registers.
    @author Damien Douxchamps: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

// #ifdef __cplusplus
// #endif

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_register(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_register(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_register(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_register(dc1394camera_t camera,
                                                 @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set Command Registers                                                    */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_control_registers(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_control_registers(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_control_registers(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_control_register(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_control_register(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_control_register(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_control_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_control_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_control_registers(dc1394camera_t camera,
        @Cast("uint64_t") long offset, @Cast("const uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_control_register(dc1394camera_t camera,
    @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set Advanced Features Registers                                          */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_adv_control_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset,
        @Cast("const uint32_t*") IntPointer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset,
        @Cast("const uint32_t*") IntBuffer value, @Cast("uint32_t") int num_regs);
public static native @Cast("dc1394error_t") int dc1394_set_adv_control_registers(dc1394camera_t camera, @Cast("uint64_t") long offset,
        @Cast("const uint32_t*") int[] value, @Cast("uint32_t") int num_regs);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_adv_control_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set Format_7 Registers                                                   */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_format7_register(dc1394camera_t camera, @Cast("unsigned int") int mode, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_format7_register(dc1394camera_t camera, @Cast("unsigned int") int mode, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_format7_register(dc1394camera_t camera, @Cast("unsigned int") int mode, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_format7_register(dc1394camera_t camera, @Cast("unsigned int") int mode, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set Absolute Control Registers                                           */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_absolute_register(dc1394camera_t camera, @Cast("unsigned int") int feature, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_absolute_register(dc1394camera_t camera, @Cast("unsigned int") int feature, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_absolute_register(dc1394camera_t camera, @Cast("unsigned int") int feature, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_absolute_register(dc1394camera_t camera, @Cast("unsigned int") int feature, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set PIO Feature Registers                                                */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_PIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_PIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_PIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_PIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set SIO Feature Registers                                                */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_SIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_SIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_SIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_SIO_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


/********************************************************************************/
/* Get/Set Strobe Feature Registers                                             */
/********************************************************************************/

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_get_strobe_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntPointer value);
public static native @Cast("dc1394error_t") int dc1394_get_strobe_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") IntBuffer value);
public static native @Cast("dc1394error_t") int dc1394_get_strobe_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t*") int[] value);

/**
 * No Docs
 */
public static native @Cast("dc1394error_t") int dc1394_set_strobe_register(dc1394camera_t camera, @Cast("uint64_t") long offset, @Cast("uint32_t") int value);


// #ifdef __cplusplus
// #endif

// #endif /* __DC1394_REGISTER_H__ */


// Parsed from <dc1394/video.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Video format headers
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #include <dc1394/log.h>

/** \file dc1394/video.h
    \brief Functions related to video modes, formats, framerate and video flow.
<p>
    More details soon
*/

// #ifndef __DC1394_VIDEO_H__
// #define __DC1394_VIDEO_H__

/**
 * Enumeration of iso data speeds
 *
 * Most (if not all) cameras are compatible with 400Mbps speed. Only older cameras (pre-1999) may still only work at sub-400
 * speeds. However, speeds lower than 400Mbps are still useful: they can be used for longer distances (e.g. 10m cables).
 * Speeds over 400Mbps are only available in "B" mode (DC1394_OPERATION_MODE_1394B).
 */
/** enum dc1394speed_t */
public static final int
    DC1394_ISO_SPEED_100= 0,
    DC1394_ISO_SPEED_200 = 1,
    DC1394_ISO_SPEED_400 = 2,
    DC1394_ISO_SPEED_800 = 3,
    DC1394_ISO_SPEED_1600 = 4,
    DC1394_ISO_SPEED_3200 = 5;
public static final int DC1394_ISO_SPEED_MIN =                   DC1394_ISO_SPEED_100;
public static final int DC1394_ISO_SPEED_MAX =                   DC1394_ISO_SPEED_3200;
public static final int DC1394_ISO_SPEED_NUM =                  (DC1394_ISO_SPEED_MAX - DC1394_ISO_SPEED_MIN + 1);

/**
 * Enumeration of video framerates
 *
 * This enumeration is used for non-Format_7 modes. The framerate can be lower than expected if the exposure time is longer
 * than the requested frame period. Framerate can be controlled in a number of other ways: framerate feature, external trigger,
 * software trigger, shutter throttling and packet size (Format_7)
 */
/** enum dc1394framerate_t */
public static final int
    DC1394_FRAMERATE_1_875= 32,
    DC1394_FRAMERATE_3_75 = 33,
    DC1394_FRAMERATE_7_5 = 34,
    DC1394_FRAMERATE_15 = 35,
    DC1394_FRAMERATE_30 = 36,
    DC1394_FRAMERATE_60 = 37,
    DC1394_FRAMERATE_120 = 38,
    DC1394_FRAMERATE_240 = 39;
public static final int DC1394_FRAMERATE_MIN =               DC1394_FRAMERATE_1_875;
public static final int DC1394_FRAMERATE_MAX =               DC1394_FRAMERATE_240;
public static final int DC1394_FRAMERATE_NUM =              (DC1394_FRAMERATE_MAX - DC1394_FRAMERATE_MIN + 1);

/**
 * Operation modes
 *
 * Two operation modes exist: the legacy and most common 1394a, and the newer 1394B. The latter allows speeds over 400Mbps, but
 * can also be used at other speeds.
 */
/** enum dc1394operation_mode_t */
public static final int
    DC1394_OPERATION_MODE_LEGACY = 480,
    DC1394_OPERATION_MODE_1394B = 481;
public static final int DC1394_OPERATION_MODE_MIN =    DC1394_OPERATION_MODE_LEGACY;
public static final int DC1394_OPERATION_MODE_MAX =    DC1394_OPERATION_MODE_1394B;
public static final int DC1394_OPERATION_MODE_NUM =   (DC1394_OPERATION_MODE_MAX - DC1394_OPERATION_MODE_MIN + 1);

/**
 * List of framerates
 *
 * dc1394framerates_t contains a list of available framerates for a particular video mode.
 */
public static class dc1394framerates_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394framerates_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394framerates_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394framerates_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394framerates_t position(int position) {
        return (dc1394framerates_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394framerates_t num(int num);
    public native @Cast("dc1394framerate_t") int framerates(int i); public native dc1394framerates_t framerates(int i, int framerates);
    @MemberGetter public native @Cast("dc1394framerate_t*") IntPointer framerates();
}

/**
 * Video frame structure.
 *
 * dc1394video_frame_t is the structure returned by the capture functions. It contains the captured image as well as a number of
 * information. 
 *
 * In general this structure should be calloc'ed so that members such as "allocated size"
 * are properly set to zero. Don't forget to free the "image" member before freeing the struct itself.
 */
public static class dc1394video_frame_t extends dc1394video_frame_t_abstract {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394video_frame_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public dc1394video_frame_t(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394video_frame_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public dc1394video_frame_t position(int position) {
        return (dc1394video_frame_t)super.position(position);
    }

    public native @Cast("unsigned char*") BytePointer image(); public native dc1394video_frame_t image(BytePointer image);                 /* the image. May contain padding data too (vendor specific). Read/write allowed. Free NOT allowed if
						       returned by dc1394_capture_dequeue() */
    public native @Cast("uint32_t") int size(int i); public native dc1394video_frame_t size(int i, int size);
    @MemberGetter public native @Cast("uint32_t*") IntPointer size();               /* the image size [width, height] */
    public native @Cast("uint32_t") @Name("position") int _position(int i); public native dc1394video_frame_t _position(int i, int _position);
    @MemberGetter public native @Cast("uint32_t*") @Name("position") IntPointer _position();           /* the WOI/ROI position [horizontal, vertical] == [0,0] for full frame */
    public native @Cast("dc1394color_coding_t") int color_coding(); public native dc1394video_frame_t color_coding(int color_coding);          /* the color coding used. This field is valid for all video modes. */
    public native @Cast("dc1394color_filter_t") int color_filter(); public native dc1394video_frame_t color_filter(int color_filter);          /* the color filter used. This field is valid only for RAW modes and IIDC 1.31 */
    public native @Cast("uint32_t") int yuv_byte_order(); public native dc1394video_frame_t yuv_byte_order(int yuv_byte_order);        /* the order of the fields for 422 formats: YUYV or UYVY */
    public native @Cast("uint32_t") int data_depth(); public native dc1394video_frame_t data_depth(int data_depth);            /* the number of bits per pixel. The number of grayscale levels is 2^(this_number).
                                                       This is independent from the colour coding */
    public native @Cast("uint32_t") int stride(); public native dc1394video_frame_t stride(int stride);                /* the number of bytes per image line */
    public native @Cast("dc1394video_mode_t") int video_mode(); public native dc1394video_frame_t video_mode(int video_mode);            /* the video mode used for capturing this frame */
    public native @Cast("uint64_t") long total_bytes(); public native dc1394video_frame_t total_bytes(long total_bytes);           /* the total size of the frame buffer in bytes. May include packet-
                                                       multiple padding and intentional padding (vendor specific) */
    public native @Cast("uint32_t") int image_bytes(); public native dc1394video_frame_t image_bytes(int image_bytes);           /* the number of bytes used for the image (image data only, no padding) */
    public native @Cast("uint32_t") int padding_bytes(); public native dc1394video_frame_t padding_bytes(int padding_bytes);         /* the number of extra bytes, i.e. total_bytes-image_bytes.  */
    public native @Cast("uint32_t") int packet_size(); public native dc1394video_frame_t packet_size(int packet_size);           /* the size of a packet in bytes. (IIDC data) */
    public native @Cast("uint32_t") int packets_per_frame(); public native dc1394video_frame_t packets_per_frame(int packets_per_frame);     /* the number of packets per frame. (IIDC data) */
    public native @Cast("uint64_t") long timestamp(); public native dc1394video_frame_t timestamp(long timestamp);             /* the unix time [microseconds] at which the frame was captured in
                                                       the video1394 ringbuffer */
    public native @Cast("uint32_t") int frames_behind(); public native dc1394video_frame_t frames_behind(int frames_behind);         /* the number of frames in the ring buffer that are yet to be accessed by the user */
    public native dc1394camera_t camera(); public native dc1394video_frame_t camera(dc1394camera_t camera);               /* the parent camera of this frame */
    public native @Cast("uint32_t") int id(); public native dc1394video_frame_t id(int id);                    /* the frame position in the ring buffer */
    public native @Cast("uint64_t") long allocated_image_bytes(); public native dc1394video_frame_t allocated_image_bytes(long allocated_image_bytes); /* amount of memory allocated in for the *image field. */
    public native @Cast("dc1394bool_t") int little_endian(); public native dc1394video_frame_t little_endian(int little_endian);         /* DC1394_TRUE if little endian (16bpp modes only),
                                                       DC1394_FALSE otherwise */
    public native @Cast("dc1394bool_t") int data_in_padding(); public native dc1394video_frame_t data_in_padding(int data_in_padding);       /* DC1394_TRUE if data is present in the padding bytes in IIDC 1.32 format,
                                                       DC1394_FALSE otherwise */
}

// #ifdef __cplusplus
// #endif

/***************************************************************************
     Video functions: formats, framerates,...
 ***************************************************************************/

/**
 * Gets a list of video modes supported by the camera.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_supported_modes(dc1394camera_t camera, dc1394video_modes_t video_modes);

/**
 * Gets a list of supported video framerates for a given video mode. This function only works with non-scalable formats.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_supported_framerates(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, dc1394framerates_t framerates);

/**
 * Gets the current framerate. This is meaningful only if the video mode is not scalable.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_framerate(dc1394camera_t camera, @Cast("dc1394framerate_t*") IntPointer framerate);
public static native @Cast("dc1394error_t") int dc1394_video_get_framerate(dc1394camera_t camera, @Cast("dc1394framerate_t*") IntBuffer framerate);
public static native @Cast("dc1394error_t") int dc1394_video_get_framerate(dc1394camera_t camera, @Cast("dc1394framerate_t*") int[] framerate);

/**
 * Sets the current framerate. This is meaningful only if the video mode is not scalable.
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_framerate(dc1394camera_t camera, @Cast("dc1394framerate_t") int framerate);

/**
 * Gets the current vide mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t*") IntPointer video_mode);
public static native @Cast("dc1394error_t") int dc1394_video_get_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t*") IntBuffer video_mode);
public static native @Cast("dc1394error_t") int dc1394_video_get_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t*") int[] video_mode);

/**
 * Sets the current vide mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode);

/**
 * Gets the current operation mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_operation_mode(dc1394camera_t camera, @Cast("dc1394operation_mode_t*") IntPointer mode);
public static native @Cast("dc1394error_t") int dc1394_video_get_operation_mode(dc1394camera_t camera, @Cast("dc1394operation_mode_t*") IntBuffer mode);
public static native @Cast("dc1394error_t") int dc1394_video_get_operation_mode(dc1394camera_t camera, @Cast("dc1394operation_mode_t*") int[] mode);

/**
 * Sets the current operation mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_operation_mode(dc1394camera_t camera, @Cast("dc1394operation_mode_t") int mode);

/**
 * Gets the current ISO speed.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_speed(dc1394camera_t camera, @Cast("dc1394speed_t*") IntPointer speed);
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_speed(dc1394camera_t camera, @Cast("dc1394speed_t*") IntBuffer speed);
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_speed(dc1394camera_t camera, @Cast("dc1394speed_t*") int[] speed);

/**
 * Sets the current ISO speed. Speeds over 400Mbps require 1394B.
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_iso_speed(dc1394camera_t camera, @Cast("dc1394speed_t") int speed);

/**
 * Gets the current ISO channel
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_channel(dc1394camera_t camera, @Cast("uint32_t*") IntPointer channel);
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_channel(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer channel);
public static native @Cast("dc1394error_t") int dc1394_video_get_iso_channel(dc1394camera_t camera, @Cast("uint32_t*") int[] channel);

/**
 * Sets the current ISO channel
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_iso_channel(dc1394camera_t camera, @Cast("uint32_t") int channel);

/**
 * Gets the current data depth, in bits. Only meaningful for 16bpp video modes (RAW16, RGB48, MONO16,...)  
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_data_depth(dc1394camera_t camera, @Cast("uint32_t*") IntPointer depth);
public static native @Cast("dc1394error_t") int dc1394_video_get_data_depth(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer depth);
public static native @Cast("dc1394error_t") int dc1394_video_get_data_depth(dc1394camera_t camera, @Cast("uint32_t*") int[] depth);

/**
 * Starts/stops the isochronous data transmission. In other words, use this to control the image flow.
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_transmission(dc1394camera_t camera, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the status of the video transmission
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_transmission(dc1394camera_t camera, @Cast("dc1394switch_t*") IntPointer pwr);
public static native @Cast("dc1394error_t") int dc1394_video_get_transmission(dc1394camera_t camera, @Cast("dc1394switch_t*") IntBuffer pwr);
public static native @Cast("dc1394error_t") int dc1394_video_get_transmission(dc1394camera_t camera, @Cast("dc1394switch_t*") int[] pwr);

/**
 * Turns one-shot mode on or off
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_one_shot(dc1394camera_t camera, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the status of the one-shot mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_one_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") IntPointer is_on);
public static native @Cast("dc1394error_t") int dc1394_video_get_one_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") IntBuffer is_on);
public static native @Cast("dc1394error_t") int dc1394_video_get_one_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") int[] is_on);

/**
 * Turns multishot mode on or off
 */
public static native @Cast("dc1394error_t") int dc1394_video_set_multi_shot(dc1394camera_t camera, @Cast("uint32_t") int numFrames, @Cast("dc1394switch_t") int pwr);

/**
 * Gets the status of the multi-shot mode.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_multi_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") IntPointer is_on, @Cast("uint32_t*") IntPointer numFrames);
public static native @Cast("dc1394error_t") int dc1394_video_get_multi_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") IntBuffer is_on, @Cast("uint32_t*") IntBuffer numFrames);
public static native @Cast("dc1394error_t") int dc1394_video_get_multi_shot(dc1394camera_t camera, @Cast("dc1394bool_t*") int[] is_on, @Cast("uint32_t*") int[] numFrames);

/**
 * Gets the bandwidth usage of a camera.
 *
 * This function returns the bandwidth that is used by the camera *IF* ISO was ON.
 * The returned value is in bandwidth units. The 1394 bus has 4915 bandwidth units
 * available per cycle. Each unit corresponds to the time it takes to send one
 * quadlet at ISO speed S1600. The bandwidth usage at S400 is thus four times the
 * number of quadlets per packet. Thanks to Krisitian Hogsberg for clarifying this.
 */
public static native @Cast("dc1394error_t") int dc1394_video_get_bandwidth_usage(dc1394camera_t camera, @Cast("uint32_t*") IntPointer bandwidth);
public static native @Cast("dc1394error_t") int dc1394_video_get_bandwidth_usage(dc1394camera_t camera, @Cast("uint32_t*") IntBuffer bandwidth);
public static native @Cast("dc1394error_t") int dc1394_video_get_bandwidth_usage(dc1394camera_t camera, @Cast("uint32_t*") int[] bandwidth);

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <dc1394/utils.h>

/*
 * 1394-Based Digital Camera Control Library
 *
 * Utilities
 *
 * Written by Damien Douxchamps <ddouxchamps@users.sf.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// #ifndef __DC1394_UTILS_H__
// #define __DC1394_UTILS_H__

/** \file dc1394/utils.h
    \brief Utility functions
    @author Damien Douxchamps: coding
    @author Peter Antoniac: documentation maintainer
<p>
    More details soon
*/

// #ifdef __cplusplus
// #endif

/**
 * Returns the image width and height (in pixels) corresponding to a video mode. Works for scalable and non-scalable video modes.
 */
public static native @Cast("dc1394error_t") int dc1394_get_image_size_from_video_mode(dc1394camera_t camera, @Cast("uint32_t") int video_mode, @Cast("uint32_t*") IntPointer width, @Cast("uint32_t*") IntPointer height);
public static native @Cast("dc1394error_t") int dc1394_get_image_size_from_video_mode(dc1394camera_t camera, @Cast("uint32_t") int video_mode, @Cast("uint32_t*") IntBuffer width, @Cast("uint32_t*") IntBuffer height);
public static native @Cast("dc1394error_t") int dc1394_get_image_size_from_video_mode(dc1394camera_t camera, @Cast("uint32_t") int video_mode, @Cast("uint32_t*") int[] width, @Cast("uint32_t*") int[] height);

/**
 * Returns the given framerate as a float.
 */
public static native @Cast("dc1394error_t") int dc1394_framerate_as_float(@Cast("dc1394framerate_t") int framerate_enum, FloatPointer framerate);
public static native @Cast("dc1394error_t") int dc1394_framerate_as_float(@Cast("dc1394framerate_t") int framerate_enum, FloatBuffer framerate);
public static native @Cast("dc1394error_t") int dc1394_framerate_as_float(@Cast("dc1394framerate_t") int framerate_enum, float[] framerate);

/**
 * Returns the number of bits per pixel for a certain color coding. This is the size of the data sent on the bus, the effective
 * data depth may vary. Example: RGB16 is 16, YUV411 is 8, YUV422 is 8.
 */
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_data_depth(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") IntPointer bits);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_data_depth(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") IntBuffer bits);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_data_depth(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") int[] bits);

/**
 * Returns the bit-space used by a pixel. This is different from the data depth! For instance, RGB16 has a bit space of 48 bits,
 * YUV422 is 16bits and YU411 is 12bits. 
 */
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_bit_size(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") IntPointer bits);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_bit_size(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") IntBuffer bits);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_bit_size(@Cast("dc1394color_coding_t") int color_coding, @Cast("uint32_t*") int[] bits);

/**
 * Returns the color coding from the video mode. Works with scalable image formats too.
 */
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_from_video_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntPointer color_coding);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_from_video_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") IntBuffer color_coding);
public static native @Cast("dc1394error_t") int dc1394_get_color_coding_from_video_mode(dc1394camera_t camera, @Cast("dc1394video_mode_t") int video_mode, @Cast("dc1394color_coding_t*") int[] color_coding);

/**
 * Tells whether the color mode is color or monochrome
 */
public static native @Cast("dc1394error_t") int dc1394_is_color(@Cast("dc1394color_coding_t") int color_mode, @Cast("dc1394bool_t*") IntPointer is_color);
public static native @Cast("dc1394error_t") int dc1394_is_color(@Cast("dc1394color_coding_t") int color_mode, @Cast("dc1394bool_t*") IntBuffer is_color);
public static native @Cast("dc1394error_t") int dc1394_is_color(@Cast("dc1394color_coding_t") int color_mode, @Cast("dc1394bool_t*") int[] is_color);

/**
 * Tells whether the video mode is scalable or not.
 */
public static native @Cast("dc1394bool_t") int dc1394_is_video_mode_scalable(@Cast("dc1394video_mode_t") int video_mode);

/**
 * Tells whether the video mode is "still image" or not ("still image" is currently not supported by any cameras on the market)
 */
public static native @Cast("dc1394bool_t") int dc1394_is_video_mode_still_image(@Cast("dc1394video_mode_t") int video_mode);

/**
 * Tells whether two IDs refer to the same physical camera unit.
 */
public static native @Cast("dc1394bool_t") int dc1394_is_same_camera(@ByVal dc1394camera_id_t id1, @ByVal dc1394camera_id_t id2);

/**
 * Returns a descriptive name for a feature 
 */
public static native @Cast("const char*") BytePointer dc1394_feature_get_string(@Cast("dc1394feature_t") int feature);

/**
 * Returns a descriptive string for an error code
 */
public static native @Cast("const char*") BytePointer dc1394_error_get_string(@Cast("dc1394error_t") int error);

/**
 * Calculates the CRC16 checksum of a memory region. Useful to verify the CRC of an image buffer, for instance.
 */
public static native @Cast("uint16_t") short dc1394_checksum_crc16(@Cast("const uint8_t*") BytePointer buffer, @Cast("uint32_t") int buffer_size);
public static native @Cast("uint16_t") short dc1394_checksum_crc16(@Cast("const uint8_t*") ByteBuffer buffer, @Cast("uint32_t") int buffer_size);
public static native @Cast("uint16_t") short dc1394_checksum_crc16(@Cast("const uint8_t*") byte[] buffer, @Cast("uint32_t") int buffer_size);

// #ifdef __cplusplus
// #endif

// #endif /* _DC1394_UTILS_H */



}
