package com.example.jwtbackend.service.userService;

import com.example.jwtbackend.model.AppUser;
import com.example.jwtbackend.model.UserPrinciple;
import com.example.jwtbackend.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IAppUserService{
    public static AppUser currentUser;
    @Autowired
    private AppUserRepo appUserRepo;
    @Override
    public List<AppUser> findAll() {
        return (List<AppUser>) appUserRepo.findAll();
    }

    @Override
    public AppUser findById(Long id) {
        return appUserRepo.findById(id).get();
    }

    @Override
    public AppUser Save(AppUser appUser) {
        return appUserRepo.save(appUser);
    }

    @Override
    public void deleteById(Long id) {
        appUserRepo.deleteById(id);

    }

    @Override
    public Optional<AppUser> findByUsername(String username) {
        return appUserRepo.findAppUserByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = findByUsername(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(userOptional.get());
    }
}
