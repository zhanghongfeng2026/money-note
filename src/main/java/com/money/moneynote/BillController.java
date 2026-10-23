package com.money.moneynote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BillController {

    @GetMapping("/bill/test")
    public List<Bill> test(){

        Bill b1=new Bill();
        b1.id=1;
        b1.title="午饭";
        b1.amount =22.5;
        b1.category = "餐饮";
        b1.occurDate = "2026-10-20";

        Bill b2 = new Bill();
        b2.id = 2;
        b2.title = "打车";
        b2.amount = 18.0;
        b2.category = "交通";
        b2.occurDate = "2026-10-20";

        List<Bill> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);

        return list;
    }
}
