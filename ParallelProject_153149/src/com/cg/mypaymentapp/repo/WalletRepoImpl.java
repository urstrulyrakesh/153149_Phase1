package com.cg.mypaymentapp.repo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Wallet;

public class WalletRepoImpl implements WalletRepo{


	private Map<String, Customer> data = new HashMap<String, Customer>(); 
	/*public WalletRepoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}
*/
	

	@Override
	public boolean save(Customer customer) {
		data.put(customer.getMobileNo(),customer);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		Customer cu1 = data.get(mobileNo);
		return cu1;
	}

/*	@Override
	public Customer createAccount(String name, String mobileNo,
			BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer cu = new Customer (name,mobileNo,new Wallet (amount));
		data.put(mobileNo, cu);
		return cu;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer cu2 = data.get(mobileNo);
		Wallet w = cu2.getWallet();
		BigDecimal bal = w.getBalance(); 
		BigDecimal upbal = bal.add(amount);
		
		cu2.setWallet(new Wallet(upbal));
		return cu2;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer cu3 = data.get(mobileNo);
		Wallet w1 = cu3.getWallet();
		BigDecimal bal = w1.getBalance(); 
		BigDecimal upbal1 = bal.subtract(amount);
		
		cu3.setWallet(new Wallet(upbal1));
		return cu3;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			BigDecimal amount) {
		Customer cust1 = data.get(sourceMobileNo);
		Customer cust2 = data.get(targetMobileNo);
		Wallet wal1 = cust1.getWallet();
		Wallet wal2 = cust2.getWallet();
		BigDecimal bal1 = wal1.getBalance(); 
		BigDecimal bal2 = wal2.getBalance(); 
		BigDecimal upbal2 = bal1.subtract(bal2);
		BigDecimal upbal3 = bal2.add(bal1);
		cust1.setWallet(new Wallet(upbal2));
		cust2.setWallet(new Wallet(upbal3));
		return cust1;
	}*/
}
