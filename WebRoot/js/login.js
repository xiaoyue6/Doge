$(document).ready(function(){
	alert(111111);
	$.ajax({
		type: "POST",
		url: "findStudentList.htm",
		dataType: "json",
		data: {},
		success: function(response){
			if(response.result!=1){
				alert(response.message);
			}else{
				var data=response.data;
				$("#list").html(JSON.stringify(data));
			}
		}
	});
});

function login(){
	
}