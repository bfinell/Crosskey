package com.crosskey.mortgageCalculator;

public class Mortgage {
    private String costumer;
    private double total_loan;
    private double interest_rate;
    private int years;
    private double monthly_pay;
    private double interestToPay;

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public double getTotal_loan() {
        return total_loan;
    }

    public void setTotal_loan(double total_loan) {
        this.total_loan = total_loan;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getMonthly_pay() {
        return monthly_pay;
    }

    public void setMonthly_pay(double monthly_pay) {
        this.monthly_pay = monthly_pay;
    }

    public double getInterestToPay() {
        return interestToPay;
    }

    public void setInterestToPay(double interestToPay) {
        this.interestToPay = interestToPay;
    }
}
