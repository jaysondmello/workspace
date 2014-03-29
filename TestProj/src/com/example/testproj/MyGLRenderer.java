package com.example.testproj;

import javax.microedition.khronos.opengles.GL10;



import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;



public class MyGLRenderer implements GLSurfaceView.Renderer {

    public void onSurfaceCreated(GL10 unused, javax.microedition.khronos.egl.EGLConfig config) {
    	
    	Log.i("MyGLRenderer", "MyGLRenderer : onSurfaceCreated() - Entered onSurfaceCreated");
        // Set the background frame color
        GLES20.glClearColor(1.0f, 0.6f, 0.0f, 1.0f);
        
        // initialize a triangle
        Triangle mTriangle = new Triangle();
    }

    public void onDrawFrame(GL10 unused) {
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }

    public void onSurfaceChanged(GL10 unused, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

}


