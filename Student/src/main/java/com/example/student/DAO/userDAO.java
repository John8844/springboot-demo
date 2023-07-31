package com.example.student.DAO;

import com.example.student.model.User;
import org.springframework.data.repository.CrudRepository;

public interface userDAO extends CrudRepository<User,Integer> {
}
