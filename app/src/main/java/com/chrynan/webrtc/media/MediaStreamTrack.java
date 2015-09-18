package com.chrynan.webrtc.media;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;

/**
 * Created by byowa_000 on 9/16/2015.
 * protected set methods should not be used outside of subclasses and their corresponding fields type's should be considered read only.
 */
public abstract class MediaStreamTrack implements ConstrainablePattern, Cloneable {
    private Set<OnMediaStreamTrackListener> listeners;
    private MediaTrackConstraints capabilities;
    private MediaTrackConstraints constraints;
    private MediaTrackConstraints settings;
    private String kind;
    private String id;
    private String label;
    private boolean enabled;
    private boolean muted;
    private boolean readOnly;
    private boolean remote;
    private State readyState;
    private SourceType type;

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        FAILED
    }

    public MediaStreamTrack(){
        this.listeners = new HashSet<>();
        this.id = UUID.randomUUID().toString();

    }

    @Override
    public MediaTrackConstraints getCapabilities() {
        return null;
    }

    @Override
    public MediaTrackConstraints getConstraints() {
        return null;
    }

    @Override
    public MediaTrackConstraints getSettings() {
        return null;
    }

    @Override
    public Future<Void> applyConstraints(MediaTrackConstraints constraints) {
        return null;
    }

    @Override
    public void onOverConstrained(MediaStreamError error) {
        alertListenersOnOverConstrained(error);
    }

    @Override
    public MediaStreamTrack clone()throws CloneNotSupportedException {
        //TODO proper clone implementation
        return null;
    }

    @Override
    public String toString(){
        return "{id: " + id + ", kind: " + kind + ", label: " + label + "}";
    }

    //subclasses must implement this method
    public abstract void stop();

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isMuted() {
        return muted;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public boolean isRemote() {
        return remote;
    }

    protected void setCapabilities(MediaTrackConstraints capabilities) {
        this.capabilities = capabilities;
    }

    protected void setConstraints(MediaTrackConstraints constraints) {
        this.constraints = constraints;
    }

    protected void setSettings(MediaTrackConstraints settings) {
        this.settings = settings;
    }

    protected void setKind(String kind) {
        this.kind = kind;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected void setLabel(String label) {
        this.label = label;
    }

    protected void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    protected void setMuted(boolean muted) {
        this.muted = muted;
    }

    protected void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    protected void setRemote(boolean remote) {
        this.remote = remote;
    }

    public State getReadyState() {
        return readyState;
    }

    protected void setReadyState(State readyState) {
        this.readyState = readyState;
    }

    public SourceType getType() {
        return type;
    }

    protected void setType(SourceType type) {
        this.type = type;
    }


    public interface OnMediaStreamTrackListener{
        void onEnded();
        void onOverConstrained(MediaStreamError error);
        void onMute();
        void onUnmute();
    }


    public void addOnMediaStreamTrackListener(OnMediaStreamTrackListener listener){
        if(listeners == null){
            listeners = new HashSet<>();
        }
        this.listeners.add(listener);
    }

    public boolean removeOnMediaStreamTrackListener(OnMediaStreamTrackListener listener){
        if(listeners != null) {
            return this.listeners.remove(listener);
        }else{
            return false;
        }
    }

    protected void alertListenersOnEnded(){
        if(listeners != null){
            for(OnMediaStreamTrackListener l : listeners){
                l.onEnded();
            }
        }
    }

    protected void alertListenersOnOverConstrained(MediaStreamError error){
        if(listeners != null){
            for(OnMediaStreamTrackListener l : listeners){
                l.onOverConstrained(error);
            }
        }
    }

    public Set<OnMediaStreamTrackListener> getListeners(){
        return this.listeners;
    }

    public void detachListeners(){
        if(listeners != null){
            this.listeners.clear();
        }
    }

    protected void alertListenersOnMute(){
        if(listeners != null){
            for(OnMediaStreamTrackListener l : listeners){
                l.onMute();
            }
        }
    }

    protected void alertListenersOnUnmute(){
        if(listeners != null){
            for(OnMediaStreamTrackListener l : listeners){
                l.onUnmute();
            }
        }
    }

}
