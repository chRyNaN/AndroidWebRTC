package com.chrynan.webrtc.media;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by byowa_000 on 9/16/2015.
 */
public class MediaStream implements Cloneable {
    private String id;
    private Set<OnMediaStreamListener> listeners;
    private Set<MediaStreamTrack> tracks;
    private Set<MediaStreamTrack> audioTracks;
    private Set<MediaStreamTrack> videoTracks;
    private boolean active;

    public MediaStream(){
        this.id = UUID.randomUUID().toString();
        this.active = false;
        this.listeners = new HashSet<>();
        this.tracks = new HashSet<>();
        this.audioTracks = new HashSet<>();
        this.videoTracks = new HashSet<>();

    }

    public MediaStream(MediaStream stream){
        this.id = UUID.randomUUID().toString();
        this.listeners = new HashSet<>();
        this.tracks = new HashSet<>();
        this.audioTracks = new HashSet<>();
        this.videoTracks = new HashSet<>();

    }

    public MediaStream(MediaStreamTrack[] tracks){
        this.id = UUID.randomUUID().toString();
        this.listeners = new HashSet<>();
        this.tracks = new HashSet<>();
        this.audioTracks = new HashSet<>();
        this.videoTracks = new HashSet<>();

    }

    public MediaStream(Collection<MediaStreamTrack> tracks){
        this.id = UUID.randomUUID().toString();
        this.listeners = new HashSet<>();
        this.tracks = new HashSet<>();
        this.audioTracks = new HashSet<>();
        this.videoTracks = new HashSet<>();

    }

    @Override
    public MediaStream clone() throws CloneNotSupportedException{
        return null;
    }

    @Override
    public String toString(){
        return "";
    }

    public Set<MediaStreamTrack> getTracks() {
        return tracks;
    }

    public Set<MediaStreamTrack> getAudioTracks() {
        return audioTracks;
    }

    public Set<MediaStreamTrack> getVideoTracks() {
        return videoTracks;
    }

    public MediaStreamTrack getTrackById(String trackId){
        return null;
    }

    public void addTrack(MediaStreamTrack track){

    }

    public boolean removeTrack(MediaStreamTrack track){
        return false;
    }

    public String getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    protected void setActive(boolean active) {
        this.active = active;
    }


    public interface OnMediaStreamListener{
        void onActive();
        void onInactive();
        void onAddTrack(MediaStreamTrack track);
        void onRemoveTrack(MediaStreamTrack track);
    }


    public void addOnMediaStreamListener(OnMediaStreamListener listener){
        if(listeners == null){
            listeners = new HashSet<>();
        }
        listeners.add(listener);
    }

    public boolean removeOnMediaStreamListener(OnMediaStreamListener listener){
        if(listeners != null){
            return listeners.remove(listener);
        }else{
            return false;
        }
    }

    protected void alertListenersOnActive(){
        if(listeners != null){
            for(OnMediaStreamListener l : listeners){
                l.onActive();
            }
        }
    }

    protected void alertListenersOnInactive(){
        if(listeners != null){
            for(OnMediaStreamListener l : listeners){
                l.onInactive();
            }
        }
    }

    protected void alertListenersOnAddTrack(MediaStreamTrack track){
        if(listeners != null){
            for(OnMediaStreamListener l : listeners){
                l.onAddTrack(track);
            }
        }
    }

    protected void alertListenersOnRemoveTrack(MediaStreamTrack track){
        if(listeners != null){
            for(OnMediaStreamListener l : listeners){
                l.onRemoveTrack(track);
            }
        }
    }

}
