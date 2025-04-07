package com.SocialMedia.repository;

import com.SocialMedia.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthRepository extends JpaRepository<Auth, Long> {
}
