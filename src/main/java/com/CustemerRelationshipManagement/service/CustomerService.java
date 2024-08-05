package com.CustemerRelationshipManagement.service;

import java.util.List;

import com.CustemerRelationshipManagement.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	
	
	List<Customer>getCustomerList();
	
	Customer getCustomerById(int id);
	
	String  updateCustomer(Customer customer);


	String deleteCustomerById(int id);
	
	String insertMultipleCustomer(List<Customer>list);

	List<Customer>getCustomerByFirstName(String firstName);

	List<Customer>getCustomerByLessThanAge(int age);

	List<Customer>getCustomerByAge(int age);

	List<Customer>getCustomerByLastName(String lastName);
	
	List<Customer>getCustomerByEmail(String email);
	
	List<Customer>getCustomerByMobileNumber(String mobileNumber);

	String updateFirstName(int id,String firstName);
	
    String updateLastName(int id ,String lastName);
	
    String updateEmailId(int id ,String emailId);
    
    String updateMobileNumber(int id ,String mobileNumber);

    String updateAge(int id ,int age);
    
    List<String> getCustomerFirstName();
    
    List<String> getCustomerLastName();
}

