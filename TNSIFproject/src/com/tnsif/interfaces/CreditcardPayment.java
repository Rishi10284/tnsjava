package com.tnsif.interfaces;

class CreditcardPayment implements Payment{
	private String cardNumber;

    // Constructor
    public CreditcardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Credit Card: " + cardNumber);
    }
}
