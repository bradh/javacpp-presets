// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class FlyCapture2 extends org.bytedeco.javacpp.presets.FlyCapture2 {
    static { Loader.load(); }

// Parsed from <FlyCapture2Platform.h>

//=============================================================================
// Copyright © 2008 Point Grey Research, Inc. All Rights Reserved.
//
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
//
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: FlyCapture2Platform.h 150960 2012-10-12 17:45:54Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_FLYCAPTURE2PLATFORM_H
// #define PGR_FC2_FLYCAPTURE2PLATFORM_H

//=============================================================================
// Platform-specific header file for FlyCapture2. 
//
// All the platform-specific code that is required by individual compilers
// to produce the appropriate code for each platform.
//=============================================================================

// #if defined(WIN32) || defined(WIN64)

// Windows 32-bit and 64-bit
// #ifdef FLYCAPTURE2_EXPORT
// #define FLYCAPTURE2_API __declspec( dllexport )
// #elif defined(FLYCAPTURE2_STATIC)
// #define FLYCAPTURE2_API 
// #else
// #define FLYCAPTURE2_API __declspec( dllimport )
// #endif

// #if _MSC_VER > 1000
// #pragma once
// #endif

// #elif defined(MAC_OSX)

// #else
// Linux and all others

// Using GCC 4 where hiding attributes is possible
// #define FLYCAPTURE2_API __attribute__ ((visibility ("default")))
// #define FLYCAPTURE2_LOCAL  __attribute__ ((visibility ("hidden")))

// #endif

// #endif // PGR_FC2_FLYCAPTURE2PLATFORM_H



// Parsed from <FlyCapture2Defs.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
//
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
//
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: FlyCapture2Defs.h 208258 2014-09-19 20:33:21Z erich $
//=============================================================================

// #ifndef PGR_FC2_FLYCAPTURE2DEFS_H
// #define PGR_FC2_FLYCAPTURE2DEFS_H

// #include <memory.h> 

//=============================================================================
// Definitions file for FlyCapture2. 
//
// Holds structures, enumerations and other global definitions that are used 
// across the entire FlyCapture2 API.
//=============================================================================

// #ifndef NULL
public static final int NULL = 0;
// #endif

// #ifndef FULL_32BIT_VALUE
public static final int FULL_32BIT_VALUE = 0x7FFFFFFF;
// #endif
    /** 
     * \defgroup GlobalConstants Global constants
     */

    /*@{*/ 

    /** The maximum length that is allocated for a string. */
    @Namespace("FlyCapture2") @MemberGetter public static native @Cast("const unsigned int") int sk_maxStringLength();  

    /** The maximum number of ports one device can have. */
    @Namespace("FlyCapture2") @MemberGetter public static native @Cast("const unsigned int") int sk_maxNumPorts();  

    /*@}*/  

    /** 
     * \defgroup Enumerations Enumerations 
     */

    /*@{*/ 

    /** The error types returned by functions. */
    /** enum FlyCapture2::ErrorType */
    public static final int        
        /** Undefined */
        PGRERROR_UNDEFINED = -1,
        /** Function returned with no errors. */
        PGRERROR_OK = 0,
        /** General failure. */
        PGRERROR_FAILED = 1,
        /** Function has not been implemented. */
        PGRERROR_NOT_IMPLEMENTED = 2,
        /** Could not connect to Bus Master. */
        PGRERROR_FAILED_BUS_MASTER_CONNECTION = 3,
        /** Camera has not been connected. */
        PGRERROR_NOT_CONNECTED = 4,
        /** Initialization failed. */
        PGRERROR_INIT_FAILED = 5, 
        /** Camera has not been initialized. */
        PGRERROR_NOT_INTITIALIZED = 6,
        /** Invalid parameter passed to function. */
        PGRERROR_INVALID_PARAMETER = 7,
        /** Setting set to camera is invalid. */
        PGRERROR_INVALID_SETTINGS = 8,         
        /** Invalid Bus Manager object. */
        PGRERROR_INVALID_BUS_MANAGER = 9,
        /** Could not allocate memory. */
        PGRERROR_MEMORY_ALLOCATION_FAILED = 10, 
        /** Low level error. */
        PGRERROR_LOW_LEVEL_FAILURE = 11,
        /** Device not found. */
        PGRERROR_NOT_FOUND = 12,
        /** GUID failure. */
        PGRERROR_FAILED_GUID = 13,
        /** Packet size set to camera is invalid. */
        PGRERROR_INVALID_PACKET_SIZE = 14,
        /** Invalid mode has been passed to function. */
        PGRERROR_INVALID_MODE = 15,
        /** Error due to not being in Format7. */
        PGRERROR_NOT_IN_FORMAT7 = 16,
        /** This feature is unsupported. */
        PGRERROR_NOT_SUPPORTED = 17,
        /** Timeout error. */
        PGRERROR_TIMEOUT = 18,
        /** Bus Master Failure. */
        PGRERROR_BUS_MASTER_FAILED = 19,
        /** Generation Count Mismatch. */
        PGRERROR_INVALID_GENERATION = 20,
        /** Look Up Table failure. */
        PGRERROR_LUT_FAILED = 21,
        /** IIDC failure. */
        PGRERROR_IIDC_FAILED = 22,
        /** Strobe failure. */
        PGRERROR_STROBE_FAILED = 23,
        /** Trigger failure. */
        PGRERROR_TRIGGER_FAILED = 24,
        /** Property failure. */
        PGRERROR_PROPERTY_FAILED = 25,
        /** Property is not present. */
        PGRERROR_PROPERTY_NOT_PRESENT = 26,
        /** Register access failed. */
        PGRERROR_REGISTER_FAILED = 27,
        /** Register read failed. */
        PGRERROR_READ_REGISTER_FAILED = 28,
        /** Register write failed. */
        PGRERROR_WRITE_REGISTER_FAILED = 29,
        /** Isochronous failure. */
        PGRERROR_ISOCH_FAILED = 30,
        /** Isochronous transfer has already been started. */
        PGRERROR_ISOCH_ALREADY_STARTED = 31,
        /** Isochronous transfer has not been started. */
        PGRERROR_ISOCH_NOT_STARTED = 32,
        /** Isochronous start failed. */
        PGRERROR_ISOCH_START_FAILED = 33,
        /** Isochronous retrieve buffer failed. */
        PGRERROR_ISOCH_RETRIEVE_BUFFER_FAILED = 34,
        /** Isochronous stop failed. */
        PGRERROR_ISOCH_STOP_FAILED = 35,
        /** Isochronous image synchronization failed. */
        PGRERROR_ISOCH_SYNC_FAILED = 36,
        /** Isochronous bandwidth exceeded. */
        PGRERROR_ISOCH_BANDWIDTH_EXCEEDED = 37,
        /** Image conversion failed. */
        PGRERROR_IMAGE_CONVERSION_FAILED = 38,
        /** Image library failure. */
        PGRERROR_IMAGE_LIBRARY_FAILURE = 39,
        /** Buffer is too small. */
        PGRERROR_BUFFER_TOO_SMALL = 40,
        /** There is an image consistency error. */
        PGRERROR_IMAGE_CONSISTENCY_ERROR = 41,
		/** The installed driver is not compatible with the library. */
		PGRERROR_INCOMPATIBLE_DRIVER = 42,
        PGRERROR_FORCE_32BITS =  FULL_32BIT_VALUE;  

    /** The type of bus callback to register a callback function for. */
    /** enum FlyCapture2::BusCallbackType */
    public static final int
        /** Register for all bus events. */
        BUS_RESET = 0,
        /** Register for arrivals only. */
        ARRIVAL = 1,
        /** Register for removals only. */
        REMOVAL = 2,
        CALLBACK_TYPE_FORCE_32BITS =  FULL_32BIT_VALUE;    

    /** 
     * The grab strategy employed during image transfer. This type controls
     * how images that stream off the camera accumulate in a user buffer
     * for handling. 
     */
     /* 
       @remark Unlike earlier versions of the FlyCapture SDK, it is no longer 
       * necessary to explicitly start the image grabbing process before
       * specifying an image grabbing mode.
     */
    /** enum FlyCapture2::GrabMode */
    public static final int
        /**
         * Grabs the newest image in the user buffer each time the 
         * RetrieveBuffer() function is called. Older images are dropped 
         * instead of accumulating in the user buffer. Grabbing blocks if the 
         * camera has not finished transmitting the next available image. If
         * the camera is transmitting images faster than the application can
         * grab them, images may be dropped and only the most recent image 
         * is stored for grabbing. Note that this mode is the equivalent of 
         * flycaptureLockLatest in earlier versions of the FlyCapture SDK.
         */
        DROP_FRAMES = 0,

        /**
         * Images accumulate in the user buffer, and the oldest image is 
         * grabbed for handling before being discarded. This member can be 
         * used to guarantee that each image is seen. However, image processing 
         * time must not exceed transmission time from the camera to the 
         * buffer. Grabbing blocks if the camera has not finished transmitting 
         * the next available image. The buffer size is controlled by the 
         * numBuffers parameter in the FC2Config struct. Note that this mode is 
         * the equivalent of flycaptureLockNext in earlier versions of the 
         * FlyCapture SDK.
         */
        BUFFER_FRAMES = 1, 

        /**
         * Unspecified grab mode.
         */
        UNSPECIFIED_GRAB_MODE = 2,
        GRAB_MODE_FORCE_32BITS =  FULL_32BIT_VALUE;      
    
    /** Timeout options for grabbing images. */
    /** enum FlyCapture2::GrabTimeout */
    public static final int        
        /**  Non-blocking wait. */
        TIMEOUT_NONE = 0,
        /**  Wait indefinitely. */
        TIMEOUT_INFINITE = -1,
        /** Unspecified timeout setting. */
        TIMEOUT_UNSPECIFIED = -2,
        GRAB_TIMEOUT_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Bandwidth allocation options for 1394 devices. */
    /** enum FlyCapture2::BandwidthAllocation */
    public static final int
        /** Do not allocate bandwidth. */
        BANDWIDTH_ALLOCATION_OFF = 0,
        /** Allocate bandwidth. This is the default setting. */
        BANDWIDTH_ALLOCATION_ON = 1,
        /**
         * Bandwidth allocation is not supported by either the camera or
         * operating system.
         */
        BANDWIDTH_ALLOCATION_UNSUPPORTED = 2,
        /** Not specified. This leaves the current setting unchanged. */
        BANDWIDTH_ALLOCATION_UNSPECIFIED = 3,
        BANDWIDTH_ALLOCATION_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Interfaces that a camera may use to communicate with a host. */
    /** enum FlyCapture2::InterfaceType */
    public static final int                
        /** IEEE-1394 (Includes 1394a and 1394b). */
        INTERFACE_IEEE1394 = 0,
        /** USB 2.0. */
        INTERFACE_USB2 = 1,
        /** USB 3.0. */
        INTERFACE_USB3 = 2,
		/** GigE. */
		INTERFACE_GIGE = 3,
        /** Unknown interface. */
        INTERFACE_UNKNOWN = 4,
        INTERFACE_TYPE_FORCE_32BITS =  FULL_32BIT_VALUE;

    /**
     * Camera properties. Not all properties may be supported, depending
     * on the camera model.
     */
    /** enum FlyCapture2::PropertyType */
    public static final int
        /** Brightness. */
        BRIGHTNESS = 0,
        /** Auto exposure. */
        AUTO_EXPOSURE = 1,
        /** Sharpness */
        SHARPNESS = 2,
        /** White balance. */
        WHITE_BALANCE = 3,
        /** Hue. */
        HUE = 4,
        /** Saturation. */
        SATURATION = 5,
        /** Gamma. */
        GAMMA = 6,
        /** Iris. */
        IRIS = 7,
        /** Focus. */
        FOCUS = 8,
        /** Zoom. */
        ZOOM = 9,
        /** Pan. */
        PAN = 10,
        /** Tilt. */
        TILT = 11,
        /** Shutter. */
        SHUTTER = 12,
        /** Gain. */
        GAIN = 13,
        /** Trigger mode. */
        TRIGGER_MODE = 14,
        /** Trigger delay. */
        TRIGGER_DELAY = 15,
        /** Frame rate. */
        FRAME_RATE = 16,
        /** Temperature. */
        TEMPERATURE = 17,
        /** Unspecified property type. */
        UNSPECIFIED_PROPERTY_TYPE = 18,
        PROPERTY_TYPE_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Frame rates in frames per second. */
    /** enum FlyCapture2::FrameRate */
    public static final int        
        /** 1.875 fps. */
        FRAMERATE_1_875 = 0,       
        /** 3.75 fps. */
        FRAMERATE_3_75 = 1,   
        /** 7.5 fps. */
        FRAMERATE_7_5 = 2,    
        /** 15 fps. */
        FRAMERATE_15 = 3,   
        /** 30 fps. */
        FRAMERATE_30 = 4,     
        /** 60 fps. */
        FRAMERATE_60 = 5,     
        /** 120 fps. */
        FRAMERATE_120 = 6,
        /** 240 fps. */
        FRAMERATE_240 = 7,
        /** Custom frame rate for Format7 functionality. */
        FRAMERATE_FORMAT7 = 8,
        /** Number of possible camera frame rates. */
        NUM_FRAMERATES = 9,
        FRAMERATE_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** DCAM video modes. */
    /** enum FlyCapture2::VideoMode */
    public static final int        
        /** 160x120 YUV444. */
        VIDEOMODE_160x120YUV444 = 0,
        /** 320x240 YUV422. */
        VIDEOMODE_320x240YUV422 = 1,
        /** 640x480 YUV411. */
        VIDEOMODE_640x480YUV411 = 2,
        /** 640x480 YUV422. */
        VIDEOMODE_640x480YUV422 = 3,
        /** 640x480 24-bit RGB. */
        VIDEOMODE_640x480RGB = 4,
        /** 640x480 8-bit. */
        VIDEOMODE_640x480Y8 = 5,
        /** 640x480 16-bit. */
        VIDEOMODE_640x480Y16 = 6,
        /** 800x600 YUV422. */
        VIDEOMODE_800x600YUV422 = 7,
        /** 800x600 RGB. */
        VIDEOMODE_800x600RGB = 8,
        /** 800x600 8-bit. */
        VIDEOMODE_800x600Y8 = 9,
        /** 800x600 16-bit. */
        VIDEOMODE_800x600Y16 = 10,
        /** 1024x768 YUV422. */
        VIDEOMODE_1024x768YUV422 = 11,
        /** 1024x768 RGB. */
        VIDEOMODE_1024x768RGB = 12,
        /** 1024x768 8-bit. */
        VIDEOMODE_1024x768Y8 = 13,
        /** 1024x768 16-bit. */
        VIDEOMODE_1024x768Y16 = 14,
        /** 1280x960 YUV422. */
        VIDEOMODE_1280x960YUV422 = 15,
        /** 1280x960 RGB. */
        VIDEOMODE_1280x960RGB = 16,
        /** 1280x960 8-bit. */
        VIDEOMODE_1280x960Y8 = 17,
        /** 1280x960 16-bit. */
        VIDEOMODE_1280x960Y16 = 18,
        /** 1600x1200 YUV422. */
        VIDEOMODE_1600x1200YUV422 = 19,
        /** 1600x1200 RGB. */
        VIDEOMODE_1600x1200RGB = 20,
        /** 1600x1200 8-bit. */
        VIDEOMODE_1600x1200Y8 = 21,
        /** 1600x1200 16-bit. */
        VIDEOMODE_1600x1200Y16 = 22,
        /** Custom video mode for Format7 functionality. */
        VIDEOMODE_FORMAT7 = 23,
        /** Number of possible video modes. */
        NUM_VIDEOMODES = 24,
        VIDEOMODE_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Camera modes for DCAM formats as well as Format7. */
    /** enum FlyCapture2::Mode */
    public static final int
        MODE_0 = 0,
        MODE_1 = 1,
        MODE_2 = 2,
        MODE_3 = 3,
        MODE_4 = 4,
        MODE_5 = 5,
        MODE_6 = 6,
        MODE_7 = 7,
        MODE_8 = 8,
        MODE_9 = 9,
        MODE_10 = 10,
        MODE_11 = 11,
        MODE_12 = 12,
        MODE_13 = 13,
        MODE_14 = 14,
        MODE_15 = 15,
        MODE_16 = 16,
        MODE_17 = 17,
        MODE_18 = 18,
        MODE_19 = 19,
        MODE_20 = 20,
        MODE_21 = 21,
        MODE_22 = 22,
        MODE_23 = 23,
        MODE_24 = 24,
        MODE_25 = 25,
        MODE_26 = 26,
        MODE_27 = 27,
        MODE_28 = 28,
        MODE_29 = 29,
        MODE_30 = 30,
        MODE_31 = 31,
        /** Number of modes */
        NUM_MODES = 32,
        MODE_FORCE_32BITS =  FULL_32BIT_VALUE;  

    /** Pixel formats available for Format7 modes. */
    /** enum FlyCapture2::PixelFormat */
    public static final int        
        /** 8 bits of mono information. */
        PIXEL_FORMAT_MONO8     =  0x80000000,
        /** YUV 4:1:1. */
        PIXEL_FORMAT_411YUV8   =  0x40000000,
        /** YUV 4:2:2. */
        PIXEL_FORMAT_422YUV8   =  0x20000000,
        /** YUV 4:4:4. */
        PIXEL_FORMAT_444YUV8   =  0x10000000,
        /** R = G = B = 8 bits. */
        PIXEL_FORMAT_RGB8      =  0x08000000,
        /** 16 bits of mono information. */
        PIXEL_FORMAT_MONO16    =  0x04000000,
        /** R = G = B = 16 bits. */
        PIXEL_FORMAT_RGB16     =  0x02000000,
        /** 16 bits of signed mono information. */
        PIXEL_FORMAT_S_MONO16  =  0x01000000,
        /** R = G = B = 16 bits signed. */
        PIXEL_FORMAT_S_RGB16   =  0x00800000,
        /** 8 bit raw data output of sensor. */
        PIXEL_FORMAT_RAW8      =  0x00400000,
        /** 16 bit raw data output of sensor. */
        PIXEL_FORMAT_RAW16     =  0x00200000,
        /** 12 bits of mono information. */
        PIXEL_FORMAT_MONO12    =  0x00100000,
        /** 12 bit raw data output of sensor. */
        PIXEL_FORMAT_RAW12     =  0x00080000,
        /** 24 bit BGR. */
        PIXEL_FORMAT_BGR       =  0x80000008,
        /** 32 bit BGRU. */
        PIXEL_FORMAT_BGRU      =  0x40000008,
        /** 24 bit RGB. */
        PIXEL_FORMAT_RGB       =  PIXEL_FORMAT_RGB8,
        /** 32 bit RGBU. */
        PIXEL_FORMAT_RGBU      =  0x40000002,
        /** R = G = B = 16 bits. */
        PIXEL_FORMAT_BGR16     =  0x02000001,
		/** 64 bit BGRU. */
		PIXEL_FORMAT_BGRU16    =  0x02000002,
        /** JPEG compressed stream. */
        PIXEL_FORMAT_422YUV8_JPEG      =  0x40000001,
        /** Number of pixel formats. */
        NUM_PIXEL_FORMATS	   = 20,
        /** Unspecified pixel format. */
        UNSPECIFIED_PIXEL_FORMAT = 0;

    /** Bus speeds. */
    /** enum FlyCapture2::BusSpeed */
    public static final int        
        /** 100Mbits/sec. */
        BUSSPEED_S100 = 0,
        /** 200Mbits/sec. */
        BUSSPEED_S200 = 1,
        /** 400Mbits/sec. */
        BUSSPEED_S400 = 2,
        /** 480Mbits/sec. Only for USB2 cameras. */
        BUSSPEED_S480 = 3,
        /** 800Mbits/sec. */
        BUSSPEED_S800 = 4,
        /** 1600Mbits/sec. */
        BUSSPEED_S1600 = 5,
        /** 3200Mbits/sec. */
        BUSSPEED_S3200 = 6,
        /** 5000Mbits/sec. Only for USB3 cameras. */
        BUSSPEED_S5000 = 7,
        /** 10Base-T. Only for GigE Vision cameras. */
        BUSSPEED_10BASE_T = 8,
        /** 100Base-T.  Only for GigE Vision cameras.*/
        BUSSPEED_100BASE_T = 9,
        /** 1000Base-T (Gigabit Ethernet).  Only for GigE Vision cameras. */
        BUSSPEED_1000BASE_T = 10,
        /** 10000Base-T.  Only for GigE Vision cameras. */
        BUSSPEED_10000BASE_T = 11,
        /** The fastest speed available. */
        BUSSPEED_S_FASTEST = 12,
        /** Any speed that is available. */
        BUSSPEED_ANY = 13,
        /** Unknown bus speed. */
        BUSSPEED_SPEED_UNKNOWN = -1,
        BUSSPEED_FORCE_32BITS =  FULL_32BIT_VALUE;

	/** enum FlyCapture2::PCIeBusSpeed */
	public static final int
		PCIE_BUSSPEED_2_5 = 0, /** 2.5 Gb/s */
		PCIE_BUSSPEED_5_0 = 1, /** 5.0 Gb/s */
		PCIE_BUSSPEED_UNKNOWN = -1, /** Speed is unknown */
		PCIE_BUSSPEED_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Types of low level drivers that flycapture uses. */
    /** enum FlyCapture2::DriverType */
    public static final int        
        /** PGRCam.sys. */
        DRIVER_1394_CAM = 0,
        /** PGR1394.sys. */
        DRIVER_1394_PRO = 1,
        /** firewire_core. */
        DRIVER_1394_JUJU = 2,
        /** video1394. */
        DRIVER_1394_VIDEO1394 = 3,
        /** raw1394. */
        DRIVER_1394_RAW1394 = 4,
        /** No usb driver used just BSD stack. (Linux only) */
        DRIVER_USB_NONE = 5,
        /** PGRUsbCam.sys. */
        DRIVER_USB_CAM = 6,
        /** PGRXHCI.sys. */
        DRIVER_USB3_PRO = 7,
        /** no gige drivers used,MS/BSD stack. */
        DRIVER_GIGE_NONE = 8,
        /** PGRGigE.sys. */
        DRIVER_GIGE_FILTER = 9,
        /** PGRGigEPro.sys. */
        DRIVER_GIGE_PRO = 10,
        /** Unknown driver type. */
        DRIVER_UNKNOWN = -1,
        DRIVER_FORCE_32BITS =  FULL_32BIT_VALUE;

    /**
     * Color processing algorithms. Please refer to our knowledge base at
     * article at http://www.ptgrey.com/support/kb/index.asp?a=4&q=33 for
     * complete details for each algorithm.
     */
    /** enum FlyCapture2::ColorProcessingAlgorithm */
    public static final int        
        /** Default method. */
        DEFAULT = 0, 
        /** No color processing. */
        NO_COLOR_PROCESSING = 1, 
        /**
         * Fastest but lowest quality. Equivalent to 
         * FLYCAPTURE_NEAREST_NEIGHBOR_FAST in FlyCapture.
         */ 
        NEAREST_NEIGHBOR = 2, 
        /** Weights surrounding pixels based on localized edge orientation. */
        EDGE_SENSING = 3, 
        /** Well-balanced speed and quality. */
        HQ_LINEAR = 4,
        /** Slowest but produces good results. */
        RIGOROUS = 5,
        /** Multithreaded with similar results to edge sensing. */
        IPP = 6,
        /** Best quality but much faster than rigorous. */
        DIRECTIONAL_FILTER = 7,

        COLOR_PROCESSING_ALGORITHM_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Bayer tile formats. */
    /** enum FlyCapture2::BayerTileFormat */
    public static final int        
        /** No bayer tile format. */
        NONE = 0,
        /** Red-Green-Green-Blue. */
        RGGB = 1,
        /** Green-Red-Blue-Green. */
        GRBG = 2,
        /** Green-Blue-Red-Green. */
        GBRG = 3,
        /** Blue-Green-Green-Red. */
        BGGR = 4,
        BT_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** File formats to be used for saving images to disk. */
    /** enum FlyCapture2::ImageFileFormat */
    public static final int        
        /** Determine file format from file extension. */
        FROM_FILE_EXT = -1,
        /** Portable gray map. */
        PGM = 0,
        /** Portable pixmap. */
        PPM = 1,
        /** Bitmap. */
        BMP = 2,
        /** JPEG. */
        JPEG = 3,
        /** JPEG 2000. */
        JPEG2000 = 4,
        /** Tagged image file format. */
        TIFF = 5,
        /** Portable network graphics. */
        PNG = 6,
        /** Raw data. */
        RAW = 7,
        IMAGE_FILE_FORMAT_FORCE_32BITS =  FULL_32BIT_VALUE;    
    
    /*@}*/ 

    /** 
     * \defgroup GigEEnums GigE specific enumerations
     *
     * These enumerations are specific to GigE camera operation only.
     */

    /*@{*/ 

    /** Possible properties that can be queried from the camera. */
    /** enum FlyCapture2::GigEPropertyType */
    public static final int        
        HEARTBEAT = 0,
        HEARTBEAT_TIMEOUT = 1,
        PACKET_SIZE = 2,
        PACKET_DELAY = 3;

    /*@}*/

    /** 
     * \defgroup Structures Structures 
     */

    /*@{*/ 

    /** The current version of the library. */
    @Namespace("FlyCapture2") public static class FC2Version extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public FC2Version() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public FC2Version(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FC2Version(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public FC2Version position(int position) {
            return (FC2Version)super.position(position);
        }
    
        /** Major version number. */
        public native @Cast("unsigned int") int major(); public native FC2Version major(int major);
        /** Minor version number. */
        public native @Cast("unsigned int") int minor(); public native FC2Version minor(int minor);
        /** Type version number. */
        public native @Cast("unsigned int") int type(); public native FC2Version type(int type);
        /** Build version number. */
        public native @Cast("unsigned int") int build(); public native FC2Version build(int build);
    }

    /** A GUID to the camera.  It is used to uniquely identify a camera. */
    @Namespace("FlyCapture2") @NoOffset public static class PGRGuid extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PGRGuid(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public PGRGuid(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public PGRGuid position(int position) {
            return (PGRGuid)super.position(position);
        }
    
        public native @Cast("unsigned int") int value(int i); public native PGRGuid value(int i, int value);
        @MemberGetter public native @Cast("unsigned int*") IntPointer value();

        /** Constructor. */
        public PGRGuid() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Equality operator. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef PGRGuid guid );

        /** Inequality operator. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef PGRGuid guid );
    }

    /** 
     * \defgroup GigEStructures GigE specific structures
     *
     * These structures are specific to GigE camera operation only.
     */

    /*@{*/ 

    /** IPv4 address. */
    @Namespace("FlyCapture2") @NoOffset public static class IPAddress extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IPAddress(Pointer p) { super(p); }
    
        public native @Cast("unsigned char") byte octets(int i); public native IPAddress octets(int i, byte octets);
        @MemberGetter public native @Cast("unsigned char*") BytePointer octets();

        public IPAddress() { super((Pointer)null); allocate(); }
        private native void allocate();

        public IPAddress( @Cast("unsigned int") int ipAddressVal ) { super((Pointer)null); allocate(ipAddressVal); }
        private native void allocate( @Cast("unsigned int") int ipAddressVal );

        /** Equality operator. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef IPAddress address );

        /** Inequality operator. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef IPAddress address );
    }

    /** MAC address. */
    @Namespace("FlyCapture2") @NoOffset public static class MACAddress extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MACAddress(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public MACAddress(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public MACAddress position(int position) {
            return (MACAddress)super.position(position);
        }
    
        public native @Cast("unsigned char") byte octets(int i); public native MACAddress octets(int i, byte octets);
        @MemberGetter public native @Cast("unsigned char*") BytePointer octets();

        public MACAddress() { super((Pointer)null); allocate(); }
        private native void allocate(); 

        public MACAddress( @Cast("unsigned int") int macAddressValHigh, @Cast("unsigned int") int macAddressValLow ) { super((Pointer)null); allocate(macAddressValHigh, macAddressValLow); }
        private native void allocate( @Cast("unsigned int") int macAddressValHigh, @Cast("unsigned int") int macAddressValLow );

        /** Equality operator. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef MACAddress address );

        /** Inequality operator. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef MACAddress address );
    }

    /** A GigE property. */
    @Namespace("FlyCapture2") public static class GigEProperty extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public GigEProperty() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigEProperty(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEProperty(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public GigEProperty position(int position) {
            return (GigEProperty)super.position(position);
        }
    
        /** The type of property. */
        public native @Cast("FlyCapture2::GigEPropertyType") int propType(); public native GigEProperty propType(int propType);        
        /** 
         * Whether the property is readable. If this is false, then
         * no other value in this structure is valid.
         */
        public native @Cast("bool") boolean isReadable(); public native GigEProperty isReadable(boolean isReadable);
        /** Whether the property is writable. */
        public native @Cast("bool") boolean isWritable(); public native GigEProperty isWritable(boolean isWritable);
        /** Minimum value. */
        public native @Cast("unsigned int") int min(); public native GigEProperty min(int min);
        /** Maximum value. */
        public native @Cast("unsigned int") int max(); public native GigEProperty max(int max);
        /** Current value. */
        public native @Cast("unsigned int") int value(); public native GigEProperty value(int value);
    }

    /** Information about a single GigE stream channel. */
    @Namespace("FlyCapture2") @NoOffset public static class GigEStreamChannel extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEStreamChannel(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigEStreamChannel(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public GigEStreamChannel position(int position) {
            return (GigEStreamChannel)super.position(position);
        }
    
        /** Network interface index used (or to use). */
        public native @Cast("unsigned int") int networkInterfaceIndex(); public native GigEStreamChannel networkInterfaceIndex(int networkInterfaceIndex);
        /** Host port on the PC where the camera will send the data stream. */
		public native @Cast("unsigned int") int hostPort(); public native GigEStreamChannel hostPort(int hostPort);
        /** Disable IP fragmentation of packets. */
        public native @Cast("bool") boolean doNotFragment(); public native GigEStreamChannel doNotFragment(boolean doNotFragment);
        /** Packet size, in bytes. */
        public native @Cast("unsigned int") int packetSize(); public native GigEStreamChannel packetSize(int packetSize);
        /** Inter packet delay, in timestamp counter units. */
        public native @Cast("unsigned int") int interPacketDelay(); public native GigEStreamChannel interPacketDelay(int interPacketDelay);      
        /** Destination IP address. It can be a multicast or unicast address. */
        public native @ByRef IPAddress destinationIpAddress(); public native GigEStreamChannel destinationIpAddress(IPAddress destinationIpAddress);
        /** Source UDP port of the stream channel. Read only. */
        public native @Cast("unsigned int") int sourcePort(); public native GigEStreamChannel sourcePort(int sourcePort);
		/** Host port on the PC where the camera will send the data stream. 
			This is deprecated, use hostPort instead. */
		public native @Cast("unsigned int*") @ByRef IntPointer hostPost(); public native GigEStreamChannel hostPost(IntPointer hostPost);

		public GigEStreamChannel() { super((Pointer)null); allocate(); }
		private native void allocate();
    }

    /** 
     * Configuration for a GigE camera.  These options are options that are
     * generally should be set before starting isochronous transfer.
     */
    @Namespace("FlyCapture2") @NoOffset public static class GigEConfig extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEConfig(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigEConfig(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public GigEConfig position(int position) {
            return (GigEConfig)super.position(position);
        }
    
		/** Turn on/off packet resend functionality */
		public native @Cast("bool") boolean enablePacketResend(); public native GigEConfig enablePacketResend(boolean enablePacketResend);

        /** 
         * Number of retries to perform when a register read/write timeout 
         * is received by the library. The default value is 0.
         */
        public native @Cast("unsigned int") int registerTimeoutRetries(); public native GigEConfig registerTimeoutRetries(int registerTimeoutRetries);

        /** 
         * Register read/write timeout value, in microseconds. 
         * The default value is dependent on the interface type.
         */
        public native @Cast("unsigned int") int registerTimeout(); public native GigEConfig registerTimeout(int registerTimeout);

		public GigEConfig() { super((Pointer)null); allocate(); }
		private native void allocate();
    }

    /** Format 7 information for a single mode. */
    @Namespace("FlyCapture2") @NoOffset public static class GigEImageSettingsInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEImageSettingsInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigEImageSettingsInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public GigEImageSettingsInfo position(int position) {
            return (GigEImageSettingsInfo)super.position(position);
        }
    
        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native GigEImageSettingsInfo maxWidth(int maxWidth);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native GigEImageSettingsInfo maxHeight(int maxHeight);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native GigEImageSettingsInfo offsetHStepSize(int offsetHStepSize);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native GigEImageSettingsInfo offsetVStepSize(int offsetVStepSize);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native GigEImageSettingsInfo imageHStepSize(int imageHStepSize);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native GigEImageSettingsInfo imageVStepSize(int imageVStepSize);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native GigEImageSettingsInfo pixelFormatBitField(int pixelFormatBitField);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native GigEImageSettingsInfo vendorPixelFormatBitField(int vendorPixelFormatBitField);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native GigEImageSettingsInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public GigEImageSettingsInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Image settings for a GigE camera. */
    @Namespace("FlyCapture2") @NoOffset public static class GigEImageSettings extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEImageSettings(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigEImageSettings(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public GigEImageSettings position(int position) {
            return (GigEImageSettings)super.position(position);
        }
    
        /** Horizontal image offset. */
        public native @Cast("unsigned int") int offsetX(); public native GigEImageSettings offsetX(int offsetX);
        /** Vertical image offset. */
        public native @Cast("unsigned int") int offsetY(); public native GigEImageSettings offsetY(int offsetY);
        /** Width of image. */
        public native @Cast("unsigned int") int width(); public native GigEImageSettings width(int width);
        /** Height of image. */
        public native @Cast("unsigned int") int height(); public native GigEImageSettings height(int height);
        /** Pixel format of image. */
        public native @Cast("FlyCapture2::PixelFormat") int pixelFormat(); public native GigEImageSettings pixelFormat(int pixelFormat);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native GigEImageSettings reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public GigEImageSettings() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /*@}*/

    /** 
    * \defgroup IIDCStructures IIDC specific structures
    *
    * These structures are specific to IIDC camera operation only.
    */

    /*@{*/ 

    /** Format 7 image settings. */
    @Namespace("FlyCapture2") @NoOffset public static class Format7ImageSettings extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Format7ImageSettings(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Format7ImageSettings(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Format7ImageSettings position(int position) {
            return (Format7ImageSettings)super.position(position);
        }
    
        /** Format 7 mode. */
        public native @Cast("FlyCapture2::Mode") int mode(); public native Format7ImageSettings mode(int mode);
        /** Horizontal image offset. */
        public native @Cast("unsigned int") int offsetX(); public native Format7ImageSettings offsetX(int offsetX);
        /** Vertical image offset. */
        public native @Cast("unsigned int") int offsetY(); public native Format7ImageSettings offsetY(int offsetY);
        /** Width of image. */
        public native @Cast("unsigned int") int width(); public native Format7ImageSettings width(int width);
        /** Height of image. */
        public native @Cast("unsigned int") int height(); public native Format7ImageSettings height(int height);
        /** Pixel format of image. */
        public native @Cast("FlyCapture2::PixelFormat") int pixelFormat(); public native Format7ImageSettings pixelFormat(int pixelFormat);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Format7ImageSettings reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Format7ImageSettings() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Format 7 information for a single mode. */
    @Namespace("FlyCapture2") @NoOffset public static class Format7Info extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Format7Info(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Format7Info(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Format7Info position(int position) {
            return (Format7Info)super.position(position);
        }
    
        /** Format 7 mode. */
        public native @Cast("FlyCapture2::Mode") int mode(); public native Format7Info mode(int mode);

        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native Format7Info maxWidth(int maxWidth);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native Format7Info maxHeight(int maxHeight);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native Format7Info offsetHStepSize(int offsetHStepSize);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native Format7Info offsetVStepSize(int offsetVStepSize);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native Format7Info imageHStepSize(int imageHStepSize);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native Format7Info imageVStepSize(int imageVStepSize);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native Format7Info pixelFormatBitField(int pixelFormatBitField);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native Format7Info vendorPixelFormatBitField(int vendorPixelFormatBitField);

        /** Current packet size in bytes. */
        public native @Cast("unsigned int") int packetSize(); public native Format7Info packetSize(int packetSize);
        /** Minimum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int minPacketSize(); public native Format7Info minPacketSize(int minPacketSize);
        /** Maximum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int maxPacketSize(); public native Format7Info maxPacketSize(int maxPacketSize);
        /** Current packet size as a percentage of maximum packet size. */
        public native float percentage(); public native Format7Info percentage(float percentage);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Format7Info reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Format7Info() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Format 7 packet information. */
    @Namespace("FlyCapture2") @NoOffset public static class Format7PacketInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Format7PacketInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Format7PacketInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Format7PacketInfo position(int position) {
            return (Format7PacketInfo)super.position(position);
        }
    
        /** Recommended bytes per packet. */
        public native @Cast("unsigned int") int recommendedBytesPerPacket(); public native Format7PacketInfo recommendedBytesPerPacket(int recommendedBytesPerPacket);
        /** Maximum bytes per packet. */
        public native @Cast("unsigned int") int maxBytesPerPacket(); public native Format7PacketInfo maxBytesPerPacket(int maxBytesPerPacket);
        /** Minimum bytes per packet. */
        public native @Cast("unsigned int") int unitBytesPerPacket(); public native Format7PacketInfo unitBytesPerPacket(int unitBytesPerPacket);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Format7PacketInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Format7PacketInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /*@}*/ 

    /** 
     * Configuration for a camera. These options are options that are
     * generally should be set before starting isochronous transfer.
     */
    @Namespace("FlyCapture2") @NoOffset public static class FC2Config extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FC2Config(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public FC2Config(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public FC2Config position(int position) {
            return (FC2Config)super.position(position);
        }
    
        /** Number of buffers used by the FlyCapture2 library to grab images. */
        public native @Cast("unsigned int") int numBuffers(); public native FC2Config numBuffers(int numBuffers);
       
        /**
         * Number of notifications per image. This value should only be set
         * after the image settings to be used is set to the camera.
         * The default number of notifications is 1.
         *
         * There are 4 general scenarios:
         * - 1 notification - End of image
         * - 2 notifications - After first packet and end of image
         * - 3 notifications - After first packet, middle of image, end of image
         * - x notifications - After first packet, (x -2) spread evenly, end of image
		 *
		 * Specifying zero for the number of notifications will be ignored (the current value 
		 * will not be modified).
		 *
		 * Note that the event numbers start at 0. Ex. when 3 notifications are
		 * used, the three events will be 0, 1 and 2.
         */
        public native @Cast("unsigned int") int numImageNotifications(); public native FC2Config numImageNotifications(int numImageNotifications);

        /** 
         *  Minimum number of notifications needed for the current image 
         *  settings on the camera. Read-only value.
         */
        public native @Cast("unsigned int") int minNumImageNotifications(); public native FC2Config minNumImageNotifications(int minNumImageNotifications);
        
        /**
         * Time in milliseconds that RetrieveBuffer() and WaitForBufferEvent()
         * will wait for an image before timing out and returning.
         */
        public native int grabTimeout(); public native FC2Config grabTimeout(int grabTimeout);
        
        /** Grab mode for the camera. The default is DROP_FRAMES. */
        public native @Cast("FlyCapture2::GrabMode") int grabMode(); public native FC2Config grabMode(int grabMode); 

		/** This parameter enables RetireveBuffer to run in high 
		 *	performance mode.  This means that any interaction
		 *  with the camera, other then grabbing the image is disabled.
		 *	Currently Retrieve buffer reads registers on the camera to 
		 *	determine which embedded image information settings have been
		 *	enabled, and it reads what the bayer tile is currently set to.
		 *	When High Performance mode is on, these reads are disabled.  This 
		 *	means that any changes to the Bayer Tile or to the Embedded image
		 *	info after StartCapture() will not be tracked when made using 
		 *	direct register writes.  If the corresponding SetEmbededImageInfo()
		 *	and GetEmbededImageInfo() calls are used then the changes will be
		 *	appropriately reflected.  This also means that changes to embedded 
		 *	image info from other processes will not be updated either.*/
		public native @Cast("bool") boolean highPerformanceRetrieveBuffer(); public native FC2Config highPerformanceRetrieveBuffer(boolean highPerformanceRetrieveBuffer);

        /** Isochronous bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int isochBusSpeed(); public native FC2Config isochBusSpeed(int isochBusSpeed);

        /** Asynchronous bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int asyncBusSpeed(); public native FC2Config asyncBusSpeed(int asyncBusSpeed);

        /**
         * Bandwidth allocation flag that tells the camera the bandwidth
         * allocation strategy to employ.
         */
        public native @Cast("FlyCapture2::BandwidthAllocation") int bandwidthAllocation(); public native FC2Config bandwidthAllocation(int bandwidthAllocation);

        /** 
         * Number of retries to perform when a register read/write timeout 
         * is received by the library. The default value is 0.
         */
        public native @Cast("unsigned int") int registerTimeoutRetries(); public native FC2Config registerTimeoutRetries(int registerTimeoutRetries);

        /** 
         * Register read/write timeout value, in microseconds. 
         * The default value is dependent on the interface type.
         */
        public native @Cast("unsigned int") int registerTimeout(); public native FC2Config registerTimeout(int registerTimeout);

        /** Reserved for future use */
        public native @Cast("unsigned int") int reserved(int i); public native FC2Config reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public FC2Config() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /**
     * Information about a specific camera property. This structure is also
     * also used as the TriggerDelayInfo structure.
     */
    @Namespace("FlyCapture2") @NoOffset public static class PropertyInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PropertyInfo(Pointer p) { super(p); }
    
        /** Property info type. */
        public native @Cast("FlyCapture2::PropertyType") int type(); public native PropertyInfo type(int type);
        /** Flag indicating if the property is present. */
        public native @Cast("bool") boolean present(); public native PropertyInfo present(boolean present);
        /** Flag indicating if auto is supported. */
        public native @Cast("bool") boolean autoSupported(); public native PropertyInfo autoSupported(boolean autoSupported);
        /** Flag indicating if manual is supported. */
        public native @Cast("bool") boolean manualSupported(); public native PropertyInfo manualSupported(boolean manualSupported);
        /** Flag indicating if on/off is supported. */
        public native @Cast("bool") boolean onOffSupported(); public native PropertyInfo onOffSupported(boolean onOffSupported);
        /** Flag indicating if one push is supported. */
        public native @Cast("bool") boolean onePushSupported(); public native PropertyInfo onePushSupported(boolean onePushSupported);
        /** Flag indicating if absolute mode is supported. */
        public native @Cast("bool") boolean absValSupported(); public native PropertyInfo absValSupported(boolean absValSupported);
        /** Flag indicating if property value can be read out. */
        public native @Cast("bool") boolean readOutSupported(); public native PropertyInfo readOutSupported(boolean readOutSupported);
        /** Minimum value (as an integer). */
        public native @Cast("unsigned int") int min(); public native PropertyInfo min(int min);
        /** Maximum value (as an integer). */
        public native @Cast("unsigned int") int max(); public native PropertyInfo max(int max);
        /** Minimum value (as a floating point value). */
        public native float absMin(); public native PropertyInfo absMin(float absMin);
        /** Maximum value (as a floating point value). */
        public native float absMax(); public native PropertyInfo absMax(float absMax);
        /** Textual description of units. */
        public native @Cast("char") byte pUnits(int i); public native PropertyInfo pUnits(int i, byte pUnits);
        @MemberGetter public native @Cast("char*") BytePointer pUnits();
        /** Abbreviated textual description of units. */
        public native @Cast("char") byte pUnitAbbr(int i); public native PropertyInfo pUnitAbbr(int i, byte pUnitAbbr);
        @MemberGetter public native @Cast("char*") BytePointer pUnitAbbr();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PropertyInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PropertyInfo() { super((Pointer)null); allocate(); }
        private native void allocate();

        public PropertyInfo( @Cast("FlyCapture2::PropertyType") int propType ) { super((Pointer)null); allocate(propType); }
        private native void allocate( @Cast("FlyCapture2::PropertyType") int propType );
    }   

    /** The TriggerDelayInfo structure is identical to PropertyInfo. */

    /** 
     * A specific camera property. \n
     * For example, to set the gain to 12dB, set the following values:
     * - \a type - \c GAIN
     * - \a absControl - \c true
     * - \a onePush - \c false
     * - \a onOff - \c true
     * - \a autoManualMode - \c false
     * - \a absValue - \c 12.0     
     */
    @Namespace("FlyCapture2") @NoOffset public static class Property extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Property(Pointer p) { super(p); }
    
        /** Property info type. */
        public native @Cast("FlyCapture2::PropertyType") int type(); public native Property type(int type);
        /** Flag indicating if the property is present. */
        public native @Cast("bool") boolean present(); public native Property present(boolean present);
        /** Flag controlling absolute mode. */
        public native @Cast("bool") boolean absControl(); public native Property absControl(boolean absControl);
        /** Flag controlling one push. */
        public native @Cast("bool") boolean onePush(); public native Property onePush(boolean onePush);
        /** Flag controlling on/off. */
        public native @Cast("bool") boolean onOff(); public native Property onOff(boolean onOff);
        /** Flag controlling auto. */
        public native @Cast("bool") boolean autoManualMode(); public native Property autoManualMode(boolean autoManualMode);
        /** Value A (integer). */
        public native @Cast("unsigned int") int valueA(); public native Property valueA(int valueA);   
        /**
         * Value B (integer). Applies only to the white balance blue value. Use
         * Value A for the red value.
         */
        public native @Cast("unsigned int") int valueB(); public native Property valueB(int valueB);   
        /** Floating point value. */
        public native float absValue(); public native Property absValue(float absValue);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Property reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Property() { super((Pointer)null); allocate(); }
        private native void allocate();

        public Property( @Cast("FlyCapture2::PropertyType") int propType ) { super((Pointer)null); allocate(propType); }
        private native void allocate( @Cast("FlyCapture2::PropertyType") int propType );
    }

    /** The TriggerDelay structure is identical to Property. */

    /** Information about a camera trigger property. */
    @Namespace("FlyCapture2") @NoOffset public static class TriggerModeInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TriggerModeInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public TriggerModeInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public TriggerModeInfo position(int position) {
            return (TriggerModeInfo)super.position(position);
        }
    
        /** Presence of trigger mode. */
        public native @Cast("bool") boolean present(); public native TriggerModeInfo present(boolean present);
        /** Flag indicating if trigger value can be read out. */
        public native @Cast("bool") boolean readOutSupported(); public native TriggerModeInfo readOutSupported(boolean readOutSupported);
        /** Flag indicating if on/off is supported. */
        public native @Cast("bool") boolean onOffSupported(); public native TriggerModeInfo onOffSupported(boolean onOffSupported);
        /** Flag indicating if polarity is supported. */
        public native @Cast("bool") boolean polaritySupported(); public native TriggerModeInfo polaritySupported(boolean polaritySupported);
        /** Flag indicating if the value is readable. */
        public native @Cast("bool") boolean valueReadable(); public native TriggerModeInfo valueReadable(boolean valueReadable);
        /** Source mask. */
        public native @Cast("unsigned int") int sourceMask(); public native TriggerModeInfo sourceMask(int sourceMask);
        /** Flag indicating if software trigger is supported. */
        public native @Cast("bool") boolean softwareTriggerSupported(); public native TriggerModeInfo softwareTriggerSupported(boolean softwareTriggerSupported);
        /** Mode mask. */
        public native @Cast("unsigned int") int modeMask(); public native TriggerModeInfo modeMask(int modeMask);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TriggerModeInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TriggerModeInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** A camera trigger. */
    @Namespace("FlyCapture2") @NoOffset public static class TriggerMode extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TriggerMode(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public TriggerMode(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public TriggerMode position(int position) {
            return (TriggerMode)super.position(position);
        }
          
        /** Flag controlling on/off. */
        public native @Cast("bool") boolean onOff(); public native TriggerMode onOff(boolean onOff);
        /** Polarity value. */
        public native @Cast("unsigned int") int polarity(); public native TriggerMode polarity(int polarity);
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native TriggerMode source(int source);
        /** Mode value. */
        public native @Cast("unsigned int") int mode(); public native TriggerMode mode(int mode);
        /** Parameter value. */
        public native @Cast("unsigned int") int parameter(); public native TriggerMode parameter(int parameter);      
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TriggerMode reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TriggerMode() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** A camera strobe property. */
    @Namespace("FlyCapture2") @NoOffset public static class StrobeInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public StrobeInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public StrobeInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public StrobeInfo position(int position) {
            return (StrobeInfo)super.position(position);
        }
    
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native StrobeInfo source(int source);
        /** Presence of strobe. */
        public native @Cast("bool") boolean present(); public native StrobeInfo present(boolean present);
        /** Flag indicating if strobe value can be read out. */
        public native @Cast("bool") boolean readOutSupported(); public native StrobeInfo readOutSupported(boolean readOutSupported);
        /** Flag indicating if on/off is supported. */
        public native @Cast("bool") boolean onOffSupported(); public native StrobeInfo onOffSupported(boolean onOffSupported);
        /** Flag indicating if polarity is supported. */
        public native @Cast("bool") boolean polaritySupported(); public native StrobeInfo polaritySupported(boolean polaritySupported);
        /** Minimum value. */
        public native float minValue(); public native StrobeInfo minValue(float minValue);
        /** Maximum value. */
        public native float maxValue(); public native StrobeInfo maxValue(float maxValue);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native StrobeInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public StrobeInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** A camera strobe. */
    @Namespace("FlyCapture2") @NoOffset public static class StrobeControl extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public StrobeControl(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public StrobeControl(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public StrobeControl position(int position) {
            return (StrobeControl)super.position(position);
        }
          
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native StrobeControl source(int source);
        /** Flag controlling on/off. */
        public native @Cast("bool") boolean onOff(); public native StrobeControl onOff(boolean onOff);
        /** Signal polarity. */
        public native @Cast("unsigned int") int polarity(); public native StrobeControl polarity(int polarity);
        /** Signal delay (in ms). */
        public native float delay(); public native StrobeControl delay(float delay);
        /** Signal duration (in ms). */
        public native float duration(); public native StrobeControl duration(float duration);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native StrobeControl reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    
        public StrobeControl() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
    
    /** Timestamp information. */
    @Namespace("FlyCapture2") @NoOffset public static class TimeStamp extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TimeStamp(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public TimeStamp(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public TimeStamp position(int position) {
            return (TimeStamp)super.position(position);
        }
    
        /** Seconds. */
        public native long seconds(); public native TimeStamp seconds(long seconds);
        /** Microseconds. */
        public native @Cast("unsigned int") int microSeconds(); public native TimeStamp microSeconds(int microSeconds);
        /** 1394 cycle time seconds. */
        public native @Cast("unsigned int") int cycleSeconds(); public native TimeStamp cycleSeconds(int cycleSeconds);
        /** 1394 cycle time count. */
        public native @Cast("unsigned int") int cycleCount(); public native TimeStamp cycleCount(int cycleCount);
        /** 1394 cycle time offset. */
        public native @Cast("unsigned int") int cycleOffset(); public native TimeStamp cycleOffset(int cycleOffset);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TimeStamp reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TimeStamp() { super((Pointer)null); allocate(); }
        private native void allocate();
    }    

    /** Camera configuration ROM. */
    @Namespace("FlyCapture2") @NoOffset public static class ConfigROM extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ConfigROM(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public ConfigROM(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public ConfigROM position(int position) {
            return (ConfigROM)super.position(position);
        }
    
        /** Vendor ID of a node. */
        public native @Cast("unsigned int") int nodeVendorId(); public native ConfigROM nodeVendorId(int nodeVendorId);
        /** Chip ID (high part). */
        public native @Cast("unsigned int") int chipIdHi(); public native ConfigROM chipIdHi(int chipIdHi);
        /** Chip ID (low part). */
        public native @Cast("unsigned int") int chipIdLo(); public native ConfigROM chipIdLo(int chipIdLo);
        /** Unit Spec ID, usually 0xa02d. */
        public native @Cast("unsigned int") int unitSpecId(); public native ConfigROM unitSpecId(int unitSpecId);
        /** Unit software version. */
        public native @Cast("unsigned int") int unitSWVer(); public native ConfigROM unitSWVer(int unitSWVer);
        /** Unit sub software version. */
        public native @Cast("unsigned int") int unitSubSWVer(); public native ConfigROM unitSubSWVer(int unitSubSWVer);
        /** Vendor unique info 0. */
        public native @Cast("unsigned int") int vendorUniqueInfo_0(); public native ConfigROM vendorUniqueInfo_0(int vendorUniqueInfo_0);
        /** Vendor unique info 1. */
        public native @Cast("unsigned int") int vendorUniqueInfo_1(); public native ConfigROM vendorUniqueInfo_1(int vendorUniqueInfo_1);
        /** Vendor unique info 2. */
        public native @Cast("unsigned int") int vendorUniqueInfo_2(); public native ConfigROM vendorUniqueInfo_2(int vendorUniqueInfo_2);
        /** Vendor unique info 3. */
        public native @Cast("unsigned int") int vendorUniqueInfo_3(); public native ConfigROM vendorUniqueInfo_3(int vendorUniqueInfo_3);
        /** Keyword. */
        public native @Cast("char") byte pszKeyword(int i); public native ConfigROM pszKeyword(int i, byte pszKeyword);
        @MemberGetter public native @Cast("char*") BytePointer pszKeyword();
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native ConfigROM reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public ConfigROM() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Camera information. */
    @Namespace("FlyCapture2") @NoOffset public static class CameraInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CameraInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CameraInfo(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CameraInfo position(int position) {
            return (CameraInfo)super.position(position);
        }
          
        /** Device serial number. */
        public native @Cast("unsigned int") int serialNumber(); public native CameraInfo serialNumber(int serialNumber);
        /** Interface type. */
        public native @Cast("FlyCapture2::InterfaceType") int interfaceType(); public native CameraInfo interfaceType(int interfaceType);
        /** Driver type. */
        public native @Cast("FlyCapture2::DriverType") int driverType(); public native CameraInfo driverType(int driverType);
        /** Flag indicating if this is a color camera. */
        public native @Cast("bool") boolean isColorCamera(); public native CameraInfo isColorCamera(boolean isColorCamera);
        /** Device model name. */
        public native @Cast("char") byte modelName(int i); public native CameraInfo modelName(int i, byte modelName);
        @MemberGetter public native @Cast("char*") BytePointer modelName();
        /** Device vendor name. */
        public native @Cast("char") byte vendorName(int i); public native CameraInfo vendorName(int i, byte vendorName);
        @MemberGetter public native @Cast("char*") BytePointer vendorName();
        /** String detailing the sensor information. */
        public native @Cast("char") byte sensorInfo(int i); public native CameraInfo sensorInfo(int i, byte sensorInfo);
        @MemberGetter public native @Cast("char*") BytePointer sensorInfo();
        /** String providing the sensor resolution. */
        public native @Cast("char") byte sensorResolution(int i); public native CameraInfo sensorResolution(int i, byte sensorResolution);
        @MemberGetter public native @Cast("char*") BytePointer sensorResolution();
        /** Driver name of driver being used. */
        public native @Cast("char") byte driverName(int i); public native CameraInfo driverName(int i, byte driverName);
        @MemberGetter public native @Cast("char*") BytePointer driverName();
        /** Firmware version of camera. */
        public native @Cast("char") byte firmwareVersion(int i); public native CameraInfo firmwareVersion(int i, byte firmwareVersion);
        @MemberGetter public native @Cast("char*") BytePointer firmwareVersion();
        /** Firmware build time. */
        public native @Cast("char") byte firmwareBuildTime(int i); public native CameraInfo firmwareBuildTime(int i, byte firmwareBuildTime);
        @MemberGetter public native @Cast("char*") BytePointer firmwareBuildTime();       
        /** Maximum bus speed. */
        public native @Cast("FlyCapture2::BusSpeed") int maximumBusSpeed(); public native CameraInfo maximumBusSpeed(int maximumBusSpeed);
        /** Bayer tile format. */
        public native @Cast("FlyCapture2::BayerTileFormat") int bayerTileFormat(); public native CameraInfo bayerTileFormat(int bayerTileFormat);
        /** Bus number, set to 0 for GigE and USB cameras **/
        public native @Cast("unsigned short") short busNumber(); public native CameraInfo busNumber(short busNumber);
        /** ieee1394 Node number, set to 0 for GigE and USB cameras **/
        public native @Cast("unsigned short") short nodeNumber(); public native CameraInfo nodeNumber(short nodeNumber);
		/** PCIe Bus Speed, set to PCIE_BUSSPEED_UNKNOWN for unsupported drivers **/
		public native @Cast("FlyCapture2::PCIeBusSpeed") int pcieBusSpeed(); public native CameraInfo pcieBusSpeed(int pcieBusSpeed);

        /** \name IIDC specific information */
        /*@{*/ 

        /** DCAM version. */
        public native @Cast("unsigned int") int iidcVer(); public native CameraInfo iidcVer(int iidcVer);
        /** Configuration ROM data. */
        public native @ByRef ConfigROM configROM(); public native CameraInfo configROM(ConfigROM configROM);

        /*@}*/       

        /** \name GigE specific information */
        /*@{*/ 

        /** GigE Vision version. */
        public native @Cast("unsigned int") int gigEMajorVersion(); public native CameraInfo gigEMajorVersion(int gigEMajorVersion);
        /** GigE Vision minor version. */
        public native @Cast("unsigned int") int gigEMinorVersion(); public native CameraInfo gigEMinorVersion(int gigEMinorVersion);
        /** User defined name. */
        public native @Cast("char") byte userDefinedName(int i); public native CameraInfo userDefinedName(int i, byte userDefinedName);
        @MemberGetter public native @Cast("char*") BytePointer userDefinedName();
        /** XML URL 1. */
        public native @Cast("char") byte xmlURL1(int i); public native CameraInfo xmlURL1(int i, byte xmlURL1);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL1();
        /** XML URL 2. */
        public native @Cast("char") byte xmlURL2(int i); public native CameraInfo xmlURL2(int i, byte xmlURL2);
        @MemberGetter public native @Cast("char*") BytePointer xmlURL2();
        /** MAC address */
        public native @ByRef MACAddress macAddress(); public native CameraInfo macAddress(MACAddress macAddress);
        /** IP address. */
        public native @ByRef IPAddress ipAddress(); public native CameraInfo ipAddress(IPAddress ipAddress);
        /** Subnet mask. */
        public native @ByRef IPAddress subnetMask(); public native CameraInfo subnetMask(IPAddress subnetMask);
        /** Default gateway. */
        public native @ByRef IPAddress defaultGateway(); public native CameraInfo defaultGateway(IPAddress defaultGateway);
		/** Status/Content of CCP register */
        public native @Cast("unsigned int") int ccpStatus(); public native CameraInfo ccpStatus(int ccpStatus);
		/** Local Application IP Address. */
        public native @Cast("unsigned int") int applicationIPAddress(); public native CameraInfo applicationIPAddress(int applicationIPAddress);
        /** Local Application port. */
        public native @Cast("unsigned int") int applicationPort(); public native CameraInfo applicationPort(int applicationPort);
        /*@}*/    

        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native CameraInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public CameraInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Properties of a single embedded image info property. */
    @Namespace("FlyCapture2") @NoOffset public static class EmbeddedImageInfoProperty extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EmbeddedImageInfoProperty(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public EmbeddedImageInfoProperty(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public EmbeddedImageInfoProperty position(int position) {
            return (EmbeddedImageInfoProperty)super.position(position);
        }
    
        /** Whether this property is available. */
        public native @Cast("bool") boolean available(); public native EmbeddedImageInfoProperty available(boolean available);
        /** Whether this property is on or off. */
        public native @Cast("bool") boolean onOff(); public native EmbeddedImageInfoProperty onOff(boolean onOff);

        public EmbeddedImageInfoProperty() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Properties of the possible embedded image information. */
    @Namespace("FlyCapture2") public static class EmbeddedImageInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public EmbeddedImageInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public EmbeddedImageInfo(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EmbeddedImageInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public EmbeddedImageInfo position(int position) {
            return (EmbeddedImageInfo)super.position(position);
        }
    
        public native @ByRef EmbeddedImageInfoProperty timestamp(); public native EmbeddedImageInfo timestamp(EmbeddedImageInfoProperty timestamp);
        public native @ByRef EmbeddedImageInfoProperty gain(); public native EmbeddedImageInfo gain(EmbeddedImageInfoProperty gain);
        public native @ByRef EmbeddedImageInfoProperty shutter(); public native EmbeddedImageInfo shutter(EmbeddedImageInfoProperty shutter);
        public native @ByRef EmbeddedImageInfoProperty brightness(); public native EmbeddedImageInfo brightness(EmbeddedImageInfoProperty brightness);
        public native @ByRef EmbeddedImageInfoProperty exposure(); public native EmbeddedImageInfo exposure(EmbeddedImageInfoProperty exposure);
        public native @ByRef EmbeddedImageInfoProperty whiteBalance(); public native EmbeddedImageInfo whiteBalance(EmbeddedImageInfoProperty whiteBalance);
        public native @ByRef EmbeddedImageInfoProperty frameCounter(); public native EmbeddedImageInfo frameCounter(EmbeddedImageInfoProperty frameCounter);
        public native @ByRef EmbeddedImageInfoProperty strobePattern(); public native EmbeddedImageInfo strobePattern(EmbeddedImageInfoProperty strobePattern);
        public native @ByRef EmbeddedImageInfoProperty GPIOPinState(); public native EmbeddedImageInfo GPIOPinState(EmbeddedImageInfoProperty GPIOPinState);
        public native @ByRef EmbeddedImageInfoProperty ROIPosition(); public native EmbeddedImageInfo ROIPosition(EmbeddedImageInfoProperty ROIPosition);
    }

    /** Metadata related to an image. */
    @Namespace("FlyCapture2") @NoOffset public static class ImageMetadata extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ImageMetadata(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public ImageMetadata(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public ImageMetadata position(int position) {
            return (ImageMetadata)super.position(position);
        }
            
        /** Embedded timestamp. */
        public native @Cast("unsigned int") int embeddedTimeStamp(); public native ImageMetadata embeddedTimeStamp(int embeddedTimeStamp);
        /** Embedded gain. */
        public native @Cast("unsigned int") int embeddedGain(); public native ImageMetadata embeddedGain(int embeddedGain);
        /** Embedded shutter. */
        public native @Cast("unsigned int") int embeddedShutter(); public native ImageMetadata embeddedShutter(int embeddedShutter);
        /** Embedded brightness. */
        public native @Cast("unsigned int") int embeddedBrightness(); public native ImageMetadata embeddedBrightness(int embeddedBrightness);
        /** Embedded exposure. */
        public native @Cast("unsigned int") int embeddedExposure(); public native ImageMetadata embeddedExposure(int embeddedExposure);
        /** Embedded white balance. */
        public native @Cast("unsigned int") int embeddedWhiteBalance(); public native ImageMetadata embeddedWhiteBalance(int embeddedWhiteBalance);
        /** Embedded frame counter. */
        public native @Cast("unsigned int") int embeddedFrameCounter(); public native ImageMetadata embeddedFrameCounter(int embeddedFrameCounter);
        /** Embedded strobe pattern. */
        public native @Cast("unsigned int") int embeddedStrobePattern(); public native ImageMetadata embeddedStrobePattern(int embeddedStrobePattern);
        /** Embedded GPIO pin state. */
        public native @Cast("unsigned int") int embeddedGPIOPinState(); public native ImageMetadata embeddedGPIOPinState(int embeddedGPIOPinState);
        /** Embedded ROI position. */
        public native @Cast("unsigned int") int embeddedROIPosition(); public native ImageMetadata embeddedROIPosition(int embeddedROIPosition);        

        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native ImageMetadata reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public ImageMetadata() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Information about the camera's look up table. */
    @Namespace("FlyCapture2") @NoOffset public static class LUTData extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public LUTData(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public LUTData(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public LUTData position(int position) {
            return (LUTData)super.position(position);
        }
    
        /** Flag indicating if LUT is supported. */
        public native @Cast("bool") boolean supported(); public native LUTData supported(boolean supported);
        /** Flag indicating if LUT is enabled. */
        public native @Cast("bool") boolean enabled(); public native LUTData enabled(boolean enabled);
        /** The number of LUT banks available (Always 1 for PGR LUT). */
        public native @Cast("unsigned int") int numBanks(); public native LUTData numBanks(int numBanks);
        /** The number of LUT channels per bank available. */
        public native @Cast("unsigned int") int numChannels(); public native LUTData numChannels(int numChannels);
        /** The input bit depth of the LUT. */
        public native @Cast("unsigned int") int inputBitDepth(); public native LUTData inputBitDepth(int inputBitDepth);
        /** The output bit depth of the LUT. */
        public native @Cast("unsigned int") int outputBitDepth(); public native LUTData outputBitDepth(int outputBitDepth);
        /** The number of entries in the LUT. */
        public native @Cast("unsigned int") int numEntries(); public native LUTData numEntries(int numEntries);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native LUTData reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public LUTData() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Camera diagnostic information. */
    @Namespace("FlyCapture2") @NoOffset public static class CameraStats extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CameraStats(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public CameraStats(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public CameraStats position(int position) {
            return (CameraStats)super.position(position);
        }
    
        /* Number of dropped images in DROP_IMAGE mode */
        public native @Cast("unsigned int") int imageDropped(); public native CameraStats imageDropped(int imageDropped);		
        /* Number of corrupt images, such as missing packet, zero packet */
        public native @Cast("unsigned int") int imageCorrupt(); public native CameraStats imageCorrupt(int imageCorrupt);
        /* Number of transmissions failed of camera */
        public native @Cast("unsigned int") int imageXmitFailed(); public native CameraStats imageXmitFailed(int imageXmitFailed);	
        /* Number of images dropped in driver */
        public native @Cast("unsigned int") int imageDriverDropped(); public native CameraStats imageDriverDropped(int imageDriverDropped);	
        /* Errors of register reading */
        public native @Cast("unsigned int") int regReadFailed(); public native CameraStats regReadFailed(int regReadFailed);
        /* Errors of register writing */
        public native @Cast("unsigned int") int regWriteFailed(); public native CameraStats regWriteFailed(int regWriteFailed);
        /* Port errors */
        public native @Cast("unsigned int") int portErrors(); public native CameraStats portErrors(int portErrors);
        /* The value of the camera power register. 
         * false: Camera is powered down.
         * true: Camera is powered up. 
         */
        public native @Cast("bool") boolean cameraPowerUp(); public native CameraStats cameraPowerUp(boolean cameraPowerUp);

        /* The voltage values of the various voltage registers 
         * supported by the camera.
         */
        public native float cameraVoltages(int i); public native CameraStats cameraVoltages(int i, float cameraVoltages);
        @MemberGetter public native FloatPointer cameraVoltages();
        /** The number of voltage registers available. 
          * 0: the values in cameraVoltages[] are invalid.
          */
        public native @Cast("unsigned int") int numVoltages(); public native CameraStats numVoltages(int numVoltages);

        /* The current values of the various current registers 
         * supported by the camera.
         */
        public native float cameraCurrents(int i); public native CameraStats cameraCurrents(int i, float cameraCurrents);
        @MemberGetter public native FloatPointer cameraCurrents();
        /** The number of current registers available.
          * 0: the values in cameraCurrents[] are invalid.
          */
        public native @Cast("unsigned int") int numCurrents(); public native CameraStats numCurrents(int numCurrents);
        /* The temperature of the camera board-level components. The value is 
         * in kelvins (0�C = 273.15K) and are in one-tenths (0.1) of a kelvin.
         */
        public native @Cast("unsigned int") int temperature(); public native CameraStats temperature(int temperature);
        /* Time in seconds since the camera was initialized. */
        public native @Cast("unsigned int") int timeSinceInitialization(); public native CameraStats timeSinceInitialization(int timeSinceInitialization);
        /* Time in seconds since the camera detected a bus reset. */
        public native @Cast("unsigned int") int timeSinceBusReset(); public native CameraStats timeSinceBusReset(int timeSinceBusReset);
        /* Time stamp */
        public native @ByRef TimeStamp timeStamp(); public native CameraStats timeStamp(TimeStamp timeStamp);
		/* Number of packets requested for resend */
		public native @Cast("unsigned int") int numResendPacketsRequested(); public native CameraStats numResendPacketsRequested(int numResendPacketsRequested);
		/* Number of packet-resend packets received */
		public native @Cast("unsigned int") int numResendPacketsReceived(); public native CameraStats numResendPacketsReceived(int numResendPacketsReceived);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native CameraStats reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public CameraStats() { super((Pointer)null); allocate(); }
        private native void allocate();
    }


    /** 
     * \defgroup ImageSaveStructures Image saving structures.
     *
     * These structures define various parameters used for saving images.
     */

    /*@{*/ 

    /** Options for saving PNG images. */
    @Namespace("FlyCapture2") @NoOffset public static class PNGOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PNGOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public PNGOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public PNGOption position(int position) {
            return (PNGOption)super.position(position);
        }
    
        /** Whether to save the PNG as interlaced. */
        public native @Cast("bool") boolean interlaced(); public native PNGOption interlaced(boolean interlaced); 
        /** Compression level (0-9). 0 is no compression, 9 is best compression. */
        public native @Cast("unsigned int") int compressionLevel(); public native PNGOption compressionLevel(int compressionLevel);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PNGOption reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PNGOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Options for saving PPM images. */
    @Namespace("FlyCapture2") @NoOffset public static class PPMOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PPMOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public PPMOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public PPMOption position(int position) {
            return (PPMOption)super.position(position);
        }
    
        /** Whether to save the PPM as a binary file. */
        public native @Cast("bool") boolean binaryFile(); public native PPMOption binaryFile(boolean binaryFile);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PPMOption reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PPMOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
       
    /** Options for saving PGM images. */
    @Namespace("FlyCapture2") @NoOffset public static class PGMOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PGMOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public PGMOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public PGMOption position(int position) {
            return (PGMOption)super.position(position);
        }
    
        /** Whether to save the PPM as a binary file. */
        public native @Cast("bool") boolean binaryFile(); public native PGMOption binaryFile(boolean binaryFile);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native PGMOption reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public PGMOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Options for saving TIFF images. */
    @Namespace("FlyCapture2") @NoOffset public static class TIFFOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TIFFOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public TIFFOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public TIFFOption position(int position) {
            return (TIFFOption)super.position(position);
        }
    
        /** enum FlyCapture2::TIFFOption::CompressionMethod */
        public static final int            
            /** Save without any compression. */
            NONE = 1,            
            /** Save using PACKBITS compression. */
            PACKBITS = 2,            
            /** Save using DEFLATE compression (ZLIB compression). */
            DEFLATE = 3,            
            /** Save using ADOBE DEFLATE compression */
            ADOBE_DEFLATE = 4,
            /**
             * Save using CCITT Group 3 fax encoding. This is only valid for
             * 1-bit images only. Default to LZW for other bit depths.
             */
            CCITTFAX3 = 5,
            /**
             * Save using CCITT Group 4 fax encoding. This is only valid for
             * 1-bit images only. Default to LZW for other bit depths.
             */
            CCITTFAX4 = 6,            
            /** Save using LZW compression. */
            LZW = 7,
            /**
             * Save using JPEG compression. This is only valid for 8-bit
             * greyscale and 24-bit only. Default to LZW for other bit depths.
             */
            JPEG = 8;

        /** Compression method to use for encoding TIFF images. */
        public native @Cast("FlyCapture2::TIFFOption::CompressionMethod") int compression(); public native TIFFOption compression(int compression); 
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TIFFOption reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TIFFOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Options for saving JPEG image. */
    @Namespace("FlyCapture2") @NoOffset public static class JPEGOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public JPEGOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public JPEGOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public JPEGOption position(int position) {
            return (JPEGOption)super.position(position);
        }
    
        /** Whether to save as a progressive JPEG file. */
        public native @Cast("bool") boolean progressive(); public native JPEGOption progressive(boolean progressive); 
        /**
         * JPEG image quality in range (0-100).
         * - 100 - Superb quality.
         * - 75  - Good quality.
         * - 50  - Normal quality.
         * - 10  - Poor quality.
         */
        public native @Cast("unsigned int") int quality(); public native JPEGOption quality(int quality);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native JPEGOption reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public JPEGOption() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

    /** Options for saving JPEG2000 image. */
    @Namespace("FlyCapture2") @NoOffset public static class JPG2Option extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public JPG2Option(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public JPG2Option(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public JPG2Option position(int position) {
            return (JPG2Option)super.position(position);
        }
    
        /** JPEG saving quality in range (1-512). */
        public native @Cast("unsigned int") int quality(); public native JPG2Option quality(int quality);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native JPG2Option reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public JPG2Option() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

	/** Options for saving Bitmap image. */
	@Namespace("FlyCapture2") @NoOffset public static class BMPOption extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public BMPOption(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(int)}. */
	    public BMPOption(int size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(int size);
	    @Override public BMPOption position(int position) {
	        return (BMPOption)super.position(position);
	    }
	
		public native @Cast("bool") boolean indexedColor_8bit(); public native BMPOption indexedColor_8bit(boolean indexedColor_8bit);
		/** Reserved for future use. */
		public native @Cast("unsigned int") int reserved(int i); public native BMPOption reserved(int i, int reserved);
		@MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

		public BMPOption() { super((Pointer)null); allocate(); }
		private native void allocate();
	}

	/** Options for saving MJPG files. */
	@Namespace("FlyCapture2") @NoOffset public static class MJPGOption extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public MJPGOption(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(int)}. */
	    public MJPGOption(int size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(int size);
	    @Override public MJPGOption position(int position) {
	        return (MJPGOption)super.position(position);
	    }
	
		/** Frame rate of the stream */
		public native float frameRate(); public native MJPGOption frameRate(float frameRate);

		/** Image quality (1-100) */
		public native @Cast("unsigned int") int quality(); public native MJPGOption quality(int quality);

		public native @Cast("unsigned int") int reserved(int i); public native MJPGOption reserved(int i, int reserved);
		@MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

		public MJPGOption() { super((Pointer)null); allocate(); }
		private native void allocate();
	}

	/** Options for saving H264 files. */
	@Namespace("FlyCapture2") @NoOffset public static class H264Option extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public H264Option(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(int)}. */
	    public H264Option(int size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(int size);
	    @Override public H264Option position(int position) {
	        return (H264Option)super.position(position);
	    }
	
		/** Frame rate of the stream */
		public native float frameRate(); public native H264Option frameRate(float frameRate);

		/** Width of source image */
		public native @Cast("unsigned int") int width(); public native H264Option width(int width);

		/** Height of source image */
		public native @Cast("unsigned int") int height(); public native H264Option height(int height);

		/** Bitrate to encode at */
		public native @Cast("unsigned int") int bitrate(); public native H264Option bitrate(int bitrate);

		/** Reserved for future use */
		public native @Cast("unsigned int") int reserved(int i); public native H264Option reserved(int i, int reserved);
		@MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

		public H264Option() { super((Pointer)null); allocate(); }
		private native void allocate();
	}

    /** Options for saving AVI files. */
    @Namespace("FlyCapture2") @NoOffset public static class AVIOption extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AVIOption(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public AVIOption(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public AVIOption position(int position) {
            return (AVIOption)super.position(position);
        }
    
        /** Frame rate of the stream */
        public native float frameRate(); public native AVIOption frameRate(float frameRate);

		/** Reserved for future use */
		public native @Cast("unsigned int") int reserved(int i); public native AVIOption reserved(int i, int reserved);
		@MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

		public AVIOption() { super((Pointer)null); allocate(); }
		private native void allocate();
    }    

	/*@}*/ 

    /*@}*/ 

// 	#pragma deprecated(hostPost)


// #endif // PGR_FC2_FLYCAPTURE2DEFS_H



// Parsed from <Error.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
//
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
//
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: Error.h 112716 2011-05-13 16:37:36Z soowei $
//=============================================================================

// #ifndef PGR_FC2_ERROR_H
// #define PGR_FC2_ERROR_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"
// #include <stdio.h>
    @Namespace("FlyCapture2") @Opaque public static class ErrorImpl extends Pointer {
        /** Empty constructor. */
        public ErrorImpl() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ErrorImpl(Pointer p) { super(p); }
    }
  
    /**
     * The Error object represents an error that is returned from the library.
     * Overloaded operators allow comparisons against other Error objects or
     * the ErrorType enumeration.
     */
    @Namespace("FlyCapture2") @NoOffset public static class Error extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Error(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Error(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Error position(int position) {
            return (Error)super.position(position);
        }
    
        
        /**
         * Default constructor.
         */
        public Error() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Copy constructor.
         */
        public Error( @Const @ByRef Error error ) { super((Pointer)null); allocate(error); }
        private native void allocate( @Const @ByRef Error error );

        /**
         * Default destructor.
         */

        /**
         * Assignment operator.
         */
        public native @ByRef @Name("operator =") Error put( @Const @ByRef Error error );

        /**
         * Equality operator.
         */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef Error error );

        /**
         * Equality operator. This overloaded operator compares the
         * ErrorType of the Error against the specified ErrorType.
         */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Cast("const FlyCapture2::ErrorType") int errorType );

        /**
         * Inequality operator.
         */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef Error error );

        /**
         * Inequality operator. This overloaded operator compares the
         * ErrorType of the Error against the specified ErrorType.
         */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Cast("const FlyCapture2::ErrorType") int errorType );

        /**
         * Retrieve the ErrorType of the error.
         *
         * @return The ErrorType of the error.
         */
        public native @Cast("FlyCapture2::ErrorType") int GetType();

        /**
         * Retrieve the top level description of the error that occurred.
         *
         * @return A string with the error description.
         */
        public native @Cast("const char*") BytePointer GetDescription();

        /**
         * Retrieve the line number where the error originated.
         *
         * @return The line number.
         */
        public native @Cast("unsigned int") int GetLine();

        /**
         * Retrieve the source filename where the error originated.
         *
         * @return A string with the file name.
         */
        public native @Cast("const char*") BytePointer GetFilename();

        /**
         * Get the error which caused this error.
         *
         * @return An error object representing the cause of this error.
         */
        public native @ByVal Error GetCause();

        /**
         * Retrieve the build date of the file where the error originated.
         *
         * @return A string with the build date and time.
         */
        public native @Cast("const char*") BytePointer GetBuildDate();

        /**
         * Retrieve the support information. 
         * It is not implemented in this release.
         *
         * @return A string containing support information.
         */
        public native @Cast("const char*") BytePointer CollectSupportInformation();

        /**
         * Print a formatted log trace to stderr.
         */
        public native void PrintErrorTrace();
    }


// #endif // PGR_FC2_ERROR_H


// Parsed from <BusManager.h>

//=============================================================================
// Copyright © 2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: BusManager.h 199388 2014-06-18 18:19:05Z mgara $
//=============================================================================

// #ifndef PGR_FC2_BUSMANAGER_H
// #define PGR_FC2_BUSMANAGER_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /** 
     * Bus event callback function prototype. Defines the syntax of the
     * callback function that is passed into RegisterCallback() and
     * UnregisterCallback(). It is recommended that minimal handling be
     * performed in this callback as it will block internal processing
     * of bus events until it returns.
     */
    public static class BusEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    BusEventCallback(Pointer p) { super(p); }
        protected BusEventCallback() { allocate(); }
        private native void allocate();
        public native void call( Pointer pParameter, @Cast("unsigned int") int serialNumber );
    }
    
    /** 
     * Handle that is returned when registering a callback. It is required
     * when unregistering the callback.
     */
    @Namespace @Name("void") @Opaque public static class CallbackHandle extends Pointer {
        /** Empty constructor. */
        public CallbackHandle() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CallbackHandle(Pointer p) { super(p); }
    }    
    
    /**
     * The BusManager class provides the functionality for the user to get an 
     * PGRGuid for a desired camera or device easily. Once the
     * camera or device token is found, it can then be used to connect to the 
     * camera or device through the camera class or device class. In addition, 
     * the BusManager class provides the ability to be notified when a camera 
     * or device is added or removed or some event occurs on the PC.
     */ 
    @Namespace("FlyCapture2") @NoOffset public static class BusManager extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BusManager(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public BusManager(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public BusManager position(int position) {
            return (BusManager)super.position(position);
        }
     

        /**
         * Default constructor.
         */
        public BusManager() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Default destructor.
         */

        /** 
         * Fire a bus reset. The actual bus reset is only fired for the 
         * specified 1394 bus, but it will effectively cause a global bus
         * reset for the library.
         *
         * @param pGuid PGRGuid of the camera or the device to cause bus reset.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error FireBusReset( PGRGuid pGuid);

        /**
         * Gets the number of cameras attached to the PC.
         *
         * @param pNumCameras The number of cameras attached.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetNumOfCameras( @Cast("unsigned int*") IntPointer pNumCameras );
        public native @ByVal Error GetNumOfCameras( @Cast("unsigned int*") IntBuffer pNumCameras );
        public native @ByVal Error GetNumOfCameras( @Cast("unsigned int*") int[] pNumCameras );

        /**
         * Gets the PGRGuid for a camera with the specified IPv4 address.
         *
         * @param ipAddress IP address to get GUID for.
         * @param pGuid Unique PGRGuid for the camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetCameraFromIPAddress( 
                    @ByVal IPAddress ipAddress,
                    PGRGuid pGuid );
        
        /**
         * Gets the PGRGuid for a camera on the PC. It uniquely identifies
         * the camera specified by the index and is used to identify the camera
         * during a Camera::Connect() call.
         *
         * @param index Zero based index of camera.
         * @param pGuid Unique PGRGuid for the camera.
         *
         * @see GetCameraFromSerialNumber()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetCameraFromIndex( 
                    @Cast("unsigned int") int index, 
                    PGRGuid pGuid );
        
        /**
         * Gets the PGRGuid for a camera on the PC. It uniquely identifies
         * the camera specified by the serial number and is used to identify the camera
         * during a Camera::Connect() call.
         *
         * @param serialNumber Serial number of camera.
         * @param pGuid Unique PGRGuid for the camera.
         *
         * @see GetCameraFromIndex()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetCameraFromSerialNumber( 
                    @Cast("unsigned int") int serialNumber, 
                    PGRGuid pGuid );
        
        /**
         * Gets the serial number of the camera with the specified index.
         *
         * @param index Zero based index of desired camera.
         * @param pSerialNumber Serial number of camera.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetCameraSerialNumberFromIndex( 
                    @Cast("unsigned int") int index, 
                    @Cast("unsigned int*") IntPointer pSerialNumber );
        public native @ByVal Error GetCameraSerialNumberFromIndex( 
                    @Cast("unsigned int") int index, 
                    @Cast("unsigned int*") IntBuffer pSerialNumber );
        public native @ByVal Error GetCameraSerialNumberFromIndex( 
                    @Cast("unsigned int") int index, 
                    @Cast("unsigned int*") int[] pSerialNumber );

        /**
         * Gets the interface type associated with a PGRGuid. This is useful
         * in situations where there is a need to enumerate all cameras
         * for a particular interface.
         *
         * @param pGuid The PGRGuid to get the interface for.
         * @param pInterfaceType The interface type of the PGRGuid.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetInterfaceTypeFromGuid(
                    PGRGuid pGuid,
                    @Cast("FlyCapture2::InterfaceType*") IntPointer pInterfaceType );
        public native @ByVal Error GetInterfaceTypeFromGuid(
                    PGRGuid pGuid,
                    @Cast("FlyCapture2::InterfaceType*") IntBuffer pInterfaceType );
        public native @ByVal Error GetInterfaceTypeFromGuid(
                    PGRGuid pGuid,
                    @Cast("FlyCapture2::InterfaceType*") int[] pInterfaceType );

        /**
         * Gets the number of devices. This may include hubs, host controllers
         * and other hardware devices (including cameras).
         *
         * @param pNumDevices The number of devices found.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetNumOfDevices( @Cast("unsigned int*") IntPointer pNumDevices );
        public native @ByVal Error GetNumOfDevices( @Cast("unsigned int*") IntBuffer pNumDevices );
        public native @ByVal Error GetNumOfDevices( @Cast("unsigned int*") int[] pNumDevices );

        /**
         * Gets the PGRGuid for a device. It uniquely identifies the device
         * specified by the index.
         *
         * @param index Zero based index of device.
         * @param pGuid Unique PGRGuid for the device.
         *
         * @see GetNumOfDevices()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetDeviceFromIndex( 
                    @Cast("unsigned int") int index, 
                    PGRGuid pGuid );

        /**
         * Read a phy register on the specified device. The full address
         * to be read from is determined by the page, port and address.
         *
         * @param guid PGRGuid of the device to read from.
         * @param page Page to read from.
         * @param port Port to read from.
         * @param address Address to read from.
         * @param pValue Value read from the phy register.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error ReadPhyRegister(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int") int page,
                    @Cast("unsigned int") int port,
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error ReadPhyRegister(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int") int page,
                    @Cast("unsigned int") int port,
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error ReadPhyRegister(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int") int page,
                    @Cast("unsigned int") int port,
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") int[] pValue );

        /**
         * Write a phy register on the specified device. The full address
         * to be written to is determined by the page, port and address.
         *
         * @param guid PGRGuid of the device to write to.
         * @param page Page to write to.
         * @param port Port to write to.
         * @param address Address to write to.
         * @param value Value to write to phy register.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error WritePhyRegister(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int") int page,
                    @Cast("unsigned int") int port,
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int") int value );

		/**
         * Read usb link info for the port that the specified device is connected to. 
         *
         * @param guid PGRGuid of the device to read from.
         * @param pValue Value read from the card register.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetUsbLinkInfo(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error GetUsbLinkInfo(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error GetUsbLinkInfo(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") int[] pValue );

		/**
         * Read usb port status for the port that the specified device is connected to. 
         *
         * @param guid PGRGuid of the device to read from.
         * @param pValue Value read from the card register.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetUsbPortStatus(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error GetUsbPortStatus(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error GetUsbPortStatus(
                    @ByVal PGRGuid guid,
                    @Cast("unsigned int*") int[] pValue );
        
        /**
         * Gets the topology information for the PC.
         *
         * @param pNode TopologyNode object that will contain the topology 
         *              information.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetTopology(
                    TopologyNode pNode );

        /**
         * Register a callback function that will be called when the
         * specified callback event occurs.
         *
         * @param busEventCallback Pointer to function that will receive
                                   the callback.
         * @param callbackType Type of callback to register for.
         * @param pParameter Callback parameter to be passed to callback.
         * @param pCallbackHandle Unique callback handle used for 
         *                        unregistering callback.
         *
         * @see UnregisterCallback()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error RegisterCallback( 
                    BusEventCallback busEventCallback, 
                    @Cast("FlyCapture2::BusCallbackType") int callbackType,
                    Pointer pParameter,
                    @ByPtrPtr CallbackHandle pCallbackHandle );
        
        /**
         * Unregister a callback function.
         *
         * @param callbackHandle Unique callback handle.
         *
         * @see RegisterCallback()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error UnregisterCallback( CallbackHandle callbackHandle );

        /**
         * Force a rescan of the buses. This does not trigger a bus reset.
         * However, any current connections to a Camera object will be
         * invalidated.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error RescanBus();

        /**
         * Force the camera with the specific MAC address to the specified
         * IP address, subnet mask and default gateway. This is useful in
         * situations where a GigE Vision camera is using Persistent IP and the
         * application's subnet is different from the device subnet.
         *
         * @param macAddress MAC address of the camera.
         * @param ipAddress IP address to set on the camera.
         * @param subnetMask Subnet mask to set on the camera.
         * @param defaultGateway Default gateway to set on the camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public static native @ByVal Error ForceIPAddressToCamera( 
                    @ByVal MACAddress macAddress,
                    @ByVal IPAddress ipAddress,
                    @ByVal IPAddress subnetMask,
                    @ByVal IPAddress defaultGateway );

        /**
         * Force all cameras on the network to be assigned sequential IP addresses
         * on the same subnet as the netowrk adapters that they are connected to. 
         * This is useful in situations where a GigE Vision cameras are using 
         * Persistent IP addresses and the application's subnet is different from 
         * the devices.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public static native @ByVal Error ForceAllIPAddressesAutomatically();

		/**
         * Force a camera on the network to be assigned an IP address
         * on the same subnet as the netowrk adapters that it is connected to. 
         * This is useful in situations where GigE Vision cameras are using IP 
		 * addresses in a subnet different from the host's subnet.
         *
         * @return An Error indicating the success or failure of the function.
         */
		public static native @ByVal Error ForceAllIPAddressesAutomatically(@Cast("unsigned int") int serialNumber);

        /**
         * Discover all cameras connected to the network even if they reside
         * on a different subnet. This is useful in situations where GigE Vision 
		 * cameras are using IP addresses in a subnet different from the host's 
		 * subnet. After discovering the camera, it is easy to use 
		 * ForceIPAddressToCamera() to set a different IP configuration.
         *
         * @param gigECameras Pointer to an array of CameraInfo structures.
         * @param arraySize Size of the array. Number of discovered cameras
         *                  is returned in the same value.
         *
         * @return An Error indicating the success or failure of the function.
         *         If the error is PGRERROR_BUFFER_TOO_SMALL then arraySize will
         *         contain the minimum size needed for gigECameras array.
         */
        public static native @ByVal Error DiscoverGigECameras( 
                    CameraInfo gigECameras,
                    @Cast("unsigned int*") IntPointer arraySize  );
        public static native @ByVal Error DiscoverGigECameras( 
                    CameraInfo gigECameras,
                    @Cast("unsigned int*") IntBuffer arraySize  );
        public static native @ByVal Error DiscoverGigECameras( 
                    CameraInfo gigECameras,
                    @Cast("unsigned int*") int[] arraySize  );

		/**
         * Query CCP status on camera with corresponding PGRGuid. This is 
		 * useful to determine if a GigE camera can be controlled.
         *
         * @param pGuid PGRGuid of the camera
         * @param pControlable Indicates whether camera is controllable
         *
         * @return An Error indicating the success or failure of the function.
         */
		public native @ByVal Error IsCameraControlable( 
					PGRGuid pGuid, @Cast("bool*") BoolPointer pControlable );
    }


// #endif //PGR_FC2_BUSMANAGER_H


// Parsed from <CameraBase.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: CameraBase.h 190879 2014-03-18 18:05:14Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_CAMERABASE_H_
// #define PGR_FC2_CAMERABASE_H_

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /** 
     * Image event callback function prototype. Defines the syntax of the
     * image callback function that is passed into StartCapture(). It is
     * possible for this function to be called simultaneously. Therefore,
     * users must make sure that code in the callback is thread safe.
     */
    public static class ImageEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    ImageEventCallback(Pointer p) { super(p); }
        protected ImageEventCallback() { allocate(); }
        private native void allocate();
        public native void call( Image pImage, @Const Pointer pCallbackData );
    }

    /**
     * The CameraBase class is an abstract base class that defines a general
     * interface to a camera.
     *
     * \nosubgrouping
     */
    @Namespace("FlyCapture2") @NoOffset public static class CameraBase extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public CameraBase() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CameraBase(Pointer p) { super(p); }
    

        /**
         * Default constructor.
         */

        /**
         * Default destructor.
         */

        /** 
         * \name Connection and Image Retrieval
         *
         * These functions deal with connections and image retrieval from
         * the camera.
         */
        /*@{*/ 

        /**
         * Connects the camera object to the camera specified by the GUID.
         * If the guid is omitted or set to NULL, the connection will be made 
         * to the first camera detected on the PC (i.e. index = 0).
         *
         * @param pGuid The unique identifier for a specific camera on the PC.
         *
         * @see BusManager::GetCameraFromIndex()
         * @see BusManager::GetCameraFromSerialNumber()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Connect( PGRGuid pGuid/*=NULL*/ );
        public native @ByVal Error Connect( );        

        /**
         * Disconnects the camera object from the camera. This allows another
         * physical camera to be connected to the camera object.
         *
         * @see Connect()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Disconnect();

        /**
         * Checks if the camera object is currently connected to a physical
         * camera.
         *
         * @see Connect()
         * @see Disconnect()
         *
         * @return Whether the camera object is connected to a physical camera.
         */ 
        public native @Cast("bool") boolean IsConnected();

        /**
         * Sets the callback data to be used on completion of image transfer.
         * To clear the current stored callback data, pass in NULL for both
         * arguments.
         *
         * @param callbackFn A function to be called when a new image is
         *                   received.
         * @param pCallbackData A pointer to data that can be passed to the
         *                      callback function.
         *
         * @see StartCapture()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn,
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn );
        
        /**
         * Starts isochronous image capture. It will use either the current
         * video mode or the most recently set video mode of the camera.
         * The optional callback function parameter is called on completion of 
         * image transfer. 
		 * When a callback function is specified, the grab mode will determine how 
		 * images are delivered.
		 * If the grab mode has not been set, or has been set to DROP_FRAMES
		 * the default behavior is to requeue images for DMA if they have
		 * not been delivered by the time the next image transfer completes.
		 * If BUFFER_FRAMES is specified, the next image in the sequence will 
		 * be delivered. Note that for the BUFFER_FRAMES case, if delivery 
		 * does not keep up with the DMA process, images will be lost.  
		 * The default behavior is to perform DROP_FRAMES image delivery
		 * Alternatively, the callback parameter can be set to NULL 
		 * and RetrieveBuffer() can be called as a blocking call to get 
		 * the image data.
         *
         * @param callbackFn A function to be called when a new image is
         *                   received.
         * @param pCallbackData A pointer to data that can be passed to the
         *                      callback function.
         *
         * @see RetrieveBuffer()
         * @see StartSyncCapture()
         * @see StopCapture()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error StartCapture( 
                    ImageEventCallback callbackFn/*=NULL*/, 
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error StartCapture( );              

        /**
         * Starts isochronous image capture on multiple cameras. On each frame, 
         * the time stamps across the cameras are aligned which means the frames 
         * are synchronized. Note that the cameras must be synchronized by
         * external means in order for this function to work. This means that
         * the cameras should either be on the same bus, hardware synchronized
         * (e.g. through triggering) or Multisync is running.
		 * Note: The use of this function with GigE Cameras is not supported.
		 *
         * @param numCameras Number of Camera objects in the ppCameras array.
         * @param ppCameras Array of pointers to Camera objects containing the
         *                  cameras to be started and synchronized.
         * @param pCallbackFns Array of callback functions for each camera.
         * @param pCallbackDataArray Array of callback data pointers. 
         *
         * @see RetrieveBuffer()
         * @see StartCapture()
         * @see StopCapture()
         * 
         * @return An Error indicating the success or failure of the function.
         */ 
        
        
        /**
         * Retrieves the the next image object containing the next image.
         * If the grab mode has not been set, or has been set to DROP_FRAMES
         * the default behavior is to requeue images for DMA if they have
         * not been retrieved by the time the next image transfer completes.
         * If BUFFER_FRAMES is specified, the next image in the sequence will 
         * be retrieved.  Note that for the BUFFER_FRAMES case, if retrieval 
         * does not keep up with the DMA process, images will be lost.  
         * The default behavior is to perform DROP_FRAMES image retrieval.   
         *
         * @param pImage Pointer to Image object to store image data.
         *
         * @see StartCapture()
         * @see StopCapture()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error RetrieveBuffer( Image pImage );

        /**
         * Stops isochronous image transfer and cleans up all associated
         * resources. 
		 * If an image callback function (specified in the StartCapture() call)
		 * is currently executing, StopCapture() will not return until after 
		 * the callback has completed.
         *
         * @see StartCapture()
         * @see RetrieveBuffer()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error StopCapture();

        /**
         * Retrieves the next image event containing the next part of the image.
         *
         * @param pImage Pointer to Image object to store image data.
         * @param eventNumber The event number to wait for.
         *
         * @see StartCapture()
         * @see RetrieveBuffer()
         * @see StopCapture()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error WaitForBufferEvent( Image pImage, @Cast("unsigned int") int eventNumber );

        /**
         * Specify user allocated buffers to use as image data buffers.
         * To prevent image tearing, the size of each buffer should be equal to
         * ((unsigned int)(bufferSize + packetSize - 1)/packetSize) * packetSize.
         * The total size should be (size * numBuffers) or larger.
		 * The packet Size that should be used differs between interfaces:
		 *	Firewire:	Use the Format7 packet size.
		 *  Usb2:		First round to Format7 packet size then round to 512 bytes.
		 *  Usb3:		Use a packet size of 1024 bytes.
		 *  GigE:		No need to do any rounding on GigE
         *
         * @param pMemBuffers Pointer to memory buffers to be written to.
         * @param size The size of each buffer (in bytes).
         * @param numBuffers Number of buffers in the array.
         *
         * @see StartCapture()
         * @see RetrieveBuffer()
         * @see StopCapture()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") BytePointer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") ByteBuffer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") byte[] pMemBuffers,
                    int size,
                    int numBuffers );

        /**
         * Get the configuration associated with the camera object.
         *
         * @param pConfig Pointer to the configuration structure to be filled.
         *
         * @see SetConfiguration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetConfiguration( FC2Config pConfig );

        /**
         * Set the configuration associated with the camera object.
         *
         * @param pConfig Pointer to the configuration structure to be used.
         *
         * @see GetConfiguration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetConfiguration( @Const FC2Config pConfig );

        /*@}*/

        /** 
         * \name Information and Properties
         *
         * These functions deal with information and properties can be
         * retrieved from the camera.
         */
        /*@{*/ 

        /**
         * Retrieves information from the camera such as serial number, model
         * name and other camera information.
         *
         * @param pCameraInfo Pointer to the camera information structure
         *                    to be filled.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetCameraInfo( CameraInfo pCameraInfo );
        
        /**
         * Retrieves information about the specified camera property. The 
         * property type must be specified in the PropertyInfo structure 
         * passed into the function in order for the function to succeed.
         *
         * @param pPropInfo Pointer to the PropertyInfo structure to be filled.
         *
         * @see GetProperty()
         * @see SetProperty()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetPropertyInfo( PropertyInfo pPropInfo );

        /**
         * Reads the settings for the specified property from the camera. The 
         * property type must be specified in the Property structure passed
         * into the function in order for the function to succeed. If auto
         * is on, the integer and abs values returned may not be consistent
         * with each other.
         *
         * @param pProp Pointer to the Property structure to be filled.
         *
         * @see GetPropertyInfo()
         * @see SetProperty()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetProperty( Property pProp );
        
        /**
         * Writes the settings for the specified property to the camera. The 
         * property type must be specified in the Property structure passed
         * into the function in order for the function to succeed.
         * The absControl flag controls whether the absolute or integer value
         * is written to the camera.
         *
         * @param pProp Pointer to the Property structure to be used.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see GetPropertyInfo()
         * @see GetProperty()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetProperty( 
                    @Const Property pProp, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetProperty( 
                    @Const Property pProp );

        /*@}*/

        /** 
         * \name General Purpose Input / Output
         *
         * These functions deal with general GPIO pin control on the camera.
         */
        /*@{*/ 

        /**
         * Get the GPIO pin direction for the specified pin. This is not a
         * required call when using the trigger or strobe functions as
         * the pin direction is set automatically internally.
         *
         * @param pin Pin to get the direction for.
         * @param pDirection Direction of the pin. 0 for input, 1 for output.
         *
         * @see SetGPIOPinDirection()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntPointer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntBuffer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") int[] pDirection);
        
        /**
         * Set the GPIO pin direction for the specified pin. This is useful if
         * there is a need to set the pin into an input pin (i.e. to read the
         * voltage) off the pin without setting it as a trigger source. This 
         * is not a required call when using the trigger or strobe functions as
         * the pin direction is set automatically internally.
         *
         * @param pin Pin to get the direction for.
         * @param direction Direction of the pin. 0 for input, 1 for output.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see GetGPIOPinDirection()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction, @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction );    

        /*@}*/       

        /** 
         * \name Trigger
         *
         * These functions deal with trigger control on the camera.
         */
        /*@{*/ 
        
        /**
         * Retrieve trigger information from the camera.
         *
         * @param pTriggerModeInfo Structure to receive trigger information.
         *
         * @see GetTriggerMode()
         * @see SetTriggerMode()
         * @see GetTriggerDelayInfo()
         * @see GetTriggerDelay()
         * @see SetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetTriggerModeInfo( TriggerModeInfo pTriggerModeInfo );
        
        /**
         * Retrieve current trigger settings from the camera.
         *
         * @param pTriggerMode Structure to receive trigger mode settings.
         *
         * @see GetTriggerModeInfo()
         * @see SetTriggerMode()
         * @see GetTriggerDelayInfo()
         * @see GetTriggerDelay()
         * @see SetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetTriggerMode( TriggerMode pTriggerMode );
        
        /**
         * Set the specified trigger settings to the camera.
         *
         * @param pTriggerMode Structure providing trigger mode settings.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see GetTriggerModeInfo()
         * @see GetTriggerMode()
         * @see GetTriggerDelayInfo()
         * @see GetTriggerDelay()
         * @see SetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode );

        /**
         * Fire the software trigger according to the DCAM specifications.
         *
         * @param broadcast Whether the action should be broadcast.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error FireSoftwareTrigger( @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error FireSoftwareTrigger( );
        
        /**
         * Retrieve trigger delay information from the camera.
         *
         * @param pTriggerDelayInfo Structure to receive trigger delay information.
         *
         * @see GetTriggerModeInfo()
         * @see GetTriggerMode()
         * @see SetTriggerMode()
         * @see GetTriggerDelay()
         * @see SetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetTriggerDelayInfo( @Cast("FlyCapture2::TriggerDelayInfo*") PropertyInfo pTriggerDelayInfo );
        
        /**
         * Retrieve current trigger delay settings from the camera.
         *
         * @param pTriggerDelay Structure to receive trigger delay settings.
         * 
         * @see GetTriggerModeInfo()
         * @see GetTriggerMode()
         * @see SetTriggerMode()         
         * @see GetTriggerDelayInfo()
         * @see SetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetTriggerDelay( @Cast("FlyCapture2::TriggerDelay*") Property pTriggerDelay );
        
        /**
         * Set the specified trigger delay settings to the camera.
         *
         * @param pTriggerDelay Structure providing trigger delay settings.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see GetTriggerModeInfo()
         * @see GetTriggerMode()
         * @see SetTriggerMode()         
         * @see GetTriggerDelayInfo()
         * @see GetTriggerDelay()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay );

        /*@}*/       

        /** 
         * \name Strobe
         *
         * These functions deal with strobe control on the camera.
         */
        /*@{*/ 

        /**
         * Retrieve strobe information from the camera.
         *
         * @param pStrobeInfo Structure to receive strobe information.
         *
         * @see GetStrobe()
         * @see SetStrobe()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetStrobeInfo( StrobeInfo pStrobeInfo );
        
        /**
        * Retrieve current strobe settings from the camera. The strobe pin
        * must be specified in the structure before being passed in to
        * the function.
        *
        * @param pStrobeControl Structure to receive strobe settings.
        * 
        * @see GetStrobeInfo()
        * @see SetStrobe()
        *
        * @return An Error indicating the success or failure of the function.
        */ 
        public native @ByVal Error GetStrobe( StrobeControl pStrobeControl );
        
        /**
         * Set current strobe settings to the camera. The strobe pin
         * must be specified in the structure before being passed in to
         * the function.
         *
         * @param pStrobeControl Structure providing strobe settings.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see GetStrobeInfo()
         * @see GetStrobe()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl );

        /*@}*/                      

        /** 
         * \name Look Up Table
         *
         * These functions deal with Look Up Table control on the camera.
         */
        /*@{*/ 
        
        /**
         * Query if LUT support is available on the camera. Note that some cameras 
		 * may report support for the LUT and return an inputBitDepth of 0. In these 
		 * cases use log2(numEntries) for the inputBitDepth.
         *
         * @param pData The LUT structure to be filled.
         *
         * @see EnableLUT()
         * @see GetLUTChannel()
         * @see SetLUTChannel()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetLUTInfo( LUTData pData );

        /**
         * Query the read/write status of a single LUT bank.
         *
         * @param bank The bank to query.
         * @param pReadSupported Whether reading from the bank is supported.
         * @param pWriteSupported Whether writing to the bank is supported.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetLUTBankInfo(
                    @Cast("unsigned int") int bank,
                    @Cast("bool*") BoolPointer pReadSupported,
                    @Cast("bool*") BoolPointer pWriteSupported );

        /**
         * Get the LUT bank that is currently being used. For cameras with
         * PGR LUT, the active bank is always 0.
         *
         * @param pActiveBank The currently active bank.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntPointer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntBuffer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") int[] pActiveBank );

        /**
         * Set the LUT bank that will be used.
         *
         * @param activeBank The bank to be set as active.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetActiveLUTBank( @Cast("unsigned int") int activeBank );

        /**
         * Enable or disable LUT functionality on the camera.
         *
         * @param on Whether to enable or disable LUT.
         *
         * @see GetLUTInfo()
         * @see GetLUTChannel()
         * @see SetLUTChannel()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error EnableLUT( @Cast("bool") boolean on );
        
        /**
         * Get the LUT channel settings from the camera.
         *
         * @param bank Bank to retrieve.
         * @param channel Channel to retrieve.
         * @param sizeEntries Number of entries in LUT table to read.
         * @param pEntries Array to store LUT entries.
         *
         * @see GetLUTInfo()
         * @see EnableLUT()
         * @see SetLUTChannel()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntPointer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntBuffer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") int[] pEntries );
        
        /**
         * Set the LUT channel settings to the camera.
         *
         * @param bank Bank to set.
         * @param channel Channel to set.
         * @param sizeEntries Number of entries in LUT table to write. This must be the 
		 *					  same size as numEntries returned by GetLutInfo().
         * @param pEntries Array containing LUT entries to write.
         *
         * @see GetLUTInfo()
         * @see EnableLUT()
         * @see GetLUTChannel()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntPointer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntBuffer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") int[] pEntries );

        /*@}*/       

        /** 
         * \name Memory Channels
         *
         * These functions deal with memory channel control on the camera.
         */
        /*@{*/ 
        
        /**
         * Retrieve the current memory channel from the camera.
         *
         * @param pCurrentChannel Current memory channel.
         *
         * @see SaveToMemoryChannel()
         * @see RestoreFromMemoryChannel()
         * @see GetMemoryChannelInfo()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntPointer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntBuffer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") int[] pCurrentChannel );
        
        /**
         * Save the current settings to the specfied current memory channel.
         *
         * @param channel Memory channel to save to.
         *
         * @see GetMemoryChannel()
         * @see RestoreFromMemoryChannel()
         * @see GetMemoryChannelInfo()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SaveToMemoryChannel( @Cast("unsigned int") int channel );
        
        /**
         * Restore the specfied current memory channel.
         *
         * @param channel Memory channel to restore from.
         *
         * @see GetMemoryChannel()
         * @see SaveToMemoryChannel()
         * @see GetMemoryChannelInfo()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error RestoreFromMemoryChannel( @Cast("unsigned int") int channel );
        
        /**
         * Query the camera for memory channel support. If the number of 
         * channels is 0, then memory channel support is not available.
         *
         * @param pNumChannels Number of memory channels supported.
         *
         * @see GetMemoryChannel()
         * @see SaveToMemoryChannel()
         * @see RestoreFromMemoryChannel()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntPointer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntBuffer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") int[] pNumChannels );

        /*@}*/       

        /** 
         * \name Embedded Image Information
         *
         * These functions deal with embedded image information control 
         * on the camera.
         */
        /*@{*/ 

        /**
         * Get the current status of the embedded image information register,
         * as well as the availability of each embedded property.
         *
         * @param pInfo Structure to be filled.
         *
         * @see SetEmbeddedImageInfo()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
        
        /**
         * Sets the on/off values of the embedded image information structure
         * to the camera.
         *
         * @param pInfo Structure to be used.
         *
         * @see GetEmbeddedImageInfo()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetEmbeddedImageInfo( EmbeddedImageInfo pInfo );

        /*@}*/       

        /** 
         * \name Register Operation
         *
         * These functions deal with register operation on the camera.
         */
        /*@{*/ 
        
        /**
         * Write to the specified register on the camera.
         *
         * @param address DCAM address to be written to.
         * @param value The value to be written.
         * @param broadcast Whether the action should be broadcast.
         *
         * @see ReadRegister()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value,
                    @Cast("bool") boolean broadcast/*=false*/);
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value);
        
        /**
         * Read the specified register from the camera.
         *
         * @param address DCAM address to be read from.
         * @param pValue The value that is read.
         *
         * @see WriteRegister()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") int[] pValue );
        
        /**
         * Write to the specified register block on the camera.
         *
         * @param addressHigh Top 16 bits of the 48 bit absolute address to
         *                    write to.
         * @param addressLow Bottom 32 bits of the 48 bits absolute address to
         *                   write to.
         * @param pBuffer Array containing data to be written.
         * @param length Size of array, in quadlets.
         *
         * @see ReadRegisterBlock()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );
        
        /**
         * Read from the specified register block on the camera.
         *
         * @param addressHigh Top 16 bits of the 48 bit absolute address to
         *                    read from.
         * @param addressLow Bottom 32 bits of the 48 bits absolute address to
         *                   read from.
         * @param pBuffer Array to store read data.
         * @param length Size of array, in quadlets.
         *
         * @see WriteRegisterBlock()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );      

        /**
         * Returns a text representation of the register value.
         *
         * @param registerVal The register value to query.
         *
         * @return The text representation of the register.
         */ 
        

		/**
         * Returns a Timestamp struct containing 1394 CYCLE_TIME information
         *
         * @param registerVal The register value to query.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
		public native @ByVal Error GetCycleTime(TimeStamp timeStamp);

		/*
		* Returns the camera diagnostic infomation.
		*
		* @param pStats Pointer to the CameraStats structure.
		*
		* @return An Error indicating the success or failure of the function.
		*/ 
		public native @ByVal Error GetStats( CameraStats pStats );

		/*
		* Reset the camera diagnostic infomation.
		*	
		*
		* @return An Error indicating the success or failure of the function.
		*/ 
		public native @ByVal Error ResetStats();        
    }


// #endif // PGR_FC2_CAMERABASE_H_


// Parsed from <Camera.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: Camera.h 164143 2013-05-27 16:58:44Z mgara $
//=============================================================================

// #ifndef PGR_FC2_CAMERA_H_
// #define PGR_FC2_CAMERA_H_

// #include "CameraBase.h"    
    /**
     * The Camera object represents a physical camera that uses the IIDC
     * register set. The object must first be connected to using Connect() 
     * before any other operations can proceed.
     *
     * It is possible for more than 1 Camera object to connect to a single
     * physical camera. However, isochronous transmission to more than
     * 1 Camera object is not supported.
     *
     * \nosubgrouping
     */
    @Namespace("FlyCapture2") public static class Camera extends CameraBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Camera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Camera(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Camera position(int position) {
            return (Camera)super.position(position);
        }
    

        /**
         * Default constructor.
         */
        public Camera() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Default destructor.
         */                

        /** 
         * \name DCAM Formats
         *
         * These functions deal with DCAM video mode and frame rate 
         * on the camera.
         */
        /*@{*/ 

        /**
         * Query the camera to determine if the specified video mode and 
         * frame rate is supported.
         *
         * @param videoMode Video mode to check.
         * @param frameRate Frame rate to check.
         * @param pSupported Whether the video mode and frame rate is
         *                   supported.
         *
         * @see GetVideoModeAndFrameRate()
         * @see SetVideoModeAndFrameRate()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetVideoModeAndFrameRateInfo(
                    @Cast("FlyCapture2::VideoMode") int videoMode,
                    @Cast("FlyCapture2::FrameRate") int frameRate,
                    @Cast("bool*") BoolPointer pSupported);
        
        /**
         * Get the current video mode and frame rate from the camera. If
         * the camera is in Format7, the video mode will be VIDEOMODE_FORMAT7
         * and the frame rate will be FRAMERATE_FORMAT7.
         *
         * @param pVideoMode Current video mode.
         * @param pFrameRate Current frame rate.
         *
         * @see GetVideoModeAndFrameRateInfo()
         * @see SetVideoModeAndFrameRate()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetVideoModeAndFrameRate(
                    @Cast("FlyCapture2::VideoMode*") IntPointer pVideoMode,
                    @Cast("FlyCapture2::FrameRate*") IntPointer pFrameRate );
        public native @ByVal Error GetVideoModeAndFrameRate(
                    @Cast("FlyCapture2::VideoMode*") IntBuffer pVideoMode,
                    @Cast("FlyCapture2::FrameRate*") IntBuffer pFrameRate );
        public native @ByVal Error GetVideoModeAndFrameRate(
                    @Cast("FlyCapture2::VideoMode*") int[] pVideoMode,
                    @Cast("FlyCapture2::FrameRate*") int[] pFrameRate );

        /**
         * Set the specified video mode and frame rate to the camera. It is
         * not possible to set the camera to VIDEOMODE_FORMAT7 or 
         * FRAMERATE_FORMAT7. Use the Format7 functions to set the camera
         * into Format7.
         *
         * @param videoMode Video mode to set to camera.
         * @param frameRate Frame rate to set to camera.
         *
         * @see GetVideoModeAndFrameRateInfo()
         * @see GetVideoModeAndFrameRate()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetVideoModeAndFrameRate(
                    @Cast("FlyCapture2::VideoMode") int videoMode,
                    @Cast("FlyCapture2::FrameRate") int frameRate );

        /*@}*/       

        /** 
         * \name Format7
         *
         * These functions deal with Format7 custom image control on the camera.
         */
        /*@{*/ 
        
        /**
         * Retrieve the availability of Format7 custom image mode and the
         * camera capabilities for the specified Format7 mode. The mode must
         * be specified in the Format7Info structure in order for the
         * function to succeed.
         *
         * @param pInfo Structure to be filled with the capabilities of the
         *              specified mode and the current state in the specified
         *              mode.
         * @param pSupported Whether the specified mode is supported.
         *
         * @see ValidateFormat7Settings()
         * @see GetFormat7Configuration()
         * @see SetFormat7Configuration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetFormat7Info( 
                    Format7Info pInfo,
                    @Cast("bool*") BoolPointer pSupported );
        
        /**
         * Validates Format7ImageSettings structure and returns valid packet
         * size information if the image settings are valid. The current
         * image settings are cached while validation is taking place. The
         * cached settings are restored when validation is complete.
         *
         * @param pImageSettings Structure containing the image settings.
         * @param pSettingsAreValid Whether the settings are valid.
         * @param pPacketInfo Packet size information that can be used to
         *                    determine a valid packet size.
         *
         * @see GetFormat7Info()
         * @see GetFormat7Configuration()
         * @see SetFormat7Configuration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error ValidateFormat7Settings( 
                    @Const Format7ImageSettings pImageSettings,
                    @Cast("bool*") BoolPointer pSettingsAreValid,
                    Format7PacketInfo pPacketInfo );
        
        /**
         * Get the current Format7 configuration from the camera. This call
         * will only succeed if the camera is already in Format7.
         *
         * @param pImageSettings Current image settings.
         * @param pPacketSize Current packet size.
         * @param pPercentage Current packet size as a percentage.
         *
         * @see GetFormat7Info()
         * @see ValidateFormat7Settings()
         * @see SetFormat7Configuration()
         * @see GetVideoModeAndFrameRate()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error GetFormat7Configuration( 
                    Format7ImageSettings pImageSettings,
                    @Cast("unsigned int*") IntPointer pPacketSize,
                    FloatPointer pPercentage );
        public native @ByVal Error GetFormat7Configuration( 
                    Format7ImageSettings pImageSettings,
                    @Cast("unsigned int*") IntBuffer pPacketSize,
                    FloatBuffer pPercentage );
        public native @ByVal Error GetFormat7Configuration( 
                    Format7ImageSettings pImageSettings,
                    @Cast("unsigned int*") int[] pPacketSize,
                    float[] pPercentage );
        
        /**
         * Set the current Format7 configuration to the camera.
         *
         * @param pImageSettings Image settings to be written to the camera.
         * @param packetSize Packet size to be written to the camera.
         *
         * @see GetFormat7Info()
         * @see ValidateFormat7Settings()
         * @see GetFormat7Configuration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetFormat7Configuration( 
                    @Const Format7ImageSettings pImageSettings,
                    @Cast("unsigned int") int packetSize );

        /**
         * Set the current Format7 configuration to the camera.
         *
         * @param pImageSettings Image settings to be written to the camera.
         * @param percentSpeed Percentage of packet size to be written to
         *                     the camera.
         *
         * @see GetFormat7Info()
         * @see ValidateFormat7Settings()
         * @see GetFormat7Configuration()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetFormat7Configuration(
                    @Const Format7ImageSettings pImageSettings,
                    float percentSpeed );

        /*@}*/

        /** 
         * The following functions are inherited from CameraBase. See 
         * CameraBase.h for further information.
         */

        public native @ByVal Error Connect( PGRGuid pGuid/*=NULL*/ );
        public native @ByVal Error Connect( );        
        public native @ByVal Error Disconnect();       
        public native @Cast("bool") boolean IsConnected();   
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn,
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn );
        public native @ByVal Error StartCapture( 
                    ImageEventCallback callbackFn/*=NULL*/, 
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error StartCapture( );               
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Cast("const FlyCapture2::Camera**") PointerPointer ppCameras, 
                    @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                    @Cast("const void**") PointerPointer pCallbackDataArray/*=NULL*/ );
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Const @ByPtrPtr Camera ppCameras );
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Const @ByPtrPtr Camera ppCameras, 
                    @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                    @Cast("const void**") @ByPtrPtr Pointer pCallbackDataArray/*=NULL*/ );        
        public native @ByVal Error RetrieveBuffer( Image pImage );        
        public native @ByVal Error StopCapture();        
        public native @ByVal Error WaitForBufferEvent( Image pImage, @Cast("unsigned int") int eventNumber );        
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") BytePointer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") ByteBuffer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") byte[] pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error GetConfiguration( FC2Config pConfig );        
        public native @ByVal Error SetConfiguration( @Const FC2Config pConfig );        
        public native @ByVal Error GetCameraInfo( CameraInfo pCameraInfo );                
        public native @ByVal Error GetPropertyInfo( PropertyInfo pPropInfo );       
        public native @ByVal Error GetProperty( Property pProp );
        public native @ByVal Error SetProperty( 
                    @Const Property pProp, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetProperty( 
                    @Const Property pProp );
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntPointer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntBuffer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") int[] pDirection);        
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction, @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction );    
        public native @ByVal Error GetTriggerModeInfo( TriggerModeInfo pTriggerModeInfo );    
        public native @ByVal Error GetTriggerMode( TriggerMode pTriggerMode );      
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode );
        public native @ByVal Error FireSoftwareTrigger( @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error FireSoftwareTrigger( );
        public native @ByVal Error GetTriggerDelayInfo( @Cast("FlyCapture2::TriggerDelayInfo*") PropertyInfo pTriggerDelayInfo );     
        public native @ByVal Error GetTriggerDelay( @Cast("FlyCapture2::TriggerDelay*") Property pTriggerDelay );  
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay );
        public native @ByVal Error GetStrobeInfo( StrobeInfo pStrobeInfo );
        public native @ByVal Error GetStrobe( StrobeControl pStrobeControl );       
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl );
        public native @ByVal Error GetLUTInfo( LUTData pData );
        public native @ByVal Error GetLUTBankInfo(
                    @Cast("unsigned int") int bank,
                    @Cast("bool*") BoolPointer pReadSupported,
                    @Cast("bool*") BoolPointer pWriteSupported );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntPointer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntBuffer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") int[] pActiveBank );
        public native @ByVal Error SetActiveLUTBank( @Cast("unsigned int") int activeBank );
        public native @ByVal Error EnableLUT( @Cast("bool") boolean on );       
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntPointer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntBuffer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") int[] pEntries );       
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntPointer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntBuffer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") int[] pEntries );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntPointer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntBuffer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") int[] pCurrentChannel );        
        public native @ByVal Error SaveToMemoryChannel( @Cast("unsigned int") int channel );        
        public native @ByVal Error RestoreFromMemoryChannel( @Cast("unsigned int") int channel );        
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntPointer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntBuffer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") int[] pNumChannels );
        public native @ByVal Error GetEmbeddedImageInfo( EmbeddedImageInfo pInfo );        
        public native @ByVal Error SetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value,
                    @Cast("bool") boolean broadcast/*=false*/);
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value);        
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") int[] pValue );        
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );        
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );      
        public static native @Cast("const char*") BytePointer GetRegisterString( @Cast("unsigned int") int registerVal);  
		public native @ByVal Error GetCycleTime(TimeStamp timeStamp);
		public native @ByVal Error GetStats( CameraStats pStats );
		public native @ByVal Error ResetStats();

    }


// #endif // PGR_FC2_CAMERA_H_


// Parsed from <GigECamera.h>

//=============================================================================
// Copyright � 2010 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: GigECamera.h 166363 2013-06-19 21:01:15Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_GIGECAMERA_H_
// #define PGR_FC2_GIGECAMERA_H_

// #include "CameraBase.h"    
    /**
     * The GigECamera object represents a physical Gigabit Ethernet camera. 
     * The object must first be connected to using Connect() before any 
     * other operations can proceed.
     *
     * Please see Camera.h for basic functions that this class inherits from.
     *
     * \nosubgrouping
     */
    @Namespace("FlyCapture2") public static class GigECamera extends CameraBase {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigECamera(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public GigECamera(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public GigECamera position(int position) {
            return (GigECamera)super.position(position);
        }
    

        /**
         * Default constructor.
         */
        public GigECamera() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Default destructor.
         */

        /** 
         * \name GVCP Register Operation
         *
         * These functions deal with GVCP register operation on the camera.
         */
        /*@{*/ 

        /**
         * Write a GVCP register.
         *
         * @param address GVCP address to be written to.
         * @param value The value to be written.
         * @param broadcast Whether the action should be broadcast.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error WriteGVCPRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value,
                    @Cast("bool") boolean broadcast/*=false*/);
        public native @ByVal Error WriteGVCPRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value);     

        /**
         * Read a GVCP register.
         *
         * @param address GVCP address to be read from.
         * @param pValue The value that is read.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error ReadGVCPRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error ReadGVCPRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error ReadGVCPRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") int[] pValue );       

        /**
         * Write a GVCP register block.
         *
         * @param address GVCP address to be write to.
         * @param pBuffer Array containing data to be written.
         * @param length Size of array, in quadlets.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error WriteGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );    

        /**
         * Read a GVCP register block.
         *
         * @param address GVCP address to be read from.
         * @param pBuffer Array for data to be read into.
         * @param length Size of array, in quadlets.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error ReadGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadGVCPRegisterBlock(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length ); 

        /**
         * Write a GVCP Memory block.
         *
         * @param address GVCP address to be write to.
         * @param pBuffer Array containing data to be written in increments.
         * @param length Size of array, in quadlets.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error WriteGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned char*") BytePointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned char*") ByteBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("const unsigned char*") byte[] pBuffer,
                    @Cast("unsigned int") int length );    

        /**
         * Read a GVCP memory block.
         *
         * @param address GVCP address to be read from.
         * @param pBuffer Array for data to be read into.
         * @param length Size of array, in quadlets.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error ReadGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned char*") BytePointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned char*") ByteBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadGVCPMemory(
                    @Cast("unsigned int") int address,
                    @Cast("unsigned char*") byte[] pBuffer,
                    @Cast("unsigned int") int length ); 

        /*@}*/ 

        /** 
         * \name GigE property manipulation
         *
         * These functions deal with GigE properties.
         */
        /*@{*/ 

        /**
         * Get the specified GigEProperty. The GigEPropertyType field must
         * be set in order for this function to succeed.
         *
         * @param pGigEProp The GigE property to get.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEProperty( GigEProperty pGigEProp );

        /**
         * Set the specified GigEProperty. The GigEPropertyType field must
         * be set in order for this function to succeed.
         *
         * @param pGigEProp The GigE property to set.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEProperty( @Const GigEProperty pGigEProp );

        /**
         * Discover the largest packet size that works for the network link
         * between the PC and the camera. This is useful in cases where
         * there may be multiple links between the PC and the camera and
         * there is a possiblity of a component not supporting the
         * recommended jumbo frame packet size of 9000.
         *
         * @param packetSize The maximum packet size supported by the link.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") IntPointer packetSize );
        public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") IntBuffer packetSize );
        public native @ByVal Error DiscoverGigEPacketSize( @Cast("unsigned int*") int[] packetSize );

        /*@}*/ 

        /** 
         * \name GigE image settings
         *
         * These functions deal with GigE image setting.
         */
        /*@{*/ 

        /**
         * Check if the particular imaging mode is supported by the camera.
         *
         * @param mode The mode to check.
         * @param isSupported Whether the mode is supported.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error QueryGigEImagingMode( @Cast("FlyCapture2::Mode") int mode, @Cast("bool*") BoolPointer isSupported );

        /**
         * Get the current imaging mode on the camera.
         *
         * @param mode Current imaging mode on the camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") IntPointer mode );
        public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") IntBuffer mode );
        public native @ByVal Error GetGigEImagingMode( @Cast("FlyCapture2::Mode*") int[] mode );

        /**
         * Set the current imaging mode to the camera. This should only be 
         * done when the camera is not streaming images.
         *
         * @param mode Imaging mode to set to the camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEImagingMode( @Cast("FlyCapture2::Mode") int mode );        

        /**
         * Get information about the image settings possible on the camera.
         *
         * @param pInfo Image settings information.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEImageSettingsInfo( GigEImageSettingsInfo pInfo );

        /**
         * Get the current image settings on the camera.
         *
         * @param pImageSettings Current image settings on camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEImageSettings( GigEImageSettings pImageSettings );

        /**
         * Set the image settings specified to the camera.
         *
         * @param pImageSettings Image settings to set to camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEImageSettings( @Const GigEImageSettings pImageSettings );

        /*@}*/ 

        /** 
         * \name GigE image binning settings
         *
         * These functions deal with GigE image binning settings.
         */
        /*@{*/ 

        /**
         * Get the current binning settings on the camera.
         *
         * @param horzBinnningValue Current horizontal binning value.
         * @param vertBinnningValue Current vertical binning value.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") IntPointer horzBinnningValue, @Cast("unsigned int*") IntPointer vertBinnningValue );
        public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") IntBuffer horzBinnningValue, @Cast("unsigned int*") IntBuffer vertBinnningValue );
        public native @ByVal Error GetGigEImageBinningSettings( @Cast("unsigned int*") int[] horzBinnningValue, @Cast("unsigned int*") int[] vertBinnningValue );

        /**
         * Set the specified binning values to the camera. It is recommended
         * that GetGigEImageSettingsInfo() be called after this function
         * succeeds to retrieve the new image settings information for
         * the new binning mode.
         *
         * @param horzBinnningValue Horizontal binning value.
         * @param vertBinnningValue Vertical binning value.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEImageBinningSettings( @Cast("unsigned int") int horzBinnningValue, @Cast("unsigned int") int vertBinnningValue );

        /*@}*/ 

        /** 
         * \name GigE image stream configuration
         *
         * These functions deal with GigE image stream configuration.
         */
        /*@{*/ 

        /**
         * Get the number of stream channels present on the camera.
         *
         * @param numChannels Number of stream channels present.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") IntPointer numChannels );
        public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") IntBuffer numChannels );
        public native @ByVal Error GetNumStreamChannels( @Cast("unsigned int*") int[] numChannels );

        /**
         * Get the stream channel information for the specified channel.
         *
         * @param channel Channel number to use.
         * @param pChannel Stream channel information for the specified channel.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEStreamChannelInfo( @Cast("unsigned int") int channel, GigEStreamChannel pChannel );

        /**
         * Set the stream channel information for the specified channel.
         *
         * Note that the source UDP port of the stream channel is read-only.
         *
         * @param channel Channel number to use.
         * @param pChannel Stream channel information to use for the specified channel.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEStreamChannelInfo( @Cast("unsigned int") int channel, GigEStreamChannel pChannel );

		/**
         * Get the current gige config on the camera.
         *
         * @param pGigEConfig Current configuration on camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetGigEConfig( GigEConfig pGigEConfig );

        /**
         * Set the gige config specified to the camera.
         *
         * @param pGigEConfig configuration to set to camera.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetGigEConfig( @Const GigEConfig pGigEConfig );

        /*@}*/ 

        /** 
         * The following functions are inherited from CameraBase. See 
         * CameraBase.h for further information.
         */

        public native @ByVal Error Connect( PGRGuid pGuid/*=NULL*/ );
        public native @ByVal Error Connect( );        
        public native @ByVal Error Disconnect();       
        public native @Cast("bool") boolean IsConnected();  
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn,
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error SetCallback(
                    ImageEventCallback callbackFn );
        public native @ByVal Error StartCapture( 
                    ImageEventCallback callbackFn/*=NULL*/, 
                    @Const Pointer pCallbackData/*=NULL*/ );
        public native @ByVal Error StartCapture( );    

		 /**
		 * StartSyncCapture() with GigE Cameras is not supported.
		 * This function has been deprecated and will be removed
		 * in a future version of FlyCapture.
         */ 
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Cast("const FlyCapture2::GigECamera**") PointerPointer ppCameras, 
                    @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                    @Cast("const void**") PointerPointer pCallbackDataArray/*=NULL*/ );
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Const @ByPtrPtr GigECamera ppCameras );
        public static native @ByVal Error StartSyncCapture( 
                    @Cast("unsigned int") int numCameras,
                    @Const @ByPtrPtr GigECamera ppCameras, 
                    @Cast("FlyCapture2::ImageEventCallback*") @ByPtrPtr ImageEventCallback pCallbackFns/*=NULL*/,
                    @Cast("const void**") @ByPtrPtr Pointer pCallbackDataArray/*=NULL*/ );        
        public native @ByVal Error RetrieveBuffer( Image pImage );        
        public native @ByVal Error StopCapture();        
        public native @ByVal Error WaitForBufferEvent( Image pImage, @Cast("unsigned int") int eventNumber );        
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") BytePointer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") ByteBuffer pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error SetUserBuffers(
                    @Cast("unsigned char*const") byte[] pMemBuffers,
                    int size,
                    int numBuffers );
        public native @ByVal Error GetConfiguration( FC2Config pConfig );        
        public native @ByVal Error SetConfiguration( @Const FC2Config pConfig );        
        public native @ByVal Error GetCameraInfo( CameraInfo pCameraInfo );                
        public native @ByVal Error GetPropertyInfo( PropertyInfo pPropInfo );       
        public native @ByVal Error GetProperty( Property pProp );
        public native @ByVal Error SetProperty( 
                    @Const Property pProp, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetProperty( 
                    @Const Property pProp );
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntPointer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") IntBuffer pDirection);
        public native @ByVal Error GetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int*") int[] pDirection);        
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction, @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetGPIOPinDirection( @Cast("unsigned int") int pin, @Cast("unsigned int") int direction );    
        public native @ByVal Error GetTriggerModeInfo( TriggerModeInfo pTriggerModeInfo );    
        public native @ByVal Error GetTriggerMode( TriggerMode pTriggerMode );      
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerMode( 
                    @Const TriggerMode pTriggerMode );
        public native @ByVal Error FireSoftwareTrigger( @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error FireSoftwareTrigger( );
        public native @ByVal Error GetTriggerDelayInfo( @Cast("FlyCapture2::TriggerDelayInfo*") PropertyInfo pTriggerDelayInfo );     
        public native @ByVal Error GetTriggerDelay( @Cast("FlyCapture2::TriggerDelay*") Property pTriggerDelay );  
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay, 
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetTriggerDelay( 
                    @Cast("const FlyCapture2::TriggerDelay*") Property pTriggerDelay );
        public native @ByVal Error GetStrobeInfo( StrobeInfo pStrobeInfo );
        public native @ByVal Error GetStrobe( StrobeControl pStrobeControl );       
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl,
                    @Cast("bool") boolean broadcast/*=false*/ );
        public native @ByVal Error SetStrobe( 
                    @Const StrobeControl pStrobeControl );
        public native @ByVal Error GetLUTInfo( LUTData pData );
        public native @ByVal Error GetLUTBankInfo(
                    @Cast("unsigned int") int bank,
                    @Cast("bool*") BoolPointer pReadSupported,
                    @Cast("bool*") BoolPointer pWriteSupported );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntPointer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") IntBuffer pActiveBank );
        public native @ByVal Error GetActiveLUTBank( @Cast("unsigned int*") int[] pActiveBank );
        public native @ByVal Error SetActiveLUTBank( @Cast("unsigned int") int activeBank );
        public native @ByVal Error EnableLUT( @Cast("bool") boolean on );       
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntPointer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") IntBuffer pEntries );
        public native @ByVal Error GetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("unsigned int*") int[] pEntries );       
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntPointer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") IntBuffer pEntries );
        public native @ByVal Error SetLUTChannel(
                    @Cast("unsigned int") int bank,
                    @Cast("unsigned int") int channel,
                    @Cast("unsigned int") int sizeEntries,
                    @Cast("const unsigned int*") int[] pEntries );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntPointer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") IntBuffer pCurrentChannel );
        public native @ByVal Error GetMemoryChannel( @Cast("unsigned int*") int[] pCurrentChannel );        
        public native @ByVal Error SaveToMemoryChannel( @Cast("unsigned int") int channel );        
        public native @ByVal Error RestoreFromMemoryChannel( @Cast("unsigned int") int channel );        
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntPointer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") IntBuffer pNumChannels );
        public native @ByVal Error GetMemoryChannelInfo( @Cast("unsigned int*") int[] pNumChannels );
        public native @ByVal Error GetEmbeddedImageInfo( EmbeddedImageInfo pInfo );        
        public native @ByVal Error SetEmbeddedImageInfo( EmbeddedImageInfo pInfo );
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value,
                    @Cast("bool") boolean broadcast/*=false*/);
        public native @ByVal Error WriteRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int") int value);        
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntPointer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") IntBuffer pValue );
        public native @ByVal Error ReadRegister( 
                    @Cast("unsigned int") int address, 
                    @Cast("unsigned int*") int[] pValue );        
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error WriteRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("const unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );        
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntPointer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") IntBuffer pBuffer,
                    @Cast("unsigned int") int length );
        public native @ByVal Error ReadRegisterBlock(
                    @Cast("unsigned short") short addressHigh,
                    @Cast("unsigned int") int addressLow,
                    @Cast("unsigned int*") int[] pBuffer,
                    @Cast("unsigned int") int length );
        public static native @Cast("const char*") BytePointer GetRegisterString( @Cast("unsigned int") int registerVal);
		public native @ByVal Error GetCycleTime(TimeStamp timeStamp);
		public native @ByVal Error GetStats( CameraStats pStats );
		public native @ByVal Error ResetStats();
    }        


// #endif // PGR_FC2_GIGECAMERA_H_


// Parsed from <Image.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: Image.h 148642 2012-08-30 00:24:37Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_IMAGE_H
// #define PGR_FC2_IMAGE_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /**
     * The Image class is used to retrieve images from a camera, convert
     * between multiple pixel formats and save images to disk. Operations on
     * Image objects are not guaranteed to be thread safe. It is recommended
     * that operations on Image objects be protected by thread synchronization
     * constructs such as mutexes.     
     */ 
    @Namespace("FlyCapture2") @NoOffset public static class Image extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Image(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public Image(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public Image position(int position) {
            return (Image)super.position(position);
        }
    
        
        /**
         * Set the default color processing algorithm.  This method will be 
         * used for any image with the DEFAULT algorithm set. The method used 
         * is determined at the time of the Convert() call, therefore the most 
         * recent execution of this function will take precedence. The default 
         * setting is shared within the current process.
         *
         * @param defaultMethod The color processing algorithm to set.
         *
         * @see GetDefaultColorProcessing()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error SetDefaultColorProcessing( 
                    @Cast("FlyCapture2::ColorProcessingAlgorithm") int defaultMethod );
        
        /**
         * Get the default color processing algorithm.         
         *
         * @see SetDefaultColorProcessing()
         *
         * @return The default color processing algorithm.
         */ 
        public static native @Cast("FlyCapture2::ColorProcessingAlgorithm") int GetDefaultColorProcessing();
        
        /**
        * Set the default output pixel format. This format will be used for any 
        * call to Convert() that does not specify an output format. The format 
        * used will be determined at the time of the Convert() call, therefore 
        * the most recent execution of this function will take precedence. 
        * The default is shared within the current process.
        *
        * @param format The output pixel format to set.
        *
        * @see GetDefaultOutputFormat()
        *
        * @return The default color processing algorithm.
        */ 
        public static native @ByVal Error SetDefaultOutputFormat( @Cast("FlyCapture2::PixelFormat") int format );
        
        /**
         * Get the default output pixel format.
         *
         * @see SetDefaultOutputFormat()
         *
         * @return The default pixel format.
         */ 
        public static native @Cast("FlyCapture2::PixelFormat") int GetDefaultOutputFormat();

        /**
         * Calculate the bits per pixel for the specified pixel format.
         *
         * @param format The pixel format.
         *
         * @return The bits per pixel.
         */ 
        public static native @Cast("unsigned int") int DetermineBitsPerPixel( @Cast("FlyCapture2::PixelFormat") int format );

        /**
         * Default constructor.
         */
        public Image() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Construct an Image object with the specified arguments.
         * Ownership of the image buffer is not transferred to the Image object.
         * It is the user's responsibility to delete the buffer when it is
         * no longer in use.
         *
         * @param rows Rows in the image.
         * @param cols Columns in the image.
         * @param stride Stride of the image buffer.
         * @param pData Pointer to the image buffer.
         * @param dataSize Size of the image buffer.
         * @param format Pixel format.
         * @param bayerFormat Format of the Bayer tiled raw image.
         */ 
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, format); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("FlyCapture2::PixelFormat") int format );

        /**
         * Construct an Image object with the specified arguments.
         * Ownership of the image buffer is not transferred to the Image object.
         * It is the user's responsibility to delete the buffer when it is
         * no longer in use.
         *
         * @param rows Rows in the image.
         * @param cols Columns in the image.
         * @param stride Stride of the image buffer.
         * @param pData Pointer to the image buffer.
         * @param dataSize Size of the image buffer.
         * @param receivedDataSize Actual size of data.
         * @param format Pixel format.
         * @param bayerFormat Format of the Bayer tiled raw image.
         */ 
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, stride, pData, dataSize, receivedDataSize, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride, 
                    @Cast("unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize,
                    @Cast("unsigned int") int receivedDataSize,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );

        /**
         * Construct an Image object with the specified arguments.
         * Ownership of the image buffer is not transferred to the Image object.
         * It is the user's responsibility to delete the buffer when it is
         * no longer in use.
         *
         * @param pData Pointer to the image buffer.
         * @param dataSize Size of the image buffer.
         */ 
        public Image(
                    @Cast("unsigned char*") BytePointer pData,
                    @Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
        private native void allocate(
                    @Cast("unsigned char*") BytePointer pData,
                    @Cast("unsigned int") int dataSize);
        public Image(
                    @Cast("unsigned char*") ByteBuffer pData,
                    @Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
        private native void allocate(
                    @Cast("unsigned char*") ByteBuffer pData,
                    @Cast("unsigned int") int dataSize);
        public Image(
                    @Cast("unsigned char*") byte[] pData,
                    @Cast("unsigned int") int dataSize) { super((Pointer)null); allocate(pData, dataSize); }
        private native void allocate(
                    @Cast("unsigned char*") byte[] pData,
                    @Cast("unsigned int") int dataSize);

        /**
         * Construct an Image object with the specified arguments.
         *
         * @param rows Rows in the image.
         * @param cols Columns in the image.
         * @param format Pixel format.
         * @param bayerFormat Format of the Bayer tiled raw image.
         */ 
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ ) { super((Pointer)null); allocate(rows, cols, format, bayerFormat); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat/*=FlyCapture2::NONE*/ );
        public Image( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("FlyCapture2::PixelFormat") int format ) { super((Pointer)null); allocate(rows, cols, format); }
        private native void allocate( 
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("FlyCapture2::PixelFormat") int format );

        /**
         * Copy constructor. Both images will point to the same image buffer
         * internally.
         */
        public Image( @Const @ByRef Image image ) { super((Pointer)null); allocate(image); }
        private native void allocate( @Const @ByRef Image image );
        
        /**
         * Default destructor. The internal image buffer will be released if
         * there are no other Image objects holding a reference to it. This
         * will also allow the buffer to be requeued internally.
         */
        
        /**
         * Assignment operator. Both images will point to the same image buffer
         * internally. If the Image already has a buffer attached to it, it will
         * will be released.
         *
         * @param image The image to copy from.
         */
        public native @ByRef @Name("operator =") Image put( @Const @ByRef Image image );
        
        /**
         * Indexing operator.
         *
         * @param index The index of the byte to return.
         *
         * @return The address of the specified byte from the image data.
         */
        public native @Cast("unsigned char*") @Name("operator []") BytePointer get( @Cast("unsigned int") int index );
        
        /**
         * Indexing operator.
         *
         * @param row The row of the pixel to return.
         * @param col The column of the pixel to return.
         *
         * @return The address of the specified byte from the image data.
         */
        public native @Cast("unsigned char*") @Name("operator ()") BytePointer apply( 
                    @Cast("unsigned int") int row, 
                    @Cast("unsigned int") int col );      
        
        /**
         * Perform a deep copy of the Image. After this operation, the image
         * contents and member variables will be the same. The Images will not
         * share a buffer. The Image's current buffer will not be released.
         *
         * @param pImage The Image to copy the data from.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error DeepCopy( @Const Image pImage );
        
        /**
         * Sets the dimensions of the image object.
         *
         * @param rows Number of rows to set.
         * @param cols Number of cols to set.
         * @param stride Stride to set.
         * @param pixelFormat Pixel format to set.
         * @param bayerFormat Bayer tile format to set.
         *
         * @see GetDimensions()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetDimensions(
                    @Cast("unsigned int") int rows,
                    @Cast("unsigned int") int cols,
                    @Cast("unsigned int") int stride,
                    @Cast("FlyCapture2::PixelFormat") int pixelFormat, 
                    @Cast("FlyCapture2::BayerTileFormat") int bayerFormat );
        
        /**
         * Set the data of the Image object.
         * Ownership of the image buffer is not transferred to the Image object.
         * It is the user's responsibility to delete the buffer when it is
         * no longer in use.
         *
         * @param pData Pointer to the image buffer.
         * @param dataSize Size of the image buffer.
         */ 
        public native @ByVal Error SetData( 
                    @Cast("const unsigned char*") BytePointer pData, 
                    @Cast("unsigned int") int dataSize );
        public native @ByVal Error SetData( 
                    @Cast("const unsigned char*") ByteBuffer pData, 
                    @Cast("unsigned int") int dataSize );
        public native @ByVal Error SetData( 
                    @Cast("const unsigned char*") byte[] pData, 
                    @Cast("unsigned int") int dataSize );
        
        /**
         * Set the block id of the Image object.
         *
         * @param blockId The blockId to assign to the image.
         */
		public native @ByVal Error SetBlockId( @Cast("const unsigned int") int blockId);
        
/**
         * get the block id of the Image object.
         *
         * @return The blockId assigned to the image.
         */
		public native @Cast("unsigned int") int GetBlockId();

        /**
         * Get the current pixel format.         
         *
         * @return The current pixel format.
         */ 
        public native @Cast("FlyCapture2::PixelFormat") int GetPixelFormat();
        
        /**
         * Get the current color processing algorithm.
         *
         * @see SetColorProcessing()
         *
         * @return The current color processing algorithm.
         */ 
        public native @Cast("FlyCapture2::ColorProcessingAlgorithm") int GetColorProcessing();
        
        /**
         * Set the color processing algorithm. This should be set on the
         * input Image object.
         *
         * @param colorProc The color processing algorithm to use.
         *
         * @see GetColorProcessing()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error SetColorProcessing( @Cast("FlyCapture2::ColorProcessingAlgorithm") int colorProc );
        
        /**
         * Get the number of columns in the image.
         *
         * @return The number of columns.
         */ 
        public native @Cast("unsigned int") int GetCols();
        
        /**
         * Get the number of rows in the image.
         *
         * @return The number of rows.
         */ 
        public native @Cast("unsigned int") int GetRows();
        
        /**
         * Get the stride in the image.
         *
         * @return The stride (The number of bytes between rows of the image).
         */ 
        public native @Cast("unsigned int") int GetStride();
        
        /**
         * Get the bits per pixel of the image.
         *
         * @return The bits per pixel.
         */ 
        public native @Cast("unsigned int") int GetBitsPerPixel();
        
        /**
         * Get the Bayer tile format of the image.
         *
         * @return The Bayer tile format.
         */ 
        public native @Cast("FlyCapture2::BayerTileFormat") int GetBayerTileFormat();
        
        /**
         * Get the size of the buffer associated with the image, in bytes.
         *
         * @return The size of the buffer, in bytes.
         */ 
        public native @Cast("unsigned int") int GetDataSize();

        /**
         * Get the size of the compressed data, in bytes. A compressed image
         * will have a maximum size equal to GetDataSize(), but may actually
         * contain less data, depending on the compression level.
         * For uncompressed images, a value smaller than the data size may
         * indicate lost data.
         *
         * @return The size of the compressed data, in bytes. 0 when camera
         *         not sending compressed data.
         */
        public native @Cast("unsigned int") int GetReceivedDataSize();
        
        /**
         * Get the image dimensions associated with the image.
         *
         * @param pRows Number of rows.
         * @param pCols Number of columns.
         * @param pStride The stride.
         * @param pPixelFormat Pixel format.
         * @param pBayerFormat Bayer tile format.
         */ 
        public native void GetDimensions( 
                    @Cast("unsigned int*") IntPointer pRows, 
                    @Cast("unsigned int*") IntPointer pCols/*=NULL*/,             
                    @Cast("unsigned int*") IntPointer pStride/*=NULL*/,
                    @Cast("FlyCapture2::PixelFormat*") IntPointer pPixelFormat/*=NULL*/,
                    @Cast("FlyCapture2::BayerTileFormat*") IntPointer pBayerFormat/*=NULL*/ );
        public native void GetDimensions( 
                    @Cast("unsigned int*") IntPointer pRows );
        public native void GetDimensions( 
                    @Cast("unsigned int*") IntBuffer pRows, 
                    @Cast("unsigned int*") IntBuffer pCols/*=NULL*/,             
                    @Cast("unsigned int*") IntBuffer pStride/*=NULL*/,
                    @Cast("FlyCapture2::PixelFormat*") IntBuffer pPixelFormat/*=NULL*/,
                    @Cast("FlyCapture2::BayerTileFormat*") IntBuffer pBayerFormat/*=NULL*/ );
        public native void GetDimensions( 
                    @Cast("unsigned int*") IntBuffer pRows );
        public native void GetDimensions( 
                    @Cast("unsigned int*") int[] pRows, 
                    @Cast("unsigned int*") int[] pCols/*=NULL*/,             
                    @Cast("unsigned int*") int[] pStride/*=NULL*/,
                    @Cast("FlyCapture2::PixelFormat*") int[] pPixelFormat/*=NULL*/,
                    @Cast("FlyCapture2::BayerTileFormat*") int[] pBayerFormat/*=NULL*/ );
        public native void GetDimensions( 
                    @Cast("unsigned int*") int[] pRows );        
        
        /**
         * Get a pointer to the data associated with the image. This function
         * is considered unsafe. The pointer returned could be invalidated if
         * the buffer is resized or released. The pointer may also be
         * invalidated if the Image object is passed to 
         * Camera::RetrieveBuffer(). It is recommended that a Image::DeepCopy()
         * be performed if a seperate copy of the Image data is required
         * for further processing.
         *
         * @return A pointer to the image data.
         */ 
        public native @Cast("unsigned char*") BytePointer GetData();
        
        /**
         * Get the metadata associated with the image. This includes 
         * embedded image information.
         *
         * @return Metadata associated with the image.
         */ 
        public native @ByVal ImageMetadata GetMetadata();
        
        /**
         * Calculate statistics associated with the image. In order to collect
         * statistics for a particular channel, the enabled flag for the
         * channel must be set to true. Statistics can only be collected for
         * images in Mono8, Mono16, RGB, RGBU, BGR and BGRU.
         *
         * @param pStatistics The ImageStatistics object to hold the statistics.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error CalculateStatistics( ImageStatistics pStatistics );
                
        /**
         * Get the timestamp data associated with the image. 
         *
         * @return Timestamp data associated with the image.
         */ 
        public native @ByVal TimeStamp GetTimeStamp();
        
        /**
         * Save the image to the specified file name with the file format
         * specified.
         *
         * @param pFilename Filename to save image with.
         * @param format File format to save in.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save( 
                    @Cast("const char*") BytePointer pFilename, 
                    @Cast("FlyCapture2::ImageFileFormat") int format/*=FlyCapture2::FROM_FILE_EXT*/ );
        public native @ByVal Error Save( 
                    @Cast("const char*") BytePointer pFilename );
        public native @ByVal Error Save( 
                    String pFilename, 
                    @Cast("FlyCapture2::ImageFileFormat") int format/*=FlyCapture2::FROM_FILE_EXT*/ );
        public native @ByVal Error Save( 
                    String pFilename );
            
        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    PNGOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    PNGOption pOption );

        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    PPMOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    PPMOption pOption );
        
        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    PGMOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    PGMOption pOption );

        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    TIFFOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    TIFFOption pOption );

        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    JPEGOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    JPEGOption pOption );

        /**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    JPG2Option pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    JPG2Option pOption );

		/**
         * Save the image to the specified file name with the options specified.
         *
         * @param pFilename Filename to save image with.
         * @param pOption Options to use while saving image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Save(
                    @Cast("const char*") BytePointer pFilename,
                    BMPOption pOption );
        public native @ByVal Error Save(
                    String pFilename,
                    BMPOption pOption );
        
        /**
         * Converts the current image buffer to the specified output format and
         * stores the result in the specified image. The destination image 
         * does not need to be configured in any way before the call is made.
         *
         * @param format Output format of the converted image.
         * @param pDestImage Destination image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Convert( 
                    @Cast("FlyCapture2::PixelFormat") int format, 
                    Image pDestImage );

        /**
         * Converts the current image buffer to the specified output format and
         * stores the result in the specified image. The destination image 
         * does not need to be configured in anyway before the call is made.
         *
         * @param pDestImage Destination image.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error Convert( Image pDestImage );
        
        /**
         * Release the buffer associated with the Image. If no buffer is
         * associated, the function does nothing.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error ReleaseBuffer();      
    }


// #endif //PGR_FC2_IMAGE_H


// Parsed from <Utilities.h>

//=============================================================================
// Copyright � 2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: Utilities.h 201275 2014-07-09 00:14:30Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_UTILITIES_H_
// #define PGR_FC2_UTILITIES_H_

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"
// #include <string>

    /** Possible operating systems. */ 
	/** enum FlyCapture2::OSType */
	public static final int
		/** All Windows 32-bit variants. */
		WINDOWS_X86 = 0,
		/** All Windows 64-bit variants. */
		WINDOWS_X64 = 1,
		/** All Linux 32-bit variants. */
		LINUX_X86 = 2,
		/** All Linux 32-bit variants. */
		LINUX_X64 = 3,
		/** Mac OSX. */
		MAC = 4,
		/** Unknown operating system. */
		UNKNOWN_OS = 5,
        OSTYPE_FORCE_32BITS =  FULL_32BIT_VALUE;

    /** Possible byte orders. */ 
	/** enum FlyCapture2::ByteOrder */
	public static final int
		BYTE_ORDER_LITTLE_ENDIAN = 0,
		BYTE_ORDER_BIG_ENDIAN = 1,
        BYTE_ORDER_FORCE_32BITS =  FULL_32BIT_VALUE;

	/** Description of the system. */ 
    @Namespace("FlyCapture2") public static class SystemInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public SystemInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public SystemInfo(int size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public SystemInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(int size);
        @Override public SystemInfo position(int position) {
            return (SystemInfo)super.position(position);
        }
    
        /** Operating system type as described by OSType. */
		public native @Cast("FlyCapture2::OSType") int osType(); public native SystemInfo osType(int osType);

		/** Detailed description of the operating system. */
		public native @Cast("char") byte osDescription(int i); public native SystemInfo osDescription(int i, byte osDescription);
		@MemberGetter public native @Cast("char*") BytePointer osDescription();

		/** Byte order of the system. */
		public native @Cast("FlyCapture2::ByteOrder") int byteOrder(); public native SystemInfo byteOrder(int byteOrder);

		/** Amount of memory available on the system. */
		public native @Cast("size_t") long sysMemSize(); public native SystemInfo sysMemSize(long sysMemSize);

		/** Detailed description of the CPU. */
		public native @Cast("char") byte cpuDescription(int i); public native SystemInfo cpuDescription(int i, byte cpuDescription);
		@MemberGetter public native @Cast("char*") BytePointer cpuDescription();

		/** Number of cores on all CPUs on the system. */
		public native @Cast("size_t") long numCpuCores(); public native SystemInfo numCpuCores(long numCpuCores);

		/** List of drivers used. */
		public native @Cast("char") byte driverList(int i); public native SystemInfo driverList(int i, byte driverList);
		@MemberGetter public native @Cast("char*") BytePointer driverList();

		/** List of libraries used. */
		public native @Cast("char") byte libraryList(int i); public native SystemInfo libraryList(int i, byte libraryList);
		@MemberGetter public native @Cast("char*") BytePointer libraryList();

		/** Detailed description of the GPU. */
		public native @Cast("char") byte gpuDescription(int i); public native SystemInfo gpuDescription(int i, byte gpuDescription);
		@MemberGetter public native @Cast("char*") BytePointer gpuDescription();

		/** Screen resolution width in pixels. */
		public native @Cast("size_t") long screenWidth(); public native SystemInfo screenWidth(long screenWidth);

        /** Screen resolution height in pixels. */
		public native @Cast("size_t") long screenHeight(); public native SystemInfo screenHeight(long screenHeight);

        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native SystemInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }

    /** 
     * Async command callback function prototype. Defines the syntax of the
     * async command function that is passed into LaunchCommandAsync().
     */
    public static class AsyncCommandCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    AsyncCommandCallback(Pointer p) { super(p); }
        protected AsyncCommandCallback() { allocate(); }
        private native void allocate();
        public native void call( @ByVal Error retError, Pointer pUserData );
    }

    /**
     * The Utility class is generally used to query for general system
     * information such as operating system, available memory etc.
     * It can also be used to launch browsers, CHM viewers or terminal commands.
     */ 
    @Namespace("FlyCapture2") public static class Utilities extends Pointer {
        static { Loader.load(); }
        /** Empty constructor. */
        public Utilities() { }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Utilities(Pointer p) { super(p); }
    
		
		/**
         * Check for driver compatibility for the given camera guid.
         *
         * @param guid Pointer to the guid of the device to check.
         *
         * @return PGR_NO_ERROR if the library is compatible with the currently 
		 *         loaded driver, otherwise an error indicating the type of failure.
         */ 
		public static native @ByVal Error CheckDriver(@Const PGRGuid guid);

		/**
         * Get the driver's name for a device
         *
         * @param guid Pointer to the guid of the device to check.
		 * @param deviceName The device name will be returned in this string
         *
         * @return An Error indicating the success or failure of the function.
         */ 
		public static native @ByVal Error GetDriverDeviceName(@Const PGRGuid guid, @StdString BytePointer deviceName);
		public static native @ByVal Error GetDriverDeviceName(@Const PGRGuid guid, @StdString String deviceName);

        /**
         * Get system information.
         *
         * @param pSystemInfo Structure to receive system information.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error GetSystemInfo( 
                    SystemInfo pSystemInfo );

        /**
         * Get library version.
         *
         * @param pVersion Structure to receive the library version.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error GetLibraryVersion( 
                    FC2Version pVersion );

        /**
         * Launch a URL in the system default browser.
         *
         * @param pAddress URL to open in browser.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error LaunchBrowser(  
                    @Cast("const char*") BytePointer pAddress );
        public static native @ByVal Error LaunchBrowser(  
                    String pAddress );

        /**
         * Open a CHM file in the system default CHM viewer.
         *
         * @param pFileName Filename of CHM file to open.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error LaunchHelp(  
                    @Cast("const char*") BytePointer pFileName );
        public static native @ByVal Error LaunchHelp(  
                    String pFileName );
		
        /**
         * Execute a command in the terminal. This is a blocking call that 
         * will return when the command completes.
         *
         * @param pCommand Command to execute.
         *
         * @see LaunchCommandAsync()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error LaunchCommand(  
                    @Cast("const char*") BytePointer pCommand );
        public static native @ByVal Error LaunchCommand(  
                    String pCommand );

        /**
         * Execute a command in the terminal. This is a non-blocking call that 
         * will return immediately. The return value of the command can be
         * retrieved in the callback.
         *
         * @param pCommand Command to execute.
         * @param pCallback Callback to fire when command is complete.
         * @param pUserData Data pointer to pass to callback.
         *
         * @see LaunchCommand()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public static native @ByVal Error LaunchCommandAsync(  
                    @Cast("const char*") BytePointer pCommand,
        			AsyncCommandCallback pCallback,
        			Pointer pUserData );
        public static native @ByVal Error LaunchCommandAsync(  
                    String pCommand,
        			AsyncCommandCallback pCallback,
        			Pointer pUserData );
      
    }



// #endif // PGR_FC2_UTILITIES_H_



// Parsed from <AVIRecorder.h>

//=============================================================================
// Copyright © 2009 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: AVIRecorder.h 125990 2011-06-02 18:52:23Z warrenm $
//=============================================================================

// #ifndef PGR_FC2_AVIRECORDER_H
// #define PGR_FC2_AVIRECORDER_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /** 
     * The AVIRecorder class provides the functionality for the user to record
     * images to an AVI file.
     */
    @Namespace("FlyCapture2") @NoOffset public static class AVIRecorder extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AVIRecorder(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public AVIRecorder(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public AVIRecorder position(int position) {
            return (AVIRecorder)super.position(position);
        }
     

        /**
         * Default constructor.
         */
        public AVIRecorder() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Default destructor.
         */
        
        /**
         * Open an AVI file in preparation for writing Images to disk.
         * The size of AVI files is limited to 2GB. The filenames are
         * automatically generated using the filename specified.
         *
         * @param pFileName The filename of the AVI file.
         * @param pOption Options to apply to the AVI file.
         *
         * @see AVIClose()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error AVIOpen( 
                    @Cast("const char*") BytePointer pFileName, 
                    AVIOption pOption );
        public native @ByVal Error AVIOpen( 
                    String pFileName, 
                    AVIOption pOption );

        /**
         * Open an MJPEG AVI file in preparation for writing Images to disk.
         * The size of AVI files is limited to 2GB. The filenames are
         * automatically generated using the filename specified.
         *
         * @param pFileName The filename of the AVI file.
         * @param pOption MJPEG options to apply to the AVI file.
         *
         * @see AVIClose()
		 * @see MJPGOption
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error AVIOpen( 
                    @Cast("const char*") BytePointer pFileName, 
                    MJPGOption pOption );
        public native @ByVal Error AVIOpen( 
                    String pFileName, 
                    MJPGOption pOption );


		 /**
         * Open an H264 MP4 file in preparation for writing Images to disk.
         * The size of MP4 files is limited to 2GB. The filenames are
         * automatically generated using the filename specified.
         *
         * @param pFileName The filename of the MP4 file.
         * @param pOption H264 options to apply to the MP4 file.
         *
         * @see AVIClose()
		 * @see H264Option
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error AVIOpen( 
                    @Cast("const char*") BytePointer pFileName, 
                    H264Option pOption );
        public native @ByVal Error AVIOpen( 
                    String pFileName, 
                    H264Option pOption );
 

        /**
         * Append an image to the AVI/MP4 file.
         *
         * @param pImage The image to append.
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error AVIAppend( Image pImage);
           
        /**
         * Close the AVI/MP4 file.
         *
         * @see AVIOpen()
         *
         * @return An Error indicating the success or failure of the function.
         */ 
        public native @ByVal Error AVIClose( );
    }


// #endif //PGR_FC2_AVIRECORDER_H


// Parsed from <TopologyNode.h>

//=============================================================================
// Copyright  2008 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: TopologyNode.h 112716 2011-05-13 16:37:36Z soowei $
//=============================================================================

// #ifndef PGR_FC2_TOPOLOGYNODE_H
// #define PGR_FC2_TOPOLOGYNODE_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /**
     * The TopologyNode class contains topology information that can be
     * used to generate a tree structure of all cameras and devices connected
     * to a computer.
     */ 
    @Namespace("FlyCapture2") @NoOffset public static class TopologyNode extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TopologyNode(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public TopologyNode(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public TopologyNode position(int position) {
            return (TopologyNode)super.position(position);
        }
    

        /**
         * Possible states of a port on a node.
         */ 
        /** enum FlyCapture2::TopologyNode::PortType */
        public static final int
            NOT_CONNECTED = 1,
            CONNECTED_TO_PARENT = 2,
            CONNECTED_TO_CHILD = 3;

        /**
         * Type of node.
         */ 
        /** enum FlyCapture2::TopologyNode::NodeType */
        public static final int
            COMPUTER = 0,
            BUS = 1,
            CAMERA = 2,
            NODE = 3;

        /**
         * Default constructor.
         */
        public TopologyNode() { super((Pointer)null); allocate(); }
        private native void allocate();
        
        /**
         * Constructor.
         *
         * @param guid The PGRGuid of the node (if applicable).
         * @param deviceId Device ID of the node.
         * @param nodeType Type of the node.
         * @param interfaceType Interface type of the node.
         */ 
        public TopologyNode( 
                    @ByVal PGRGuid guid,
                    int deviceId,
                    @Cast("FlyCapture2::TopologyNode::NodeType") int nodeType,
                    @Cast("FlyCapture2::InterfaceType") int interfaceType ) { super((Pointer)null); allocate(guid, deviceId, nodeType, interfaceType); }
        private native void allocate( 
                    @ByVal PGRGuid guid,
                    int deviceId,
                    @Cast("FlyCapture2::TopologyNode::NodeType") int nodeType,
                    @Cast("FlyCapture2::InterfaceType") int interfaceType );

        /**
         * Default destructor.
         */

        /**
         * Copy constructor.
         */
        public TopologyNode( @Const @ByRef TopologyNode other ) { super((Pointer)null); allocate(other); }
        private native void allocate( @Const @ByRef TopologyNode other );

        /**
         * Assignment operator.
         *
         * @param other The TopologyNode to copy from.
         */
        public native @ByRef @Name("operator =") TopologyNode put( @Const @ByRef TopologyNode other );

        /**
         * Get the PGRGuid associated with the node.
         *
         * @return PGRGuid of the node.
         */ 
        public native @ByVal PGRGuid GetGuid();

        /**
         * Get the device ID associated with the node.
         *
         * @return Device ID of the node.
         */ 
        public native int GetDeviceId();   
        
        /**
         * Get the node type associated with the node.
         *
         * @return Node type of the node.
         */ 
        public native @Cast("FlyCapture2::TopologyNode::NodeType") int GetNodeType();

        /**
         * Get the interface type associated with the node.
         *
         * @return Interface type of the node.
         */ 
        public native @Cast("FlyCapture2::InterfaceType") int GetInterfaceType();
        
        /**
         * Get the number of child nodes.
         *
         * @return Number of child nodes.
         */
        public native @Cast("unsigned int") int GetNumChildren();

        /**
         * Get child node located at the specified position.
         *
         * @param position Position of the node.
         *
         * @return TopologyNode at the specified position.
         */
        public native @ByVal TopologyNode GetChild( @Cast("unsigned int") int position );

        /**
         * Add the specified TopologyNode as a child of the node.
         *
         * @param childNode The TopologyNode to add.
         */
        public native void AddChild( @ByVal TopologyNode childNode );

        /**
         * Get the number of ports.
         *
         * @return Number of ports.
         */
        public native @Cast("unsigned int") int GetNumPorts();

        /**
         * Get type of port located at the specified position.
         *
         * @param position Position of the port.
         *
         * @return PortType at the specified position.
         */
        public native @Cast("FlyCapture2::TopologyNode::PortType") int GetPortType( @Cast("unsigned int") int position );

        /**
         * Add the specified PortType as a port of the node.
         *
         * @param childPort The port to add.
         */
        public native void AddPort( @Cast("FlyCapture2::TopologyNode::PortType") int childPort );

        /**
         * Assign a PGRGuid and device ID to the node.
         *
         * @param guid PGRGuid to be assigned.
         * @param deviceId Device ID to be assigned.
         *
         * @return Whether the data was successfully set to the node.
         */ 
        public native @Cast("bool") boolean AssignGuidToNode( @ByVal PGRGuid guid, int deviceId );

        /**
         * Assign a PGRGuid, device ID and nodeType to the node.
         *
         * @param guid PGRGuid to be assigned.
         * @param deviceId Device ID to be assigned.
         * @param nodeType NodeType to be assigned
         *
         * @return Whether the data was successfully set to the node.
         */ 
        public native @Cast("bool") boolean AssignGuidToNode(@ByVal PGRGuid guid, int deviceId, @Cast("FlyCapture2::TopologyNode::NodeType") int nodeType);
    }


// #endif


// Parsed from <ImageStatistics.h>

//=============================================================================
// Copyright 2009 Point Grey Research, Inc. All Rights Reserved.
// 
// This software is the confidential and proprietary information of Point
// Grey Research, Inc. ("Confidential Information").  You shall not
// disclose such Confidential Information and shall use it only in
// accordance with the terms of the license agreement you entered into
// with Point Grey Research, Inc. (PGR).
// 
// PGR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
// SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE, OR NON-INFRINGEMENT. PGR SHALL NOT BE LIABLE FOR ANY DAMAGES
// SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
// THIS SOFTWARE OR ITS DERIVATIVES.
//=============================================================================

//=============================================================================
// $Id: ImageStatistics.h 112716 2011-05-13 16:37:36Z soowei $
//=============================================================================

// #ifndef PGR_FC2_IMAGESTATISTICS_H
// #define PGR_FC2_IMAGESTATISTICS_H

// #include "FlyCapture2Platform.h"
// #include "FlyCapture2Defs.h"

    /**
     * The ImageStatistics object represents image statistics for an image.  
     */
    @Namespace("FlyCapture2") @NoOffset public static class ImageStatistics extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ImageStatistics(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(int)}. */
        public ImageStatistics(int size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(int size);
        @Override public ImageStatistics position(int position) {
            return (ImageStatistics)super.position(position);
        }
    

        /**
         * Channels that allow statistics to be calculated.
         */ 
        /** enum FlyCapture2::ImageStatistics::StatisticsChannel */
        public static final int
            GREY = 0,
            RED = 1,
            GREEN = 2,
            BLUE = 3,
            HUE = 4,
            SATURATION = 5,
            LIGHTNESS = 6,
            NUM_STATISTICS_CHANNELS = 7;

        /**
         * Default constructor.
         */
        public ImageStatistics() { super((Pointer)null); allocate(); }
        private native void allocate();
       
        /**
         * Default destructor.
         */

        /**
         * Copy constructor.
         */
        public ImageStatistics( @Const @ByRef ImageStatistics other ) { super((Pointer)null); allocate(other); }
        private native void allocate( @Const @ByRef ImageStatistics other );

        /**
         * Assignment operator.
         *
         * @param other The ImageStatistics object to copy from.
         */
        public native @ByRef @Name("operator =") ImageStatistics put( @Const @ByRef ImageStatistics other );

        /**
         * Enable all channels.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error EnableAll();

        /**
         * Disable all channels.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error DisableAll();

        /**
         * Enable only the grey channel.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error EnableGreyOnly();

        /**
         * Enable only the RGB channels.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error EnableRGBOnly();

        /**
         * Enable only the HSL channels.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error EnableHSLOnly();

        /**
         * Get the status of a statistics channel.
         *
         * @param channel The statistics channel.
         * @param pEnabled Whether the channel is enabled.
         *
         * @see SetChannelStatus()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetChannelStatus(
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
                    @Cast("bool*") BoolPointer pEnabled );

        /**
         * Set the status of a statistics channel.
         *
         * @param channel The statistics channel.
         * @param enabled Whether the channel should be enabled.
         *
         * @see GetChannelStatus()
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error SetChannelStatus( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("bool") boolean enabled );        

        /**
         * Get the range of a statistics channel. The values returned
         * are the maximum possible values for any given pixel in the image.
         * This is generally 0-255 for 8 bit images, and 0-65535 for
         * 16 bit images.
         *
         * @param channel The statistics channel.
         * @param pMin The minimum possible value.
         * @param pMax The maximum possible value.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntPointer pMin, 
                    @Cast("unsigned int*") IntPointer pMax );
        public native @ByVal Error GetRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntBuffer pMin, 
                    @Cast("unsigned int*") IntBuffer pMax );
        public native @ByVal Error GetRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") int[] pMin, 
                    @Cast("unsigned int*") int[] pMax );

        /**
         * Get the range of a statistics channel. The values returned
         * are the maximum values recorded for all pixels in the image.
         *
         * @param channel The statistics channel.
         * @param pPixelValueMin The minimum pixel value.
         * @param pPixelValueMax The maximum pixel value.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetPixelValueRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntPointer pPixelValueMin, 
                    @Cast("unsigned int*") IntPointer pPixelValueMax );
        public native @ByVal Error GetPixelValueRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntBuffer pPixelValueMin, 
                    @Cast("unsigned int*") IntBuffer pPixelValueMax );
        public native @ByVal Error GetPixelValueRange( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") int[] pPixelValueMin, 
                    @Cast("unsigned int*") int[] pPixelValueMax );

        /**
         * Get the number of unique pixel values in the image.
         *
         * @param channel The statistics channel.
         * @param pNumPixelValues The number of unique pixel values.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetNumPixelValues( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntPointer pNumPixelValues );
        public native @ByVal Error GetNumPixelValues( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") IntBuffer pNumPixelValues );
        public native @ByVal Error GetNumPixelValues( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("unsigned int*") int[] pNumPixelValues );

        /**
         * Get the mean of the image.
         *
         * @param channel The statistics channel.
         * @param pPixelValueMean The mean of the image.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetMean( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    FloatPointer pPixelValueMean );
        public native @ByVal Error GetMean( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    FloatBuffer pPixelValueMean );
        public native @ByVal Error GetMean( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    float[] pPixelValueMean );

        /**
         * Get the histogram for the image.
         *
         * @param channel The statistics channel.
         * @param ppHistogram Pointer to an array containing the histogram.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetHistogram( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @Cast("int**") PointerPointer ppHistogram );
        public native @ByVal Error GetHistogram( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @ByPtrPtr IntPointer ppHistogram );
        public native @ByVal Error GetHistogram( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @ByPtrPtr IntBuffer ppHistogram );
        public native @ByVal Error GetHistogram( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel, 
                    @ByPtrPtr int[] ppHistogram );

        /**
         * Get all statistics for the image.
         *
         * @param channel The statistics channel.
         * @param pRangeMin The minimum possible value.
         * @param pRangeMax The maximum possible value.
         * @param pPixelValueMin The minimum pixel value.
         * @param pPixelValueMax The maximum pixel value.
         * @param pNumPixelValues The number of unique pixel values.
         * @param pPixelValueMean The mean of the image.
         * @param ppHistogram Pointer to an array containing the histogram.
         *
         * @return An Error indicating the success or failure of the function.
         */
        public native @ByVal Error GetStatistics( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
                    @Cast("unsigned int*") IntPointer pRangeMin/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pRangeMax/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pPixelValueMin/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pPixelValueMax/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pNumPixelValues/*=NULL*/,
                    FloatPointer pPixelValueMean/*=NULL*/,
                    @Cast("int**") PointerPointer ppHistogram/*=NULL*/ );
        public native @ByVal Error GetStatistics( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel );
        public native @ByVal Error GetStatistics( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
                    @Cast("unsigned int*") IntPointer pRangeMin/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pRangeMax/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pPixelValueMin/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pPixelValueMax/*=NULL*/,
                    @Cast("unsigned int*") IntPointer pNumPixelValues/*=NULL*/,
                    FloatPointer pPixelValueMean/*=NULL*/,
                    @ByPtrPtr IntPointer ppHistogram/*=NULL*/ );
        public native @ByVal Error GetStatistics( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
                    @Cast("unsigned int*") IntBuffer pRangeMin/*=NULL*/,
                    @Cast("unsigned int*") IntBuffer pRangeMax/*=NULL*/,
                    @Cast("unsigned int*") IntBuffer pPixelValueMin/*=NULL*/,
                    @Cast("unsigned int*") IntBuffer pPixelValueMax/*=NULL*/,
                    @Cast("unsigned int*") IntBuffer pNumPixelValues/*=NULL*/,
                    FloatBuffer pPixelValueMean/*=NULL*/,
                    @ByPtrPtr IntBuffer ppHistogram/*=NULL*/ );
        public native @ByVal Error GetStatistics( 
                    @Cast("FlyCapture2::ImageStatistics::StatisticsChannel") int channel,
                    @Cast("unsigned int*") int[] pRangeMin/*=NULL*/,
                    @Cast("unsigned int*") int[] pRangeMax/*=NULL*/,
                    @Cast("unsigned int*") int[] pPixelValueMin/*=NULL*/,
                    @Cast("unsigned int*") int[] pPixelValueMax/*=NULL*/,
                    @Cast("unsigned int*") int[] pNumPixelValues/*=NULL*/,
                    float[] pPixelValueMean/*=NULL*/,
                    @ByPtrPtr int[] ppHistogram/*=NULL*/ );
    }


// #endif


}
