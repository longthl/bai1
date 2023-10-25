package com.example.bai7.service.Impl;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.model.VatTu;
import com.example.bai7.repository.ChiTietPhieuNhapRepo;
import com.example.bai7.repository.VatTuRepository;
import com.example.bai7.service.ChiTietPhieuNhapService;
import com.example.bai7.service.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietPhieuNhapServiceImpl implements ChiTietPhieuNhapService {
@Autowired
    ChiTietPhieuNhapRepo chiTietPhieuNhapRepo;
@Autowired
    VatTuService vatTuService;
    @Override
    public void insert(ChiTietPhieuNhap chiTietPhieuNhap) {
        chiTietPhieuNhapRepo.save(chiTietPhieuNhap);
//        int vatTu=chiTietPhieuNhap.getVatTu().getId();
//        int soLuongNhap=chiTietPhieuNhap.getSoLuongNhap();
//        vatTuService.capnhat(vatTu,soLuongNhap);
    }
}
