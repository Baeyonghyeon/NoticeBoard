package com.nhnacademy.noticeboard.command;

import com.nhnacademy.noticeboard.domain.Member;
import com.nhnacademy.noticeboard.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class AddMemberController implements Command {

    UserRepository userRepository;

    public AddMemberController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String name = request.getParameter("name");
        String profileFileName = request.getParameter("profileFileName");
        userRepository.add(new Member(id, pwd, name, profileFileName));
        log.debug("현재 등록된 회원수 : " + userRepository.getUsers().size());
        return "addMemberSuccess.jsp";
    }
}
