<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<script type="text/javascript">
function regist(){
	form1.action="/board/write";
	form1.method="post";
	form1.submit();
}
</script>
</head>
<body>

<h3>Contact Form</h3>

<div class="container">
  <form name="form1">
    <input type="text" 		name="title" 			placeholder="Your name..">
    <input type="text" 		name="writer" 		placeholder="Your last name..">
    <textarea 					name="content" 		placeholder="Write something.." style="height:200px"></textarea>
 	<p>
    <input type="button" value="Submit" onClick="regist()">
  </form>
</div>

</body>
</html>
