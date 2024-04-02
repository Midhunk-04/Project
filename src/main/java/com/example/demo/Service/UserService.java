package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService 
{
	@Autowired
	public UserRepo ur;
	
	public List<UserEntity> getUser()
	{
		return ur.findAll();
	}
	
	public UserEntity saveuser( UserEntity ue)
	{
		return ur.save(ue);
	}
	
	@Transactional
	public void deletebyname(String name) 
	{
		ur.deletedatabyname(name);
	}
	
	
	@Transactional
    public void updatePassByUsername(String username, String password) {
        ur.updatePassByUsername(username, password);
    }
}
