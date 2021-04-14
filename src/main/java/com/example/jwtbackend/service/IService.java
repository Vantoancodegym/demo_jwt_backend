package com.example.jwtbackend.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    T findById(Long id);
    T Save(T t);
    void deleteById(Long id);
}
