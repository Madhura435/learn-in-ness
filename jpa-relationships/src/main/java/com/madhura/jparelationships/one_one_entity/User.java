package com.madhura.jparelationships.one_one_entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
one-one relationship unidirectional
*/
@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {
@Id	
private long id;
@Column(name="name")
private String name;
@Column(name="mobile")
private long mobile;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="address_id",referencedColumnName="id")
private Address address;
}
/*
{
"id":1,
"name":"priya",
"mobile":78828,
"address":
{
    "id":1,
"houseNo":"1-89-99",
"city":"pileru"
}
}
*/