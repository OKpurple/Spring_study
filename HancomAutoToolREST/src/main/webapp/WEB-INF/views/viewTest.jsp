<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>ViewTest</title>
</head>
<body>
viewTest
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>


<div>
	<button id="jwh">jwhbutton</button>
</div>

<ul id = "jwhs">
</ul>

<script>

/* $("#jwh").on("click",function(){
	var str=""
	$.getJSON("http://13.124.115.238:8080/contents/test",function(data){
		console.log(data.length);
		$(data).each(
		function(){
			str += "<li>"+this.success+"</li>";
		});
		
		$("#jwhs").html(str);
	
})

	
	
}); */

$("#jwh").on("click",function(){
$.ajax({
	type:'get',
	url:'http://13.124.115.238:8080/contents/test',
	headers:{
		"Content-Type":"application/json",
		"authorization":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjozNSwiaWF0IjoxNTAwOTAxNjAyLCJleHAiOjE1MDM0OTM2MDJ9.BzXKTTuQRoWvONI1SWfygqhgZZODCV8T-S_o6h8XoHw"
	},
	dataType : "jsonp",
	success:function(data){
		if(data=='SUCCESS'){
			alert("등록");
		}
	}
});


});

</script>


</body>
</html>
