/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservice-communication-using-eureka-server
 */
package io.blog.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ArticleServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ArticleServiceApp.class, args);
    }
}
