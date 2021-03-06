package com.KyMann.MeesaBieber.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JarJarBieberTweet {

    @NotNull
    @Size(min=1, max=240)
    private String tweet;

    private int changes;

    private boolean approved;

    @GeneratedValue
    @Id
    private int id;

    public JarJarBieberTweet() {}

    public JarJarBieberTweet(String aTweet, int aChanges) {
        tweet = aTweet;
        changes = aChanges;
        approved = true;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet; }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }

    public boolean isApproved() {return approved;}

    public void setApproved(boolean approved) { this.approved = approved;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

}
