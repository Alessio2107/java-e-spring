package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

    Image findByFileName(String fileName);
}