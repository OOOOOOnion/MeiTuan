/**
 * 
 */
function changeBGC(id){
			document.getElementById(id).style.backgroundColor='#e5e5e5';
		}
		function changeback(id){
			document.getElementById(id).style.backgroundColor='#FFFFFF';
		}
$(function () {  
    $("#hhh").click(function () { 

    	var page = parseInt($("#page").val()); 
    	var height =  parseInt($("#商家").height());
    	
		$.post("showShopsServlet",
			{
				name:"lhc",
				page:page
			},
			
			function(data){
				if (data.length < 4) {  
					//$('#hhh').attr('disabled',"true");
					 $("#hhh").unbind();
					$("#hhh").text("没有更多了");
					$("#商家").css("height",height+261);
                } else {  
                    $("#page").val(page + 1);//记录页码  
                    $("#商家").css("height",height+261);
                }  
		    //data为返回的数据以json形式
			var information = $("#商家");  
	        var html = '';  
	        html += "<div class='aa'></div>";
	        for (var i = 0; i < data.length; i++) {  
	          
	              
	          html += "<div class='mc'id='"+data[i].sid+"' onmouseover=\"changeBGC(this.id)\" onmouseout=\"changeback(this.id)\">"+
	          		  "<img  class='图片' src='pic\\"+data[i].spic+".jpg'>"+
	          			"<span id='店名1' class='店名'>"+data[i].sname+"("+data[i].address+"店)</span>"+
	          			"<span id='评分1' class='评分' style='font-size: 9px;'>评分：5.0</span>"+
	          			"<span class='span3' style='margin:0px;' >"+
	    				"<span id='起送1' name='起送' class='起送'>起送价："+data[i].startprice+"</span>"+
	    				"<span id='配送费1' name='配送费' class='配送费'>配送费："+data[i].deliveryfee+"</span>"+
	    				"<span id='时间1' name='时间' class='时间'>"+data[i].deliverytime+"分钟</span>"+
	    				"</span>"+
	          		  "</div>";	        		       
	        }   
	        html += "<div class='aa'></div>";
	       
	        information.append(html);  
		},"json");   
	});
});