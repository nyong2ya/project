package kr.edu.kosta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		/*key,value 가지는 데이터 생성.(request.setAttribute("id", "kwan1357");)*/
		mav.addObject("id","kwan1357");
		mav.addObject("pw","1234");
		mav.addObject("name","kwanyong");
		//mav.setViewName("WEB-INF/view/hello.jsp");
		mav.setViewName("hello"); //어떤 페이지로 이동할 것인지 VIEW 설정
		
		/*viewResolver에서 정의 형식과 조합함.
		(접두어) /view/ + hello + .jsp(접미사)*/
		
		return mav;
	}

}
