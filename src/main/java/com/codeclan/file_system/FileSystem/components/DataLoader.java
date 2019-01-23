package com.codeclan.file_system.FileSystem.components;

import com.codeclan.file_system.FileSystem.models.File;
import com.codeclan.file_system.FileSystem.models.Folder;
import com.codeclan.file_system.FileSystem.models.User;
import com.codeclan.file_system.FileSystem.repositories.FileRepository;
import com.codeclan.file_system.FileSystem.repositories.FolderRepository;
import com.codeclan.file_system.FileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run (ApplicationArguments args){
        User kevin = new User ("Kevin");
        userRepository.save(kevin);

        Folder myDocs = new Folder ("MyDocs", kevin);
        folderRepository.save(myDocs);

        Folder myMusic = new Folder("My Music", kevin );
        folderRepository.save(myMusic);

        File readMe = new File("ReadMe", "txt", 5, myDocs);
        fileRepository.save(readMe);

        File bohemianRhapsody = new File("Bohemian Rhapsody", "mp3", 8000, myMusic);
        fileRepository.save(bohemianRhapsody);
    }

}
