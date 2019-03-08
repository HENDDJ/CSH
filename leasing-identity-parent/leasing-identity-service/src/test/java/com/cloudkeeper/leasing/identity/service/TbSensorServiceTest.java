package com.cloudkeeper.leasing.identity.service;

import com.cloudkeeper.leasing.identity.domain.TbSensor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 传感器 service 测试
 * @author lxw
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TbSensorServiceTest {

    /** 传感器 service */
    @Autowired
    private TbSensorService tbSensorService;

    @Test
    public void saveTest() {
        TbSensor tbSensor = new TbSensor();
        tbSensor = tbSensorService.save(tbSensor);
        assertNotNull(tbSensor.getId());
    }

}