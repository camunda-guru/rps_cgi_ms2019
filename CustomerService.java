package com.cgi.banking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.banking.models.Customer;
import com.cgi.banking.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	//insert
	
	public Customer addCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	//select all
	
	public List<Customer> getAllCustomers()
	{
		return repo.findAll();
	}
	
	//select customer by id
	public Customer getCustomerById(long id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//delete
	public void deleteCustomer(long id)
	{
		repo.deleteById(id);
	}
	
	//update
	public Customer updateCustomer(long id, Customer customer)
	{
		
		Customer obj=getCustomerById(id);
		obj=customer;
		return repo.save(obj);		
		
	}
	
	//find by mobile no
	
	public Customer getCustomerByMobileNo(long mobileNo)
	{
		return repo.findByMobileNo(mobileNo);
	}
	
	

}
