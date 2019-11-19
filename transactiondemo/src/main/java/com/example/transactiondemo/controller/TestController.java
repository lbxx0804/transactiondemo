package com.example.transactiondemo.controller;

import com.example.transactiondemo.bo.MainTableInsertBo;
import com.example.transactiondemo.domain.ItemTable;
import com.example.transactiondemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("test")
    public String test() throws Exception{
        MainTableInsertBo mainTableInsertBo = new MainTableInsertBo();
        mainTableInsertBo.setCreateDate(new Date());
        List<ItemTable> itemTableList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemTableList.add(new ItemTable("项目" + i));
        }
        mainTableInsertBo.setItemTableList(itemTableList);
        itemService.saveDb(mainTableInsertBo);
        return "ok";
    }
}
