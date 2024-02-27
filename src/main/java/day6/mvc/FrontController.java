package day6.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import day6.mvc.Controller.Controller;
import day6.mvc.Controller.RequestMap;

@WebServlet(urlPatterns = {"/"}, description = "모든 요청을 받는 서블릿.")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);

	// 서블릿이 톰캣에서 실행되기 시작할 때 (메모리에 로드될 때) 실행하는 메소드
	@Override
	public void init() throws ServletException {
		RequestControllerMapping.init();
	}

	// get, post 방식 상관없이 요청을 처리하는 메소드
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getServletPath();
		String method = req.getMethod();

		RequestMap map = new RequestMap(url, method);
		Controller controller = RequestControllerMapping.getController(map);

		controller.handle(req, resp);
	}

	// service와 doget 모두 동작하는지 확인 => service 메소드만 실행합니다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getServletPath();
		String method = req.getMethod();
		logger.info("  [doGet 메소드] url : {}, method : {} ", url, method);
	}
}

/*
 * 	아래 if문을 Map을 생성하여 저장하는 방법으로 대체.
 * 		Map의 Key는 url, method로 구성된 RequestMap 객체, value는 Controller
 *  if (url.equals("/member/join") && method.equals("GET")) {
		controller = new MemberJoinController();
	} else if (url.equals("/member/modify") && method.equals("GET")) {
		controller = new MemberModifyController();
	} else if (url.equals("/community/list") && method.equals("GET")) {
		controller = new CommunityListController();
	} else if (url.equals("/product/list") && method.equals("GET")) {
		controller = new ProductListController();
	} else if (url.equals("/community/write") && method.equals("GET")) {
		controller = new CommunityWriteController();
	} else if (url.equals("/mypage") && method.equals("GET")) {
		controller = new MyPageController();
	} else if (url.equals("/cart") && method.equals("GET")) {
		controller = new CartController();
	} else if (url.equals("/login") && method.equals("GET")) {
		controller = new LoginController();
	} else if (url.equals("/member/save") && method.equals("POST")) {
		controller = new MemberSaveController();
	}
 * */
