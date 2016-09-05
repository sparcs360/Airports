package com.bigfish.airports.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigfish.airports.data.entity.Airport;

/**
 * 
 * @author Lee Newfeld
 *
 */
@RepositoryRestResource(collectionResourceRel="airport")
public interface AirportRepository extends PagingAndSortingRepository<Airport, String> {

}
