package kr.kosta.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kr.kosta.model.GuestBookDAO;

public class ListController implements Controller {

	private GuestBookDAO guestBookDAO;
	
	public void setGuestBookDAO(GuestBookDAO guestBookDAO) { // DI 
		this.guestBookDAO = guestBookDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List list = guestBookDAO.listGuest();
		
		mav.addObject("list",list);
		mav.setViewName("list");// /WEB-INF/views/list.jsp
		return mav;
	}

}
