package com.github.alexanderfefelov.bgbilling.plugin.demo.common.model;

public class ScriptEventType {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public int getEventMode() {
        return eventMode;
    }

    public void setEventMode(int eventMode) {
        this.eventMode = eventMode;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private long id;
    private String moduleId;
    private int eventMode;
    private String eventId;
    private String title;
}
