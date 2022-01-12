package com.madhura.jparelationships.one_one_entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;
//one-one-birectional
@Entity
@Table(name="cars")
@Data
@NoArgsConstructor
public class Car {
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public long id;
	@Column(name="model")
	public String model;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="owner_id",referencedColumnName="id")
	@JsonBackReference
	public Owner owner;
	/*referencedColumnName="id" owner reference id
	 @JsonBackReference use while save car
	"status": 415,
    "error": "Unsupported Media Type",
    [
    {
        "id": 4,
        "name": "reddi",
        "car": {
            "id": 4,
            "model": "audi",
            "owner": {
                "id": 4,
                "name": "reddi",
                "car": {
                    "id": 4,
                    "model": "audi",
                    "owner": {
                        "id": 4,
                        "name": "reddi",
                        "car": {
                            "id": 4,
                            "model": "audi",
                            "owner": {
                                "id": 4,
                                
    */
}
