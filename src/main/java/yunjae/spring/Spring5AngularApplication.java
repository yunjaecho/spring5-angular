package yunjae.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.reactor.core.ReactorCoreAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {ReactorCoreAutoConfiguration.class})
public class Spring5AngularApplication {
//public class Spring5AngularApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Spring5AngularApplication.class, args);
	}
}
