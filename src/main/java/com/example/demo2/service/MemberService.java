package com.example.demo2.service;


import java.util.List;
import com.example.demo2.dto.MemberDTO;

public interface MemberService {
List<MemberDTO> findMemberList();
MemberDTO findMemberDetail(String id);
void registerMember(MemberDTO memberDTO);
void removeMember(String id);

}