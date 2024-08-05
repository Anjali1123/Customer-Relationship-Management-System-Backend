package com.CustemerRelationshipManagement.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustemerRelationshipManagement.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sf;
	private Object customer;

	public CustomerDao(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public String insertCustomer(Customer customer) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		return "Customer inser Successfully";
	}

	public List<Customer> getCustomerList() {
		Session session = sf.openSession();
		return session.createQuery("from Customer").list();
	}

	public Customer getcustomerById(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;

	}

	public String updateCustomer(Customer customer) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "customer updated successfully";

	}

	public String deleteCustomerById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();
		// TODO Auto-generated method stub
		return "customer deleted successfully";
	}

	public String insertMultipleCustomer(List<Customer> customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Customer customers : customer) {
			session.save(customers);
		}

		tr.commit();
		session.close();
		return "Customer are inserted successfully";

	}

	public List<Customer>getCustomerByFirstName(String firstName){
		
		Session session=sf.openSession();
		//@SuppressWarnings("deprecation")
		Query <Customer> customers= session.createQuery("from Customer c where c.firstName =:firstName",Customer.class);
        customers.setParameter("firstName", firstName);
		List<Customer>list = customers.list();
		return list;
		
		
		
	}
	public List<Customer>getCustomerByLessThanAge(int age){
		Session session = sf.openSession();
		Query<Customer>customer = session.createQuery("from Customer c where c.age<:age",Customer.class);
		customer.setParameter("age", age);
		List<Customer>list = customer.list();
		return list;
	}
	public List<Customer>getCustomerByAge(int age){
		Session session = sf.openSession();
		Query<Customer> customer=session.createQuery("from Customer c where c.age=:age",Customer.class);
		customer.setParameter("age",age);
		List<Customer>list = customer.list();
		return list;
	}
	
	public List<Customer>getCustomerByLastName(String lastName){
		Session session = sf.openSession();
		Query<Customer>customer=session.createQuery("from Customer c wher c.lastName=:lastName",Customer.class);
		customer.setParameter("lastName", lastName);
		List<Customer>list=customer.list();
		return list;
	}
	
	public List<Customer> getCustomerByEmail(String email){
		Session session = sf.openSession();
		Query<Customer> customer=session.createQuery("from customer c where c.email=:email",Customer.class);
		customer.setParameter("emai", email);
		List<Customer> list=customer.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByMobileNumber(String mobileNumber){
		Session session =sf.openSession();
		Query<Customer> customer=session.createQuery("from customer c where c.mobileNumber=:mobileNumber",Customer.class);
		customer.setParameter("mobileNumber", mobileNumber);
		List<Customer> list=customer.list();
		return list;
		
	}
	
	public String updateFirstName(int id,String firstName) {
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		return "updated successfully";
		
		
	}
	
	public String updateLastName(int id,String lastName) {
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setLastName(lastName);
		tr.commit();
		session.close();
		return "Updated Successfully";
	}
	public String updateEmailId(int id,String emailId) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setEmail(emailId);
		tr.commit();
		session.close();
		return  "Updated Successfully";
		
	}
	public String updateMobileNumber(int id,String mobileNumber) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setMobileNumber(mobileNumber);
		tr.commit();
		session.close();
		return  "Updated Successfully";
}
	
	public String updateAge(int id,int age) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setAge(age);
		tr.commit();
		session.close();
		return  "Updated Successfully";
	}
	
	public List<String> getCustomerFirstNames(){
		Session session = sf.openSession();
		return session.createQuery("select c.firstName from Customer c").list();
	}
	public List<String> getCustomerLastNames(){
		Session session = sf.openSession();
		return session.createQuery("select c.lastName from Customer c").list();
}
}