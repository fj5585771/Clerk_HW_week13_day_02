package com.codeclanstudent.clerk_hw.controllers;

import com.codeclanstudent.clerk_hw.models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codeclanstudent.clerk_hw.repositories.FileRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        List <File> allFiles = fileRepository.findAll();
        return new ResponseEntity<List<File>>(allFiles, HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<File>> getFileById(@PathVariable Long id){
        return new ResponseEntity<Optional<File>>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity <File> createFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<File>(file, HttpStatus.CREATED);
    }

}
