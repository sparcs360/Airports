package com.bigfish.airports.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigfish.airports.data.entity.Country;
import com.bigfish.airports.data.repository.CountryRepository;

@Controller
//@RequestMapping("/country")
public class CountryController {

	private static final Logger log = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryRepository repo;
	
	//@RequestMapping(name="/country/{code}", method=RequestMethod.GET)
	@RequestMapping("/country/{code}")
	public Country getOne(
		@PathVariable("code") String code
	) {
		
		log.info("code={}", code);
		Country country = repo.findOne(code);
		if( country == null ) {
			return null;
		}
		log.info(country.toString());
		return country;		
	}
}
