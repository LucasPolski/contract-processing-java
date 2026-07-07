package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Contract Number: ");
        int contractNumber = sc.nextInt();

        System.out.print("Contract Date (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Contract Value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, date, totalValue);

        System.out.print("Enter the number o installments: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, months);

        System.out.println();
        System.out.println("INSTALLMENTS: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
