package com.example.jwtbackend.service.roleService;

import com.example.jwtbackend.model.AppRole;
import com.example.jwtbackend.service.IService;

public interface IAppRoleService extends IService<AppRole> {
    AppRole findByName(String name);
}
