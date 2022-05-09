package com.wang.parking.member.parkingmember.service.impl;

import com.wang.parking.member.parkingmember.entity.Member;
import com.wang.parking.member.parkingmember.entity.MemberExample;
import com.wang.parking.member.parkingmember.mapper.MemberMapper;
import com.wang.parking.member.parkingmember.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;
    @Override
    public List<Member> list() {
        MemberExample example = new MemberExample();
        List<Member> members = memberMapper.selectByExample(example);
        return members;
    }
}
