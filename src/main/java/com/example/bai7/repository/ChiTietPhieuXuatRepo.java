package com.example.bai7.repository;

import com.example.bai7.model.ChiTietPhieuXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuXuatRepo extends JpaRepository<ChiTietPhieuXuat,Integer> {
}
