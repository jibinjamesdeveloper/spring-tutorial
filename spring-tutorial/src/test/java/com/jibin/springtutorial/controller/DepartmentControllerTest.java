package com.jibin.springtutorial.controller;

import com.jibin.springtutorial.entity.Department;
import com.jibin.springtutorial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp(){
        department = Department.builder()
                .departmentAddress("Kerala")
                .departmentCode("IT-01")
                .departmentName("IT")
                .departmentId(1L)
                .build();
    }


    @Test
    void saveDepartment() {
        Department inputDepartment = Department.builder()
                .departmentAddress("Kerala")
                .departmentCode("IT-01")
                .departmentName("IT") // Remove the deprtmentId
                .build();
        Mockito.when(departmentService)


    }

    @Test
    void fetchDepartmentById() {
    }
}