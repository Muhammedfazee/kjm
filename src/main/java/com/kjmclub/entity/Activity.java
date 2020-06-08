package com.kjmclub.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ACTIVITY")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ACTIVITY_ID")
    private long activityId;

    private String desc;
    private String type;

    @ManyToMany
    @JoinTable(
            name = "MEMBER_ACTIVITY",
            joinColumns = @JoinColumn(name = "ACTIVITY_ID"),
            inverseJoinColumns = @JoinColumn(name  = "MEMBER_ID")
    )
    private List<Member> members;


    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
