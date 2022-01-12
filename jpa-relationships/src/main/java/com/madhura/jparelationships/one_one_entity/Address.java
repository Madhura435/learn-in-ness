package com.madhura.jparelationships.one_one_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="address")
@Data
@NoArgsConstructor
public class Address {
@Id	
private long id;
@Column(name="HouseNo")
private String HouseNo;
@Column(name="city")
private String city;

}
