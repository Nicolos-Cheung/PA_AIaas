$(function () {
    var width= window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);
    if(width>1024){
        $(".col").each(function() {
            $(this).hover(function(){
                $(this).children(".box").slideDown("fast");
                $(this).children(".img-circle,.h3").hide();
            },
            function(){
                $(this).children(".box").hide();
                $(this).children(".img-circle,.h3").show();
            });
        }); 
    }else{
        $(".box").css({
            "display":"block",
            "background":"#1C2B4A",
        });
        $(".img-circle,.h3").hide();
    }


        if(width<768){
            $("#palogo").attr("src","static/images/pingan1.png");
            $(".level1 > a").click(function(){
                $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();   
                return false; 
            });
        }else{
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
            }
        }
});