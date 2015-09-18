package com.chrynan.webrtc.media;

import java.util.Set;
import java.util.concurrent.Future;

/**
 * Created by chrynan on 9/15/2015.
 */
public interface NavigatorUserMedia {

    MediaTrackConstraints getSupportedConstraints();
    Future<MediaStream> getUserMedia(MediaStreamConstraints constraints);
    void getUserMedia(MediaStreamConstraints constraints, OnNavigatorListener listener);
    //enumerateDevices is an asynchronous method call so this may return null while that's still completing
    Set<MediaDeviceInfo> getMediaDevices();

}
