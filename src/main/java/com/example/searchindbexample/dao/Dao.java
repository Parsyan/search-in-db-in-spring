package com.example.searchindbexample.dao;




// Interface for a generic Data Access Object (DAO) with methods to find and update objects of type T

import java.util.List;

public interface Dao<T> {
    T find(T obj) throws NoSuchFieldException;
    T update(T beforeChange, T afterChange);
    List<T> findAll();
}