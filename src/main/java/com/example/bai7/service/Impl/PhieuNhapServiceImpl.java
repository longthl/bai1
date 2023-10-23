package com.example.bai7.service.Impl;

import com.example.bai7.model.PhieuNhap;
import com.example.bai7.model.PhieuXuat;
import com.example.bai7.model.VatTu;
import com.example.bai7.repository.PhieuNhapRepository;
import com.example.bai7.service.PhieuNhapService;
import com.example.bai7.service.PhieuXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuNhapServiceImpl implements PhieuNhapService {
@Autowired
    PhieuNhapRepository phieuNhapRepository;

    @Override
    public void insert(PhieuNhap phieuNhap) {
        phieuNhapRepository.save(phieuNhap);
    }
}
