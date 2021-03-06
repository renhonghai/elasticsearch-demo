package com.luckychacha.elasticsearch.dao.mysql;

import com.luckychacha.elasticsearch.model.entity.mysql.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectTest();
}