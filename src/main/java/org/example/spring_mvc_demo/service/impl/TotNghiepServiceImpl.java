package org.example.spring_mvc_demo.service.impl;

import org.example.spring_mvc_demo.entity.TotNghiep;
import org.example.spring_mvc_demo.repository.TNRepository;
import org.example.spring_mvc_demo.service.TotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotNghiepServiceImpl implements TotNghiepService {
    @Autowired private TNRepository tnRepository;

    @Override
    public boolean insertTotNghiep(TotNghiep tn) {
        try {
            tnRepository.save(tn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
