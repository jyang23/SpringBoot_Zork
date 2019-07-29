package com.jy.springboot_zork.Repository;

import com.jy.springboot_zork.Beans.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
}
