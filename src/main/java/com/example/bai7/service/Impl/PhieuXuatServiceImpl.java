package com.example.bai7.service.Impl;

import com.example.bai7.model.*;
import com.example.bai7.repository.PhieuXuatRepository;
import com.example.bai7.repository.VatTuRepository;
import com.example.bai7.service.ChiTietPhieuXuatService;
import com.example.bai7.service.PhieuXuatService;
import com.example.bai7.service.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuXuatServiceImpl implements PhieuXuatService {
@Autowired
    PhieuXuatRepository phieuXuatRepository;
@Autowired
    VatTuRepository vatTuRepository;
@Autowired
    VatTuService vatTuService;
@Autowired
    ChiTietPhieuXuatService chiTietPhieuXuatService;
    @Override
    public void insert(PhieuXuat phieuXuat) {
        phieuXuatRepository.save(phieuXuat);
    }

    @Override
    public PhieuXuat themmoi(PhieuXuat phieuXuat, List<ChiTietPhieuXuat> CTphieuxuatlist) {
        PhieuXuat sevdPhieuXuat=phieuXuatRepository.save(phieuXuat);
        for(ChiTietPhieuXuat chitiet: CTphieuxuatlist){
            int vattu=chitiet.getVatTu().getId();
            VatTu vatTu=vatTuRepository.findById(vattu).orElse(null);
            System.out.println(vattu);
            chitiet.setVatTu(vatTu);
            chitiet.setPhieuXuatId(sevdPhieuXuat);
            int soluongt=chitiet.getSoLuongXuat();
            chiTietPhieuXuatService.insert(chitiet);
            vatTuService.capnhat(vattu,-soluongt);
        }
        return sevdPhieuXuat;
    }


}
