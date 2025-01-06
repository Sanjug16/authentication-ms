package com.demo.authentication_service.Dao;

import com.demo.authentication_service.Dao.Entity.UserCredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsDao extends JpaRepository<UserCredentialsEntity, Integer>{
    public Optional<UserCredentialsEntity> findByName(String name);
}
