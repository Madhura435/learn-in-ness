package com.spring.batch.Spring.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobInvokeController {
@Autowired
JobLauncher jobLauncher;
@Autowired
Job processJob;

@RequestMapping("invokejob")
public String handle() throws JobExecutionAlreadyRunningException, JobRestartException,
		JobInstanceAlreadyCompleteException, JobParametersInvalidException {
	
	JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
			.toJobParameters();
	
	jobLauncher.run(processJob, jobParameters);
	
	return "Batch Job has been invoked";
}
}
