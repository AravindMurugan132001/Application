package com.nseit.Application.repository;

import com.nseit.Application.model.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUsers,Integer> {
    AppUsers findByUserName(String name);
}
