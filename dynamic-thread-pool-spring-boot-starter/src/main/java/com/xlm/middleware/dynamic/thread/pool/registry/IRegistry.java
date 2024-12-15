package com.xlm.middleware.dynamic.thread.pool.registry;

import com.xlm.middleware.dynamic.thread.pool.domain.model.Entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author xlm
 * 2024/12/15 下午4:54
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
