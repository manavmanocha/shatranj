function CutTextFirstName(obj)
	{
	if(obj.value=="First Name")
		{
		obj.value="";
		obj.style.color="black";
		}
	}
	function PasteTextFirstName(obj)
	{
		if(obj.value=="")
		{
		obj.value="First Name";
		obj.style.color="gray";
		}
	}

	function CutTextLastName(obj)
	{
	if(obj.value=="Last Name")
		{
		obj.value="";
		obj.style.color="black";
		}
	}
	function PasteTextLastName(obj)
	{
		if(obj.value=="")
		{
		obj.value="Last Name";
		obj.style.color="gray";
		}
	}
	function ShowSecondPage()
	{
	document.getElementById("CreateAccountFirstPage").style.display="none";
	document.getElementById("CreateAccountSecondPage").style.display="block";
	}

	function ShowFirstPage()
	{
		document.getElementById("CreateAccountSecondPage").style.display="none";
		document.getElementById("CreateAccountFirstPage").style.display="block";
	}
