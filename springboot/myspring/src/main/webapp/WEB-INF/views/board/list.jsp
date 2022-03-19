<%@page import="java.util.List"%>
<%@page import="com.board.domain.BoardVO"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	List<BoardVO> boardList = (List) request.getAttribute("boardList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>	
	</thead>
	<tbody>
		<%for(BoardVO board : boardList){ %>
 			<tr>
 				<td><%board.getBno(); %></td>
 				<td><%board.getTitle(); %></td>
 				<td><%board.getContent(); %></td>
 				<td><%board.getWirter(); %></td>
 				<td><%board.getDate(); %></td>
 				<td><%board.getViewCnt(); %></td>
			</tr>
		<%} %>
	</tbody>
</table>
	<div>
		<a href="/board/write">글 등록</a>
	</div>

</body>
</html>