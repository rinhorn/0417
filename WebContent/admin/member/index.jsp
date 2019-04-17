<%@page import="game.model.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	List<Member> memberList=(List)request.getAttribute("memberList");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/admin/common/bar.jsp"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/admin/common/tableStyle.jsp"%>
</head>
<style>
#member {
	background-color: #4CAF50;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>

</script>
<body>
	<div>
		<h2>Member Management</h2>
	</div>
	<div>
		<form>
			<input type="text" placeholder="Search.." name="search">
			<button type="submit">
				<i class="fa fa-search"></i>
			</button>
		</form>
	</div>

	<table>
		<tr>
			<th>ID</th>
			<th>Password</th>
			<th>Name</th>
			<th>Nickname</th>
			<th>Email</th>
		</tr>
		<%for(int i=0; i<memberList.size(); i++){ %>
		<%Member member=memberList.get(i); %>
		<tr>
			<td><%=member.getId() %></td>
			<td><%=member.getPass() %></td>
			<td><%=member.getName() %></td>
			<td><%=member.getNick() %></td>
			<td><%=member.getEmail() %></td>
		</tr>
		<%} %>
		<tr>
			<td colspan="5">
				<%for(int i=1; i<=5; i++){ %> 
					[<%=i %>] 
				<%} %>
			</td>
		</tr>
	</table>

</body>
</html>
