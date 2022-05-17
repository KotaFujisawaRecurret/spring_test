package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {

	@RequestMapping("/")
	public String top() {
		return "index";
	}
	
	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView top(
			@RequestParam("num") int num,
			ModelAndView mv
			) {
//		if (num % 3 == 0&&num % 5 == 0) {
//			mv.addObject("result", "Fizz!! Buzz!! ");
//		}else if (num % 3 == 0) {
//			mv.addObject("result", "Fizz! ");
//		} else if (num % 5 == 0) {
//			mv.addObject("result", "Buzz! ");
//		} else {
//			mv.addObject("result", "ん？？");
//		}
		
		String r ="";
		if(num!=0) {
		if (num % 3 == 0) {
			r+="Fizz! ";
		}
		if (num % 5 == 0) {
			r+="Buzz! ";
		}
		if (num % 7 == 0) {
			r+="Ass! aaaaa";
		}
		
		mv.addObject("result", r);
		}
		mv.addObject("num", num);
		mv.addObject("numf", num);
		mv.addObject("num", num);
		mv.addObject("numf", num);
		mv.addObject("numffaf", num);
		
		mv.setViewName("index");
		return mv;
	}

}
