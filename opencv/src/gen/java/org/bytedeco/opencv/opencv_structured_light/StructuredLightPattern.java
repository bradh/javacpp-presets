// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_structured_light;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_phase_unwrapping.*;
import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_structured_light.*;


/** \brief Abstract base class for generating and decoding structured light patterns.
 */
@Namespace("cv::structured_light") @Properties(inherit = org.bytedeco.opencv.presets.opencv_structured_light.class)
public class StructuredLightPattern extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructuredLightPattern(Pointer p) { super(p); }

  /** \brief Generates the structured light pattern to project.
   <p>
   @param patternImages The generated pattern: a vector<Mat>, in which each image is a CV_8U Mat at projector's resolution.
   */
  public native @Cast("bool") boolean generate( @ByVal MatVector patternImages );
  public native @Cast("bool") boolean generate( @ByVal UMatVector patternImages );
  public native @Cast("bool") boolean generate( @ByVal GpuMatVector patternImages );

  /** \brief Decodes the structured light pattern, generating a disparity map
   <p>
   @param patternImages The acquired pattern images to decode (vector<vector<Mat>>), loaded as grayscale and previously rectified.
   @param disparityMap The decoding result: a CV_64F Mat at image resolution, storing the computed disparity map.
   @param blackImages The all-black images needed for shadowMasks computation.
   @param whiteImages The all-white images needed for shadowMasks computation.
   @param flags Flags setting decoding algorithms. Default: DECODE_3D_UNDERWORLD.
   \note All the images must be at the same resolution.
   */
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal Mat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal Mat disparityMap );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal Mat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal Mat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal UMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal UMat disparityMap );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal UMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal UMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal GpuMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") MatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal GpuMat disparityMap );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal GpuMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") UMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
  public native @Cast("bool") boolean decode( @Const @ByRef MatVectorVector patternImages, @ByVal GpuMat disparityMap,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector blackImages,
                         @ByVal(nullValue = "cv::InputArrayOfArrays(cv::noArray())") GpuMatVector whiteImages,
                         int flags/*=cv::structured_light::DECODE_3D_UNDERWORLD*/ );
}
