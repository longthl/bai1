package com.example.bai7.repository;

import com.example.bai7.model.ChiTietPhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuNhapRepo extends JpaRepository<ChiTietPhieuNhap,Integer> {
}
