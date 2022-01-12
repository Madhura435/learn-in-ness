package com.madhura.jparelationships.one_one_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
/*
one-many relationship unidirectional
*/
@Entity
@Table(name="student")
@Data
@NoArgsConstructor
public class Student {
	@Id
	private long id;
	@Column(name="name")
	private String name;
}
