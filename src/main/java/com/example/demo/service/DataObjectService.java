package com.example.demo.service;

import com.example.demo.repository.dao.DataObject;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface DataObjectService {

    @NotNull
    List<DataObject> findAll();

    @NotNull
    DataObject save(DataObject data);
}
