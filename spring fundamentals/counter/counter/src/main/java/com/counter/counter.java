package com.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counter {
	@RequestMapping("/counter")
	public String homePage() {

		return "index.jsp";
	}

	@RequestMapping("/")

	public String visitorCounter(HttpSession session) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			++count;
			session.setAttribute("count", count);
		}
		return "counter.jsp";
	}

}
