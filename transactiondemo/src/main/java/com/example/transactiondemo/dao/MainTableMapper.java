package com.example.transactiondemo.dao;

import com.example.transactiondemo.domain.MainTable;
import org.springframework.stereotype.Repository;

@Repository
public interface MainTableMapper {

    void insert(MainTable mainTable);
}
