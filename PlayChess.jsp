<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	       <c:set var="name" value="${sessionScope.userName}" />
	    	  <c:out   value="${name}" />,
	    	<c:if test="${name != null}">
				<jsp:forward page="GamePage.jsp" />
			</c:if>
		<div id="header">
			<img src="img/title1.png"/>
		</div>
		<div id="navigation" class="container">
			<div id="PlayChess" class="pri-nav active"><div><a>PlayChess</a></div></div>
			<div id="LearnChess" class="pri-nav"><div><a href="LearnChess.jsp">LearnChess</a></div></div>
			<div id="Members" class="pri-nav"><div><a href="Members.jsp">Members</a></div></div>
			<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
			<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
		</div>
		<div id="LoginBox">
			<html:form action="Login.do" method="post">
				<div class="LoginItems">
					User Name :
				</div>
				<html:text property="userName"/>
				<br/><br/>
				<div class="LoginItems">
					Password :
				</div>
				<html:password property="userPassword"/>
				<br/><br/><br/>
				<div style="margin-left:7em"/>
					<input type="submit" value="Login" />
				</div>
				<div id="LoginErrors">
					<html:errors/>
				</div>
			</html:form>
			<div style="margin-top:1.75em;text-align:center">
				New To Shatranj ?
			<a href="CreateAccount.jsp" style="color:white;font-size:1.2em">Register Now</a>
			</div>
		</div>
	</body>
</html:html>
