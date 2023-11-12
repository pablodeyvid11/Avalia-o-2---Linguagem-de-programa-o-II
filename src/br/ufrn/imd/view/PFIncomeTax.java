package br.ufrn.imd.view;

import br.ufrn.imd.controll.IncomeTaxGenerator;
import br.ufrn.imd.dao.PersonDAO;
import br.ufrn.imd.model.CheckingAccount;
import br.ufrn.imd.model.LifeInsurance;
import br.ufrn.imd.model.Person;

public class PFIncomeTax {
    public static void main(String[] args) {
        PersonDAO daoP = new PersonDAO();

        CheckingAccount cc1 = new CheckingAccount("1020-5", "100.231-1", 0.0);
        LifeInsurance sv1 = new LifeInsurance(1, "Maria da Silva", 10000);
        Person p1 = new Person("Roberto Carlos", 500.0, cc1, sv1);
        daoP.add(p1);

        CheckingAccount cc2 = new CheckingAccount("2105-4", "123.564-9", 0.0);
        LifeInsurance sv2 = new LifeInsurance(2, "João Maria", 15000);
        Person p2 = new Person("Dom Pedro", 1000.0, cc2, sv2);
        daoP.add(p2);

        CheckingAccount cc3 = new CheckingAccount("3565-4", "584.557-3", 0.0);
        LifeInsurance sv3 = new LifeInsurance(3, "João do Patrocínio", 16000);
        Person p3 = new Person("Rui Barbosa", 1500.5, cc3, sv3);
        daoP.add(p3);

        daoP.listPeople();

        p1.getAccount().cashIn(200.0);
        p2.getAccount().cashIn(500.0);

        System.out.println();

        p3.getAccount().cashOut(100.0);

        System.out.println();

        p2.getAccount().transfer(300.0, cc3);

        System.out.println();

        p3.getAccount().cashOut(100.0);

        daoP.listPeople();

        daoP.calcTotalTax();

        daoP.printTotalTax();

        System.out.println("Total tax from " + p1.getName() + ": " + IncomeTaxGenerator.calcAllTaxFromPerson(p1));
        System.out.println("Total tax from " + p2.getName() + ": " + IncomeTaxGenerator.calcAllTaxFromPerson(p2));
        System.out.println("Total tax from " + p3.getName() + ": " + IncomeTaxGenerator.calcAllTaxFromPerson(p3));
    }
}
