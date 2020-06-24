package com.altran.bank.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@Autowired
    @RequestMapping(path = {"/"}, method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    String index(HttpServletResponse response, @RequestParam Optional<String> lang) throws Exception {
        return "";
    }
}
