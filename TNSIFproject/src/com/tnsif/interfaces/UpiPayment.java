package com.tnsif.interfaces;

class UpiPayment implements Payment{
    private String upiId;

    // Constructor
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to UPI ID: " + upiId);
    }
}   