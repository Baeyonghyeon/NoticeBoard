package com.nhnacademy.noticeboard.util;

import com.nhnacademy.noticeboard.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddMemberFormController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/addMember.jsp";
    }
}
