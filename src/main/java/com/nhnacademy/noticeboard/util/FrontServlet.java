package com.nhnacademy.noticeboard.util;

import com.nhnacademy.noticeboard.command.*;
import com.nhnacademy.noticeboard.domain.UserManager;
import com.nhnacademy.noticeboard.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name = "frontServlet", urlPatterns = "*.do")
public class FrontServlet extends HttpServlet {

    private static final String REDIRECT_PREFIX = "redirect:";
    private static UserRepository userRepository = new UserManager();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        try {
            Command command = resolveCommand(req.getServletPath(), req.getMethod());
            String view = command.execute(req, resp);

            if (view.startsWith(REDIRECT_PREFIX)) {
                resp.sendRedirect(view.substring(REDIRECT_PREFIX.length()));
            } else {
                RequestDispatcher rd = req.getRequestDispatcher(view);
                rd.include(req, resp);
            }
        } catch (Exception ex) {
            log.error("", ex);

            req.setAttribute("exception", ex);

            RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
            rd.forward(req, resp);
        }
    }

    private Command resolveCommand(String servletPath, String method) {
        Command command = null;

        if ("/login.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new LoginFormController();
        } else if ("/login.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new LoginProcessingController("admin", "12345");
        }else if ("/addMember.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new AddMemberFormController();
        } else if ("/addMember.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new AddMemberController(userRepository);
        } else if ("/memberCheck.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new MemberCheckController(userRepository);
        }
        return command;
    }
}
