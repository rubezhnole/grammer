package com.grammer.schedule.service.executor;

import com.grammer.schedule.dto.SchecduleConfigDto;

public interface Schedule {

    void setUpSchecdule(SchecduleConfigDto schecduleConfigDto, Runnable runnable);
}
