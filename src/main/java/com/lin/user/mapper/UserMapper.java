package com.lin.user.mapper;

import com.lin.user.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findUserList();
}
