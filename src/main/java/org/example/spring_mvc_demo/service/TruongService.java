package org.example.spring_mvc_demo.service;

import org.example.spring_mvc_demo.entity.Truong;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TruongService {
    List<Truong> getAllTruong();
}
