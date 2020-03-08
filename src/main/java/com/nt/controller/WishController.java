package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.Service;
@Controller
public class WishController {
	@Resource
private Service service;
	/*@RequestMapping("/welcome.htm")
public String process(Model model) {
String msg=service.generatorWish();
model.addAttribute("wMsg",msg);
return "result";*/
	/*@RequestMapping("/welcome.htm")
	public ModelAndView process() {
		String msg=service.generatorWish();
		return new ModelAndView("result","wMsg",msg);*/
	@RequestMapping("/welcome.htm")
	public String process (Map<String,Object> map) {
		String msg=service.generatorWish();
		map.put("wMsg",msg);
		return "result";
}
}
