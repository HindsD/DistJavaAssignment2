package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesInput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileInput implements SalesInput {
    public FileInput() {
    }

    public List<Sale> getSales() {
        List<String> contents = this.readline();
        List<Sale> sales = new ArrayList();
        Iterator var3 = contents.iterator();

        while(var3.hasNext()) {
            String row = (String)var3.next();
            String[] array = row.split(",");
            Sale sale = new Sale(array);
            sales.add(sale);
        }

        return sales;
    }

    public List<String> readline() {
        File data = new File("sales.txt");
        BufferedReader in = null;
        String line = null;
        ArrayList contents = new ArrayList();

        try {
            if (data.exists()) {
                in = new BufferedReader(new FileReader(data));

                while(true) {
                    line = in.readLine();
                    if (line == null) {
                        in.close();
                        break;
                    }

                    contents.add(line);
                }
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch (IOException var8) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException var7) {
                System.out.println(var7.getMessage());
            }

            System.out.println(var8.getMessage());
            System.exit(1);
        }

        return contents;
    }
}
