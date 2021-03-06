package com.bigfish.airports.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigfish.airports.data.entity.Country;

/**
 * 
 * @author Lee Newfeld
 *
 */
@RepositoryRestResource(collectionResourceRel="country")
public interface CountryRepository extends PagingAndSortingRepository<Country, String> {

}
