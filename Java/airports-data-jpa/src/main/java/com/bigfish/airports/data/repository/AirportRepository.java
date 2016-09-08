package com.bigfish.airports.data.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bigfish.airports.data.entity.Airport;

/**
 * 
 * @author Lee Newfeld
 *
 */
@RepositoryRestResource(collectionResourceRel="airport")
public interface AirportRepository extends PagingAndSortingRepository<Airport, String> {

    @Query(
    	"SELECT  a " +
    	"FROM    Airport a " +
    	"WHERE   (UPPER(a.ident) = UPPER(:q) OR UPPER(a.name) LIKE '%' + UPPER(:q) + '%')"
    )
    public Set<Airport> q(@Param("s") String query);
}
