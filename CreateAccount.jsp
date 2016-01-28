<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page isELIgnored="false" %>
<html>
<head>
	<title>Shatranj</title>
	<link rel="stylesheet" href="css/main.css" type="text/css" />
	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript" src="js/jquery-bp.js" ></script>
	<script type="text/javascript" src="js/navigation.js" ></script>
	<script type="text/javascript" src="js/CreateAccountChecks.js" ></script>
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
	<div id="CreateAccountDiv">
		<html:form action="CreateAccount.do" method="post" enctype="multipart/form-data">

				<div class="CreateAccountHeader">
					About Yourself
				</div>

				<div class="CreateAccountField">
				Name :
				</div>
				<html:text property="name"/>

				<div class="CreateAccountErrors">
					<html:errors property="name"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Gender :
				</div>
				<html:select property="gender" style="width:14em" >
					<html:option value="">-Select one-</html:option>
					<html:option value="Male">Male</html:option>
					<html:option value="Female">Female</html:option>
				</html:select>
				<div class="CreateAccountErrors">
					<html:errors property="gender"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Age :
				</div>

				<html:text property="age" size="6" />
				<div class="CreateAccountErrors">
					<html:errors property="age"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Country :
				</div>
				<html:select property="countryId" style="width:14em">
					<html:option value="">-Select Country-</html:option>
					<html:option value="1">India</html:option>
					<html:option value="2">Pakistan</html:option>
					<html:option value="3">U.S.A</html:option>
					<html:option value="4">U.K</html:option>
					<html:option value="5">Australia</html:option>
					<html:option value="6">China</html:option>
					<html:option value="8">Other countries</html:option>
				</html:select>
				<div class="CreateAccountErrors">
					<html:errors property="countryId"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Email ID :
				</div>
				<html:text property="emailId" size="30"  />
				<div class="CreateAccountErrors">
					<html:errors property="emailId"/>
				</div>


				<br/>
				<br/>
				<br/>
				<br/>




				<div class="CreateAccountHeader">
					Select User ID and Password
				</div>

				<div class="CreateAccountField">
					User Name :
				</div>
				<html:text property="userName"/>
				<div class="CreateAccountErrors">
					<html:errors property="userName"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Password :
				</div>
				<html:password property="userPassword"/>
				<div class="CreateAccountErrors">
					<html:errors property="userPassword"/>
				</div>
				<br/>
				<br/>

				<div class="CreateAccountField">
					Confirm Password :
				</div>
				<html:password property="confirmUserPassword"/>
				<div class="CreateAccountErrors">
					<html:errors property="confirmUserPassword"/>
				</div>
				<br/>
				<br/>
				<div class="CreateAccountField">
					Upload Image :
				</div>
				<html:file property="image" />
				<div class="CreateAccountErrors">
					<html:errors property="image"/>
				</div>
				<br/>
				<br/>
				<div style="margin-left:10em">
				  <input type="button" value="Back" onclick="ShowFirstPage();" />
				  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				  <html:submit value="Submit"/>
				  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				  <input type="button" value="Cancel"/>
				</div>

		</html:form>
	</div>
</body>
</html>