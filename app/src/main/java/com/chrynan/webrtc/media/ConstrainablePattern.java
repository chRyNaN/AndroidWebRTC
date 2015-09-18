package com.chrynan.webrtc.media;

import java.util.concurrent.Future;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public interface ConstrainablePattern {

    MediaTrackConstraints getCapabilities();
    MediaTrackConstraints getConstraints();
    MediaTrackConstraints getSettings();
    Future<Void> applyConstraints(MediaTrackConstraints constraints);
    void onOverConstrained(MediaStreamError error);

}
