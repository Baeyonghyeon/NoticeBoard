package com.nhnacademy.noticeboard.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

public class LogoutController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        //"id"session이 null이 아니면 현재 로그인한 상태이기 때문에 세션 종료하며 로그인 화면으로 이동.
        if (Objects.nonNull(session) && Objects.nonNull(session.getAttribute("id"))) {
            session.invalidate();
        }

        return "redirect:/login.do";
    }

}
