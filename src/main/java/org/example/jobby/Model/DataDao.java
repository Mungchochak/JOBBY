package org.example.jobby.Model;

    public interface DataDao<T>{
        void save(T data, String filePath) throws Exception;
        T load(String filePath) throws Exception;
    }

