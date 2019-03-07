package com.cloudkeeper.leasing.identity.service;

import com.cloudkeeper.leasing.identity.domain.TbCamera;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 摄像头配置 service 测试
 * @author lxw
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TbCameraServiceTest {

    /** 摄像头配置 service */
    @Autowired
    private TbCameraService tbCameraService;

    @Test
    public void saveTest() {
        TbCamera tbCamera = new TbCamera();
        tbCamera = tbCameraService.save(tbCamera);
        assertNotNull(tbCamera.getId());
    }

}