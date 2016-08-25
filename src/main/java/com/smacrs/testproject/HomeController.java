package com.smacrs.testproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.SpringTransactionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {
	
	

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage", "This is the message from the controller!");
		return "home";
	}
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String signiIn(Model model) {
		logger.info("Sign In page");
//		model.addAttribute("controllerMessage", "SignIn!");
		return "signIn";
	}
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signiUp(Model model) {
		logger.info("Sign Up page");
//		model.addAttribute("controllerMessage", "SignUp!");
		return "signUp";
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
//	@PersistenceContext
//	private EntityManager em;
	/**
	 * Selects the home page and populates the model with a message
	 */
	@Transactional
	@RequestMapping(value = "/doSignIn", method = RequestMethod.POST)
	public String doSignIn(Model model,@RequestParam("email") String email,@RequestParam("pass") String pass) {
		logger.info("entering the system");
//		ModelAndView modelv=new ModelAndView();
		UserModel user=new UserModel();
		Query query = em.createQuery("from UserModel where UserEmail='"+email+"' and UserPass='"+pass+"'");
        user= (UserModel) query.getResultList().get(0);
        
		model.addAttribute("userName", user.getUserName());
		return "System";
	}
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@PersistenceContext
	private EntityManager em;
	@Transactional
	@RequestMapping(value = "/doSignUp", method = RequestMethod.POST)
	public String doSigniUp(Model model,@RequestParam("name") String name,
			@RequestParam("email") String email,@RequestParam("pass") String pass) {
		logger.info("creating an account!");
		UserModel user=new UserModel();
		user.setUserEmail(email);
		user.setUserPass(pass);
		user.setUserName(name);
		user.setUserAdress("sgas");
		System.out.println(user.toString());
		em.persist(user);
		
//		model.addAttribute("controllerMessage", "SignUp!");
		return "signIn";
	}


}
