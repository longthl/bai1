package com.example.bai7.controller;

import com.example.bai7.model.ChiTietPhieuXuat;
import com.example.bai7.service.ChiTietPhieuXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chi-tiet-phieu-xuat")
public class ChiTietPhieuXuatController {
    @Autowired
    ChiTietPhieuXuatService chiTietPhieuXuatService;
    @PostMapping("/add")
    public String add(@RequestBody ChiTietPhieuXuat chiTietPhieuXuat){
        chiTietPhieuXuatService.insert(chiTietPhieuXuat);
        return "Thành công";
    }
}
