package com.wang.parking.member.parkingmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.parking.member.parkingmember.mapper")
public class ParkingMemeberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingMemeberApplication.class, args);
    }

}
