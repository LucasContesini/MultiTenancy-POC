package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DataSourceConfig;

@Repository
public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, Long> {
	DataSourceConfig findByName(String name);
}
