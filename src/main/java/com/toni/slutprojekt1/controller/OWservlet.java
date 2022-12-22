package com.toni.slutprojekt1.controller;

import com.toni.slutprojekt1.model.GettheWeather;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.toni.slutprojekt1.model.GettheWeather;
import com.toni.slutprojekt1.model.weatherBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "OWServlet", value = "/OWServlet")
public class OWservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Saves input from user to Strings
        String cityStr = request.getParameter("city");
        String countryStr = request.getParameter("country");

        // Loops through cookies to find "searchCookie". Saves value to "temp"
        String temp = "";
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("searchCookie")) {
                temp = cookies[i].getValue();
            }
        }

        //Loops through cookies to find "consentCookie". If it exists - sets cookie "searchCookie" to save searches.
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("consentCookie")) {
                response.addCookie(new Cookie("searchCookie", temp + "<br>" + cityStr + countryStr));
            }
        }

        response.setContentType("text/html");


        weatherBean wBean = new weatherBean(cityStr, countryStr);

        GettheWeather.getWeather(wBean);

        request.setAttribute("wBean", wBean);

        RequestDispatcher rd = request.getRequestDispatcher("showWeather.jsp");
        rd.forward(request, response);
    }

}


