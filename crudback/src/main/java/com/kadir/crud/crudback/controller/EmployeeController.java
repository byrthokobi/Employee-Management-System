package com.kadir.crud.crudback.controller;

import com.kadir.crud.crudback.dtos.EmployeeRecordDTO;
import com.kadir.crud.crudback.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employee/records")
    public ResponseEntity<List<EmployeeRecordDTO>> allRecords() {
        return ResponseEntity.ok(employeeService.allRecords());
    }
}
