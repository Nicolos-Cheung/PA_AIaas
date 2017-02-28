$(function () {
	window.onscroll = function(){
		var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
		if (scrollTop>50) {
			$("#menu-nav").css({"background":"#fff"});
			$("#menu-nav a").css({"color":"#333"});
			$("#palogo").attr("src","static/images/pingan1.png");
		}else{
			$("#menu-nav").css({"background":"rgba(0,0,0,0.05)"});
			$("#menu-nav a").css({"color":"#fff"});
			$(".dropdown-menu a").css({"color":"#333"});
			$("#palogo").attr("src","static/images/pingan.png");
		}
	};

  $("#start").onclick=function(){
    $("#voice1").addClass("preloader");
    $("#voice1").css({
      "background": "none"
    });
    $(".mic").hide();
  }




});