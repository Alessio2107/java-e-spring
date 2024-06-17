package model;

import abstractClasses.MultimediaElement;

public class Image extends MultimediaElement {
    int pixel;

    public Image(){

    }

    public Image(String fileName, char resolution, boolean isRaw, int pixel) {
        super(fileName, resolution, isRaw);
        this.pixel = pixel;
    }



    public int getPixel() {
        return this.pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    @Override
    public void resize(int percentage) {
        this.pixel = this.pixel * percentage / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " Pixels: " + pixel;
    }
}
