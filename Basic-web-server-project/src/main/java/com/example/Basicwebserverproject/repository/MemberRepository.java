package com.example.Basicwebserverproject.repository;

import com.example.Basicwebserverproject.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
