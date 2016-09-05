package com.bigfish.airports.data.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	private String code;
	private String name;
	private String continent;
	private String wikipediaLink;
	private String keywords;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Airport.class, mappedBy="country")
	private Set<Airport> airports;
	
	protected Country() {
	}
	
	public Country(String code, String name, String continent, String wikipediaLink, String keywords) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.wikipediaLink = wikipediaLink;
		this.keywords = keywords;
		
		this.airports = new HashSet<Airport>();
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public String getWikipediaLink() {
		return wikipediaLink;
	}

	public String getKeywords() {
		return keywords;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", wikipediaLink="
				+ wikipediaLink + ", keywords=" + keywords + "]";
	}

	public Set<Airport> getAirports() {
		return airports;
	}
}
