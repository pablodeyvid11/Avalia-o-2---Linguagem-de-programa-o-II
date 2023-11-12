package br.ufrn.imd.controll;
import br.ufrn.imd.model.Person;
public class IncomeTaxGenerator {

    public static Double calcAllTaxFromPerson(Person person) {
        Double totalTax = 0.0;
        totalTax += person.calculateTax();
        if (person.getAccount() != null) {
            totalTax += person.getAccount().calculateTax();
        }
        if (person.getInsurance() != null) {
            totalTax += person.getInsurance().calculateTax();
        }
        return totalTax;
    }
}
