package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Image;
import com.example.demo.models.MultimediaElement;
import com.example.demo.models.Video;
import com.example.demo.services.GalleryService;

@RestController
@RequestMapping("/api/gallery")
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    @GetMapping("/getAll")
    public List<MultimediaElement> getGallery() {
        return galleryService.getGallery();
    }

    @PostMapping("/image")
    public void addImage(@RequestBody Image image) {
        galleryService.addElement(image);
    }

    @PostMapping("/video")
    public void addVideo(@RequestBody Video video) {
        galleryService.addElement(video);
    }

    @PostMapping("/saveSpace")
    public void saveSpace() {
        galleryService.saveSpace();
    }

    @PostMapping("/removeLow")
    public void removeLow() {
        galleryService.removeLow();
    }

    
}