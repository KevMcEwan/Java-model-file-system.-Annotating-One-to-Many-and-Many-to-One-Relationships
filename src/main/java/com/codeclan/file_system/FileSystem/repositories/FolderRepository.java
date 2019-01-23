package com.codeclan.file_system.FileSystem.repositories;

import com.codeclan.file_system.FileSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
