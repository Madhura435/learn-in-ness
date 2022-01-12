package com.filter.Integration3.all;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String street;
private String city;
private String state;
}
