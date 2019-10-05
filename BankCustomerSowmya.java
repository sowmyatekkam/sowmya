package com.uiexample.BankProjectwithWebService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankCustomerSowmya {
    @Id   
	public String acctnum;
    @Column
	public String name;
    @Column
	public double balance;
}
