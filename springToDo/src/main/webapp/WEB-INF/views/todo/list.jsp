<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.todoBox{
		display: flex;
		margin: 20px;
	}
	.todoBox>div{
		margin-right: 20px;
	}
	.todoBox>div>input{
		height: 30px;
		width: 500px;
	}
</style>
</head>
<body>
	<h3> 메뉴 </h3>
	<div>
		<ul>
			<li>
				<a href="/"><button>메인으로</button></a>
			</li>
			<li> 
				<a href="/todo/recycle"><button>TODO List 휴지통</button></a>
			</li>
		</ul>
	</div>
	
	
	<h3> TODO List </h3>
	<div>
		<form action="/todo/add" method="post">
			작성자 : <input type="text" name="writer" value="작성자">
			내용 : <input type="text" name="content">
			<button type="submit"> 작성하기 </button>
		</form>
	
	
	</div>
	
	<!-- TODO List 출력 부분 -->
		<ul class="todoContainer">
	<c:forEach items="${list}" var="tvo">
			<li>
				<form action="/todo/modify" method="post">
					<div class="todoBox">
						<div> <input type="hidden" name="tno" value="${tvo.tno }"></div>
						<div> <input type="hidden" name="writer" value="${tvo.writer }">${tvo.writer }</div>
						<div> <input type="text" name="content" value="${tvo.content }"></div>
						<div>
							<button type="submit">수정</button>
							<a href="/todo/remove?tno=${tvo.tno}"><button type="button">삭제</button></a>
						</div>
					</div>
				</form>
			</li>
	</c:forEach>
		</ul>
	
</body>
</html>