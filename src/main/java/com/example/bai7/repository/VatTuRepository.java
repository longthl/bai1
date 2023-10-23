package com.example.bai7.repository;

import com.example.bai7.model.VatTu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VatTuRepository extends JpaRepository<VatTu,Integer> {
    @Query("select vt from VatTu vt where vt.SoLuongTon = 0")
    List<VatTu> findby();
}
