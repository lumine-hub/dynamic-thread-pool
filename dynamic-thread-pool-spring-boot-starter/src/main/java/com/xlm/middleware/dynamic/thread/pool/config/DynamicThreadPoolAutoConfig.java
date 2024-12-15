package com.xlm.middleware.dynamic.thread.pool.config;

import com.xlm.middleware.dynamic.thread.pool.domain.DynamicThreadPoolService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.nio.ch.ThreadPool;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.slf4j.LoggerFactory;


/**
 * @author xlm
 * 2024/12/15 下午2:00
 */
@Configuration
public class DynamicThreadPoolAutoConfig {

    private static final Logger log = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    @Bean("dynamicThreadPoolService")
    public DynamicThreadPoolService service(Map<String, ThreadPoolExecutor> executorMap, ApplicationContext context) {

        String appName = context.getEnvironment().getProperty("spring.application.name");
        if (StringUtils.isBlank(appName)) {
            log.warn("应用 spring.application.name 为空");
            appName= "default";
        }
        return new DynamicThreadPoolService(appName, executorMap);
    }
}
