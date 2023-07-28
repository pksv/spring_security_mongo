package com.pksv.security_mongo.model.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepo extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
