package com.cloudkeeper.leasing.identity.repository;

import com.cloudkeeper.leasing.identity.domain.TbSensor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 传感器 repository 测试
 * @author lxw
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TbSensorRepositoryTest {

    /** 传感器 repository */
    @Autowired
    private TbSensorRepository tbSensorRepository;

    @Test
    public void saveTest() {
        TbSensor tbSensor = new TbSensor();
        tbSensor = tbSensorRepository.save(tbSensor);
        assertNotNull(tbSensor.getId());
    }

}