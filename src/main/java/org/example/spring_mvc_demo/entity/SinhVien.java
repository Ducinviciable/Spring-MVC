package org.example.spring_mvc_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @Column(name = "SoCMND")
    private String SoCMND;

    String HoTen;
    String SoDT;
    String Email;
    String DiaChi;
}
