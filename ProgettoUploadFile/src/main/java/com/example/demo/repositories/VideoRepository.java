package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {

    Video findByFileName(String fileName);

    Video findByNumFrames(int numFrames);
}
