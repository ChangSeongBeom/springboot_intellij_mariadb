package com.example.testProject.controller;

import com.example.testProject.dao.TestDAO;
import com.example.testProject.dao.TestImpl;
import com.example.testProject.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TestImpl testimpl;

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld() {
        return testimpl.getTestData();
    }
}
