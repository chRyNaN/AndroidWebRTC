package com.chrynan.webrtc.media;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public class MediaDeviceInfo {
    private String deviceId;
    private MediaDeviceKind kind;
    private String label;
    private String groupId;

    public MediaDeviceInfo(String deviceId, MediaDeviceKind kind, String label, String groupId){
        this.deviceId = deviceId;
        this.kind = kind;
        this.label = label;
        this.groupId = groupId;

    }

    public String getDeviceId() {
        return deviceId;
    }

    public MediaDeviceKind getKind() {
        return kind;
    }

    public String getLabel() {
        return label;
    }

    public String getGroupId() {
        return groupId;
    }
}
