package org.example.spring_mvc_demo.repository;

import org.example.spring_mvc_demo.entity.CongViec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongViecRepository extends JpaRepository<CongViec, String> {
}

