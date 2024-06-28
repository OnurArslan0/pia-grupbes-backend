package com.pia.grupbes.pia_grupbes_backend.service;

import com.pia.grupbes.pia_grupbes_backend.entity.User;
import com.pia.grupbes.pia_grupbes_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import com.pia.grupbes.pia_grupbes_backend.entity.User;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor  //kendi constructını inject ettirdi.
@Service
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(User user) {
        user.setId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
