package com.madhura.valiframe.second;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotEmpty
@Size(min=2,max=8,message="user name should have min 2 char and max 8 char")
private String name;
@NotEmpty
private String email;
@NotEmpty
@Size(min=8,message="password should have min 2 char and max 8 char")
private String password;
@NotNull(message="The date of birth is required")
@BirthDate(message="The birth date must be greater or equal than 18")
@Past(message="The date of birth must be in the past")
private Date birthDate;
}

