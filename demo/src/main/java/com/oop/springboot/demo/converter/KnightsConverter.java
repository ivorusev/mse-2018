package com.oop.springboot.demo.converter;

import com.oop.springboot.demo.dto.Knight;
import com.oop.springboot.demo.persistence.KnightEntity;

public class KnightsConverter {

	public static Knight getKnight(KnightEntity entity) {
		Knight knight = new Knight();
		knight.setAge(entity.getAge());
		knight.setName(entity.getName());
		knight.setWeapon(entity.getWeapon());
		return knight;
	}

	public static KnightEntity getKnight(Knight knight) {
		KnightEntity entity = new KnightEntity();
		entity.setAge(knight.getAge());
		entity.setName(knight.getName());
		entity.setWeapon(knight.getWeapon());
		return entity;
	}

}
