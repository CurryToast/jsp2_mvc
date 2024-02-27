package day6.mvc;

import java.util.HashMap;
import java.util.Map;

import day6.mvc.Controller.CartController;
import day6.mvc.Controller.CommunityListController;
import day6.mvc.Controller.CommunityWriteController;
import day6.mvc.Controller.Controller;
import day6.mvc.Controller.LoginController;
import day6.mvc.Controller.MemberJoinController;
import day6.mvc.Controller.MemberModifyController;
import day6.mvc.Controller.MemberSaveController;
import day6.mvc.Controller.MyPageController;
import day6.mvc.Controller.ProductListController;
import day6.mvc.Controller.RequestMap;

public class RequestControllerMapping {
	// Key는 url, method로 구성된 RequestMap 객체, value는 Controller
	private static final Map<RequestMap, Controller> mapping = new HashMap<>();
	
	public static void init() {
		mapping.put(new RequestMap("/member/join", "GET"), new MemberJoinController());
		mapping.put(new RequestMap("/member/modify", "GET"), new MemberModifyController());
		mapping.put(new RequestMap("/member/save", "POST"), new MemberSaveController());
		mapping.put(new RequestMap("/community/list", "GET"), new CommunityListController());
		mapping.put(new RequestMap("/community/write", "GET"), new CommunityWriteController());
		mapping.put(new RequestMap("/mypage", "GET"), new MyPageController());
		mapping.put(new RequestMap("/cart", "GET"), new CartController());
		mapping.put(new RequestMap("/login", "GET"), new LoginController());
		mapping.put(new RequestMap("/product/list", "GET"), new ProductListController());
	}
	
	public static Controller getController(RequestMap key) {
		return mapping.get(key);
	}
}
