<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> TODOList 휴지통 </h1>
	
	<div>
		<ul>
			<li>
				<a href="/todo/list"><button>리스트로</button></a>
			</li>
		</ul>
	</div>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>내용</th>
				<th>작성일</th>
				<th>수정일</th>
				<th>파일개수</th>
				<th>삭제여부</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="tvo">
			<tr>
				<td>${tvo.tno }</td>
				<td>${tvo.writer }</td>
				<td>${tvo.content }</td>
				<td>${tvo.regdate }</td>
				<td>${tvo.moddate }</td>
				<td>${tvo.hasfile }</td>
				<td>${tvo.isDel }</td>
				<td><a href="/todo/restore?tno=${tvo.tno }"><button>복구</button></a></td>
				<td><a href="/todo/realdel?tno=${tvo.tno }"><button>완전삭제</button></a></td>
			</tr>
			
		</c:forEach>
		</tbody>
	
	</table>

</body>
</html>