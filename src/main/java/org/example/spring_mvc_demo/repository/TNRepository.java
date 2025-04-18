package org.example.spring_mvc_demo.repository;

import org.example.spring_mvc_demo.entity.SinhVien;
import org.example.spring_mvc_demo.entity.TotNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TNRepository extends JpaRepository<TotNghiep, String> {
}

