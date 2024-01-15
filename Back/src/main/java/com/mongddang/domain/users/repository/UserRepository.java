package com.mongddang.domain.users.repository;

import com.mongddang.domain.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
