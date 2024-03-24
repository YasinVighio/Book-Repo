package com.bookrepo.services;

import com.bookrepo.beans.requestbeans.AuthRequestBean;
import com.bookrepo.entities.UserRightsEntity;
import com.bookrepo.entities.UsersEntity;
import com.bookrepo.exceptions.UnAuthException;
import com.bookrepo.dataaccess.UserRightsDAO;
import com.bookrepo.dataaccess.UsersDAO;
import com.bookrepo.utility.CommonUtilities;
import com.bookrepo.utility.UserUtility;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    protected UserRightsDAO userRightsDAO;

    @Autowired
    protected UsersDAO usersDAO;

    public Boolean authorizeUser(AuthRequestBean authRequestBean, HttpSession session){
        UsersEntity user = usersDAO.getUserByUsername(authRequestBean.getUsername());
        if(user!=null) {
            if(UserUtility.validateUserPassword(authRequestBean.getPassword(), user.getPwd(), user.getSalt())){
                session.setAttribute("loggedIn", true);
                return true;
            }
        }
        return false;
    }

    public List<UserRightsEntity> getAllUserRights(HttpSession session) throws UnAuthException{
        CommonUtilities.validateUserSession(session);
        return userRightsDAO.getAllUserRights();
    }

}
