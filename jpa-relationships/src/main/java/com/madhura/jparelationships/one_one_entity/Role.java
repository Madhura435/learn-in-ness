package com.madhura.jparelationships.one_one_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
many-many relationship unidirectional
*/
@Entity
@Table(name="role")
@Data
@NoArgsConstructor
public class Role {
@Id	
private long id;
@Column(name="name")
private String name;

}
