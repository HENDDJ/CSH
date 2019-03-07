package com.cloudkeeper.leasing.identity.service.impl;

import com.cloudkeeper.leasing.base.repository.BaseRepository;
import com.cloudkeeper.leasing.base.service.impl.BaseServiceImpl;
import com.cloudkeeper.leasing.identity.domain.TbCamera;
import com.cloudkeeper.leasing.identity.repository.TbCameraRepository;
import com.cloudkeeper.leasing.identity.service.TbCameraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

/**
 * 摄像头配置 service
 * @author lxw
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbCameraServiceImpl extends BaseServiceImpl<TbCamera> implements TbCameraService {

    /** 摄像头配置 repository */
    private final TbCameraRepository tbCameraRepository;

    @Override
    protected BaseRepository<TbCamera> getBaseRepository() {
        return tbCameraRepository;
    }

    @Override
    public ExampleMatcher defaultExampleMatcher() {
        return super.defaultExampleMatcher()
                .withMatcher("cameraUuid", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("cameraName", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("cameraType", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("cameraChannelNum", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("smartType", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("smartSupport", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("onlineStatus", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("keyBoardCode", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("orderNum", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("unitUuid", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("regionUuid", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("encoderUuid", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("resAuths", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("xLoc", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("yLoc", ExampleMatcher.GenericPropertyMatchers.contains());
    }

}