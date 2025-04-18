package org.example.spring_mvc_demo.service;

import org.example.spring_mvc_demo.entity.Nganh;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NganhService {
    List<Nganh> getAllNganh();
    boolean deleteNganh(String maNganh);
}
