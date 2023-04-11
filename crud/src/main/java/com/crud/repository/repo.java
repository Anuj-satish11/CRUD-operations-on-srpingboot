package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.entity;

public interface repo extends JpaRepository<entity, Integer> {

}
