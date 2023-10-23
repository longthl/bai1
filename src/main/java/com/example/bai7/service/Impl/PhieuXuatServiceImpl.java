package com.example.bai7.service.Impl;

import com.example.bai7.model.PhieuXuat;
import com.example.bai7.repository.PhieuXuatRepository;
import com.example.bai7.service.PhieuXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuXuatServiceImpl implements PhieuXuatService {
@Autowired
    PhieuXuatRepository phieuXuatRepository;

    @Override
    public void insert(PhieuXuat phieuXuat) {
        phieuXuatRepository.save(phieuXuat);
    }
}
