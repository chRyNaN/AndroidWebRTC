package com.chrynan.webrtc.media;

/**
 * Created by byowa_000 on 9/15/2015.
 */
public interface OnNavigatorListener {

    void onSuccess(MediaStream stream);
    void onError(MediaStreamError error);

}
