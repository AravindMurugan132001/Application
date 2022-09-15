package com.nseit.Application.repository;

import com.nseit.Application.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer>{

    Role findByName(String name);
}
