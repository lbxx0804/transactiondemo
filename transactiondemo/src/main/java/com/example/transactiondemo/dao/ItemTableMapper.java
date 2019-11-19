package com.example.transactiondemo.dao;

import com.example.transactiondemo.domain.ItemTable;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTableMapper {
    void insert(ItemTable itemTable);
}
