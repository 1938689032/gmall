package com.atguigu.gmall.demo2;


import com.ld.common.web.getway.annotation.EnableGetWay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*exclude  因为在配置文件中没有配置数据源 所有需要在这里禁止自动配置*/
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableGetWay
public class GmallDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(GmallDemo2Application.class, args);
    }

}
