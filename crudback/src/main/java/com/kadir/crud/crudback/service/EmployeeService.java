package com.kadir.crud.crudback.service;

import com.kadir.crud.crudback.dtos.EmployeeRecordDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    public List<EmployeeRecordDTO> allRecords(){
        return Arrays.asList(
                new EmployeeRecordDTO(1L, "Omar Hossain" , "01732188177", "omar@gmail.com", "omar.png"),
                new EmployeeRecordDTO(2L, "Omar Rahman" , "01732188100", "rahman@gmail.com", "omar.png")
        );
    }

}
