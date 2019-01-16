package com.grammer.schedule.service.executor;

import com.grammer.schedule.dto.SchecduleConfigDto;
import com.grammer.schedule.service.connection.ConnectionPoolService;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleImpl implements Schedule {

    private ConnectionPoolService connectionPoolService;

    @Autowired
    public ScheduleImpl(ConnectionPoolService connectionPoolService) {
        this.connectionPoolService = connectionPoolService;
    }

    @Override
    public void setUpSchecdule(SchecduleConfigDto schecduleConfigDto, Runnable runnable) {

        // config timer
        // run schedule runnable

        runnable.run();
    }
}
