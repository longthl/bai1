package com.example.bai7.controller;

import com.example.bai7.model.VatTu;
import com.example.bai7.service.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vat-tu")
public class VatTuController {
    @Autowired
    VatTuService vatTuService;
    @PostMapping("/add")
    public String add(@RequestBody VatTu vatTu){
        vatTuService.insert(vatTu);
        return "Thành công";
    }
    @GetMapping("/hienthi")
    public ResponseEntity<List<String>>hienthi(){
        List<String> list=vatTuService.hienthi();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/timkiem")
    public List<VatTu> timkiem(){
        List<VatTu>list=vatTuService.findby();
        return list;
    }
}
