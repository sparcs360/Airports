package com.bigfish.airports.data.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Airport {

	@Id
	private String ident;
	
	private String type;
	private String name;
	private double latitude_deg;
	private double longitude_deg;
	private int elevation_ft;
	private String continent;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iso_country")
	private Country country;

	private String iso_region;
	private String municipality;
	private boolean scheduled_service;
	private String gps_code;
	private String iata_code;
	private String local_code;
	private String home_link;
	private String wikipedia_link;
	private String keywords;
	
	protected Airport() {
	}

	public String getIdent() {
		return ident;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude_deg;
	}

	public double getLongitude() {
		return longitude_deg;
	}

	public int getElevation() {
		return elevation_ft;
	}

	public String getContinent() {
		return continent;
	}

	public Country getCountry() {
		return country;
	}

	public String getRegion() {
		return iso_region;
	}

	public String getMunicipality() {
		return municipality;
	}

	public boolean isServiceScheduled() {
		return scheduled_service;
	}

	public String getGpsCode() {
		return gps_code;
	}

	public String getIataCode() {
		return iata_code;
	}

	public String getLocalCode() {
		return local_code;
	}

	public String getHomeLink() {
		return home_link;
	}

	public String getWikipediaLink() {
		return wikipedia_link;
	}

	public String getKeywords() {
		return keywords;
	}	
}
