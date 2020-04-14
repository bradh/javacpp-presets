// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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

import static org.bytedeco.opencv.global.opencv_video.*;


/** \brief Variational optical flow refinement
<p>
This class implements variational refinement of the input flow field, i.e.
it uses input flow to initialize the minimization of the following functional:
{@code E(U) = \int_{\Omega} \delta \Psi(E_I) + \gamma \Psi(E_G) + \alpha \Psi(E_S) },
where {@code E_I,E_G,E_S} are color constancy, gradient constancy and smoothness terms
respectively. {@code \Psi(s^2)=\sqrt{s^2+\epsilon^2}} is a robust penalizer to limit the
influence of outliers. A complete formulation and a description of the minimization
procedure can be found in \cite Brox2004
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class VariationalRefinement extends DenseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariationalRefinement(Pointer p) { super(p); }

    /** \brief \ref calc function overload to handle separate horizontal (u) and vertical (v) flow components
    (to avoid extra splits/merges) */
    public native void calcUV(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow_u, @ByVal Mat flow_v);
    public native void calcUV(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow_u, @ByVal UMat flow_v);
    public native void calcUV(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow_u, @ByVal GpuMat flow_v);

    /** \brief Number of outer (fixed-point) iterations in the minimization procedure.
    @see setFixedPointIterations */
    public native int getFixedPointIterations();
    /** \copybrief getFixedPointIterations @see getFixedPointIterations */
    public native void setFixedPointIterations(int val);

    /** \brief Number of inner successive over-relaxation (SOR) iterations
        in the minimization procedure to solve the respective linear system.
    @see setSorIterations */
    public native int getSorIterations();
    /** \copybrief getSorIterations @see getSorIterations */
    public native void setSorIterations(int val);

    /** \brief Relaxation factor in SOR
    @see setOmega */
    public native float getOmega();
    /** \copybrief getOmega @see getOmega */
    public native void setOmega(float val);

    /** \brief Weight of the smoothness term
    @see setAlpha */
    public native float getAlpha();
    /** \copybrief getAlpha @see getAlpha */
    public native void setAlpha(float val);

    /** \brief Weight of the color constancy term
    @see setDelta */
    public native float getDelta();
    /** \copybrief getDelta @see getDelta */
    public native void setDelta(float val);

    /** \brief Weight of the gradient constancy term
    @see setGamma */
    public native float getGamma();
    /** \copybrief getGamma @see getGamma */
    public native void setGamma(float val);

    /** \brief Creates an instance of VariationalRefinement
    */
    public static native @Ptr VariationalRefinement create();
}
