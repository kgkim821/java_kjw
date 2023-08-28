<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 상세</h1>
	<div>제목 : ${board.bo_title }</div>
	<div>작성자 :${board.bo_me_id}</div>

	<form herf="<c:url value='/board/'/>">
	<button>삭제</button>
	<input type ="hidden" name ="bo_num" value="${board.bo_num }">
	</form> <br>
	<a herf="<c:url value='/board/update?bo_num=${board.bonum}'/>">수정</a>	<br>
	<a herf="<c:url value='/list'/>">목록으로</a>
	<script type="text/javascript">
	function checkId(){
		let bo_me_id=prompt('작성자 아이디를 입력하세요')
		if(bo_me_id != '{board.bo_me_id}'){
			return false;
	}
	return true;
}
	</script>
</body>
</html>