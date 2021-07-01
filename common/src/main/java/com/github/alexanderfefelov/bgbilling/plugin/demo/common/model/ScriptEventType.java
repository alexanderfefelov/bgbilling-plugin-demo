package com.github.alexanderfefelov.bgbilling.plugin.demo.common.model;

public class ScriptEventType {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getEventMode() {
        return eventMode;
    }

    public void setEventMode(Integer eventMode) {
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

    private Long id;
    private String moduleId;
    private Integer eventMode;
    private String eventId;
    private String title;
}
