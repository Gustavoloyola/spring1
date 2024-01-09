package com.example.ejemindata2.service;

import com.example.ejemindata2.entity.UserEntity;
import com.example.ejemindata2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //es como si fuera con el constructor

    public List<UserEntity> findAll(){
        return (List<UserEntity>) userRepository.findAll();
    }

    public String created(UserEntity user){
        userRepository.save(user);
        return "user created";
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public String deletedById(Long id){
        userRepository.deleteById(id);
        return "deleted";
    }

    public String actualizar(Long id,UserEntity userAct){
        Optional<UserEntity> user1=userRepository.findById(id);
        user1.orElseThrow().setName(userAct.getName());
        user1.orElseThrow().setAge(userAct.getAge());
        return "actualizado";
    }
}
