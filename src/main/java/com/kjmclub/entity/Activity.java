package com.kjmclub.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ACTIVITY")
public class Activity {

    @Id
    @Column(name = "ACTIVITY_ID")
    private long activityId;

    @Column(name = "DESC")
    private String description;

    @Column(name = "TYPE")
    private String type;

    @ManyToMany
    @JoinTable(
            name = "MEMBER_ACTIVITY",
            joinColumns = @JoinColumn(name = "ACTIVITY_ID"),
            inverseJoinColumns = @JoinColumn(name = "MEMBER_ID")
    )
    private List<Member> members;

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
