package com.company;


import com.company.Moneys.RUB;
import com.company.Moneys.UAH;
import com.company.Persons.Visitors.Client;


public class Main {

        public static void main(String[] args){

            Client a = new Client("Makc",12,"22222","32wde2");
            a.putMoneyOnAccount(new UAH(10));
            a.takeMoneyFromAccount(new UAH(10));
            a.putMoneyOnAccount(new RUB(11));
            a.takeCredit(100);

        }
    }
