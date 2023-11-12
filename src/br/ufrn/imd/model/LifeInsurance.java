package br.ufrn.imd.model;

public class LifeInsurance implements ITaxable {
    private Integer number;
    private String beneficiary;
    private double value;
    private double tax;

    public LifeInsurance(Integer number, String beneficiary, double value) {
        this.number = number;
        this.beneficiary = beneficiary;
        this.value = value;
        this.tax = 31.5;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public Double calculateTax() {
        return this.tax;
    }
}
