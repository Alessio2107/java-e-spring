
import java.io.IOException;

import model.Gallery;
import model.Image;
import model.Video;

public class User {
    public static void main(String[] args) {
        //try {
            Gallery gallery = new Gallery();
            //gallery.loadFromFile("multimedia.txt");

            gallery.addElement(new Image("New Image", 'h', true, 2000));
            gallery.addElement(new Video("New Video", 'h', true, 30));

            System.out.println("Stampa di tutta la gallery prima della rimozione:");
            gallery.printGallery();

            gallery.saveSpace();

            System.out.println("After removing space:");
            gallery.printGallery();

            gallery.removeLow();

            System.out.println("After removing low quality items:");
            gallery.printGallery();

        /* } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}