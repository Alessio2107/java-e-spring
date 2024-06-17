package com.example.demo.services;

import com.example.demo.*;
import com.example.demo.models.Image;
import com.example.demo.models.MultimediaElement;
import com.example.demo.models.Video;
import com.example.demo.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GalleryService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private VideoRepository videoRepository;

    public void loadFromFile(String fileName) {

        if (fileName.contains(".jpg")) {
            imageRepository.save(new Image(fileName, 'p', true, 0));
        } else if (fileName.contains(".mp4")) {
            videoRepository.save(new Video(fileName, 'p', true, 0));
        }
    }

    public void addElement(MultimediaElement element) {
        if (element instanceof Image) {

            imageRepository.save((Image) element);

        } else if (element instanceof Video) {

            videoRepository.save((Video) element);
        }
    }

    public void saveSpace() {
        List<Image> images = imageRepository.findAll();
        List<Video> videos = videoRepository.findAll();

        
    }

    public void removeLow() {
        List<Image> images = imageRepository.findAll();

        images.removeIf(image -> !image.checkQuality());

        imageRepository.saveAll(images);

        List<Video> videos = videoRepository.findAll();

        videos.removeIf(video -> !video.checkQuality());

        videoRepository.saveAll(videos);
    }

    public List<MultimediaElement> getGallery() {

        List<MultimediaElement> gallery = new ArrayList<>();
        
        gallery.addAll(imageRepository.findAll());

        gallery.addAll(videoRepository.findAll());

        return gallery;
    }
}
