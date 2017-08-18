package yunjae.spring.configration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.PostConstruct;

/**
 * Created by USER on 2017-08-18.
 */
@Configuration
@EnableConfigurationProperties(SimpleProperties.class)
@EnableWebMvc
public class SimpleMvcConfig extends WebMvcConfigurationSupport {
    @Value("${my.property")
    private String myProperty;

    private SimpleProperties simpleProperties;

    @Autowired
    public SimpleMvcConfig(SimpleProperties simpleProperties) {
        this.simpleProperties = simpleProperties;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(myProperty);
        //System.out.println(simpleProperties.getName());
        //System.out.println(simpleProperties.isEnabled());
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SimpleInterceptor()).addPathPatterns("/**");
    }
}
