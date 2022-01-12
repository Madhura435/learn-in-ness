package com.madhura.jparelationships.one_one_entity;
/*
one-many relationship unidirectional
*/
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="college")
@Data
@NoArgsConstructor
public class College {
	@Id
	public long id;
	@Column(name="name")
	public String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="college_id",referencedColumnName="id")
	public List<Student> students;
	
}
/*
 {
 "id":1,
 "name":"Sree rama",
 "students":
 [
 {
 "id":1,
 "name":"madhura"
 },
 {
 "id":2,
 "name":"reddi"
 }
 ]
 }
 
*/