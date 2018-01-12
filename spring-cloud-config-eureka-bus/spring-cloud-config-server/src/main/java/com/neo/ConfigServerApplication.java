package com.neo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * http://www.cnblogs.com/ityouknow/p/6931958.html
 * @author goujy
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    /**
     *
     *
     * curl -X POST http://localhost:8001/bus/refresh
     *
     * <p>
     * 在我们使用Bug消息总线时，希望动态更新,在一个客户端中刷新命令;
     * 可以使用这样的方式;
     * 需要使用RabbitMq消息中线;
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
