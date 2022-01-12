package com.madhura.jparelationships.one_one_entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
one-many relationship bidirectional
*/
@Entity
@Table(name="book")
@Data
@NoArgsConstructor
public class Book {
	@Id
	private long id;
	@Column(name="name")
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="library_id",referencedColumnName="libraryId")
	@JsonIgnoreProperties("books")
	private Library library;
	/*
	 @ManyToOne(cascade=CascadeType.ALL)
	 @JsonIgnoreProperties("books")
	 */
}



