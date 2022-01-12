package com.reddix.integration.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
private static final long serialVersionID=1L;
private String street;
private String city;
private String state;
}
