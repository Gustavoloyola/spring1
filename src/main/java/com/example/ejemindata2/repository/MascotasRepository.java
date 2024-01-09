package com.example.ejemindata2.repository;

import com.example.ejemindata2.entity.MascotaEntity;
import com.example.ejemindata2.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends CrudRepository<MascotaEntity,Long> {
}
