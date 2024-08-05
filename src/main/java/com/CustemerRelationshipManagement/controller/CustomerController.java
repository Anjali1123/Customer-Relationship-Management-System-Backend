package com.CustemerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustemerRelationshipManagement.entity.Customer;
import com.CustemerRelationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService=customerService;
	}
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		String msg=customerService.insertCustomer(customer);
		
		return msg;
		
	}
	@GetMapping("/get")
	public List<Customer> getCustomerList(){
		List<Customer> list=customerService.getCustomerList();
		return list;
		
	}
	@GetMapping("/{id}")
	public Customer getcustomerById(@PathVariable int id) {
		Customer msg=customerService.getCustomerById(id);
		return msg;
		
	}
	
	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
		
	}
	
	@PostMapping("/inserts")
	public String insertMultipleCustomer(@RequestBody List <Customer> customer) {
		return customerService.insertMultipleCustomer(customer);
		
	}
	@GetMapping("/byname/{firstName}")
	public List<Customer>getCustomerByFirstName(@PathVariable String firstName ){
		return customerService.getCustomerByFirstName(firstName);
		
	}
	@GetMapping("/bylessthanage/{age}")
	public List<Customer>getCustomerByLessThanAge(@PathVariable int age){
		return customerService.getCustomerByLessThanAge(age);
		
	}
	@GetMapping("/byage/{age}")
	public List<Customer>getCustomerByAge(@PathVariable int age){
		return customerService.getCustomerByAge(age);
	}
	@GetMapping("/bylastname/{lastName}")
	public List<Customer>getCustomerByLastName(@PathVariable String lastName){
		return customerService.getCustomerByLastName(lastName);
	}
	@GetMapping("/byemail/{email}")
	public List<Customer>getCustomerByEmail(@PathVariable String email){
		return customerService.getCustomerByEmail(email);
	}
	@GetMapping("/bymobileno/{mobileNumber}")
	public List<Customer>getCustomerByMobileNumber(@PathVariable String mobileNumber){
		return customerService.getCustomerByMobileNumber(mobileNumber);
	}
	@PutMapping("/fname/{id}")
	public String updateFirstName(@PathVariable int id,@RequestBody Map<String,String>request) {
		String firstName=request.get("firstName");
		
		return customerService.updateFirstName(id, firstName);
	}
	@PutMapping("/lname/{id}")
	public String updateLastName(@PathVariable int id,@RequestBody Map<String,String>request) {
		String lastName=request.get("lastName");
		
		return customerService.updateLastName(id, lastName);
		
	}
	@PutMapping("/email/{id}")
	public String updateEmailId(@PathVariable int id,@RequestBody Map<String,String>request) {
		String emailId=request.get("emailId");
		
		return customerService.updateEmailId(id,emailId);
	}
	@PutMapping("/mobilenumber/{id}")
	public String updateMobileNumber(@PathVariable int id,@RequestBody Map<String,String>request) {
		String mobileNumber=request.get("mobileNumber");
		
		return customerService.updateMobileNumber(id,mobileNumber);
}
	@PutMapping("/age/{id}")
	public String updateAge(@PathVariable int id,@RequestBody Map<String,Integer>request) {
		int age=request.get("Age");
		
		return customerService.updateAge(id,age);
}
	@GetMapping("/firstNames")
	public List<String>getFirstnames(){
		return customerService.getCustomerFirstName();
	}
	@GetMapping("/lastNames")
	public List<String>getLastnames(){
		return customerService.getCustomerLastName();
	}
}