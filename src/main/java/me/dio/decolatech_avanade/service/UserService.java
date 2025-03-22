package me.dio.decolatech_avanade.service;

import me.dio.decolatech_avanade.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
