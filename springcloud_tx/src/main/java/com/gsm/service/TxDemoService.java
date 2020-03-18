package com.gsm.service;

import com.gsm.dao.TxDemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TxDemoService {
    @Autowired
    private TxDemoDao txDemoDao;

    public void updateDemo() {
        txDemoDao.insertUser("闻家奇1");
    }
}
