package com.shop.dev.mapper;

import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author tqj
 * @Description
 * @create 2019/5/21 15:39
 **/
@Mapper
public interface LoginMapper {
     List<Map<String, Object>> findUsername();
}
