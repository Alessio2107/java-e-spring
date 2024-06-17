package abstractClasses;
import interfaces.Resizable;

public abstract class MultimediaElement implements Resizable {
    String fileName;
    char resolution;
    boolean isRaw;

    public MultimediaElement(){

    }

    public MultimediaElement(String fileName, char resolution, boolean isRaw) {
        this.fileName = fileName;
        this.resolution = resolution;
        this.isRaw = isRaw;
    }


    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public char getResolution() {
        return this.resolution;
    }

    public void setResolution(char resolution) {
        this.resolution = resolution;
    }

    public boolean isIsRaw() {
        return this.isRaw;
    }

    public boolean getIsRaw() {
        return this.isRaw;
    }

    public void setIsRaw(boolean isRaw) {
        this.isRaw = isRaw;
    }

    @Override
    public boolean checkQuality() {
        return this.resolution == 'h' && this.isRaw;
    }

    @Override
    public abstract void resize(int percentage);

}