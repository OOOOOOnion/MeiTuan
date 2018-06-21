/*
* @Author: Administrator
* @Date:   2018-05-05 16:59:41
* @Last Modified by:   PJJ
* @Last Modified time: 2018-06-15 18:41:24
*/
$(document).ready(function(){
	var sid=$("#隐藏").val();
		 $.ajax({  
             type : "post",
             url : "ShangpinServlet",
             dataType : "json",
             data:{"sjid":sid},
             success : function(data) {
            	var information = $("#商品展示");  
     	        var html = '';  
     	        for (var i = 0; i < data.length; i++) {  
     	        	html +=
     	        	"<div class='商品详细信息'>"+
     				"<img id='商品图片' class='图片' src='"+data[i].sppic+"'>"+
     				"<span id='商品名称字号'>商品名称:</span>"+
     				"<span id='商品名称' class='名称'>"+data[i].spname+"</span>"+
     				"<span id='商品价格字号'>商品价格:</span>"+
     				"<span id='商品价格' class='价格'>"+data[i].spprice+"</span>"+
     				"<span id='购买'>点击添加到购物车</span>"+
     				"<img  class='添加' src='img/添加.png'  id='"+data[i].spid+"' onclick='tianjia(this)'>"+
     			"</div>"
     			}
     	        information.append(html);  
             }
	});
		 
});


$(function(){
	var sid=$("#隐藏").val();
	 $.ajax({  
		 url:"SjToSpServlet",
         type:"post",
         dataType:"json",
         data:{"sid":sid},
         success:function(data){
        	 $("#商家店名").html(data[0].sname);
        	 $("#送餐下左").html(data[0].deliverytime);
        	 $("#起送下左").html(data[0].startprice);
        	 $("#配送下左").html(data[0].deliveryfee);
        	 $("#配送费价格").html(data[0].deliveryfee);}
});
})


 function tianjia(id){
	 var spid=$(id).attr("id");//商品id
	 var $i= $(id).siblings();  
	 var pic=$i.eq(0).attr('src');
     var name = $i.eq(2).html();
     var price = $i.eq(4).html(); 
     	/*var html = $(
        				 "<div id='选中商品' class='购物车栏'>"
     						+"<div class='选中商品名称' id='"+name+"'>"+name+"</div>"
     						+"<div id='选中商品数量'>"
     							+"<form>"
     								+"<input type=button value='x' id='"+id+"'  onclick='shanchu(this)'>"
     							+"</form>"
     							+"</div>"
     						+"<div class='选中商品价格'  id='"+price+"'>" +
     									"<span id='选中商品价格符号'>¥:</span>"+
     						"<span id='选中商品价格金额'>"+price+"</span></div>"
        				 +"</div>");
		        $("#购物车商品").append(html);
		        var pprice=price;
		        var sum=parseInt($("#总价价格").text());
		    	var summ=sum+parseInt(price);
		    	$("#总价价格").text(summ);*/
		    	var sjid=$("#隐藏").val();// 商家id

	$.ajax({
        url:"GouWuCheServlet",
        type: "post",
        data:{"spid":spid,
        	"sjid":sjid,
        	"spname":name,
        	"price":price
        	},
        dataType:"json",
        success : function(data) {
        	var information = $("#购物车商品");  
 	        var html = '';  
 	       $("#购物车商品").empty();
 	       var totalprice = 0;
 	        for (var i = 0; i < data.length; i++) {  
 	        	var html = $(
       				 "<div id='选中商品' class='购物车栏'>"
    						+"<div class='选中商品名称' id='"+data[i].spid+"'>"+data[i].spname+"</div>"
    						+"<div id='选中商品数量'>"
    							+"<form>"
    								+"<input type=button value='x' id='"+data[i].spid+"'  onclick='shanchu(this)'>"
    							+"</form>"
    							+"</div>"
    						+"<div class='选中商品价格'  id='"+data[i].spnum+"'>" +
    									"<span id='选中商品价格符号'>数量:</span>"+
    						"<span id='选中商品价格金额'>"+data[i].spnum+"</span></div>"
       				 +"</div>");
 	        	totalprice +=data[i].price*data[i].spnum;
 	        	information.append(html);  
		        
 			}
 	      /*  alert(totalprice)*/
 	       
	        /*var sum=parseInt($("#总价价格").text("0"));
	    	var summ=sum+totalprice;*/
	    	$("#总价价格").text(totalprice);
         }
        
    });	
		    	/*alert(sjid);
		    	alert(spid);
		    	window.location.href="GouWuCheServlet?spid="+spid+"&sjid="+sjid;*/
}
 
 function shanchu(id){
	 var $ii= $(id).parent().parent().siblings().children();  
     var price = $ii.eq(1).html(); 
	 var scsum=parseInt($("#总价价格").text());
	 var scsumm=scsum-parseInt(price);
		$("#总价价格").text(scsumm);
	 $(id).parent().parent().parent().remove();
	
 }

 function jiesuan(){
	 var sjid=$("#隐藏").val();// 商家id
	 window.location.href="UserNewOrderServlet?&sjid="+sjid;
 }
