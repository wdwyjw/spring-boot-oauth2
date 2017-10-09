package com.ihr.oauth.repository;


import com.ihr.oauth.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
