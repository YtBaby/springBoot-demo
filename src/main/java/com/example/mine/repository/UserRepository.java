package com.example.mine.repository;

import com.example.mine.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select user from User user where user.userName = :name and user.userPwd = :pwd")
    User findByUserName(@Param("name") String name, @Param("pwd") String pwd);
}
