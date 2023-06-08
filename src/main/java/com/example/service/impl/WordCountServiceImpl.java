package com.example.service.impl;

import com.example.bean.WordCount;
import com.example.mapper.WordCountMapper;
import com.example.service.WordCountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WordCountServiceImpl implements WordCountService {

    @Resource
    private WordCountMapper wordCountMapper;

    @Override
    public List<WordCount> list() {
        return wordCountMapper.list();
    }
}
