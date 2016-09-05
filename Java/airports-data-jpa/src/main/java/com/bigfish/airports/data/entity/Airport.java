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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iso_country")
	private Country country;
	
	protected Airport() {
	}
}
