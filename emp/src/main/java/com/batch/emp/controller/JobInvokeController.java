package com.batch.emp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class JobInvokeController {
@Autowired
JobLauncher jobLauncher;

@Autowired
public Job job;

@GetMapping("invokejob")
public BatchStatus handle() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException  {
	Map<String,JobParameter> maps=new HashMap();
	maps.put("time", new JobParameter(System.currentTimeMillis()));
	JobParameters jobParameters=new JobParameters(maps);
	JobExecution jobExecution=jobLauncher.run(job, jobParameters);
	System.out.println("JobExecution"+" "+jobExecution.getStatus());
	
	System.out.println("Batch is Running");
	while(jobExecution.isRunning())
	{
		System.out.println("step1 ******");
		int a=5;
		log.info("mssm {}",a);
	}
	return jobExecution.getStatus();
}

}
