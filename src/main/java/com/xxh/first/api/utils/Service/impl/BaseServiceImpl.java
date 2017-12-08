package com.xxh.first.api.utils.Service.impl;

import com.xxh.first.api.utils.MyMapper;
import com.xxh.first.api.utils.Service.BaseService;

import javax.annotation.Resource;
import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService {
    //在这里进行基础业务层接口的实现，用抽象类，保证不被实例化

    @Resource
    MyMapper mymapper;

    @Override
    public Object findById(Integer id) {
        return mymapper.selectByIds(id.toString());
    }
}
