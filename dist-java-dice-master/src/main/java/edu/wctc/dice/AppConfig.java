package edu.wctc.dice;

import edu.wctc.dice.iface.*;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    public AppConfig() {
    }

    @Bean
    public SalesInput salesInput(){
        //return new ConsoleInput();
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport(){
        return new DetailReport();
        //return new SummaryReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FreeShipping();
        //return new FlatRateShipping();
    }



}
