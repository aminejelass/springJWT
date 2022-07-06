package service;

import domaine.Appuser;
import domaine.Role;

import java.util.List;

public interface UserService {
    Appuser saveuser (Appuser user);
    Role saverole (Role role);
    void addRoletoUser (Appuser user , String rolename);
    Appuser getUser(String username);
    List<Appuser> getUser();

}
