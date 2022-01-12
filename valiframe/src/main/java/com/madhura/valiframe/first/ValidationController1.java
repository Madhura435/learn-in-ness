package com.madhura.valiframe.first;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class ValidationController1 {
	
	@GetMapping("/validate1")
	public String getData(@PathParam("data") @NotNull String data)
	{
		System.out.println(data);
		return data;
	}
	

	@PostMapping(value="/validate2", consumes= {MediaType.ALL_VALUE})
	public @Valid String getData(@RequestBody @Valid RequestDTO data)
	{
		System.out.println(data);
		return data.getRequest();
	}
	
}
