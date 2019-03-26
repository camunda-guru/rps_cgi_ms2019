package com.cgi.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cgi.banking.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	@Query("select  c from Customer c where c.mobileNo=:no")
	public Customer findByMobileNo(@Param("no") long no);
	
	
}
