package cn.imufeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author MuFeng
 * @since 2023/5/6 15:27
 */
@SpringBootApplication
@EnableEurekaServer //开启 Eureka server,接受其他微服务的注册
public class MicroServiceCloudEureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEureka7001Application.class, args);
    }
}
