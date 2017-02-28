/**
 * Created by sll on 2016/10/19.
 */

$(document).ready(function() {

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
        oBoxs1.append($('<h4>原图 - '+ (i+1) +'</h4>'));
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

        parent.append(pDiv);

        var oSpan3 = $('<span></span>');
        var oBoxs3 = $('<div class="small_pic" style="position: relative"></div>');
        oBoxs3.append($('<h4>定损结果 - '+ (i+1) +'</h4>'));
        oSpan3.append(oBoxs3);
        pDiv.append(oSpan3);
        oBoxs3.append("<li>" + reImgObj[key] + "</li>");
        $("<span>" + reImgObj[key] + "</span>").appendTo($('#' + 'sec-pic' + i));

    var lDiv = document.createElement('div');
    lDiv.id = 'loading-mask' + i;
    lDiv.style.cssText ='display:none;position:fixed;top:0;left:0;width:100%;height:100%;background:rgba(0,0,0,0.8);z-index: 20';
    var lSpan = document.createElement('span');
    lSpan.setAttribute('class','loading-cross');
    var iDiv = document.createElement('div');
    iDiv.setAttribute('class','imgDiv');
    iDiv.style.cssText = 'position: fixed;z-index: 21;';
    iDiv.id = 'big-sec'+i;
        var lh4 = document.createElement('h4');
        lh4.id='testResult'+i;

    var iDiv2=document.createElement('div');
    iDiv2.style.cssText= 'display:block;position:relative;top:0;left:0;width:100%;height:100%';
    iDiv2.id = 'big2-sec'+i;
    var iImg = document.createElement('img');
    iImg.setAttribute('class','zoomInImg');
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

    //大图点击

    (function() {
    var t = i;

    document.getElementById("fir-pic"+t).onclick = function () {
        $('#' + 'loading-mask' + t).show();
        $('#'+'sec-pic'+t+'div').hide();
        zoomInImg();
    };

    document.getElementById('loading-mask'+t).onclick = function () {
        window.onresize = '';
        $('#' + 'loading-mask' + t).hide();
        $(".color-box").remove();
        $('#'+'sec-pic'+t+'div').show();
    };

    function zoomInImg() {
        var bigImg = $('#' + 'loading-mask' + t+' img');
        if (width <= 773) {
            bigImg.removeClass("zoomInImg");
            bigImg.css({
                "width": width + "px"
            });
        }
    }})();

    i += 1;
    });

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



