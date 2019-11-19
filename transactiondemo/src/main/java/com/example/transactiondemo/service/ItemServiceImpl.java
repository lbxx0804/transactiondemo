package com.example.transactiondemo.service;

import com.example.transactiondemo.bo.MainTableInsertBo;
import com.example.transactiondemo.dao.ItemTableMapper;
import com.example.transactiondemo.dao.MainTableMapper;
import com.example.transactiondemo.domain.ItemTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements  ItemService {
    @Autowired
    private MainTableMapper mainTableMapper;
    @Autowired
    private ItemTableMapper itemTableMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveDb(MainTableInsertBo mainTableInsertBo) throws Exception {
        mainTableMapper.insert(mainTableInsertBo);
        int i = 0;
        for (ItemTable itemTable : mainTableInsertBo.getItemTableList()) {
            i++;
            itemTable.setMainId(mainTableInsertBo.getId());
            if(i == 5){
                throw new Exception("测试");
            }
            itemTableMapper.insert(itemTable);
        }
    }
}
