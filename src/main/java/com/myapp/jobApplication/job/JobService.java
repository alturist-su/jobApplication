package com.myapp.jobApplication.job;

import java.util.List;

public interface JobService {

    //find all jobs
    List<Job> findAll();

    //create a new job
    void createJob(Job job);

    //get job by id
    Job getJobById(Long id);
}
