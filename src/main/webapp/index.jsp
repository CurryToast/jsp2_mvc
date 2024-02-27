<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css" >
<title>JSP2 MVC</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3>프론트 컨트롤러 테스트</h3>
	<hr>
	<p>
		url은 확장자가 없는 형식으로 만들어 봅시다.
		<br>
		프로젝트에서는 기능별로 폴더를 만듭니다.
	</p>
	<ul>
		<li><a href="member/join">회원가입</a></li>
		<li><a href="member/modify">회원정보수정</a></li>
		<li><a href="product/list">상품목록</a></li>
		<li><a href="community/list">커뮤니티(게시판)</a></li>
		<li><a href="community/write">커뮤니티(글쓰기)</a></li>
		<li><a href="mypage">마이페이지</a></li>
		<li><a href="cart">장바구니</a></li>
		<li><a href="login">로그인</a></li>
		<li>
			<form action="member/save" method="post">
				<input type="text" name="test" placeholder="테스트입니다.">
				<button>POST테스트</button>
			</form>
		</li>
	</ul>
</body>
</html>