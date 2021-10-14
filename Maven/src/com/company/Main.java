package com.company;


import com.company.Moneys.RUB;
import com.company.Moneys.UAH;
import com.company.Persons.Visitors.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
        private final static Logger LOGGER = LogManager.getLogger(Main.class);
        public static void main(String[] args){
            Client a = new Client("Makc",12,"22222","32wde2");
            a.putMoneyOnAccount(new UAH(10));
            a.takeMoneyFromAccount(new UAH(10));
            a.putMoneyOnAccount(new RUB(11));
            a.takeCredit(100);

            LOGGER.info("info message");
            LOGGER.warn("warn message");
            LOGGER.error("error message");
        }
    }
