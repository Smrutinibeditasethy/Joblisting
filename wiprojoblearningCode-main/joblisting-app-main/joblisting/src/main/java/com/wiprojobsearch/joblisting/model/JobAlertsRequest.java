package com.wiprojobsearch.joblisting.model;

import java.util.Set;

public class JobAlertsRequest {

    private Set<String> preferredSkills;

    public Set<String> getPreferredSkills() {
        return preferredSkills;
    }

    public void setPreferredSkills(Set<String> preferredSkills) {
        this.preferredSkills = preferredSkills;
    }
}
