package com.bookrepo.utility;

import com.bookrepo.exceptions.UnAuthException;
import jakarta.servlet.http.HttpSession;

public class CommonUtilities {
    public static void validateUserSession(HttpSession session) throws UnAuthException {
        if(!Boolean.TRUE.equals(session.getAttribute("loggedIn")))
            throw new UnAuthException("User is not logged in");
    }
}
