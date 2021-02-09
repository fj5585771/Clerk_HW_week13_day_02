package com.codeclanstudent.clerk_hw.repositories;

import com.codeclanstudent.clerk_hw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
