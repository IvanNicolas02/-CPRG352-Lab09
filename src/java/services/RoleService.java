/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;
import models.User;

/**
 *
 * @author techn
 */
public class RoleService {
    public List<Role> getAll() throws Exception {
        RoleDB noteDB = new RoleDB();
        List<Role> roles = noteDB.getAll();
        return roles;
        
    }
    
}
