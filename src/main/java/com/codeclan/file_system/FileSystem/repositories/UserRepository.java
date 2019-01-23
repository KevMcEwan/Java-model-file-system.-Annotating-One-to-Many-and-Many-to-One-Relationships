package com.codeclan.file_system.FileSystem.repositories;

import com.codeclan.file_system.FileSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
