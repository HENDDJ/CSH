package com.cloudkeeper.leasing.identity.controller;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.domain.TbSensor;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

/**
 * 传感器 controller 测试
 * @author lxw
 */
public class TbSensorControllerTest extends BaseControllerTest {

    @Test
    public void add() {
        TbSensor tbSensor = new TbSensor();
        HttpEntity<TbSensor> httpEntity = new HttpEntity<>(tbSensor, httpHeaders);
        ParameterizedTypeReference<Result<TbSensor>> type = new ParameterizedTypeReference<Result<TbSensor>>() {};
        ResponseEntity<Result<TbSensor>> responseEntity = restTemplate.exchange("/tbSensor/add", HttpMethod.POST, httpEntity, type);
        assertEquals(responseEntity.getStatusCodeValue(), 200);
        assertNotNull(responseEntity.getBody().getContent());
    }

}