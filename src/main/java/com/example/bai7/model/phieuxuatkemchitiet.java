package com.example.bai7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class phieuxuatkemchitiet {
private PhieuXuat phieuXuat;
private List<ChiTietPhieuXuat>chiTietPhieuXuats;
}
