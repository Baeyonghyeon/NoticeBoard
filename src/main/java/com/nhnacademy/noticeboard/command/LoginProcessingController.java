package com.nhnacademy.noticeboard.command;

import com.nhnacademy.noticeboard.command.Command;

import javax.servlet.ServletContext;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@HandlesTypes({
        javax.servlet.Servlet.class,
        javax.servlet.Filter.class,
        javax.servlet.ServletContextListener.class
})
public class LoginProcessingController implements Command {

    private String id;
    private String pwd;

    public LoginProcessingController(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }



    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        if (id != null && pwd != null && id.equals(this.id) && pwd.equals(this.pwd)) {
            HttpSession session = request.getSession();
            session.setAttribute("id", id);
            return "redirect:/login.do";
        } else {
            return "/loginForm.jsp";
        }
    }
}
