package com.gl.CollegeFestDebateSpring.boot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFestDebateSpring.boot.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	public User findByUsername(String username);
}