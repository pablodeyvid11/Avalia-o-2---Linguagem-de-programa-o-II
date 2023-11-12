package br.ufrn.imd.model;

import java.util.Objects;

public class Person implements ITaxable {
    private String name;
    private Double salary;
    private CheckingAccount account;
    private LifeInsurance insurance;

    public Person(String name, Double salary, CheckingAccount account, LifeInsurance insurance) {
        this.name = name;
        this.salary = salary;
        this.account = account;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public CheckingAccount getAccount() {
        return account;
    }

    public void setAccount(CheckingAccount account) {
        this.account = account;
    }

    public LifeInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(LifeInsurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public Double calculateTax() {
        Double salaryTax = getSalary() * 0.11;

        return salaryTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
