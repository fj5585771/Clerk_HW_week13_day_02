package com.codeclanstudent.clerk_hw.controllers;

import com.codeclanstudent.clerk_hw.models.File;
import com.codeclanstudent.clerk_hw.models.Folder;
import com.codeclanstudent.clerk_hw.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        List <Folder> allFolders = folderRepository.findAll();
        return new ResponseEntity<List<Folder>>(allFolders, HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity<Optional<Folder>> getFolderById(@PathVariable Long id){
        return new ResponseEntity<Optional<Folder>>(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/folders")
    public ResponseEntity <Folder> createFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<Folder>(folder, HttpStatus.CREATED);
    }

}
