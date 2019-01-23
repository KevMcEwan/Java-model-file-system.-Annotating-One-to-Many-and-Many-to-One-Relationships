package com.codeclan.file_system.FileSystem.repositories;

import com.codeclan.file_system.FileSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
