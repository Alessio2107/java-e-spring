package model;

import abstractClasses.MultimediaElement;

public class Video extends MultimediaElement {
    int numFrames;

    public Video(){
    
    }

    public Video(String fileName, char resolution, boolean isRaw, int numFrames) {
        super(fileName, resolution, isRaw);
        this.numFrames = numFrames;
    }


    public int getNumFrames() {
        return this.numFrames;
    }

    public void setNumFrames(int numFrames) {
        this.numFrames = numFrames;
    }


    @Override
    public void resize(int percentage) {
        this.numFrames = this.numFrames * percentage / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " Frames: " + numFrames;
    }
}

