<%@page import="java.util.List"%>
<%@page import="com.board.domain.BoardVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	List<BoardVO> boardList = (List) request.getAttribute("boardList");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<%for(BoardVO board : boardList){ %>
		<tr>
			<td><%=board.getBno() %></td>
			<td><a href="/board/detail?bno=<%=board.getBno()%>"><%=board.getTitle() %></a></td>
			<td><%=board.getContent() %></td>
			<td><%=board.getWriter() %></td>
			<td><%=board.getRegDate() %></td>
			<td><%=board.getViewCnt() %></td>
		<%} %>
		</tr>
	</tbody>
</table>
	<div>
		<a href="/board/write">글 등록</a>
		<a href="/board/listPage?bno=1">페이지보기</a>
	</div>
	
<script>


</script>

</body>
</html>