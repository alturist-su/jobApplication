package com.myapp.jobApplication.job;

import org.springframework.data.jpa.repository.JpaRepository;

//spring data JPA will create an implementation of this interface for us to use
public interface JobRepository extends JpaRepository<Job, Long> {

}
