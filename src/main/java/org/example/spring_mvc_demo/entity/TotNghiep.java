package org.example.spring_mvc_demo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(TotNghiepPK.class)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tot_nghiep")
public class TotNghiep {

    @Id
    @ManyToOne
    @JoinColumn(name = "SoCMND")
    SinhVien sinhVien;
    @Id
    @ManyToOne
    @JoinColumn(name = "MaTruong")
    Truong truong;

    @Id
    @ManyToOne
    @JoinColumn(name = "MaNganh")
    Nganh nganh;


    String HeTN;
    Date NamTN;
    String LoaiTN;

}
