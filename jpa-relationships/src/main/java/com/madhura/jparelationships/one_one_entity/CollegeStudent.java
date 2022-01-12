package com.madhura.jparelationships.one_one_entity;
/*
many-many relationship bidirectional
{
"id":1,
"name":"madhura",
"courses":
[
{
"id":1,
"name":"java"
},
{
"id":1,
"name":"c++"
}
]
}
*/
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "collegestudent")
public class CollegeStudent {

	@Id
	private long id;
	@Column(name = "name")
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	@JsonIgnoreProperties("students")
	private List<Course> courses = new ArrayList<>();
/*
 @JsonIgnoreProperties("students") means it ignores properties of 
 students in List<Course> courses
 */
	public void addCourse(Course course) {
		courses.add(course);
	}
}

