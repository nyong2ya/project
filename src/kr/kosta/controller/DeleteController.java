package kr.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kr.kosta.model.GuestBookDAO;

public class DeleteController implements Controller {
	
	private GuestBookDAO guestBookDAO;

	public void setGuestBookDAO(GuestBookDAO guestBookDAO) { // DI
		this.guestBookDAO = guestBookDAO;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		int num = Integer.parseInt(request.getParameter("num"));
		guestBookDAO.deleteGuest(num);
		mav.setViewName("redirect:list.do");
		return mav;
	}

}
