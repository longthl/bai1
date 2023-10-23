package com.example.bai7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ChiTietPhieuNhap")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietPhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ChiTietPhieuNhapId")
    private int id;
    @ManyToOne
    @JoinColumn(name="VatTuId")
    private VatTu VatTu;
    @ManyToOne
    @JoinColumn(name="PhieuNhapId")
    private PhieuNhap PhieuNhapId;
    @Column(name="SoLuongNhap")
    private int SoLuongNhap;
}
