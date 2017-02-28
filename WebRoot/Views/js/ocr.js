$(document).ready(function() {

	var width= window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);
	if(width<=773){
		var lw=(width-172-40-2)/2;
		$(".small_pic").css({"margin":"25px"+" "+lw+"px 0","padding":"20px"});
		$(".txt-box").css("text-align","center");
		$(".level1 > a").click(function(){
            $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();   
            return false; 
        });
	}
	var secPic=$("#sec-pic");
	var xy=secPic.attr("data-xy");
	var iniPic=secPic.attr("data-pic");
	var picContent=secPic.attr("data-content");
	
	// var xy="[[617.5596923828125, 917.5650024414062, 589.1922607421875, 916.3829956054688, 584.37255859375, 1032.05712890625, 612.739990234375, 1033.2392578125], [612.5355224609375, 601.8507690429688, 582.117431640625, 600.7512817382812, 578.677734375, 695.9160766601562, 609.0958251953125, 697.0155639648438], [711.5592651367188, 35.341407775878906, 671.6101684570312, 33.914649963378906, 667.0012817382812, 162.96432495117188, 706.9503784179688, 164.39108276367188]]";
	// var iniPic="(1170, 1584)";

	if(xy&&iniPic){
		var newXy=xy.replace("[[","").replace("]]","").split("],");
		var newIniPic=iniPic.replace("(","").replace(")","").split(",");
		var content=picContent.split(",");
		var iniWidth=newIniPic[1];
		var iniHeight=newIniPic[0];

		var pw=$("#sec-pic img").width();
		var ph=$("#sec-pic img").height();
		var ssw=iniWidth/pw;
		var ssh=iniHeight/ph;
		var canvas = document.getElementById("smallCanvas");
		var ctx = canvas.getContext("2d");
		ctx.clearRect(0,0,canvas.width,canvas.height);

		for(var i=0,len=newXy.length;i<len;i++){
			var tempXy=newXy[i].replace("[","").split(","); 

			var tempArr=[];
			tempArr.push(tempXy);
			var arr=tempArr[0];

			var canvas = document.getElementById("smallCanvas");

			if(canvas.getContext){  
			    var ctx = canvas.getContext("2d");
			    ctx.beginPath();
			    ctx.strokeStyle = "red";
			    ctx.moveTo(arr[1]/ssw,arr[0]/ssh);
			    for(var k=2;k<arr.length;k+=2){
			    	ctx.lineTo(arr[k+1]/ssw,arr[k]/ssh);
			    }
			    ctx.lineTo(arr[1]/ssw,arr[0]/ssh); 
			    ctx.closePath();
			    ctx.stroke();
			}

			line1 = Math.sqrt((arr[3]-arr[1])*(arr[3]-arr[1])+(arr[2]-arr[0])*(arr[2]-arr[0]));
			line2 = Math.sqrt((arr[7]-arr[1])*(arr[7]-arr[1])+(arr[6]-arr[0])*(arr[6]-arr[0]));
			if (line1<line2){
				var bh= Math.abs(arr[2]-arr[0]);
				var bw= Math.abs(arr[7]-arr[1]);
				$('<div>').addClass("smallBox").appendTo($('#sec-pic'));
				var tempSecPic=$("#sec-pic").find("div").eq(i);
				tempSecPic.attr("title",content[i]);
				tan = (arr[4]-arr[2])/(arr[5]-arr[3])
				angle = Math.atan(tan)/ Math.PI*180
				tempSecPic.css({
					"position": "absolute",
			    	"top": arr[2]/ssh+"px",
			   	 	"left": arr[3]/ssw+"px",
			    	"width": line2/ssw+"px",
			   	 	"height": line1/ssh+"px",
			   	 	"transform-origin": "top left",
			   	 	"transform": "rotate(" + angle + "deg)",
			    	"filter": "alpha(opacity=0)",
			    	"opacity":"0"
				});
			}
			else{
				var bh= Math.abs(arr[6]-arr[0]);
				var bw= Math.abs(arr[1]-arr[3]);
				$('<div>').addClass("smallBox").appendTo($('#sec-pic'));
				var tempBigSec=$("#sec-pic").find("div").eq(i);
				tempBigSec.attr("title",content[i]);
				tan = (arr[6]-arr[4])/(arr[7]-arr[5])
				angle = Math.atan(tan)/ Math.PI*180
				tempBigSec.css({
					"position": "absolute",
			    	"top": arr[4]/ssh+"px",
			   	 	"left": arr[5]/ssw+"px",
			    	"width": line1/ssw+"px",
			   	 	"height": line2/ssh+"px",
			   	 	"transform-origin": "top left",
			   	 	"transform": "rotate(" + angle + "deg)",
			    	"filter": "alpha(opacity=0)",
			    	"opacity":"0"
				});
			}
	   
		}
toolTip($(".smallBox"));

	document.getElementById("fir-pic").onclick=function(){
		$("#loading-mask").show();
		$(".bigBox").remove();
		$("#sec-pic div").hide();
		$("#bigCanvas").hide();
		zoomInImg();
	};

	document.getElementById("loading-mask").onclick=function(){
		$("#loading-mask").hide();
		$("#sec-pic div").show();
		// $("#bigCanvas").hide();
		$(".tip-inner").css("font-size","12px");
};
		
	var drawBox=function(){
		var bpw=$(".imgDiv img").width();
		var bph=$(".imgDiv img").height();

		var bsw=iniWidth/bpw;
		var bsh=iniHeight/bph;
		var canvas = document.getElementById("bigCanvas");
		var ctx = canvas.getContext("2d");
		ctx.clearRect(0,0,canvas.width,canvas.height);
		for(var i=0,len=newXy.length;i<len;i++){
			var tempXy=newXy[i].replace("[","").split(","); 

			var tempArr=[];
			tempArr.push(tempXy);
			var arr=tempArr[0];

			var canvas = document.getElementById("bigCanvas");

			if(canvas.getContext){  
				var ctx = canvas.getContext("2d");
				ctx.beginPath();
				ctx.strokeStyle = "red";
				ctx.moveTo(arr[1]/bsw,arr[0]/bsh);
				for(var k=2;k<arr.length;k+=2){
				    ctx.lineTo(arr[k+1]/bsw,arr[k]/bsh);
				}
				ctx.lineTo(arr[1]/bsw,arr[0]/bsh); 
				ctx.closePath();
				ctx.stroke();
			}

			line1 = Math.sqrt((arr[3]-arr[1])*(arr[3]-arr[1])+(arr[2]-arr[0])*(arr[2]-arr[0]));
			line2 = Math.sqrt((arr[7]-arr[1])*(arr[7]-arr[1])+(arr[6]-arr[0])*(arr[6]-arr[0]));
			if (line1<line2){
				var bh= Math.abs(arr[2]-arr[0]);
				var bw= Math.abs(arr[7]-arr[1]);
				$('<div>').addClass("bigBox").appendTo($('#big-sec'));
				var tempBigSec=$("#big-sec").find("div").eq(i);
				tempBigSec.attr("title",content[i]);
				tan = (arr[4]-arr[2])/(arr[5]-arr[3])
				angle = Math.atan(tan)/ Math.PI*180
				tempBigSec.css({
					"position": "absolute",
			    	"top": arr[2]/bsh+"px",
			   	 	"left": arr[3]/bsw+"px",
			    	"width": line2/bsw+"px",
			   	 	"height": line1/bsh+"px",
			   	 	"transform-origin": "top left",
			   	 	"transform": "rotate(" + angle + "deg)",
			    	"filter": "alpha(opacity=0)",
			    	"opacity":"0"
				});
			}
			else{
				var bh= Math.abs(arr[6]-arr[0]);
				var bw= Math.abs(arr[1]-arr[3]);
				$('<div>').addClass("bigBox").appendTo($('#big-sec'));
				var tempBigSec=$("#big-sec").find("div").eq(i);
				tempBigSec.attr("title",content[i]);
				tan = (arr[6]-arr[4])/(arr[7]-arr[5])
				angle = Math.atan(tan)/ Math.PI*180
				tempBigSec.css({
					"position": "absolute",
			    	"top": arr[4]/bsh+"px",
			   	 	"left": arr[5]/bsw+"px",
			    	"width": line1/bsw+"px",
			   	 	"height": line2/bsh+"px",
			   	 	"transform-origin": "top left",
			   	 	"transform": "rotate(" + angle + "deg)",
			    	"filter": "alpha(opacity=0)",
			    	"opacity":"0"
				});
			}
		}
	};

	function toolTip(cls){
	    cls.poshytip({
	        className: 'tip-violet',
	        alignTo: 'target',
	        alignX: 'right',
	        alignY: 'center',
	        offsetX: 5,
	        showTimeout: 100
	    });
	}
function zoomInImg(){
	var bigImg=$("#loading-mask img");
	if(width<=773){
		bigImg.removeClass("zoomInImg");
		bigImg.css({
			"width": width+"px",
			"height": "265px"
		});
	}
}
	function zoomIn(){
		zoomInImg();
		$("#loading-mask").show();
		$("#bigCanvas").show();
		$(".bigBox").remove();
		$(".tip-violet").remove();
		drawBox();
	    toolTip($(".bigBox"));
	    $(".tip-inner").css("font-size","18px");
	}

	var EventUtil={
		addHandler:function(element,type,handler){
			if(element.addEventListener){
				element.addEventListener(type,handler,false);
			}else if(element.attachEvent){
				element.attachEvent("on"+type,handler);
			}else{
				element["on"+type]=handler;
			}
		}
	};
	var secPic=document.getElementById("sec-pic");

	EventUtil.addHandler(secPic,"click",zoomIn);

}
});