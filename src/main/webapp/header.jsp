<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
	<style type="text/css">
		ul {
			list-style: none;
			padding: 20px;
			display: flex;
			border-bottom: 3px solid gray;
		}
		
		li {
			padding: 20px;
		}
		
		a {
			text-decoration: none;
		}
		
		a > span {
			font-weight: 700;
		}
	</style>
</head>
<body>
	<ul class="header-ul">
		<li><a href="<%= request.getContextPath() %>"><span>HOME</span></a></li>
		<li><a href="${pageContext.request.contextPath}/member/join">회원가입</a></li>
		<li><a href="${pageContext.request.contextPath}/member/modify">회원정보수정</a></li>
		<li><a href="${pageContext.request.contextPath}/product/list">상품목록</a></li>
		<li><a href="${pageContext.request.contextPath}/community/list">커뮤니티(게시판)</a></li>
		<li><a href="${pageContext.request.contextPath}/community/write">커뮤니티(글쓰기)</a></li>
		<li><a href="${pageContext.request.contextPath}/mypage">마이페이지</a></li>
		<li><a href="${pageContext.request.contextPath}/cart">장바구니</a></li>
		<li><a href="${pageContext.request.contextPath}/login">로그인</a></li>
		<li class="profile">
			<img alt="profile" src="${pageContext.request.contextPath}/assets/images/foximage.jpeg">
		</li>
	</ul>
</body>
</html>