package com.bright.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author 徐亮亮
 */
@Configuration
@EnableSwagger2
public class BaseConfig {
/*    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }*/

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // 限制包
                .apis(RequestHandlerSelectors.basePackage("com.bright.controller"))
                // 限制接口
                //.paths(PathSelectors.ant("/api/*"))
                .paths(PathSelectors.ant("/*"))
                .build()
                // 这里有一个调用
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "十毛API",
                "十毛API文档",
                "1.0",
                "Terms of service",
                new Contact("bright Xu", "https://blog.csdn.net/weixin_44129085", "bright666@qq.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
