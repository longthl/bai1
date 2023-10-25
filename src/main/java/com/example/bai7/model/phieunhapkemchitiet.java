package com.example.bai7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class phieunhapkemchitiet {
 private PhieuNhap PhieuNhap;
 private List<ChiTietPhieuNhap> ChiTietPhieuNhap;
}
