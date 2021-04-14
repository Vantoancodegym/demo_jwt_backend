package com.example.jwtbackend.service.roleService;

import com.example.jwtbackend.model.AppRole;
import com.example.jwtbackend.repository.AppRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IAppRoleService{
    @Autowired
    private AppRoleRepo appRoleRepo;
    @Override
    public List<AppRole> findAll() {
        return (List<AppRole>) appRoleRepo.findAll() ;
    }

    @Override
    public AppRole findById(Long id) {
        return appRoleRepo.findById(id).get();
    }

    @Override
    public AppRole Save(AppRole appRole) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public AppRole findByName(String name) {
        return appRoleRepo.findAppRoleByName(name);
    }
}
