package com.example.bai7.controller;

import com.example.bai7.model.ChiTietPhieuNhap;
import com.example.bai7.service.ChiTietPhieuNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chi-tiet-phieu-nhap")
public class ChiTietPhieuNhapController {
    @Autowired
    ChiTietPhieuNhapService chiTietPhieuNhapService;
    @PostMapping("/add")
    public String add(@RequestBody ChiTietPhieuNhap chiTietPhieuNhap){
        chiTietPhieuNhapService.insert(chiTietPhieuNhap);
        return "Thành công";
    }
}
