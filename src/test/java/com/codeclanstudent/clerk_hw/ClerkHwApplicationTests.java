package com.codeclanstudent.clerk_hw;

import com.codeclanstudent.clerk_hw.models.File;
import com.codeclanstudent.clerk_hw.models.Folder;
import com.codeclanstudent.clerk_hw.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclanstudent.clerk_hw.repositories.FileRepository;
import com.codeclanstudent.clerk_hw.repositories.FolderRepository;
import com.codeclanstudent.clerk_hw.repositories.UserRepository;

@SpringBootTest
class ClerkHwApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void showFiles(){
		User user = new User("Capaldi");
		userRepository.save(user);

		Folder folder = new Folder("Meetings", user);
		folderRepository.save(folder);

	}

}
