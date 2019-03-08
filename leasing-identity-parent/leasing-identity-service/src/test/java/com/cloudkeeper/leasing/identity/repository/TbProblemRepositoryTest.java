package com.cloudkeeper.leasing.identity.repository;

import com.cloudkeeper.leasing.identity.domain.TbProblem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 问题定位 repository 测试
 * @author lxw
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TbProblemRepositoryTest {

    /** 问题定位 repository */
    @Autowired
    private TbProblemRepository tbProblemRepository;

    @Test
    public void saveTest() {
        TbProblem tbProblem = new TbProblem();
        tbProblem = tbProblemRepository.save(tbProblem);
        assertNotNull(tbProblem.getId());
    }

}