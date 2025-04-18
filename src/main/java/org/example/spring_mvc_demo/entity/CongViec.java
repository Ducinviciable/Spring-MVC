package org.example.spring_mvc_demo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CongViecPK.class)
@Table(name = "cong_viec")
public class CongViec {
    @Id
    @ManyToOne
    @JoinColumn(name = "SoCMND")
    SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "MaNganh")
    Nganh nganh;

    @Id
    Date NgayVaoCongTy;

    String tenCongTy;

    Date ngayVaoCongTy;

    String thoiGianLamViec;

}
