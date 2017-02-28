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
    var secPic = $("#sec-pic");
    var xy = secPic.attr("data-xy");
    var iniPic = secPic.attr("data-pic");
    var picContent = secPic.attr("data-content");
    if (picContent) {
        var boxContent = picContent.replace("[", "").replace("]", "").split(",");
    }

    if (xy && iniPic) {
        var newIniPic = iniPic.replace("(", "").replace(")", "").split(",");
        var iniWidth = newIniPic[1];
        var iniHeight = newIniPic[0];

        var pw = $("#sec-pic img").width();
        var ph = $("#sec-pic img").height();
        var ssw = iniWidth / pw;
        var ssh = iniHeight / ph;

        var arr = [];
        pattern = new RegExp("\\((.| )+?\\)", "igm");
        arr.push(xy.match(pattern));
        if (arr[0]) {
            for (var i = 0, len = arr[0].length; i < len; i++) {
                var temp = arr[0][i].replace("(", "").replace(")", "").split(",");
                var bw = temp[2] - temp[0];
                var bh = temp[3] - temp[1];
                if (bw == 0) continue;
                $('<div>').addClass("content-box").appendTo($('#sec-pic'));
                $("#sec-pic").find("div").eq(i).css({
                    "position": "absolute",
                    "top": temp[1] / ssh + "px",
                    "left": temp[0] / ssw + "px",
                    "width": bw / ssw + "px",
                    "height": bh / ssh + "px",
                    "border": "2px solid #00FFFF"
                });
                if (boxContent) {
                    $("<span>" + boxContent[i] + "</span>").appendTo($("#sec-pic").find("div").eq(i));
                    if (width <= 773) {
                        $(".content-box").css({"text-align": "left"});
                    }

                }
            }
        }


        document.getElementById("sec-pic").onclick = function () {
            zoomInImg();
            $("#loading-mask").show();
            var trh = $("#testResult").height();
            var bpw = $("#maskimg").width();
            var bph = $("#maskimg").height();

            var bsw = iniWidth / bpw;
            var bsh = iniHeight / bph;
            if (arr[0]) {
                for (var i = 0, len = arr[0].length; i < len; i++) {
                    var temp = arr[0][i].replace("(", "").replace(")", "").split(",");
                    var bw = temp[2] - temp[0];
                    var bh = temp[3] - temp[1];
                    $('<div>').addClass("color-box").appendTo($('#big-sec'));
                    $("#big-sec").find("div").eq(i).css({
                        "position": "absolute",
                        "top": temp[1] / bsh + trh + 20 + "px",
                        "left": temp[0] / bsw + "px",
                        "width": bw / bsw + "px",
                        "height": bh / bsh + "px",
                        "border": "3px solid #00FFFF",
                    });
                    if (boxContent) {
                        $("<span>" + boxContent[i] + "</span>").appendTo($("#big-sec").find("div").eq(i));
                        if (width <= 773) {
                            $(".color-box").css({"font-size": "10px", "text-align": "left"});
                        }
                    }
                    $("#sec-pic div").hide();
                }
            }
        };

        document.getElementById("fir-pic").onclick = function () {
            $("#loading-mask").show();
            $("#sec-pic div").hide();
            zoomInImg();
        };

        document.getElementById("loading-mask").onclick = function () {
            $("#loading-mask").hide();
            $(".color-box").remove();
            $("#sec-pic div").show();
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
    }
})