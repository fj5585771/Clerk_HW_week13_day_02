package com.codeclanstudent.clerk_hw.repositories;

import com.codeclanstudent.clerk_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
