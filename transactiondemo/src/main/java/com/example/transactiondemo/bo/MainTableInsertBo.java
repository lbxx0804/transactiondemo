package com.example.transactiondemo.bo;

import com.example.transactiondemo.domain.ItemTable;
import com.example.transactiondemo.domain.MainTable;

import java.util.List;

public class MainTableInsertBo extends MainTable {
    private List<ItemTable> itemTableList;

    public List<ItemTable> getItemTableList() {
        return itemTableList;
    }

    public void setItemTableList(List<ItemTable> itemTableList) {
        this.itemTableList = itemTableList;
    }
}
