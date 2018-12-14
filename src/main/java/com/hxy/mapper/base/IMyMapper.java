package com.hxy.mapper.base;


import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * @author hexy
 * @date 2018/12/1416:30
 */
public interface IMyMapper<T> extends Mapper<T>, MySqlMapper<T>, DeleteByIdsMapper<T>, ConditionMapper<T>, ExampleMapper<T>, SelectByIdsMapper<T> {
}
