package kr.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kr.kosta.model.GuestBookDAO;
import kr.kosta.model.GuestBookVO;

public class WriteController implements Controller {
	
	private GuestBookDAO guestBookDAO;

	public void setGuestBookDAO(GuestBookDAO guestBookDAO) { // DI
		this.guestBookDAO = guestBookDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		int num = Integer.parseInt(request.getParameter("pwd"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String home = request.getParameter("home");
		String contents = request.getParameter("contents");
		
		GuestBookVO vo = new GuestBookVO();
		vo.setNum(num);
		vo.setName(name);
		vo.setEmail(email);
		vo.setHome(home);
		vo.setContents(contents);
		guestBookDAO.insertGuest(vo);
		mav.setViewName("redirect:list.do");
		return mav;
	}

}
