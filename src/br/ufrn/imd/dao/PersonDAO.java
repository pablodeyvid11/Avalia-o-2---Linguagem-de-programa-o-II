package br.ufrn.imd.dao;

import br.ufrn.imd.model.Person;

import java.util.ArrayList;

public class PersonDAO {
    private ArrayList<Person> people;

    public PersonDAO() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public void remove(Person person) {
        this.people.remove(person);
    }

    public void listPeople() {
        for (Person person : this.people) {
            System.out.println(person.getName());
        }
    }

    public Double calcTotalTax() {
        Double totalTax = 0.0;
        for (Person person : this.people) {
            totalTax += person.calculateTax();
        }
        return totalTax;
    }

    public void printTotalTax() {
        System.out.println("Total tax: " + this.calcTotalTax());

        Person highestTax = this.people.get(0);
        for (Person p : people) {
            if (highestTax.calculateTax() < p.calculateTax()) {
                highestTax = p;
            }
        }

        System.out.println("Highest tax: " + highestTax.getName());

        Person highestLifeInsurance = this.people.get(0);
        for (Person p : people) {
            if (highestLifeInsurance.getInsurance().getValue() < p.getInsurance().getValue()) {
                highestLifeInsurance = p;
            }
        }

        System.out.println("Highest life insurance: " + highestLifeInsurance.getName());
    }
}
