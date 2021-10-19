package aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"aop.demo1"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
