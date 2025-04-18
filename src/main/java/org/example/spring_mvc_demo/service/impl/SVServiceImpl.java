package org.example.spring_mvc_demo.service.impl;

import org.example.spring_mvc_demo.entity.SinhVien;
import org.example.spring_mvc_demo.repository.SVRepository;
import org.example.spring_mvc_demo.service.SVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SVServiceImpl implements SVService {
    @Autowired
    private SVRepository svRepository;
    @Override
    public boolean insertSinhVien(SinhVien sv) {
        try {
            svRepository.save(sv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
