package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class Video extends MultimediaElement {
    private int numFrames;

    public Video() {
    }

    public Video(String fileName, char resolution, boolean isRaw, int numFrames) {
        super(fileName, resolution, isRaw);
        this.numFrames = numFrames;
    }

    

    @Override
    public void resize(int percentage) {
        this.numFrames = this.numFrames * percentage / 100;
    }

    /**
     * @return int return the numFrames
     */
    public int getNumFrames() {
        return numFrames;
    }

    /**
     * @param numFrames the numFrames to set
     */
    public void setNumFrames(int numFrames) {
        this.numFrames = numFrames;
    }

}