package com.webapp.bankingportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webapp.bankingportal.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findByAccountAccountNumber(String accountNumber);

    @Query("SELECT u FROM User u WHERE u.name LIKE %?1% OR u.email LIKE %?1% OR u.phoneNumber LIKE %?1%")
    List<User> searchUsers(String keyword);
}
