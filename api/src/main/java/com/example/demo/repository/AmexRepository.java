package com.example.demo.repository;

import com.example.demo.entity.Amex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmexRepository extends JpaRepository<Amex,String> {
}
