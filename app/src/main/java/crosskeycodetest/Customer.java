
package crosskeycodetest;

public class Customer {
    public String name;
    public int years;
    public double loan;
    public double interest;
    public double mortgage;

    public Customer(String name, int years, double loan, double interest) {
        this.name = name;
        this.years = years;
        this.loan = loan;
        this.interest = interest;
        calculateMortgage();
    }

    public Customer() {
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setLoanAmount(double loanAmount) {
        loan = loanAmount;
    }

    public double getLoanAmount() {
        return loan;
    }

    public void setInterestRate(double interestRate) {
        interest = interestRate;
    }

    public double getInterestRate() {
        return interest;
    }

    public String toString() {
        return name + " " + "wants to borrow " + loan + "€ for a period of " + years + " years and pay " + String.format("%.2f", mortgage) + "€ each month";
    }

    public double pow(double base, int exponent) {
        double power = base;
        if (exponent == 0)
            return 1;
        for (int i = 1; i < exponent; i++) {
            power *= base;
        }
        return power;
    }

    public void calculateMortgage() {   //E = U[b(1 + b)^p]/[(1 + b)^p - 1]
        int periods = years * 12;
        double monthlyRate = (interest / 100) / 12;
        mortgage = loan * (monthlyRate * pow(1 + monthlyRate, periods)) / (pow(1 + monthlyRate, periods) - 1);
    }
}
