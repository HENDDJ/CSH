package com.cloudkeeper.leasing.identity.controller;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.domain.TbCamera;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

/**
 * 摄像头配置 controller 测试
 * @author lxw
 */
public class TbCameraControllerTest extends BaseControllerTest {

    @Test
    public void add() {
        TbCamera tbCamera = new TbCamera();
        HttpEntity<TbCamera> httpEntity = new HttpEntity<>(tbCamera, httpHeaders);
        ParameterizedTypeReference<Result<TbCamera>> type = new ParameterizedTypeReference<Result<TbCamera>>() {};
        ResponseEntity<Result<TbCamera>> responseEntity = restTemplate.exchange("/tbCamera/add", HttpMethod.POST, httpEntity, type);
        assertEquals(responseEntity.getStatusCodeValue(), 200);
        assertNotNull(responseEntity.getBody().getContent());
    }

}