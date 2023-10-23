package com.example.bai7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "PhieuXuat")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhieuXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PhieuXuatId")
    private int id;
    @Column(name="MaPhieu")
    private String maPhieu;
    @Column(name="TieuDe")
    private String tieuDe;
    @Column(name="NgayXuat")
    private LocalDate ngayXuat;
}
