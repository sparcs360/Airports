package com.bigfish.airports.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.bigfish.airports.data.entity.Country;

/**
 * 
 * @author Lee Newfeld
 *
 */
public interface CountryRepository extends CrudRepository<Country, String> {

}
