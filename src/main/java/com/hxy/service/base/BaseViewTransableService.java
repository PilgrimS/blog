package com.hxy.service.base;

import java.util.List;

/**
 * @author hexy
 * @date 2018/12/1416:17
 */
public abstract class BaseViewTransableService<E,V> {
    /**
     * 将数据实体类对象转换为视图类对象
     *
     * @param entityList 数据实体类对象集合
     *
     * @return 视图模型类对象集合
     */
    protected abstract List<V> transEntityToView(List<E> entityList);
}
