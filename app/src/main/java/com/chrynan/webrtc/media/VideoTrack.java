package com.chrynan.webrtc.media;

import android.hardware.Camera;
import android.os.Build;
import android.util.Log;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public class VideoTrack extends MediaStreamTrack {
    private static final String TAG = "VideoTrack";
    private int cameraId;

    public VideoTrack(){
        super();
        this.setKind("video");
        this.cameraId = 0;

    }

    public VideoTrack(int cameraId){
        this();
        this.cameraId = cameraId;

    }

    @Override
    public void stop() {
        
    }

    @SuppressWarnings("deprecation")
    private Camera getCamera(int cameraId){
        try {
            int numOfCameras = Camera.getNumberOfCameras();
            cameraId = (cameraId < 0) ? 0 : cameraId;
            cameraId = (cameraId > numOfCameras - 1) ? numOfCameras - 1 : cameraId;
            return Camera.open(cameraId);
        }catch(Exception e){
            Log.e(TAG, "Error opening camera:");
            e.printStackTrace();
        }
        return null;
    }


}
