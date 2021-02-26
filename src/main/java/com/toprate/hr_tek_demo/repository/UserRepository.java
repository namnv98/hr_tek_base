package com.toprate.hr_tek_demo.repository;

import com.toprate.hr_tek_demo.base.repository.GenericRepository;
import com.toprate.hr_tek_demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends GenericRepository<User, String> {

    Optional<User> findByGmail(String gmail);

    @Query(value = "SELECT u FROM User u WHERE u.enable = 1")
    List<User> findAllUser();

    @Query(value = "SELECT u FROM User u WHERE u.role.roleName = :role and u.status = :status ")
    List<User> searchUser(@Param("role") String role, @Param("status") String status);

    List<User> findByRole_RoleName(String name);

}
