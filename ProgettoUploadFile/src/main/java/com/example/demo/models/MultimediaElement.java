package com.example.demo.models;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MultimediaElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private char resolution;
    private boolean isRaw;

    public MultimediaElement() {
    }

    public MultimediaElement(String fileName, char resolution, boolean isRaw) {
        this.fileName = fileName;
        this.resolution = resolution;
        this.isRaw = isRaw;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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
    

    public boolean checkQuality() {
        return this.resolution == 'h' && this.isRaw;
    }

    public abstract void resize(int percentage);
}
