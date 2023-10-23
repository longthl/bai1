package com.example.bai7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name="PhieuNhap")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PhieuNhapId")
    private int id;
    @Column(name="MaPhieu")
    private String maPhieu;
    @Column(name="TieuDe")
    private String tieuDe;
    @Column(name="NgayNhap")
    private LocalDate ngayNhap;
}
