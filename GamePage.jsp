<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<head>
	<title>Shatranj</title>

	<link rel="stylesheet" href="css/main.css" type="text/css" />
	<script src="js/jquery.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript" src="js/jquery-bp.js" ></script>
	<script type="text/javascript" src="js/navigation.js" ></script>
	<script type="text/javascript" src="js/jquery.blockUI.js" ></script>

	<script type="text/javascript">

	var lastUpadatedJsonData="";

	function GetXmlHttpObject()
	{
		if (window.XMLHttpRequest)
		  {
		  return new XMLHttpRequest();
		  }
		if (window.ActiveXObject)
		  {
		  return new ActiveXObject("Microsoft.XMLHTTP");
		  }
		return null;
	}

	function getDataFromServer()
	{
			  xmlhttp=GetXmlHttpObject();
  			  xmlhttp.onreadystatechange=getUsers;
  			  function getUsers()
			  {
				  if(xmlhttp.readyState==4)
				    {
						  var JsonData=xmlhttp.responseText;


						  if(lastUpadatedJsonData != JsonData)
							 {
							    lastUpadatedJsonData = JsonData;
								var JsonObject = eval('(' + JsonData + ')');



							    var onlineUsersContainer=document.getElementById('OnlineUsersContainer');
										  if ( onlineUsersContainer.hasChildNodes() )
											{
											    while (onlineUsersContainer.hasChildNodes())
											    {
											       onlineUsersContainer.removeChild( onlineUsersContainer.lastChild );
											    }
											}

							    var onlineUsersHeader  = document.createElement('span');
								onlineUsersHeader.innerHTML="Online Users";
								onlineUsersContainer.appendChild(onlineUsersHeader);

							     for(i=0;i<(JsonObject.users.length);i++)
								    {
									  var name=JsonObject.users[i].name;
									  var image=JsonObject.users[i].image;
									  var username=JsonObject.users[i].username;
									  var userBusy=JsonObject.users[i].userbusy;


									  var onlineUsersDiv  = document.createElement('div');
									  onlineUsersContainer.appendChild(onlineUsersDiv);
									  var userImage = document.createElement('img');
									  userImage.src=image;
									  userImage.setAttribute("name",username);
									  onlineUsersDiv.appendChild(userImage);
									  var userName = document.createElement('div');
									  userName.innerHTML=name;
									  onlineUsersDiv.appendChild(userName);
									  if(userBusy == "false" )
									  {
										  var playButton = document.createElement("input");
										  playButton.setAttribute("type","button");
										  playButton.setAttribute("name",username);
										  playButton.setAttribute("value","Invite for match");
										  playButton.onclick=setInvitation;
										  onlineUsersDiv.appendChild(playButton);
									  }

									  if(userBusy == "true" )
									  {
									  	  var busySpan = document.createElement("div");
									  	  busySpan.innerHTML = "User Busy";
									  	  busySpan.style.color="red";

										  onlineUsersDiv.appendChild(busySpan);
									  }

								  }

								  if(JsonObject.invitedby != "null")
								  	{
								  		document.getElementById('invitedBy').innerHTML=JsonObject.invitedby;
								  		$.blockUI.defaults.css = {};
										$.blockUI({ message: JsonObject.invitedby+' has Invited you to play ShAtRaNj <br/>Do You Want to play?<br/><input type="button" value="Yes" onclick="acceptInvitation(event);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="No" onclick="rejectInvitation();"/>'});


								  	}

								  if(JsonObject.invitationstatus == "3")
								  {

								  $.unblockUI();
								  var invited= document.getElementById('invited').innerHTML;
								  $.blockUI.defaults.css = {};
								  $.blockUI({ message: invited +' Does not want to play<br/><input type="button" value="Ok" onclick="clearInvitationStatus();" '  });

								  }

								  if(JsonObject.invitationstatus == "4")
								  {

								  $.unblockUI();
								  var invited= document.getElementById('invited').innerHTML;
								  $.blockUI.defaults.css = {};
								  $.blockUI({ message: invited +' is already playing Shatranj with Someone<br/><input type="button" value="Ok" onclick="clearInvitationStatus();" '  });

								  }

								  if(JsonObject.invitationstatus == "2")
								  {
								  $.unblockUI();
								  var invited= document.getElementById('invited').innerHTML;
								  window.location="playGame.do?invited="+invited;

								  }

							}
				    }
			  }
			  xmlhttp.open("POST","getDataFromServer.do",true);
			  xmlhttp.send(null);
			  setTimeout("getDataFromServer()",10000);
			}



			function clearInvitationStatus()
			{
			 $.unblockUI();
			 xmlhttp=GetXmlHttpObject();
			    xmlhttp.onreadystatechange=function()
			    {
					 if(xmlhttp.readyState==4)
					 {

					 }
				}
				xmlhttp.open("GET","clearInvitationStatus.do",true);
				xmlhttp.send(null);
			}

			function setInvitation(event)
			{

				var event = event || window.event;
			    var target = event.target || event.srcElement;
			    document.getElementById('invited').innerHTML=target.name;


				$.blockUI.defaults.css = {};
				$.blockUI({ message: 'Waiting for '+target.name+' to approve<br/><br/><img src="img/loading.gif"' });

				xmlhttp=GetXmlHttpObject();
			    xmlhttp.onreadystatechange=function()
			    {
					 if(xmlhttp.readyState==4)
					 {

					 }
				}
				xmlhttp.open("GET","inviteUser.do?userInvited="+target.name,true);
				xmlhttp.send(null);




			}
			function acceptInvitation()
			{

			   	var invitedBy= document.getElementById('invitedBy').innerHTML;
				xmlhttp=GetXmlHttpObject();
			    xmlhttp.onreadystatechange=function()
			    {
					 if(xmlhttp.readyState==4)
					 {
					 	$.unblockUI();
					 	window.location="playGame.do?invitedBy="+invitedBy;
					 }
				}
				xmlhttp.open("GET","acceptInvitation.do?invitedBy="+invitedBy,true);
				xmlhttp.send(null);


			}

			function rejectInvitation()
			{


			   	var invitedBy= document.getElementById('invitedBy').innerHTML;
				xmlhttp=GetXmlHttpObject();
			    xmlhttp.onreadystatechange=function()
			    {
					 if(xmlhttp.readyState==4)
					 {
					 	$.unblockUI();
					 }
				}
				xmlhttp.open("GET","rejectInvitation.do?invitedBy="+invitedBy,true);
				xmlhttp.send(null);

			}

	</script>

</head>
<body onload="getDataFromServer();" >
	<div id="header">
	<img src="img/title1.png" style="float:left;margin-right:30em"/>
	<div style="margin-top:2.5em;color:yellow">
		Welcome
	    <span style="font-size:1.2em">
	    	<c:set var="name" value="${sessionScope.userName}" />
	    	  <c:out   value="${name}" />,
	    	<c:if test="${name == null}">
				<jsp:forward page="showerror.jsp" />
			</c:if>
	    </span>

		<a href="logout.do" style="color:yellow">Log out</a>
	</div>
	</div>
	<div id="navigation" class="container">
		<div id="PlayChess" class="pri-nav active"><div><a>PlayChess</a></div></div>
		<div id="LearnChess" class="pri-nav"><div><a href="LearnChess.jsp">LearnChess</a></div></div>
		<div id="Members" class="pri-nav"><div><a href="Members.jsp">Members</a></div></div>
		<div id="AboutUs" class="pri-nav"><div><a href="AboutUs.jsp">AboutUs</a></div></div>
		<div id="ContactUs" class="pri-nav"><div><a href="ContactUs.jsp">ContactUs</a></div></div>
	</div>
	<div id="gamePageContainer" style="margin:5em 0.5em 0em 0.5em;border:2px solid white;height:24.8em;width:62.5em">
		<div id="UserInfo">
				<c:set var="fullname" value="${sessionScope.storedName}" />
				<c:set var="gender" value="${sessionScope.storedGender}" />
				<c:set var="age" value="${sessionScope.storedAge}" />
				<c:set var="image" value="${sessionScope.userImage}" />

				<img src="<c:out value="${image}" />"/>
				<div style="font-size:1.4em">
				Welcome ,
				<c:out   value="${fullname}" /><br/>

				<!--
				<c:out   value="${gender}" /><br/>
				<c:out   value="${age}" /><br/>
				-->
				</div>

		</div>

	    <div id="OnlineUsersContainer">

		</div>
		<span id="invitedBy" style="display:none"></span>
		<span id="invited" style="display:none"></span>
	</div>










</body>
</html>
