package com.company;


import com.company.Moneys.RUB;
import com.company.Moneys.UAH;
import com.company.Persons.Visitors.Client;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Main {
        private static Logger log = Logger.getLogger(Main.class);
        public static void main(String[] args){
            BasicConfigurator.configure();

            Client a = new Client("Makc",12,"22222","32wde2");
            a.putMoneyOnAccount(new UAH(10));
            a.takeMoneyFromAccount(new UAH(10));
            a.putMoneyOnAccount(new RUB(11));
            a.takeCredit(new RUB(11));

            int b = 0;
            try{
                int n = 1/b;
            }catch (ArithmeticException exception){
                log.info("basic exception");
            }

            try{
                int n = 1/b;
            }catch (CustomException exception){
                log.info("my exception");
            }
        }
    }
