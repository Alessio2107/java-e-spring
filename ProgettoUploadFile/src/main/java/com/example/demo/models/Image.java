package com.example.demo.models;


import jakarta.persistence.Entity;

@Entity
public class Image extends MultimediaElement {
    private int pixel;

    public Image() {
    }

    public Image(String fileName, char resolution, boolean isRaw, int pixel) {
        super(fileName, resolution, isRaw);
        this.pixel = pixel;
    }

    

    @Override
    public void resize(int percentage) {
        this.pixel = this.pixel * percentage / 100;
    }

    /**
     * @return int return the pixel
     */
    public int getPixel() {
        return pixel;
    }

    /**
     * @param pixel the pixel to set
     */
    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

}