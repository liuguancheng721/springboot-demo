package com.example.controller;

import com.example.bean.WordCount;
import com.example.service.WordCountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/wordcount")
public class WordCountController {

    @Resource
    private WordCountService wordCountService;

    @GetMapping("/list")
    public List<WordCount> list() {
        List<WordCount> list = wordCountService.list();
        return list;
    }

}
