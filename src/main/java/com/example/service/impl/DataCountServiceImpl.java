package com.example.service.impl;

import com.example.bean.DataCount;
import com.example.mapper.DataCountMapper;
import com.example.service.DataCountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataCountServiceImpl implements DataCountService {

    @Resource
    private DataCountMapper dataCountMapper;

    @Override
    public List<DataCount> list() {
        return dataCountMapper.list();
    }
}
