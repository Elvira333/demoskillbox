package com.example.demo.service;

import com.example.demo.repository.DataRepository;
import com.example.demo.repository.dao.DataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataObjectServiceImpl implements DataObjectService{
    private final DataRepository dataRepository;

    public DataObjectServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<DataObject> findAll() {
         return dataRepository.findAll();
    }

    @Override
    public DataObject save(DataObject data) {
        return dataRepository.save(data);
    }

}
