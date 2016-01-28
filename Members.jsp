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

	$(document).ready(function() {

		//move the image in pixel
		var move = -15;

		//zoom percentage, 1.2 =120%
		var zoom = 1.2;

		//On mouse over those thumbnail
		$('.member').hover(function() {

			//Set the width and height according to the zoom percentage
			width = $('.member').width() * zoom;
			height = $('.member').height() * zoom;

			//Move and zoom the image
			$(this).find('img').stop(false,true).animate({'width':width, 'height':height, 'top':move, 'left':move}, {duration:200});

		},
		function() {
			//Reset the image
			$(this).find('img').stop(false,true).animate({'width':$('.member').width(), 'height':$('.member').height(), 'top':'0', 'left':'0'}, {duration:100});


		});

	});

	function displaySearch()
	{

	document.getElementById("SearchResultsDiv").style.display="none";
	document.getElementById("NewestUsersDiv").style.display="none";
	document.getElementById("SearchDiv").style.display="block";
	}

	function displayNewest()
	{

		document.getElementById("SearchResultsDiv").style.display="none";
		document.getElementById("SearchDiv").style.display="none";
		document.getElementById("NewestUsersDiv").style.display="block";
	}
	function SearchResults()
	{

			document.getElementById("SearchDiv").style.display="none";
			document.getElementById("NewestUsersDiv").style.display="none";
			document.getElementById("SearchResultsDiv").style.display="block";
	}

	</script>

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
		<div id="Members" class="pri-nav active"><div><a>Members</a></div></div>
		<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
	</div>


	<div id="SearchDiv" style="display:none">
		<form >
			<div style="background-color:brown;">
				Search for Members:
			</div>
			<br/>
			<div style="float:left;margin-left:1em;width:5em">
				Name:
			</div>
			<input type="text"/><br/><br/>
			<div style="float:left;margin-left:1em;width:5em">
				Country:
			</div>
			<input type="text"/>
			<br/>
			<br/>
			<div style="margin-left:7em">
				<input type="button" value="Search" onclick="SearchResults();"/>
			</div>
		</form>
		<br/>
	</div>


	<div style="display:none" id="NewestUsersDiv" >
		<div style="font-size:1.3em;text-decoration:underline;margin:0.25em 1.5em 1em 1em">
			Newest Users
		</div>
		<div  style="overflow:hidden;float:left;height:11em;width:8em;border:1px solid white;MARGIN-LEFT:2EM;margin-bottom:1em">
			<div class="member" style="overflow:hidden;height:9em;width:8em;border-bottom:1px solid white;">
			<img  src="img/2.jpg" style="height:9em;width:8em;"/>
			</div>
			<a href="#" style="margin-left:0.5em;text-decoration:none;color:white">Ramanjit singh</a>
		</div>
	</div>

	<div style="display:none" id="SearchResultsDiv" >
		<div style="font-size:1.3em;text-decoration:underline;margin:0.25em 1.5em 1em 1em">
			Search Results
		</div>
		<div  style="overflow:hidden;float:left;height:11em;width:8em;border:1px solid white;MARGIN-LEFT:2EM;margin-bottom:1em">
			<div class="member" style="overflow:hidden;height:9em;width:8em;border-bottom:1px solid white;">
			<img  src="img/2.jpg" style="height:9em;width:8em;"/>
			</div>
			<a href="#" style="margin-left:0.5em;text-decoration:none;color:white">Ramanjit singh</a>
		</div>
	</div>

	<div  style="text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:10em;width:8.5em;padding:0.25em">
	<a style=" text-decoration:none;color:white" href="PlayChess.jsp">Online Members</a>
	</div>

	<div style="cursor:pointer;text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:2em;width:8.5em;padding:0.25em" onclick="displayNewest();">
	Newest Members
	</div>

	<div style="cursor:pointer;text-align:center;background-color:rgb(33,142,190);border:2px solid white;margin-left:2em;-moz-border-radius:1em;margin-top:2em;width:8.5em;padding:0.25em" onclick="displaySearch();">
	Search Members
	</div>




</body>
