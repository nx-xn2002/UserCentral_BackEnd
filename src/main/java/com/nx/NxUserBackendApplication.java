package com.nx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 18702
 */
@SpringBootApplication
@MapperScan("com.nx.mapper")
public class NxUserBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NxUserBackendApplication.class, args);
    }

}
