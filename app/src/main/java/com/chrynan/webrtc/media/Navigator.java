package com.chrynan.webrtc.media;


import android.content.Context;
import android.content.pm.PackageManager;

import java.util.Set;
import java.util.concurrent.Future;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public class Navigator implements NavigatorUserMedia, MediaDevices {
    private Context context;

    public Navigator(Context context){
        this.context = context;

    }

    @Override
    public void onDeviceChange(MediaDeviceInfo deviceInfo) {

    }

    @Override
    public Future<Set<MediaDeviceInfo>> enumerateDevices() {
        return null;
    }

    @Override
    public MediaTrackConstraints getSupportedConstraints() {
        return null;
    }

    @Override
    public Future<MediaStream> getUserMedia(MediaStreamConstraints constraints) {
        return null;
    }

    @Override
    public void getUserMedia(MediaStreamConstraints constraints, OnNavigatorListener listener) {

    }

    @Override
    public Set<MediaDeviceInfo> getMediaDevices() {
        return null;
    }

    private boolean hasCameraPermission(){
        if(context != null){
            String permission = "android.permission.CAMERA";
            int res = context.checkCallingOrSelfPermission(permission);
            return res == PackageManager.PERMISSION_GRANTED;
        }else {
            return false;
        }
    }

}
