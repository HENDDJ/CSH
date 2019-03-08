package com.cloudkeeper.leasing.identity.service.impl;

import com.cloudkeeper.leasing.base.repository.BaseRepository;
import com.cloudkeeper.leasing.base.service.impl.BaseServiceImpl;
import com.cloudkeeper.leasing.identity.domain.TbProblem;
import com.cloudkeeper.leasing.identity.repository.TbProblemRepository;
import com.cloudkeeper.leasing.identity.service.TbProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

/**
 * 问题定位 service
 * @author lxw
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbProblemServiceImpl extends BaseServiceImpl<TbProblem> implements TbProblemService {

    /** 问题定位 repository */
    private final TbProblemRepository tbProblemRepository;

    @Override
    protected BaseRepository<TbProblem> getBaseRepository() {
        return tbProblemRepository;
    }

    @Override
    public ExampleMatcher defaultExampleMatcher() {
        return super.defaultExampleMatcher()
                .withMatcher("problemName", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("type", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("message", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("imgUrl", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("xloc", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("yloc", ExampleMatcher.GenericPropertyMatchers.contains());
    }

}