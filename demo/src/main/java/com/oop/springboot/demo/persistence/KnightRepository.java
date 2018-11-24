package com.oop.springboot.demo.persistence;

import org.springframework.data.repository.CrudRepository;

public interface KnightRepository extends CrudRepository<KnightEntity, Long> {

}
