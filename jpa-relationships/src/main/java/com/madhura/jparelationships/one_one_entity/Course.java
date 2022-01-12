package com.madhura.jparelationships.one_one_entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.madhura.jparelationships.one_one_entity.CollegeStudent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
many-many relationship bidirectional
{
"id":1,
"name":"java",
"students":
[
{
"id":1,
"name":"madhura"
},
{
"id":1,
"name":"geetha"
}
]
}
*/
@Entity
@Table(name="Course")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {
	@Id	
	private long id;
	@Column(name="name")
	private String name;
	@ManyToMany(mappedBy="courses",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("courses")
	private List<CollegeStudent> students=new ArrayList<>();
	public void addCollegestudent(CollegeStudent cs)
	{
		students.add(cs);
	}
}
