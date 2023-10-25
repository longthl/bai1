package com.example.bai7.controller;

import com.example.bai7.model.PhieuXuat;
import com.example.bai7.model.phieuxuatkemchitiet;
import com.example.bai7.service.PhieuXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phieu-xuat")
public class PhieuXuatController {
    @Autowired
    PhieuXuatService phieuXuatService;
    @PostMapping("/add")
    public String add(@RequestBody PhieuXuat phieuXuat){
        phieuXuatService.insert(phieuXuat);
        return "thành công";
    }
    @PostMapping("/themPhieuNhap")
    public String themPhieuNha(@RequestBody phieuxuatkemchitiet phieuxuatkemchitiet) {
        phieuXuatService.themmoi(phieuxuatkemchitiet.getPhieuXuat(),phieuxuatkemchitiet.getChiTietPhieuXuats());
        return "Thanh cong";
    }
}
