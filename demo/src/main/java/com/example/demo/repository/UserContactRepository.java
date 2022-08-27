package com.example.demo.repository;

import com.example.demo.model.entity.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserContactRepository extends JpaRepository<UserContact, String> {

    @Query(value = "SELECT uc FROM USER_CONTACT uc WHERE uc.id = :id")
    Optional<UserContact> findById(String id);
}
