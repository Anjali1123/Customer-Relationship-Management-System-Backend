package com.CustemerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustemerRelationshipManagement.dao.CustomerDao;
import com.CustemerRelationshipManagement.entity.Customer;
import com.CustemerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
     
	
	@Autowired
	CustomerDao customerDao;
	
	public CustomerServiceImpl(CustomerDao customerDao){
		
	}
	
	@Override
	public String insertCustomer(Customer customer) {
		
		String msg=customerDao.insertCustomer(customer);
		return msg;
		
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		List<Customer> list=customerDao.getCustomerList();
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		
		Customer customer=customerDao.getcustomerById(id);
		return customer;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
		
	}

	@Override
	public String deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomer(List<Customer> list) {
		// TODO Auto-generated method stub
		return customerDao.insertMultipleCustomer(list); 
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByLastName(lastName);
	}
     @Override
	public List<Customer> getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByEmail(email);
	}

	@Override
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByMobileNumber(mobileNumber);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		// TODO Auto-generated method stub
		return customerDao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String lastName) {
		// TODO Auto-generated method stub
		return customerDao.updateLastName(id,lastName);
	}

	@Override
	public String updateEmailId(int id, String emailId) {
		// TODO Auto-generated method stub
		return customerDao.updateEmailId(id, emailId);
	}

	@Override
	public String updateMobileNumber(int id, String mobileNumber) {
		// TODO Auto-generated method stub
		return customerDao.updateMobileNumber(id, mobileNumber);
	}

	@Override
	public String updateAge(int id, int age) {
		// TODO Auto-generated method stub
		return customerDao.updateAge(id, age);
	}

	@Override
	public List<String> getCustomerFirstName() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerFirstNames() ;
	}

	@Override
	public List<String> getCustomerLastName() {
		return customerDao.getCustomerLastNames();
		// TODO Auto-generated method stub
	
	}
}
