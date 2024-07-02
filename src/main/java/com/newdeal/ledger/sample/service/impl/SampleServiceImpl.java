package com.newdeal.ledger.sample.service.impl;

import com.newdeal.ledger.sample.mapper.SampleMapper;
import com.newdeal.ledger.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleMapper sm;

    @Override
    public int list() {
        int sample = sm.list();
        return sample;
    }
}
