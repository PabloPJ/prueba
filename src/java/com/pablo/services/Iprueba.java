package com.pablo.services;

import java.util.List;

public interface Iprueba<T> {

    public boolean create(T t);

    public boolean update(T t);

    public boolean delete(T t);

    public List<T> fildByeQuery(String q);
    public T findSingle
    (String q);


   
}
