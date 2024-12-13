package org.core;

import org.core.Utils.DemoUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.core"})
public class ConfigClass {

    @Bean(name = "util")
    public DemoUtil getDemoUtil()
    {
        return new DemoUtil();
    }
}
