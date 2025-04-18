package org.example.spring_mvc_demo.service;

import org.example.spring_mvc_demo.entity.SinhVien;
import org.springframework.stereotype.Service;

public interface SVService {
    boolean insertSinhVien(SinhVien sv);
}
