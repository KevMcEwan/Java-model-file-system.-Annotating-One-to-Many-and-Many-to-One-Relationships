package com.codeclan.file_system.FileSystem.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileTest {

    File file;
    Folder folder;
    User user;

    @Before
    public void before (){
        user = new User("Kevin");
        folder = new Folder("MyDocs", user);
        file = new File("ReadMe", "txt", 5, folder);
    }

    @Test
    public void getName() {
        assertEquals("ReadMe", file.getName());
    }

//    @Test
//    public void setName() {
//    }

    @Test
    public void getExtension() {
        assertEquals("txt", file.getExtension());
    }

//    @Test
//    public void setExtension() {
//    }

    @Test
    public void getSize() {
        assertEquals(5, file.getSize());
    }

//    @Test
//    public void setSize() {
//    }

    @Test
    public void getFolder(){
        assertEquals(folder, file.getFolder());
    }
}