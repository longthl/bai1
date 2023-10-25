package com.example.bai7.service;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.model.ChiTietPhieuXuat;
import com.example.bai7.model.PhieuNhap;
import com.example.bai7.model.PhieuXuat;

import java.util.List;

public interface PhieuXuatService {
    void insert(PhieuXuat phieuXuat);
    PhieuXuat themmoi(PhieuXuat phieuXuat, List<ChiTietPhieuXuat> CTphieuxuatlist);
}
