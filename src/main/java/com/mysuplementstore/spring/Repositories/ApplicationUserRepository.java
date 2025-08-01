package com.mysuplementstore.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysuplementstore.spring.Models.ApplicationUser;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    Optional<ApplicationUser> findApplicationUsersByEmail(String email);

}
