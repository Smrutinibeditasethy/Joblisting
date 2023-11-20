package com.wiprojobsearch.joblisting.service;

import com.wiprojobsearch.joblisting.model.JobAlertsRequest;
import com.wiprojobsearch.joblisting.model.User;
import com.wiprojobsearch.joblisting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobAlertsService {

    @Autowired
    private UserRepository userRepository;

    public void setJobAlerts(String userId, JobAlertsRequest jobAlertsRequest) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        // Update user's preferred skills
        user.setPreferredSkills(jobAlertsRequest.getPreferredSkills());

        // Save the updated user
        userRepository.save(user);
    }

}
