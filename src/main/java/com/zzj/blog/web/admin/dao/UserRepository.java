package com.zzj.blog.web.admin.dao;

import com.zzj.blog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


    User findUserByUsernameAndPassword(String username,String password);

}
