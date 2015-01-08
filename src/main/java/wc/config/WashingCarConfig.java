package wc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "wc")
@ImportResource({"classpath:application-context.xml"})
public class WashingCarConfig {

}
