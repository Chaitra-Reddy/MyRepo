package com.example.demo.modules.zone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modules.zone.entity.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>
{

}
