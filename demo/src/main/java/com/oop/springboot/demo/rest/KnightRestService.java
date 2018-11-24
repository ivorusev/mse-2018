package com.oop.springboot.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oop.springboot.demo.converter.KnightsConverter;
import com.oop.springboot.demo.dto.Knight;
import com.oop.springboot.demo.persistence.KnightEntity;
import com.oop.springboot.demo.persistence.KnightRepository;

@RestController
public class KnightRestService {

	@Autowired
	private KnightRepository repository;

	@RequestMapping(path = "/get-knights", method = RequestMethod.GET)
	public List<Knight> getKnights() {
		List<KnightEntity> knights = new ArrayList<>();
		repository.findAll().forEach(knights::add);
		return knights.stream().map(KnightsConverter::getKnight).collect(Collectors.toList());
	}

	@RequestMapping(path = "/save-knight", method = RequestMethod.POST, consumes="application/json")
	public void saveKnight(@RequestBody Knight knight) {
		repository.save(KnightsConverter.getKnight(knight));
	}

}
