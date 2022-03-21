<%@page import="com.board.domain.BoardVO"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	BoardVO board = (BoardVO) request.getAttribute("read");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>

<h3>Contact Form</h3>

<div class="container">
  <form name="form1">
  	<input type="hidden" name="bno" value="<%=board.getBno()%>">
	<div>
  		<label>제목</label>
    	<input type="text" 		name="title" 			placeholder="제목" value="<%=board.getTitle()%>">
	</div>
    <div>
    	<label>작성자</label>
    	<input type="text" 		name="writer" 		placeholder="작성자" value="<%=board.getWriter()%>" readonly="readonly">
    </div>
    <div>
        <label>내용</label>
   		<textarea 					name="content" 		placeholder="내용" style="height:200px"><%=board.getContent()%></textarea>
 	</div>
 	<p>
 		<button id="modify_btn">수정</button>
 		<button id="delete_btn">삭제</button>
    </p>
  </form>
</div>

<script type="text/javascript">
var formObj = $("form[name='form1']");
$("#modify_btn").click(function(){
	var result = confirm("수정하시겠습니까?");
	if(result){
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");
		formObj.submit();
	}else{
		return;
	}
});
$("#delete_btn").click(function(){
	formObj.attr("action", "/board/delete?bno="+<%=board.getBno()%>);
	formObj.attr("method", "get");
	formObj.submit();
});

</script>
</body>
</html>
