package com.nhnacademy.noticeboard.domain;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserRepository {

    List<User> users = new ArrayList<>();

    public UserManager() {
        this.users.add(new Member("yonghyeon1", "123", "용현1", "1"));
        this.users.add(new Member("yonghyeon2", "123", "용현2", "2"));
        this.users.add(new Member("yonghyeon3", "123", "용현3", "3"));
        this.users.add(new Member("yonghyeon4", "123", "용현4", "4"));
    }

    @Override
    public void add(User user) {
        this.users.add(user);
    }

    @Override
    public void modify(User user) {
        long count = users.stream()
                .filter(player -> player.getId().equals(user.getId()))
                .count();

        this.users.set((int) count, user);
    }

    @Override
    public User remove(String id) {
        long count = users.stream()
                .filter(player -> player.getId().equals(id))
                .count();

        return this.users.remove((int) count);
    }

    @Override
    public User getUser(String id) {
        long count = users.stream()
                .filter(player -> player.getId().equals(id))
                .count();

        return this.users.get((int) count);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
