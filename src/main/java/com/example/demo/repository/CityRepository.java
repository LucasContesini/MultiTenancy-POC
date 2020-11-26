package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

	Optional<City> findById(Long id);

	City findByName(String name);

	void deleteByName(String name);
}