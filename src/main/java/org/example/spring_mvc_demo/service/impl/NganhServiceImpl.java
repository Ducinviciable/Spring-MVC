package org.example.spring_mvc_demo.service.impl;

import org.example.spring_mvc_demo.entity.Nganh;
import org.example.spring_mvc_demo.repository.NganhRepository;
import org.example.spring_mvc_demo.service.NganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NganhServiceImpl implements NganhService {
    @Autowired
    private NganhRepository nganhRepository;

    @Override
    public List<Nganh> getAllNganh() {
        try {
            return nganhRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean deleteNganh(String maNganh) {
        try {
            nganhRepository.deleteById(maNganh);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
