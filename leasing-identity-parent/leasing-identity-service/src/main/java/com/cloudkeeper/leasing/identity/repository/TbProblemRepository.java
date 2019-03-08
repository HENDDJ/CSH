package com.cloudkeeper.leasing.identity.repository;

import com.cloudkeeper.leasing.identity.domain.TbProblem;
import com.cloudkeeper.leasing.base.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * 问题定位 repository
 * @author lxw
 */
@Repository
public interface TbProblemRepository extends BaseRepository<TbProblem> {

}