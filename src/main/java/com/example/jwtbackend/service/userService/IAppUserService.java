package com.example.jwtbackend.service.userService;

import com.example.jwtbackend.model.AppUser;
import com.example.jwtbackend.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IAppUserService extends IService<AppUser>, UserDetailsService {
    Optional<AppUser> findByUsername(String username);
}
