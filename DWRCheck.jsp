<%@ page isELIgnored="false" %>
<html>
	<head>
	<script src='/Shatranj/dwr/interface/JDate.js'></script>
	<script src='/Shatranj/dwr/engine.js'></script>
	<script type='text/javascript'>
    function sendMessage()
    {
       JDate.getDate(handleData );
       function handleData(str) {
  			document.getElementById("check").innerHTML=str;
		}
    }
  </script>
	</head>

	<body>

	<input type="button" value="Getdate" onClick="sendMessage();"/>
	<p id="check"></p>

	</body>
</html>