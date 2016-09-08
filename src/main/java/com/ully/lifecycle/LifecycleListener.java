package com.ully.lifecycle;

/**
 * Created by ully.li on 2016/9/8.
 */
public interface LifecycleListener {
    /**
     * 当被监听的对象有事件发生时 会触发该方法
     * @param event
     */
    public void lifecycleEvent(LifecycleEvent event);
}
