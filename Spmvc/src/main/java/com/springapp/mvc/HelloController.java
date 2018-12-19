package com.springapp.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @RequestMapping(value="/aa",method={RequestMethod.GET,RequestMethod.HEAD})
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "你好!");
		return "first";
	}
}