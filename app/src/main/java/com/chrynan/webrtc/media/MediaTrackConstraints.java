package com.chrynan.webrtc.media;

/**
 * Created by byowa_000 on 9/15/2015.
 */
public class MediaTrackConstraints {
    private long width;
    private long height;
    private double aspectRatio;
    private double frameRate;
    private String facingMode;
    private double volume;
    private long sampleRate;
    private long sampleSize;
    private boolean echoCancellation;
    private String deviceId;
    private String groupId;

    public MediaTrackConstraints(){

    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate = frameRate;
    }

    public String getFacingMode() {
        return facingMode;
    }

    public void setFacingMode(String facingMode) {
        this.facingMode = facingMode;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(long sampleRate) {
        this.sampleRate = sampleRate;
    }

    public long getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(long sampleSize) {
        this.sampleSize = sampleSize;
    }

    public boolean isEchoCancellation() {
        return echoCancellation;
    }

    public void setEchoCancellation(boolean echoCancellation) {
        this.echoCancellation = echoCancellation;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
