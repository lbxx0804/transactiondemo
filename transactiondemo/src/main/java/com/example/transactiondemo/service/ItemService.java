package com.example.transactiondemo.service;

import com.example.transactiondemo.bo.MainTableInsertBo;

public interface ItemService {
    void saveDb(MainTableInsertBo mainTableInsertBo) throws Exception;
}
