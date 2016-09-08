package com.bigfish.airports.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bigfish.airports.data.entity.Airport;
import com.bigfish.airports.data.repository.AirportRepository;

/**
 * 
 * @author Lee Newfeld
 *
 */
public class AirportRepositoryTest extends BaseTest {

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(AirportRepositoryTest.class);

	@Autowired
	AirportRepository repository;

	/**
	 * 
	 */
	@Test
	public void shouldFindAllAirportsInLeeds() {

		Set<Airport> results = repository.q("leeds");
		assertEquals(5, results.size());
		assertTrue(results.stream().anyMatch(a -> a.getName().equals("Leeds Bradford Airport")));
	}
}
