package com.wang.parking.member.parkingmember.controller;

import com.wang.parking.member.parkingmember.entity.Member;
import com.wang.parking.member.parkingmember.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
@Slf4j
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping("/list")
    public List<Member> list() {
        List<Member> members = memberService.list();
        log.info("query member list = " + members);
        return members;
    }

}

