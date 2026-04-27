package org.example.getstarted.model;

import org.example.getstarted.excepition.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class UserDAO {
    private long nextId = 1;

    private List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void delete(final long id) {
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public UserModel findById(final long id) {
       var message = String.format("There is no user registered with ID %d!", id);
        return models.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll() {
        return models;
    }

}
