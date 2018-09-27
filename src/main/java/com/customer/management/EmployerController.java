package com.customer.management;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployerController {
	@RequestMapping(value = "/")
    public String listEmployee() {       
        return "Home";
	}
}
