package org.ecmicroservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value="/ecms")
public class MicroServiceController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String test(){
		return "test micro service";
	}
}
