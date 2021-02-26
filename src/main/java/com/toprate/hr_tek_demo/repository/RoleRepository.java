package com.toprate.hr_tek_demo.repository;

import com.toprate.hr_tek_demo.base.repository.GenericRepository;
import com.toprate.hr_tek_demo.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends GenericRepository<Role, String> {
}
