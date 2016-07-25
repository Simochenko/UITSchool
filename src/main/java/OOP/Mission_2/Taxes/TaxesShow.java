package OOP.Mission_2.Taxes;

import java.util.Scanner;

public class TaxesShow {
    public void TaxesInit() {
        Individual individual = createIndividual();
        System.out.println("Общий сумма налогов = " + individual.getAmount() + " " + "количество налогов за год =  " + " " + individual.getQuantity());
        consolIO(individual);
    }

    public static Individual createIndividual() {
        Tax mainPlaceWorkTax = new MainPlaceWorkTax(1000.25, "Подоходный");
        Tax additionalWorkplaceTax = new AdditionalWorkplaceTax(425.25, "Подоходный");
        Tax royaltyTax = new RoyaltyTax(10000.25, "Косвенный");
        Tax dispositionPropertyTax = new DispositionPropertyTax(1035.25, "Косвенный");
        Tax presentTax = new PresentTax(100000.00, "Косвенный");
        Tax transferTax = new TransferTax(1000.25, "Косвенный");
        Tax benefitsChildrenTax = new BenefitsChildrenTax(528.33, "Косвенный");
        Tax financialAssistanceTax = new FinancialAssistanceTax(100.25, "Косвенный");


        Individual individual = new Individual();
        individual.addTax(mainPlaceWorkTax);
        individual.addTax(additionalWorkplaceTax);
        individual.addTax(royaltyTax);
        individual.addTax(dispositionPropertyTax);
        individual.addTax(presentTax);
        individual.addTax(transferTax);
        individual.addTax(benefitsChildrenTax);
        individual.addTax(financialAssistanceTax);
        return individual;

    }

    public static void consolIO(Individual individual) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка налогов по сумме=");
            individual.sortTax();
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }
    }
}
