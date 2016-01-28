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
</head>
<body>
	<div id="header">
		<img src="img/title1.png" style="float:left;margin-right:30em"/>
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
		<div id="PlayChess" class="pri-nav "><div><a href="PlayChess.jsp">PlayChess</a></div></div>
		<div id="LearnChess" class="pri-nav "><div><a href="LearnChess.jsp">LearnChess</a></div></div>
		<div id="Members" class="pri-nav "><div><a href="Members.jsp">Members</a></div></div>
		<div id="AboutUs" class="pri-nav "><div><a href="AboutUs.jsp">AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav active"><div><a>ContactUs</a></div></div>
	</div>
	<div id="ContactUsDiv">
		<br/>
		E-mail : manav_mas@yahoo.com
		<br/>
		<br/>
		<br/>
		Contact no. : 9654387634
	</div>
</body>
