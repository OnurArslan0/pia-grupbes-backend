package com.pia.grupbes.pia_grupbes_backend.repository;

import com.pia.grupbes.pia_grupbes_backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    List<User> findAllByAddressCity(String city);
    List<User> findAllByNameAndLastNameAndAddressCountry(String name, String lastName, String country);

}
