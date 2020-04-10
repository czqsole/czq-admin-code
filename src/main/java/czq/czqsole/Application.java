package czq.czqsole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Author: czqsole
 * Date: 2018/6/13
 */
@SpringBootApplication
@MapperScan("czq.czqsole.dao")
@ComponentScan(basePackages = "czq.czqsole")
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
