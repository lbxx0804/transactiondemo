package com.example.transactiondemo.domain;

public class ItemTable {

    public ItemTable(String item) {
        this.item = item;
    }

    public ItemTable() {
    }

    private Integer id;
    private Integer mainId;
    private String item;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
