package br.ufrn.imd.model;

public class CheckingAccount implements ITaxable {
    private String agency;
    private String number;
    private Double balance;

    public CheckingAccount(String agency, String number, Double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public String getAgency() {
        return agency;
    }

    public String getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }


    public Boolean cashOut(Double value) {
        if (value <= this.balance) {
            this.balance -= value;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public void cashIn(Double value) {
        this.balance += value;
    }

    public void transfer(Double value, CheckingAccount destination) {
        if (this.cashOut(value)) {
            destination.cashIn(value);
        }
    }

    @Override
    public Double calculateTax() {
        return this.balance * 0.0038;
    }
}
