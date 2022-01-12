package com.filter.Integration3.all;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
private static final long serialVersionUID=-7408851479146003262L;
private String id;
private String name;
private String school;
}
