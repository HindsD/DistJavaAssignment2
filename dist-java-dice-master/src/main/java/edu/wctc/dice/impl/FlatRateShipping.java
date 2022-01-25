package edu.wctc.dice.impl;

import edu.wctc.dice.Sale;
import edu.wctc.dice.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    public FlatRateShipping() {
    }

    public void applyShipping(Sale sale) {
        String var2 = sale.Country;
        byte var3 = -1;
        switch(var2.hashCode()) {
            case -2032517217:
                if (var2.equals("United States")) {
                    var3 = 0;
                }
                break;
            case -418800704:
                if (var2.equals("Scotland")) {
                    var3 = 3;
                }
                break;
            case 70793495:
                if (var2.equals("India")) {
                    var3 = 2;
                }
                break;
            case 71341030:
                if (var2.equals("Japan")) {
                    var3 = 1;
                }
        }

        switch(var3) {
            case 0:
                sale.shipping = 5.99D;
                break;
            case 1:
                sale.shipping = 14.5D;
                break;
            case 2:
                sale.shipping = 11.79D;
                break;
            case 3:
                sale.shipping = 7.54D;
                break;
            default:
                sale.shipping = 0.0D;
        }

    }
}
