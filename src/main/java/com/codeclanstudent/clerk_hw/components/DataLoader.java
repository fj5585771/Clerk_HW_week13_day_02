package com.codeclanstudent.clerk_hw.components;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component // Annotates from SpringBoot Directory
public class DataLoader implements ApplicationRunner { // this defins as functional interface.. one method called "run".  at any time the springboot app "ClerkHWApp" then seed the DB

    public DataLoader(){ // "Very POJO like"

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {



    }
}
