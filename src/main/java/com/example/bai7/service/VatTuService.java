package com.example.bai7.service;

import com.example.bai7.model.VatTu;

import java.util.List;
import java.util.Optional;

public interface VatTuService {
    void insert(VatTu vatTu);
    List<String> hienthi();
    List<VatTu>findby();
    void capnhat(int id,int SoLuongTon);

}
