package com.example.bai7.controller;

import com.example.bai7.model.PhieuNhap;
import com.example.bai7.service.PhieuNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phieu-nhap")
public class PhieuNhapController {
@Autowired
    PhieuNhapService phieuNhapService;
@PostMapping("/add")
    public String add(@RequestBody PhieuNhap phieuNhap){
    phieuNhapService.insert(phieuNhap);
    return "Thành công";
}
}
