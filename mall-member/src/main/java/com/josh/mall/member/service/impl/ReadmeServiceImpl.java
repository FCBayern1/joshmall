package com.josh.mall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.josh.common.utils.PageUtils;
import com.josh.common.utils.Query;

import com.josh.mall.member.dao.ReadmeDao;
import com.josh.mall.member.entity.ReadmeEntity;
import com.josh.mall.member.service.ReadmeService;


@Service("readmeService")
public class ReadmeServiceImpl extends ServiceImpl<ReadmeDao, ReadmeEntity> implements ReadmeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ReadmeEntity> page = this.page(
                new Query<ReadmeEntity>().getPage(params),
                new QueryWrapper<ReadmeEntity>()
        );

        return new PageUtils(page);
    }

}