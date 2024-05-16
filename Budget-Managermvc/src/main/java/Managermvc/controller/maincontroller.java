package Managermvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transaction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

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
	
	//handle add transaction
	@RequestMapping(value = "/handle-transaction", method = RequestMethod.POST)
	public RedirectView handleTransaction(@ModelAttribute Transaction trans, HttpServletRequest request) {
		System.out.println(trans);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
