package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import abstractClasses.MultimediaElement;

public class Gallery {
    List mediaList = new List();


    public List getMediaList() {
        return this.mediaList;
    }

    public void setMediaList(List mediaList) {
        this.mediaList = mediaList;
    }


    public void loadFromFile(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (data[0].equals("Image")) {

                mediaList.insert(new Image(data[1], data[2].charAt(0),
                Boolean.parseBoolean(data[3]), 
                Integer.parseInt(data[4])));

            } else if (data[0].equals("Video")) {

                mediaList.insert(new Video(data[1], data[2].charAt(0), 
                Boolean.parseBoolean(data[3]),
                Integer.parseInt(data[4])));
            }
        }
        br.close();
    }

    public void addElement(MultimediaElement element) {
        mediaList.insert(element);
    }

    public void saveSpace() {
        mediaList.saveSpace();
    }

    public void removeLow() {
        mediaList.removeLow();
    }

    public void printGallery() {
        mediaList.printList();
    }
}
