package com.example.sample.a.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AMapper {

    @Select(
            ""
    )
    void base();
}
