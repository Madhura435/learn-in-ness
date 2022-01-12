package com.madhura.jparelationships.one_one_entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
many-many relationship unidirectional
*/
@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
public class Employee {
	@Id	
	private long id;
	@Column(name="name")
	private String name;
	@ManyToMany(targetEntity=Role.class,cascade=CascadeType.ALL)
	private List<Role> roles;
	//targetEntity is the entity class that is the target of the association (relationship)
}
