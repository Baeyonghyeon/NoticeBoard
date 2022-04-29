package com.nhnacademy.noticeboard.command;

import com.nhnacademy.noticeboard.domain.User;
import com.nhnacademy.noticeboard.domain.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class MemberCheckController implements Command{

    UserRepository userRepository;

    public MemberCheckController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "memberCheck.jsp";
    }
}
