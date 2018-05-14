/**
 * 
 */

var flag=false;//flag是为了判断动画是否执行的
		$(document).ready(function(){
    		$(window).on("scroll",function(){
        		//下滑超过100，添加class为fixed的样式
        		if($(this).scrollTop() >110){
            		$(".div-top").addClass("fixed");
            		//如果动画没执行了，则做以下if处理
            		if(!flag){
                		$(".div-top").css("top","-100px");//每次要执行动画之前都将top值设为-100px
                		$(".div-top").animate({"top":"0px"},300);
                		flag = true;
            		}
        		}
        		//下滑不超过100，或者上滑小于100，则移除
        		else{
            		flag=false;
            		
            		$(".div-top").removeClass("fixed");
            	
       			}
    		})
		});