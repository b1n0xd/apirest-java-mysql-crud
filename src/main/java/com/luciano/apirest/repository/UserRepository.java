package com.luciano.apirest.repository;

import com.luciano.apirest.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
