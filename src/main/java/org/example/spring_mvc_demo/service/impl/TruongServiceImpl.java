package org.example.spring_mvc_demo.service.impl;

import org.example.spring_mvc_demo.entity.Truong;
import org.example.spring_mvc_demo.repository.TruongRepository;
import org.example.spring_mvc_demo.service.TruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruongServiceImpl implements TruongService {
    @Autowired
    private TruongRepository truongRepository;
    @Override
    public List<Truong> getAllTruong() {
        try {
            return truongRepository.findAll();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
