/**
 * 
 */
$.validator.setDefaults({
		

	});

	$().ready(function() {
		// 在键盘按下并释放及提交后验证提交表单
		$("#loginform").validate({
			rules : {
				uaccount : {
					required : true,
					minlength : 2,
				},
				password : {
					required : true,
					minlength : 5
				}
			},
			messages : {
				uaccount : {
					required : "请输入账户名",
					minlength : "必需由两个以上字母及数字构成组成",
				},
				password : {
					required : "请输入密码",
					minlength : "密码长度不能小于 5 个字母"
				},
			},
		});
	});