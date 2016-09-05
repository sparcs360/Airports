package com.bigfish.airports.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bigfish.airports.data.entity.Country;
import com.bigfish.airports.data.repository.CountryRepository;

/**
 * 
 * @author Lee Newfeld
 *
 */
public class CountryRepositoryTest extends BaseTest {

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(CountryRepositoryTest.class);

	@Autowired
	CountryRepository repository;

	/**
	 * 
	 */
	@Test
	public void findAll() {

		Stream<Country> streamOfCountry = StreamSupport.stream(repository.findAll().spliterator(), false);
		assertEquals(247, streamOfCountry.count());
	}

	/**
	 * 
	 */
	@Test
	public void allAirportsInGB() {

		Country gb = repository.findOne("GB");
		assertNotNull(gb);
		assertEquals("GB", gb.getCode());
		assertEquals("United Kingdom", gb.getName());
		assertEquals("EU", gb.getContinent());
		assertEquals("http://en.wikipedia.org/wiki/United_Kingdom", gb.getWikipediaLink());
		assertEquals("Great Britain", gb.getKeywords());
		assertEquals(683, gb.getAirports().size());
	}
}
