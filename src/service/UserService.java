/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;

/**
 *
 * @author Ismail Tobiss
 */
public class UserService extends AbstractFacade<User> {
    
    public UserService() {
        super(User.class);
        
    }
    
   public int sinscrire(User user) {
        if (user == null) {
            return -1;
        } else {
            create(user);
            return 1;
        }
    }
    
}
