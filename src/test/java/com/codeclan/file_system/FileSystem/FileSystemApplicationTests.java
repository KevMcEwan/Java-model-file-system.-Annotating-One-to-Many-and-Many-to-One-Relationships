package com.codeclan.file_system.FileSystem;

import com.codeclan.file_system.FileSystem.models.File;
import com.codeclan.file_system.FileSystem.models.Folder;
import com.codeclan.file_system.FileSystem.models.User;
import com.codeclan.file_system.FileSystem.repositories.FileRepository;
import com.codeclan.file_system.FileSystem.repositories.FolderRepository;
import com.codeclan.file_system.FileSystem.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileSystemApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveFile(){
		User user = new User ("Kevin");
		userRepository.save(user);

		Folder folder = new Folder ("MyDocs", user);
		folderRepository.save(folder);

		File file = new File("ReadMe", "txt", 5, folder);
		fileRepository.save(file);
	}

}

