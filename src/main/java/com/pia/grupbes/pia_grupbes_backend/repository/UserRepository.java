package com.pia.grupbes.pia_grupbes_backend.repository;

import com.pia.grupbes.pia_grupbes_backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    //üstteki string, modeldeki primary key ile aynı tipte olmalıdır.

    Optional<User> findByName(String name);
//findByNameAndLastName yazarak hem isim hem soyisim kümesinde arama yapabilirdik.

    List<User> findAllByAddressCity(String city);
    List<User> findAllByNameAndLastNameAndAddressCountry(String name, String lastName, String country);

    //Optional<User> findByNameAndLastNameAndAddressCountry(String name, String lastName, String country);
//isim,soyisim ve country ile arama yapam bir query yaz.

}
