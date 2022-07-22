package com.example.demo.repository;

import com.example.demo.entity.Nara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaraRepository extends JpaRepository<Nara,String> {


}
