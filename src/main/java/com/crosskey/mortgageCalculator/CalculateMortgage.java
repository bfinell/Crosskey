package com.crosskey.mortgageCalculator;

public class CalculateMortgage {
    public double calculate(double total_loan,double interest,int years){
        int months = years * 12;
        double interest_rate = (interest/100)/12;
        //using E = U*(b*(1 + b)**p)/((1 + b)**p - 1) formula
        double monthly_pay = total_loan * ((interest_rate) * power((1 + interest_rate), months)) / (power((1 + interest_rate), months) - 1);
        return round(monthly_pay);
    }


    //complexity could be improved since now O(N), where N is the power. but since these calculations are very small it should not matter to much
    public double power(double base, double power){
        double result=1;
        for (power=power; power!=0; power--){
            result = result*base;
        }
        return result;
    }
    //round to 2 decimals since anything smaller won't be off interest to customer
    public double round(double number){
        double mult = number * 100;
        double add = mult + 0.5;
        double result = (int) add;
        return result/100.0;
    }
    public double calculateInterestToPay(double monthly, int years, double loan){
        return round((monthly*years*12)-loan);
    }

}
