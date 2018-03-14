package com.example.demo.query.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.query.entity.User;

public interface UserRepository extends Neo4jRepository<User, Long> {

}
