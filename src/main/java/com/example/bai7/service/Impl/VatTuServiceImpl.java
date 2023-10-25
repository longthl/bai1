package com.example.bai7.service.Impl;

import com.example.bai7.model.VatTu;
import com.example.bai7.repository.VatTuRepository;
import com.example.bai7.service.VatTuService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VatTuServiceImpl implements VatTuService {
    @Autowired
    VatTuRepository vatTuRepository;

    @Override
    public void insert(VatTu vatTu) {
        vatTuRepository.save(vatTu);

    }

    @Override
    public List<String> hienthi() {
        List<VatTu> danhsachVattu = vatTuRepository.findAll();
        List<String> danhsach = new ArrayList<>();
        for (VatTu vt : danhsachVattu) {
            String dong;
            if (vt.getSoLuongTon() == 0) {
                dong = "Vat tu[" + vt.getTenVatTu() + "]: SLTK: Hết hàng";
            } else {
                dong = "Vat tu[" + vt.getTenVatTu() + "]: SLTK" + vt.getSoLuongTon();
            }

            danhsach.add(dong);
        }
        return danhsach;
    }

    @Override
    public List<VatTu> findby() {
        return vatTuRepository.findby();
    }

    @Override
    public void capnhat(int id, int SoLuongTon) {
        VatTu vatTu = vatTuRepository.findById(id).orElse(null);
        if (vatTu != null) {
            int soluongmoi = SoLuongTon + vatTu.getSoLuongTon();
            vatTu.setSoLuongTon(soluongmoi);
            vatTuRepository.save(vatTu);
        }


    }
}