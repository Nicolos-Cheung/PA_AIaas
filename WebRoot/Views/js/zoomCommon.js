$(document).ready(function () {
    var width = window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);

    if (width <= 773) {
        smallpic_img_width = $(".small_pic img").css("width").substring(0, $(".small_pic img").css("width").length - 2);
        var lw = (width - smallpic_img_width - 40 - 2) / 2;
        $(".small_pic").css({"margin": "25px" + " " + lw + "px 20px", "padding": "20px"});
        $(".txt-box").css("text-align", "center");
        $(".level1 > a").click(function () {
            $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();
            return false;
        });
    }

    if (document.getElementById("sec-pic")) {
        document.getElementById("sec-pic").onclick = function () {
            $("#loading-mask").show();
            var picSrc2 = $("#sec-pic img").attr("src");
            $(".zoomInImg").attr("src", picSrc2);
        }
    }

    document.getElementById("fir-pic").onclick = function () {
        var picSrc1 = $("#fir-pic img").attr("src");
        $(".zoomInImg").attr("src", picSrc1);
        $("#loading-mask").show();
        zoomInImg();
    };

    document.getElementById("loading-mask").onclick = function () {
        $("#loading-mask").hide();
        $(".small_pic").show();
        zoomInImg();
    };

    function zoomInImg() {
        var bigImg = $("#loading-mask img");
        if (width <= 773) {
            bigImg.removeClass("zoomInImg");
            bigImg.css({
                "width": width + "px"
            });
        }
    }
});