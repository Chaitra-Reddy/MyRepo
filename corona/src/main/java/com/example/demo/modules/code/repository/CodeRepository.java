package com.example.demo.modules.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modules.code.entity.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code, String>
{

}
