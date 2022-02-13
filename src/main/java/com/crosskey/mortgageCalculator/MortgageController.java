package com.crosskey.mortgageCalculator;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MortgageController {

    CalculateMortgage calculateMortgage = new CalculateMortgage();
    ReadFile readFile = new ReadFile();

    @GetMapping("/mortgagePage")
    public String mortgageForm(Model model) {
        model.addAttribute("mortgagePage", new Mortgage());
        return "mortgagePage";
    }

    @PostMapping("/mortgagePage")
    public String mortgagePost(@ModelAttribute Mortgage mortgage, Model model) {
        model.addAttribute("mortgagePage", mortgage);
        mortgage.setMonthly_pay(calculateMortgage.calculate(mortgage.getTotal_loan(),mortgage.getInterest_rate(),mortgage.getYears()));
        mortgage.setInterestToPay(calculateMortgage.calculateInterestToPay(mortgage.getMonthly_pay(),mortgage.getYears(),mortgage.getTotal_loan()));
        return "mortgagePage";
    }
}

