package com.example.bai7.service.Impl;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.model.ChiTietPhieuXuat;
import com.example.bai7.model.VatTu;
import com.example.bai7.repository.ChiTietPhieuXuatRepo;
import com.example.bai7.service.ChiTietPhieuNhapService;
import com.example.bai7.service.ChiTietPhieuXuatService;
import com.example.bai7.service.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietPhieuXuatServiceImpl implements ChiTietPhieuXuatService {
@Autowired
    ChiTietPhieuXuatRepo chiTietPhieuXuatRepo;
@Autowired
    VatTuService vatTuService;
    @Override
    public void insert(ChiTietPhieuXuat chiTietPhieuXuat) {
        chiTietPhieuXuatRepo.save(chiTietPhieuXuat);
        int vatTu=chiTietPhieuXuat.getVatTu().getId();
        int soLuongXuat=chiTietPhieuXuat.getSoLuongXuat();
        vatTuService.capnhat(vatTu,-soLuongXuat);
    }
}
