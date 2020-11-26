package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public void save(City city) {
		cityRepository.save(city);
	}

	public List<City> getAll() throws SQLException {
		return cityRepository.findAll();

	}

	public City get(Long id) {
		return cityRepository.findById(id).get();
	}

	public City getByName(String name) {
		return cityRepository.findByName(name);
	}

	public void delete(String name) {
		cityRepository.deleteByName(name);
	}
}