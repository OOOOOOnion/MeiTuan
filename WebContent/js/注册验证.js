/**
 * 
 */

$.validator.setDefaults({
   
  
	
});
$().ready(function() {
// 在键盘按下并释放及提交后验证提交表单
  $("#signupForm").validate({
	    rules: {
	      uaccount: {
	        required: true,
	        minlength: 2,
	        remote:{
                url:"IsExistUaccountServlet",
                type:"post",
               data:{
            	   uaccount:function(){return $("#uaccount").val()},
            	   },
           },},
	      password: {
	        required: true,
	        minlength: 5
	      },
	      confirm_password: {
	        required: true,
	        minlength: 5,
	        equalTo: "#password"
	      },
	    /*  upic: {
	        required: true,
	        extension:'jpg'
	      },
	      */
	    },
	    messages: {
	      
	      uaccount: {
	        required: "请输入账户名",
	        minlength: "账户名必需由两个以上字母及数字构成组成",
	        remote:"该用户名已存在！"
	      },
	      password: {
	        required: "请输入密码",
	        minlength: "密码长度不能小于 5 个字母"
	      },
	      confirm_password: {
	        required: "请输入验证密码",
	        minlength: "密码长度不能小于 5 ",
	        equalTo: "两次密码输入不一致"
	      },
	    /*  upic: "请选择jpg格式的图片",*/
	      
	    }
	});
});