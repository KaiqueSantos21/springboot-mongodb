package com.kaiquesantos.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaiquesantos.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
