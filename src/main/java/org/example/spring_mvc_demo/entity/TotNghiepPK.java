package org.example.spring_mvc_demo.entity;

import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotNghiepPK implements Serializable {
    private String sinhVien;
    private String truong;
    private String nganh;
}
