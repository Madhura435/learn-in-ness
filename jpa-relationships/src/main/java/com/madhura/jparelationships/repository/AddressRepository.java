package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhura.jparelationships.one_one_entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
