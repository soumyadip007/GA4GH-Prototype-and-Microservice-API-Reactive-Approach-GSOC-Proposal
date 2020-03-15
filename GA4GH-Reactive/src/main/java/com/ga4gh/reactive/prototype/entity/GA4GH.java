package com.ga4gh.reactive.prototype.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter	
@Setter	
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class GA4GH {

	@Id
	private int id;		

	private String sequencename;
	
	private String genbankaccn;	
	
	private String refseqaccn;		
	
	private String sequencelength;
	
}
