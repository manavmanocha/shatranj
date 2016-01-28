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
	<script type="text/javascript">
		function showUserProfile(userName)
		{
			window.location="showUserProfile.do?userName="+userName;
		}
		function viewOnlineGame(gameId)
		{
			window.location="viewOnlineGame.do?gameId="+gameId;
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


		<div style="padding:0.25em;margin:4em 5em 0em 4em;float:left;border:1px solid white;width:25em;height:25em;overflow-y:scroll;background-color:rgb(100,150,200)">
			<div style="text-decoration:underline;font-size:1.5em;margin-bottom:1em">
				Ongoing Games
			</div>
			<c:set var="ongoingGamesList" value="${requestScope.ongoingGamesList}" />
			<c:forEach var="ongoingGame" items="${ongoingGamesList}">
				<div style="border-bottom:1px solid white;margin-bottom:2em">

					<c:out value="${ongoingGame[1]}"></c:out>
					<span> V/s </span>
					<c:out value="${ongoingGame[2]}"></c:out>
					<div style="float:right">
						<input type="button" value="View game" onclick="viewOnlineGame(this.name)" name="${ongoingGame[0]}"/>
					</div>
				</div>
			</c:forEach>
		</div>
		<div style="padding:0.25em;margin:4em 0em 0em 0em;border:1px solid white;height:25em;width:25em;overflow-y:scroll;background-color:rgb(100,150,200)">
			<div style="text-decoration:underline;font-size:1.5em;margin-bottom:1em">
				Star Players
			</div>
 				<c:forEach var="topuser" items="${requestScope.topUsers}" varStatus="key">
					<c:set var="topuserinfolist"  value="${topuser.value}"/>
						<div style="height:8em">
								<img style="height:7em;width:5em;vertical-align:text-top;float:left;cursor:pointer" onclick="showUserProfile('${topuserinfolist[0]}')" src="<c:out value="${topuserinfolist[3]}"/>"/>

								<table>
								<tr>
									<td><c:out value="${topuserinfolist[1]}" /></td>
								</tr>
								<tr>
									<td>Star rating :</td>
									<td><c:out value="${topuserinfolist[2]}" /></td>
								</tr>
								</table>
							</div>
				</c:forEach>
		</div>


</body>
</html>
