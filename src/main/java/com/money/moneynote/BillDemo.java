package com.money.moneynote;

import java.util.ArrayList;
import java.util.List;

public class BillDemo {
    public  static void main(String[] args){
        Bill b1 = new Bill();
        b1.id=1;
        b1.title="午饭";
        b1.amount=25.5;
        b1.category="餐饮";
        b1.occurDate="2026-10-27";

        Bill b2 =new Bill();
        b2.id=2;
        b2.title="打车";
        b2.amount=18.0;
        b2.category="交通";
        b2.occurDate="2026-10-27";

        List<Bill> bills = new ArrayList<>();
        bills.add(b1);
        bills.add(b2);
        System.out.println(bills.size());

        List<Bill> expensive = filterByAmount(bills, 20);
        System.out.println(expensive.size());
    }

    static List<Bill> filterByAmount(List<Bill> list, double min) {
        List<Bill> result = new ArrayList<>();
        for (Bill b : list) {
            if (b.amount > min) {
                result.add(b);
            }
        }
        return result;
    }

}
