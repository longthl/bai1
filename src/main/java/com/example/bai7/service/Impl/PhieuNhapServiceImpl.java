package com.example.bai7.service.Impl;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.model.PhieuNhap;
import com.example.bai7.model.PhieuXuat;
import com.example.bai7.model.VatTu;
import com.example.bai7.repository.ChiTietPhieuNhapRepo;
import com.example.bai7.repository.ChiTietPhieuXuatRepo;
import com.example.bai7.repository.PhieuNhapRepository;
import com.example.bai7.repository.VatTuRepository;
import com.example.bai7.service.ChiTietPhieuNhapService;
import com.example.bai7.service.PhieuNhapService;
import com.example.bai7.service.PhieuXuatService;
import com.example.bai7.service.VatTuService;
import lombok.extern.flogger.Flogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhieuNhapServiceImpl implements PhieuNhapService {
@Autowired
    PhieuNhapRepository phieuNhapRepository;
@Autowired
    ChiTietPhieuNhapRepo chiTietPhieuNhapRepo;
@Autowired
    VatTuRepository vatTuRepository;
@Autowired
    VatTuService vatTuService;
@Autowired
    ChiTietPhieuNhapService chiTietPhieuNhapService;
    @Override
    public void insert(PhieuNhap phieuNhap) {
        phieuNhapRepository.save(phieuNhap);
    }

    @Override
    public PhieuNhap themmoi(PhieuNhap phieuNhap, List<ChiTietPhieuNhap> chiTietPhieuNhapList) {
        PhieuNhap savedPhieuNhap=phieuNhapRepository.save(phieuNhap);

        for (ChiTietPhieuNhap chiTiet : chiTietPhieuNhapList) {
        int vattu=chiTiet.getVatTu().getId();
       VatTu vatTu=vatTuRepository.findById(vattu).orElse(null);
            System.out.println(vattu);
            chiTiet.setVatTu(vatTu);
            chiTiet.setPhieuNhapId(savedPhieuNhap);
            int soluongt=chiTiet.getSoLuongNhap();
            chiTietPhieuNhapService.insert(chiTiet);
            vatTuService.capnhat(vattu,soluongt);
        }

        return savedPhieuNhap;
    }
}
