package com.x.api.dao;

import com.x.api.model.Address;
import com.x.api.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AddressDao extends CrudRepository<Address, Long> {

    List<Address> findByUser(User user);
}
