package com.example.mapper;

import com.example.bean.WordCount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WordCountMapper {

    @Select("select name,value from wordcount")
    List<WordCount> list();
}
