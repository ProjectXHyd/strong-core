package com.x.api.dao;

import org.springframework.data.repository.CrudRepository;
import com.x.api.model.User;


public interface UserDao extends CrudRepository<User, Long>{

	User findByName(String name);
}
