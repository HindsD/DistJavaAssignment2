package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public List<Sale> getSales() {
        System.out.println("Enter sales information as customer name, country, amount, tax");
        String line = this.scanner.nextLine();
        List<Sale> salesList = new ArrayList();
        String[] array = line.split(",");
        Sale sale = new Sale(array);
        salesList.add(sale);
        return salesList;
    }
}