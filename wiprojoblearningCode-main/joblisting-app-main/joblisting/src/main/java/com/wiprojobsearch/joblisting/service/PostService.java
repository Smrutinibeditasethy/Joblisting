package com.wiprojobsearch.joblisting.service;


import com.wiprojobsearch.joblisting.model.Post;
import com.wiprojobsearch.joblisting.repository.PostRepository;
import com.wiprojobsearch.joblisting.repository.UserRepository;
import com.wiprojobsearch.joblisting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Post> getRecommendedJobs(String userId) {
        // Retrieve user information from the database based on userId
        User user = userRepository.findById(userId).orElse(null);

        // Assuming user skills are stored in the User class
        Set<String> userSkills = (user != null) ? user.getSkills() : null;

        // Implement your logic to find recommended jobs based on user skills
        // For example, find jobs that require at least one of the user's skills
        return (userSkills != null) ? postRepository.findByTechsIn(userSkills) : null;
    }
}
