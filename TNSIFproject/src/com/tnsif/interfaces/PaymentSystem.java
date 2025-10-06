package com.tnsif.interfaces;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment type1 = new CreditcardPayment("1234-4321-1234");
		Payment type2 = new UpiPayment("12345yid");
		 type1.pay(2500.50);
	     type1.refund(500.00);

	     System.out.println("---------------------------");
	     type2.pay(5500.50);
	     type2.refund(2300.00);


	}

}
