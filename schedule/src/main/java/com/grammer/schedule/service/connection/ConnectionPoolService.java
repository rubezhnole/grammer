package com.grammer.schedule.service.connection;

import com.grammer.schedule.dto.UserConnection;

import java.util.Optional;

public interface ConnectionPoolService {

    void remove(String userId);

    Optional<UserConnection> findBy(String userId);

    Optional<UserConnection> init(String login, String password);
}
