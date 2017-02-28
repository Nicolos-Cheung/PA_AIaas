/**
 * Created by sll on 2016/10/19.
 */

$(document).ready(function () {

    var width = window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);

//从sessionStorage获取图片识别码
    var imgUrlArr = sessionStorage.getItem('img').split(',');
    var imgName = new Array();
    for (var i = 0; i < imgUrlArr.length; i++) {
        var dot = imgUrlArr[i].lastIndexOf('/');
        imgName.push(imgUrlArr[i].substring(dot + 1));
    }

    var shh = $("#result_pic_bg ").attr("data");
    var reImgObj = JSON.parse(shh);
    var arr = [];
    var i = 0;
    var parent = $('#result_pic_bg');
    $.each(reImgObj, function (key, value) {
//    生成原图
        var pDiv = $('<div style="clear:both"></div>');
        var oSpan1 = $('<span></span>');
        var oBoxs1 = $('<div class="small_pic" style="position: relative"></div>');
        oBoxs1.append($('<h4>原图 - ' + (i + 1) + '</h4>'));
        var oA1 = document.createElement('a');
        oA1.href = '#pic_one' + i;
        oA1.id = 'fir-pic' + i;
        oBoxs1.append(oA1);
        var oImg1 = document.createElement('img');
        oImg1.id = 'origin-pic' + i;
        oImg1.src = imgUrlArr[i];
        oA1.appendChild(oImg1);
        oBoxs1.append(oA1);
        oSpan1.append(oBoxs1);
        pDiv.append(oSpan1);
//    生成结果图
        var oSpan2 = $('<span></span>');
        var oBoxs2 = $('<div class="small_pic" style="position: relative"></div>');
        oBoxs2.append($('<h4>定损结果 - ' + (i + 1) + '</h4>'));
        var oA2 = document.createElement('a');
        oA2.href = '#pic_two' + i;
        oA2.id = 'sec-pic' + i;
        oA2.style.cssText = "position:relative;display:block;";
        oBoxs2.append(oA2);
        var oImg2 = document.createElement('img');
        oImg2.id = 'result-pic' + i;
        oImg2.src = imgUrlArr[i];
        $(oImg2).load(function () {  //rx
            console.log('结果图OK');
        });
        oBoxs2.append(oA2);
        oA2.appendChild(oImg2);
        oSpan2.append(oBoxs2);
        pDiv.append(oSpan2);

        parent.append(pDiv);


//画框
        var xy = value.box;
        var iniPic = value.imgsize;
        var boxContent = value.text;
        arr.push(xy);
        if (xy.length != 0) {
            if (boxContent.length != 0){
                var oSpan3 = $('<span></span>');
                var oBoxs3 = $('<div class="small_pic" style="position: relative"></div>');
                oBoxs3.append($('<h4>定损结果 - ' + (i + 1) + '</h4>'));
                oSpan3.append(oBoxs3);
                pDiv.append(oSpan3);
            }

            var newIniPic = iniPic.split(",");
            var iniWidth = newIniPic[1];
            var iniHeight = newIniPic[0];
//      获取小图的长宽
            var pw = $('#' + 'result-pic' + i).width();
            var ph = $('#' + 'result-pic' + i).height();
            var ssw = iniWidth / pw;
            var ssh = iniHeight / ph;
        }

        if (arr[i]) {
            var maxEndX = $('#' + 'result-pic' + i).width();  //rx
            var maxEndY = $('#' + 'result-pic' + i).height();  //rx
            for (var j = 0, len = arr[i].length; j < len; j++) {
                var temp = arr[i][j].split(',');
                var bw = temp[2] - temp[0];
                var bh = temp[3] - temp[1];
                var drawW = ((temp[0] / ssw + bw / ssw) < maxEndX) ? (bw / ssw) : (maxEndX - temp[0] / ssw);  //rx
                var drawH = ((temp[1] / ssh + bh / ssh) < maxEndY) ? (bh / ssh) : (maxEndY - temp[1] / ssh);  //rx
                $('<div>').addClass("content-box").appendTo($('#' + 'sec-pic' + i));
                $('#' + 'sec-pic' + i).find("div").eq(j).css({
                    "position": "absolute",
                    "top": temp[1] / ssh + "px",
                    "left": temp[0] / ssw + "px",
                    // "width": bw / ssw + "px",  //rx
                    // "height": bh / ssh + "px",  //rx
                    "width": drawW + "px",  //rx
                    "height": drawH + "px",  //rx
                    "border": "2px solid #00FFFF"
                });
                if (boxContent.length > 0) {
                    oBoxs3.append("<li style='text-align: left'>" + boxContent[j] + "</li>");  //rx
                    $("<span>" + boxContent[j] + "</span>").appendTo($('#' + 'sec-pic' + i).find("div").eq(j));
                    if (width <= 773) {
                        $(".content-box").css({"text-align": "center"});
                    }
                }
            }
        }

        // for (var i = 0; i < data.length; i++) {

        var lDiv = document.createElement('div');
        lDiv.id = 'loading-mask' + i;
        lDiv.style.cssText = 'display:none;position:fixed;top:0;left:0;width:100%;height:100%;background:rgba(0,0,0,0.8);z-index: 20';
        var lSpan = document.createElement('span');
        lSpan.setAttribute('class', 'loading-cross');
        var iDiv = document.createElement('div');
        iDiv.setAttribute('class', 'imgDiv');
        iDiv.style.cssText = 'position: fixed;z-index: 21;';
        iDiv.id = 'big-sec' + i;
        var lh4 = document.createElement('h4');
        lh4.id = 'testResult' + i;

        var iDiv2 = document.createElement('div');
        iDiv2.style.cssText = 'display:block;position:relative;top:0;left:0;width:100%;height:100%';
        iDiv2.id = 'big2-sec' + i;
        var iImg = document.createElement('img');
        iImg.setAttribute('class', 'zoomInImg');
        iImg.id = 'maskImg' + i;
        iImg.width = '960';
        iImg.src = imgUrlArr[i];


        lDiv.appendChild(lSpan);
        lSpan.appendChild(iDiv);
        iDiv.appendChild(lh4);
        iDiv2.appendChild(iImg);
        iDiv2.appendChild(lh4);
        iDiv.appendChild(iDiv2);

        parent.append(lDiv);

        //大图点击和画框

        (function () {
            var t = i;
            document.getElementById("sec-pic" + t).onclick = function () {
                zoomInImg();
                $('#' + 'loading-mask' + t).show();
                var trh = $('#' + 'testResult' + t).height();
                var bpw = $('#' + 'maskImg' + t ).width();
                var bph = $('#' + 'maskImg' + t ).height();

                var bsw = iniWidth / bpw;
                var bsh = iniHeight / bph;
                if (arr[t]) {

                    for (var j = 0, len = arr[t].length; j < len; j++) {
                        var temp = arr[t][j].replace("(", "").replace(")", "").split(",");
                        var bw = temp[2] - temp[0];
                        var bh = temp[3] - temp[1];
                        var maxEndX = $('#' + 'maskImg' + t).width();
                        var maxEndY = $('#' + 'maskImg' + t).height();
                        var drawW = ((temp[0] / bsw + bw / bsw) < maxEndX) ? (bw / bsw) : (maxEndX - temp[0] / bsw);  //rx
                        var drawH = ((temp[1] / bsh + trh + bh / bsh) < maxEndY) ? (bh / bsh) : (maxEndY - (temp[1] / bsh + trh ));  //rx
                        $('<div>').addClass("color-box").appendTo($('#' + 'big2-sec' + t));
                        $('#' + 'big2-sec' + t).find("div").eq(j).css({
                            "position": "absolute",
                            "top": temp[1] / bsh + trh + "px",
                            "left": temp[0] / bsw + "px",
                            "width": drawW + "px",
                            "height": drawH + "px",
                            "border": "3px solid #00FFFF"
                        });
                        if (boxContent.length > 0) {
                            $("<span>" + boxContent[j] + "</span>").appendTo($('#' + 'big2-sec' + t).find("div").eq(j));
                            if (width <= 773) {
                                $(".color-box").css({"font-size": "10px", "text-align": "center"});
                            }
                        }

                        (function () {
                            window.onresize = function () {
                                console.log(bw);
                                var bpw2 = $('#' + 'maskImg' + t).width();
                                var bph2 = $('#' + 'maskImg' + t).height();
                                var maxEndX = $('#' + 'maskImg' + t).width();  //rx
                                var maxEndY = $('#' + 'maskImg' + t).height();  //rx
                                var bsw2 = iniWidth / bpw2;
                                var bsh2 = iniHeight / bph2;
                                for (var j = 0, len = arr[t].length; j < len; j++) {
                                    var temp = arr[t][j].replace("(", "").replace(")", "").split(",");
                                    var bw = temp[2] - temp[0];
                                    var bh = temp[3] - temp[1];
                                    var drawW = ((temp[0] / bsw2 + bw / bsw2) < maxEndX) ? (bw / bsw2) : (maxEndX - temp[0] / bsw2);  //rx
                                    var drawH = ((temp[1] / bsh2 + trh + 10 + bh / bsh2) < maxEndY) ? (bh / bsh2) : (maxEndY - (temp[1] / bsh2 + trh + 10));  //rx
                                    $('#' + 'big2-sec' + t).find("div").eq(j).css({
                                        "position": "absolute",
                                        "top": temp[1] / bsh2 + trh + "px",
                                        "left": temp[0] / bsw2 + "px",
                                        "width": drawW + "px",
                                        "height": drawH + "px",
                                        "border": "3px solid #00FFFF"
                                    });
                                }
                            }
                        })();
                        $('#' + 'big2-sec' + t + 'div').hide();
                    }
                }
            };

            document.getElementById("fir-pic" + t).onclick = function () {
                $('#' + 'loading-mask' + t).show();
                $('#' + 'sec-pic' + t + 'div').hide();
                zoomInImg();
            };

            document.getElementById('loading-mask' + t).onclick = function () {
                window.onresize = '';
                $('#' + 'loading-mask' + t).hide();
                $(".color-box").remove();
                $('#' + 'sec-pic' + t + 'div').show();
            };

            function zoomInImg() {
                var bigImg = $('#' + 'loading-mask' + t + ' img');
                if (width <= 773) {
                    bigImg.removeClass("zoomInImg");
                    bigImg.css({
                        "width": width + "px"
                    });
                }
            }
        })();

        i += 1;
    })

    if (width <= 773) {
        console.log($(".small_pic img").css("width"));
        smallpic_img_width = $(".small_pic img").css("width").substring(0, $(".small_pic img").css("width").length - 2);
        var lw = (width - smallpic_img_width - 40 - 2) / 2;
        $(".small_pic").css({"margin": "25px" + " " + lw + "px 20px", "padding": "20px"});
        $(".txt-box").css("text-align", "center");
        $(".level1 > a").click(function () {
            $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();
            return false;
        });
    }

});


