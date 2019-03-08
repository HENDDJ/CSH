package com.cloudkeeper.leasing.identity.controller;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.domain.TbProblem;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

/**
 * 问题定位 controller 测试
 * @author lxw
 */
public class TbProblemControllerTest extends BaseControllerTest {

    @Test
    public void add() {
        TbProblem tbProblem = new TbProblem();
        HttpEntity<TbProblem> httpEntity = new HttpEntity<>(tbProblem, httpHeaders);
        ParameterizedTypeReference<Result<TbProblem>> type = new ParameterizedTypeReference<Result<TbProblem>>() {};
        ResponseEntity<Result<TbProblem>> responseEntity = restTemplate.exchange("/tbProblem/add", HttpMethod.POST, httpEntity, type);
        assertEquals(responseEntity.getStatusCodeValue(), 200);
        assertNotNull(responseEntity.getBody().getContent());
    }

}