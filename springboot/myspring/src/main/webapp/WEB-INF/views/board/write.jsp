<%@page import="com.board.domain.BoardVO"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>게시판</title>
</head>
<body>
	<div id="root">

		<hr />

		<nav>처음화면 - 글쓰기 - 로그인</nav>

		<hr />

		<section id="container">

			<form role="form" method="post" autocomplete="off">
				<p>
					<label for="num">글 번호</label>
					<input type="text" id="num" name="num" readonly="readonly" />
				</p>

				<p>
					<label for="title">글 제목</label>
					<input type="text" id="title"
						name="title" readonly="readonly" />
				</p>
				<p>
					<label for="content">글 내용</label>
					<textarea id="content" name="content" readonly="readonly"></textarea>
				</p>
				<p>
					<label for="writer">작성자</label>
					<input type="text" id="writer" name="writer" readonly="readonly" />
						<br />
					<label>작성 날짜</label> 
					<span>
					<input type="datetime" value="regdate" pattern="yyyy-MM-dd" />
					</span>
				</p>
					<button type="submit">작성완료</button>
			</form>

		</section>

		<hr />

	</div>

</body>
</html>