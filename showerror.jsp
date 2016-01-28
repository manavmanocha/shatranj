<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page isELIgnored="false" %>
<html:html locale="true">
	<head>
		<title>Shatranj</title>
		<link rel="stylesheet" href="css/main.css" type="text/css" />
		<script type="text/javascript" src="js/jquery.js" ></script>
		<script type="text/javascript" src="js/jquery-bp.js" ></script>
		<script type="text/javascript" src="js/navigation.js" ></script>
	</head>
	<body>
		<div id="header">
			<img src="img/title1.png"/>
		</div>
		<div id="navigation" class="container">
			<div id="PlayChess" class="pri-nav"><div><a href="PlayChess.jsp">PlayChess</a></div></div>
			<div id="LearnChess" class="pri-nav"><div><a href="LearnChess.jsp">LearnChess</a></div></div>
			<div id="Members" class="pri-nav"><div><a href="Members.jsp">Members</a></div></div>
			<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
			<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
		</div>
		<div class="incorrectBox">
		ERROR - 404
		<br/>
		<br/>
		<br/>

		You are not logged in
		<br/>
		Please <a href="PlayChess.jsp">Login</a> to view this page
		</div>
	</body>
</html:html>




