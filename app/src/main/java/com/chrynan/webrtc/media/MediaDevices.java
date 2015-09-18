package com.chrynan.webrtc.media;

import java.util.Set;
import java.util.concurrent.Future;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public interface MediaDevices {

    void onDeviceChange(MediaDeviceInfo deviceInfo);
    Future<Set<MediaDeviceInfo>> enumerateDevices();

}
