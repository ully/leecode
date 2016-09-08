package com.ully.lifecycle;

/**
 * Created by ully.li on 2016/9/8.
 */
public class Light implements Lifecycle{
    private LifecycleSupport lifecycle = new LifecycleSupport(this);

    private String name ;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_START, null);
        System.out.println("大灯"+ this.name +"开始发光...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_START, null);
    }

    @Override
    public void stop() {
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_STOP, null);
        System.out.println("大灯"+ this.name +"关闭...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_STOP, null);
    }

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    @Override
    public LifecycleListener[] getLifecycleEvents() {
        return lifecycle.getLifecycleEvents();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
