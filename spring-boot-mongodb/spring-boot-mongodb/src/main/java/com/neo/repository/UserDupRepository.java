package com.neo.repository;

import com.neo.model.User;
import com.neo.model.UserDuplicate;

/**
 * Created by summer on 2017/5/5.
 */
public interface UserDupRepository {

    public void saveUser(UserDuplicate user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}
