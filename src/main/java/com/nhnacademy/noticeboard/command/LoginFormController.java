package com.nhnacademy.noticeboard.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

public class LoginFormController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);

        //세션이 없거나 "id"session이 null 값일 경우 다시 로그인
        if (Objects.isNull(session) || Objects.isNull(session.getAttribute("id"))) {
            return "/loginForm.jsp";
        } else {
            return"/loginSuccess.jsp";
        }
    }

}
