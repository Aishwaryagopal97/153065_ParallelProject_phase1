package com.capgemini.core.pw.model;
import java.util.HashMap;
import java.util.Map;
import com.capgemini.core.pw.beans.Customer;
import com.capgemini.core.pw.exception.InvalidInputException;
public class WalletRepoImpl implements WalletRepo {
	private Map<String, Customer> data=new HashMap<>(); 
	
	
	public WalletRepoImpl(Map<String, Customer> data) 
	{
		super();
		this.data = data;
	}
	public WalletRepoImpl() {
		super();
	}
	Customer customer=new Customer();
	@Override
	public boolean save(Customer customer) throws InvalidInputException
	{
		if(customer==null)
			throw new InvalidInputException("");
		data.put(customer.getMobileNo(),customer);
		return true;
	}
	
	@Override
	public Customer findOne(String mobileNo)
	{
		
		Customer customer = null;
		if(data.containsKey(mobileNo))
		{
			customer = data.get(mobileNo);
		}
		
		return customer;
	}

	

	
}
