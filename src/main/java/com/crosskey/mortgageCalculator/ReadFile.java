package com.crosskey.mortgageCalculator;

import java.io. *;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadFile {

    public void read() throws Exception{
        CalculateMortgage calculateMortgage = new CalculateMortgage();
        Scanner sc = new Scanner(new File("src/main/resources/prospects.txt"));
        sc.useDelimiter("\\n");
        sc.next();
        String[] line;
        String temp;
        while (sc.hasNext()){
            Mortgage mortgage = new Mortgage();
            temp = sc.next();

            if (temp.startsWith("\"")) {
                temp = temp.replace("\"","");
                temp = temp.replaceFirst(","," ");
            }
            line = temp.split(",");
            //[Ljava.lang.String;@9807454
            //Juha,1000,5,2

            if (!Objects.equals(line[0], "Customer")){
                mortgage.setCostumer(line[0]);
                mortgage.setTotal_loan(Double.parseDouble(line[1]));
                mortgage.setInterest_rate(Double.parseDouble(line[2]));
                mortgage.setYears(parseInt(line[3]));
                mortgage.setMonthly_pay(calculateMortgage.calculate(mortgage.getTotal_loan(), mortgage.getInterest_rate(), mortgage.getYears()));
                System.out.println(mortgage.getCostumer() + " : "+mortgage.getMonthly_pay());
                System.out.println("-----");

            }

        }
        sc.close();

    }
}
