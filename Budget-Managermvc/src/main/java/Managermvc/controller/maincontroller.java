package Managermvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class maincontroller {


		@RequestMapping("/")
		public String home() {
			return "index";
		}
		
	@RequestMapping("/add-transaction")
	public String addtransaction(Model m)
	 {
		m.addAttribute("title", "add transaction");
		 return "Transaction";
	 }
}
