
function check(f){
	if(f.username.value=="" || f.password.value==""){
		alert("Username or password cannot be empty");
		return;
	}else{
		f.submit();
	}
    
}
