package com.chrynan.webrtc.media;

/**
 * Created by byowa_000 on 9/15/2015.
 */
public class MediaStreamConstraints {
    private boolean video;
    private boolean audio;
    private MediaTrackConstraints videoConstraints;
    private MediaTrackConstraints audioConstraints;

    public MediaStreamConstraints(){
        this.video = true;
        this.audio = true;
        this.videoConstraints = null;
        this.audioConstraints = null;
    }

    public MediaStreamConstraints(boolean video, boolean audio){
        this.video = video;
        this.audio = audio;
        this.videoConstraints = null;
        this.audioConstraints = null;
    }

    public MediaStreamConstraints(MediaTrackConstraints videoConstraints, MediaTrackConstraints audioConstraints){
        if(videoConstraints != null){
            this.video = true;
        }else{
            this.video = false;
        }
        if(audioConstraints != null){
            this.audio = true;
        }else{
            this.audio = false;
        }
        this.videoConstraints = videoConstraints;
        this.audioConstraints = audioConstraints;
    }


    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    public MediaTrackConstraints getVideoConstraints() {
        return videoConstraints;
    }

    public void setVideoConstraints(MediaTrackConstraints videoConstraints) {
        this.videoConstraints = videoConstraints;
    }

    public MediaTrackConstraints getAudioConstraints() {
        return audioConstraints;
    }

    public void setAudioConstraints(MediaTrackConstraints audioConstraints) {
        this.audioConstraints = audioConstraints;
    }
}
