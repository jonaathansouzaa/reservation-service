package com.reservation.service;

import com.reservation.domain.User;
import com.reservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByCpf(String cpf) {
        return userRepository.findByCpf(cpf).get();
    }

}
