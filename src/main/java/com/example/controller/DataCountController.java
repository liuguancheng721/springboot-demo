package com.example.controller;


import com.example.bean.DataCount;
import com.example.service.DataCountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DataCountController {

    @Resource
    private DataCountService datacountService;

    @GetMapping("/dataCountList")
    public List<DataCount> list() {
        List<DataCount> dataCounts = datacountService.list();
        return dataCounts;
    }
}
