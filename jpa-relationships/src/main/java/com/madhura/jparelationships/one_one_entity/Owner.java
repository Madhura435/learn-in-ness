package com.madhura.jparelationships.one_one_entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
//one-one-birectional
@Entity
@Table(name="owners")
@Data
@NoArgsConstructor
public class Owner {
//@GeneratedValue(strategy=GenerationType.AUTO)
@Id
public long id;
@Column(name="name")
public String name;
@OneToOne(cascade=CascadeType.ALL)
@JsonManagedReference
public Car car;

//@JsonManagedReference is used to store owner_id forien key in cars table 
}
