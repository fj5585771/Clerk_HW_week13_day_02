package com.codeclanstudent.clerk_hw.controllers;

import com.codeclanstudent.clerk_hw.models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeclanstudent.clerk_hw.repositories.FileRepository;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        List <File> allFiles = fileRepository.findAll();
        return new ResponseEntity<>(allFiles, HttpStatus.OK);
    }

}
