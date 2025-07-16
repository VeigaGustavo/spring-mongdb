package com.veiga.workshopmongo.services;

import com.veiga.workshopmongo.domain.User;
import com.veiga.workshopmongo.dto.UserDTO;
import com.veiga.workshopmongo.repository.UserRepository;
import com.veiga.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id).orElseThrow(() ->
                new ObjectNotFoundException(
                        "Object not found! Id: " + id + ", Type: " + User.class.getName())
        );
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO obj) {
        return new User(obj.getId(), obj.getName(), obj.getEmail());
    }
}
