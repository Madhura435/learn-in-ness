package com.spring.jpa.join.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
one-many relationship bidirectional
*/
@Entity
@Table(name="library")
@Data
@NoArgsConstructor
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long libraryid;
	@Column(name="name")
	private String name;
	@OneToMany(mappedBy="library",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("library")
	private List<Book> books;
}

/*
{
 "id":1,
 "name":"svu",
 "books":
 [
 {"id":1,
 "name":"KalamBiograpy"},
 {"id":2,
 "name":"cvBiograpy"}
 ]
 }
 */


