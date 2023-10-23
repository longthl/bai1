package com.example.bai7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ChiTietPhieuXuat")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChiTietPhieuXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ChiTietPhieuXuatId")
    private int id;
    @ManyToOne
    @JoinColumn(name="VatTuId")
    private VatTu VatTu;
    @ManyToOne
    @JoinColumn(name="PhieuXuatId")
    private PhieuNhap PhieuXuatId;
    @Column(name="SoLuongXuat")
    private int SoLuongXuat;
}
