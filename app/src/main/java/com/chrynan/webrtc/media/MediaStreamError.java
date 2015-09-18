package com.chrynan.webrtc.media;

/**
 * Created by byowa_000 on 9/15/2015.
 */
public class MediaStreamError extends Exception {
    //The operation is not supported.
    public static final String NotSupportedError = "NotSupportedError";
    //The user did not grant permission for the operation.
    public static final String PermissionDeniedError = "PermissionDeniedError";
    //One of the mandatory Constraints could not be satisfied.
    public static final String ConstraintNotSatisfiedError = "ConstraintNotSatisfiedError";
    //Due to changes in the environment, one or more mandatory constraints can no longer be satisfied.
    public static final String OverconstrainedError = "OverconstrainedError";
    //The object can not be found here.
    public static final String NotFoundError = "NotFoundError";
    //The operation was aborted.
    public static final String AbortError = "AbortError";
    //The source of the MediaStream could not be accessed due to a hardware error (e.g. lock from another process).
    public static final String SourceUnavailableError = "SourceUnavailableError";

    private String name;
    private String message;
    private String constraintName;

    private StringBuilder sb;

    public MediaStreamError(String name, String message, String constraintName){
        super(message);
        this.name = name;
        this.message = message;
        this.constraintName = constraintName;

    }

    @Override
    public String toString(){
        String newLine = System.getProperty("line.separator");
        sb = new StringBuilder();
        sb.append("com.chrynan.webrtc.MediaStreamError: " + newLine);
        sb.append("Name: " + name + newLine);
        sb.append("Message: " + message + newLine);
        sb.append("ConstraintName: " + constraintName + newLine);
        return sb.toString();
    }

    //All should be read only; so no set methods
    public String getName(){
        return name;
    }

    @Override
    public String getMessage(){
        return message;
    }

    public String getConstraintName(){
        return constraintName;
    }

}
