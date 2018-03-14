package com.example.demo.query.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NodeEntity
public class User {

	@Id
	@GeneratedValue
	Long id;

	String name;
}
