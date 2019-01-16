package com.grammer.schedule.service.connection;

import com.grammer.schedule.dto.UserConnection;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class ConnectionPoolServiceImpl implements ConnectionPoolService {

    private final Map<String, UserConnection> connectionsMap = new HashMap<>();


    @PostConstruct
    public void initConnections() {
        // init user connections saved in db
    }

    @Override
    public void remove(String userId) {
        UserConnection userConnection1 = connectionsMap.get(userId);
        userConnection1.close();
    }

    @Override
    public Optional<UserConnection> findBy(String userId) {
        return Optional.ofNullable(connectionsMap.get(userId));
    }

    @Override
    public Optional<UserConnection> init(String login, String password) {
        final UserConnection userConnection = new UserConnection();
        userConnection.setUserId(login + "_" + password);

        connectionsMap.put(login + "_" + password, userConnection);

        return Optional.of(userConnection);
    }
}
