package com.cloudkeeper.leasing.identity.service.impl;

import com.cloudkeeper.leasing.base.repository.BaseRepository;
import com.cloudkeeper.leasing.base.service.impl.BaseServiceImpl;
import com.cloudkeeper.leasing.identity.domain.TbSensor;
import com.cloudkeeper.leasing.identity.repository.TbSensorRepository;
import com.cloudkeeper.leasing.identity.service.TbSensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

/**
 * 传感器 service
 * @author lxw
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbSensorServiceImpl extends BaseServiceImpl<TbSensor> implements TbSensorService {

    /** 传感器 repository */
    private final TbSensorRepository tbSensorRepository;

    @Override
    protected BaseRepository<TbSensor> getBaseRepository() {
        return tbSensorRepository;
    }

    @Override
    public ExampleMatcher defaultExampleMatcher() {
        return super.defaultExampleMatcher()
                .withMatcher("sensorName", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("sensorType", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("sensorUrl", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("message", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("xloc", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("yloc", ExampleMatcher.GenericPropertyMatchers.contains());
    }

}