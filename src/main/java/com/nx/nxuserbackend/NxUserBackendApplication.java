package com.nx.nxuserbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 18702
 */
@SpringBootApplication
@MapperScan("com.nx.nxuserbackend.mapper")
public class NxUserBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NxUserBackendApplication.class, args);
    }

}
