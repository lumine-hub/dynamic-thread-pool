package com.xlm.middleware.dynamic.thread.pool.domain;

import com.xlm.middleware.dynamic.thread.pool.domain.model.Entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author xlm
 * 2024/12/15 下午3:43
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
