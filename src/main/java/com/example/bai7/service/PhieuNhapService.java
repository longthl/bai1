package com.example.bai7.service;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.model.PhieuNhap;

import java.util.List;

public interface PhieuNhapService {
    void insert(PhieuNhap phieuNhap);
    PhieuNhap themmoi(PhieuNhap phieuNhap, List<ChiTietPhieuNhap> CTphieunhaplist);
}
