package com.example.bai7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="VatTu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VatTu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="VatTuId")
    private int id;
    @Column(name="TenVatTu")
    private String tenVatTu;
    @Column(name="SoLuongTon")
    private int SoLuongTon;
}
