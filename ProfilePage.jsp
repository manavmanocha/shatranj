<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<head>
	<title>Shatranj</title>
	<link rel="stylesheet" href="css/main.css" type="text/css" />
	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript" src="js/jquery-bp.js" ></script>
	<script type="text/javascript" src="js/navigation.js" ></script>
	<script>
		function showGamePlayback(viewGameButton)
		{

			window.location = "showGamePlayback.do?gameId="+viewGameButton.id;
		}
	</script>
</head>
<body >
	<div id="header">
		<img src="img/title1.png"  style="float:left;margin-right:30em"/>
		<div style="margin-top:2.5em;color:yellow">

	    	<c:set var="name" value="${sessionScope.userName}" />
	    	<c:if test="${name != null}">
	    		Welcome
	   		    <span style="font-size:1.2em">
		    	    <c:out   value="${name}" />,
		    	    <a href="logout.do" style="color:yellow">Log out</a>
	    	    </span>
	    	</c:if>
	   	</div>

	</div>
	<div id="navigation" class="container">
		<div id="PlayChess" class="pri-nav"><div><a href="PlayChess.jsp">PlayChess</a></div></div>
		<div id="LearnChess" class="pri-nav"><div><a href="LearnChess.jsp">LearnChess</a></div></div>
		<div id="Members" class="pri-nav"><div><a href="Members.jsp">Members</a></div></div>
		<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
	</div>
	<div style="padding:0.5em;margin:4em 0.5em 0.5em 1em;height:25em;width:60em;overflow-y:scroll;border:1px solid white;background-color:rgb(100,150,200);">


		<c:set var="userDetailsList" value="${requestScope.userDetailsList}" />
		<img style="height:10em;width:7em;vertical-align:text-top;float:left;margin:0.5em 2em 0.25em 0em" src="<c:out value="${userDetailsList[0]}"/>"/>
		<table>
			<tr>
				<td style="font-size:1.8em;font-weight:bold">
					<c:out value="${userDetailsList[1]}"/>
				</td>
			</tr>
			<tr>
				<td>
					<c:out value="${userDetailsList[2]}"/>, <c:out value="${userDetailsList[3]}"/>, <c:out value="${userDetailsList[4]}"/>
				</td>
			</tr>

			<tr>
				<td>
					Star Rating : <c:out value="${userDetailsList[5]}"/>
				</td>
			</tr>
			<tr>
				<td>
					<c:out value="${userDetailsList[6]}"/>
				</td>
			</tr>
		</table>
		<div style="margin:3em 1em 0em 0em">
			<span style="text-decoration:underline;font-size:1.5em;font-weight:bold"> Games History</span>
			<table border="1" id="gamesHistoryTable">
				<tr>
					<th>Versus</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Result</th>
					<th></th>
				</tr>
			<c:set var="userGamesList" value="${requestScope.userGamesList}" />
				<c:forEach var="gameDetails" items="${userGamesList}" >


						<tr>
							<td>${gameDetails[1]}</td>
							<td>${gameDetails[2]}</td>
							<td>${gameDetails[3]}</td>
							<td>${gameDetails[4]}</td>
							<td><input type="button" value="View Game" id="${gameDetails[0]}" name="${gameDetails[1]}" onclick="showGamePlayback(this)"/></td>
						</tr>


				</c:forEach>
			</table>
		</div>






	</div>

</body>
</html>
