package com.nseit.Application.service;

import com.nseit.Application.model.Standard;
import com.nseit.Application.repository.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class StandardService {
    @Autowired
   public StandardRepository standardRepository;

    public void addStandard(Standard standard) {
        standardRepository.save(standard);
    }

    public void updateStandard(Standard standard) {
        standardRepository.save(standard);
    }

    public List<Standard> viewStandard() {
        return standardRepository.findAll();
    }

    public void deleteStandard(int id) {
       for(Standard standard : StandardRepository.findAll()){
           if(id==standard.getId()){
               StandardRepository.delete(standard);
           }
       }
    }

}
