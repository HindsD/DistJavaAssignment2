package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.SalesReport;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SummaryReport implements SalesReport {
    public SummaryReport() {
    }

    public void generateReport(List<Sale> saleList) {
        Map<String, Sale> map = new HashMap();
        Iterator var3 = saleList.iterator();

        while(var3.hasNext()) {
            Sale sale = (Sale)var3.next();
            if (map.containsKey(sale.Country)) {
                Sale objectFromMap = (Sale)map.get(sale.Country);
                objectFromMap.setAmount(objectFromMap.getAmount() + sale.amount);
                objectFromMap.setTax(objectFromMap.getTax() + sale.tax);
                objectFromMap.setShipping(objectFromMap.getShipping() + sale.shipping);
                map.put(sale.Country, objectFromMap);
            } else {
                map.put(sale.Country, sale);
            }
        }

        System.out.println("Summary Sales Report");
        var3 = map.keySet().iterator();

        while(var3.hasNext()) {
            String country = (String)var3.next();
            System.out.printf("%-22s%-22.2f%-22.2f%-22.2f\n", country, ((Sale)map.get(country)).getAmount(), ((Sale)map.get(country)).getTax(), ((Sale)map.get(country)).getShipping());
        }

    }
}
