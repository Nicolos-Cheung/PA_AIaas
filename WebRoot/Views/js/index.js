$(function () {
	var width= window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);
	$(".box").each(function() {
		$(this).hover(function(){
			$(this).children().find(".detail").show();
			$(this).children(".feature").css({"margin-top":"53px","cursor":"pointer"});
		},
		function(){
			$(this).children().find(".detail").hide();
			$(this).children(".feature").css({"margin-top":"76px"});
		});
	});
	function smNav() {
        $("#palogo").attr("src","static/images/pingan1.png");
        $(".level1 > a").click(function(){
            $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();
            return false;
        });
    }
    function midNav() {
        $(".carousel,.carousel .item,.item img").css({"height":"500px"});
        $("#palogo").attr("src","static/images/pingan.png");
    }
    if(width<768){
        smNav();
    }else if(width>=768){
        midNav();
    }

    window.onscroll = function(){
        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
        if (scrollTop>50) {
            $("#menu-nav").css({"background":"#fff"});
            $(".navbar-nav>li>a,.navbar-brand").css({"color":"#333"}).mouseenter(function () {
                $(this).css({"color":"#333"});
            }).mouseleave(function () {
                $(this).css({"color":"#333"});
                $(".dropdown-menu").mouseenter(function (e) {
                    $('.dropdown-toggle').css({"color":"#333"});
                }).mouseleave(function () {
                    $('.dropdown-toggle').css({"color":"#333"});
                });
            });
            $("#palogo").attr("src","static/images/pingan1.png");
        }else{
            $("#menu-nav").css({"background":"rgba(0,0,0,0.05)"});
            $(".navbar-nav>li>a,.navbar-brand").css({"color":"#fff"}).mouseenter(function (e) {
                $(this).css({"color":"#428bca"});
            }).mouseleave(function () {
                $(this).css({"color":"#fff"});
                $(".dropdown-menu").mouseenter(function (e) {
                    $('.dropdown-toggle').css({"color":"#428bca"});
                }).mouseleave(function () {
                    $('.dropdown-toggle').css({"color":"#fff"});
                });
            });
            $(".dropdown-menu a").css({"color":"#333"});
            $("#palogo").attr("src","static/images/pingan.png");


        }
    };

    window.onresize = function () {
        if(window.innerWidth<768){
            smNav();
        }else if(window.innerWidth>=768){
            midNav();
        }
    }
});