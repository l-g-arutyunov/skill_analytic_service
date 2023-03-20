package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByExternalId(Long externalId);

}
