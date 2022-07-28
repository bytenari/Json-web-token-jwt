package com.codestates.member;

import com.codestates.member.MemberPatchDto;
import com.codestates.member.MemberPostDto
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController   // (1)
@RequestMapping(value = "/v1/members")   // (2)
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberPostDto memberPostDto) {
        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
    }
//    public String postMember(@RequestParam("email") String email,
//                             @RequestParam("name") String name,
//                             @RequestParam("phone") String phone) {
//        Map<String, String> map = new HashMap<>();
//        map.put("email", email);
//        map.put("name", name);
//        map.put("phone", phone)
//
//        return new ResponseEntity<>(map, HttpStatus.CREATED);
//    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id")long memberId) {
        System.out.println("# memberId: " + memberId);

        // not implementation
        return new ResponseEntity<>(HttpStatus.OK)
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# getMembers");

        // not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }
}