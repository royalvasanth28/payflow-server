package com.payflow.payflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payflow.payflow.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
