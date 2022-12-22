package com.toni.slutprojekt1.model;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "consentServlet", value = "/consentServlet")
public class consentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Loops through cookies to fins "consentCookie" with value "accepted"
        boolean cookiePolicyAccepted = false;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("consentCookie") && cookie.getValue().equals("accepted")) {
                    cookiePolicyAccepted = true;
                    break;
                }
            }
        }

        // Shows banner if above statement is not true
        if (!cookiePolicyAccepted) {
            request.getRequestDispatcher("/cookieBanner.jsp").forward(request, response);
        }
    }
}
