package com.mindefdb.services;

import com.mindefdb.dtos.UserDTO;

public interface IUserService {

	UserDTO createUser(UserDTO userDTO);

	UserDTO updateUser(UserDTO userDTO);

}
