package sample.cloud.base.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"sample.cloud"})
@EnableFeignClients({"sample.cloud"})
public class ServiceBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBaseApplication.class, args);
    }

}
