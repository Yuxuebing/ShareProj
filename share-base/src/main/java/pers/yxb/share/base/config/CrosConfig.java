package pers.yxb.share.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/13 0013
 * @Version
 * @Describe
 */
@Configuration
public class CrosConfig extends WebMvcConfigurationSupport {
    //跨域访问
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedMethods("*");
    }
}
