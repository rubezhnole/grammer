package com.grammer.schedule.service.executor;

import com.grammer.schedule.dto.ExecutableItem;

public interface Schedulable<T extends ExecutableItem> {

    void execute(T executableItem);
}
