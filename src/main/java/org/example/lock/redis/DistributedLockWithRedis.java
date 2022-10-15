package org.example.lock.redis;

import org.example.lock.DistributedLock;

import java.util.concurrent.TimeUnit;

public class DistributedLockWithRedis implements DistributedLock {
    @Override
    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unLock() {

    }
}
