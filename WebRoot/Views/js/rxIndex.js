/**
 * Created by raferxu on 17/2/6.
 */

$(function () {

    // 根据屏幕大小动态改变htmlFontSize的值
    function htmlFontSize() {
        var $container = $('.container'),
            $container = $container.width(),
            hfz;
        hfz = $container;
        $('html').css('fontSize',hfz/11.7+'px');
    }
    htmlFontSize();
    $(window).on('resize',function () {
        htmlFontSize();
    });


    // header

    // header API

    $('#api-btn').mouseover(function (e) {

        $(this).children('a').addClass('hover').siblings('.arrow-down').css('border-top-color','#fff');
        $('#api-menu').addClass('db');

    }).mouseout(function (e) {

        // if($(e.relatedTarget).attr('id') != 'api-menu'){
            $(this).children('a').removeClass('hover').siblings('.arrow-down').css('border-top-color','#000');
            $('#api-menu').removeClass('db').addClass('dn');
        // }

    });

    // main

    // main carousel
    (function () {
        var oDiv = document.getElementById('carousel');
        var oUl = oDiv.getElementsByTagName('ul')[0];
        var aLi = oUl.getElementsByTagName('li');
        var aImg = oUl.getElementsByTagName('img');

        var oBtn = document.getElementById('indicators-btn');
        var aA = oBtn.getElementsByTagName('a');

        var imgWidth = 1920;
        var iNow = 0;
        var iNow2 = 0;

        oUl.style.width = aImg.length * imgWidth + 'px';

        function toReSize(){

            var veiwWidth = document.documentElement.clientWidth;

            if(veiwWidth>=1170){
                for(var i=0;i<aImg.length;i++){
                    aImg[i].style.left = - (imgWidth - veiwWidth)/2 + 'px';
                }
                $('#aboutUs>img')[0].style.left = - (imgWidth - veiwWidth)/2 + 'px';
                $('#aboutUs .media')[0].style.left = (veiwWidth - 1170)/2 + 'px';
                $('#carousel .prev')[0].style.left = (veiwWidth - 1170)/2 + 'px';
                $('#carousel .next')[0].style.right = (veiwWidth - 1170)/2 + 'px';
            }else{
                $('#aboutUs .media')[0].style.left = 0;
                $('#carousel .prev')[0].style.left = 0;
                $('#carousel .next')[0].style.right = 0;
            }

        }

        toReSize();

        window.onresize = function(){
            toReSize();
        };

        function toRun(){
            if(iNow == aLi.length-1){
                aLi[0].style.position = 'relative';
                aLi[0].style.left = aLi.length * imgWidth + 'px';
                iNow = 0;
            }
            else{
                iNow++;
            }

            iNow2++;

            for(var i=0;i<aA.length;i++){
                aA[i].className = '';
            }

            aA[iNow].className = 'active';

            startMove(oUl,{left : - iNow2 * imgWidth},function(){

                if(iNow==0){
                    aLi[0].style.position = 'static';
                    oUl.style.left = 0;
                    iNow2 = 0;
                }

            });

        }

        var run = setInterval(toRun,3000);

        for(var i=0;i<aA.length;i++){
            aA[i].index = i;
            aA[i].onclick = function(){

                clearInterval(run);

                for(var i=0;i<aA.length;i++){
                    aA[i].className = '';
                }
                this.className = 'active';

                var This = this;

                startMove(oUl,{left : - This.index * imgWidth},function () {

                    iNow = This.index;

                    iNow2 = iNow;

                    run = setInterval(toRun,3000);
                });

            };
        }

        $('#carousel .prev').click(function () {

            clearInterval(run);

            if(iNow==0){
                iNow=2;
            }else{
                iNow--;
            }

            iNow2 = iNow;

            for(var i=0;i<aA.length;i++){
                aA[i].className = '';
            }

            aA[iNow].className = 'active';

            startMove(oUl,{left : - iNow2 * imgWidth},function () {

                run = setInterval(toRun,3000);

            });

            return false;
        });
        $('#carousel .next').click(function () {

            clearInterval(run);

            if(iNow==2){
                aLi[0].style.position = 'relative';
                aLi[0].style.left = aLi.length * imgWidth + 'px';
                iNow = 0;
                iNow2 = 3;
            }else{
                iNow++;
                iNow2 = iNow;
            }

            for(var i=0;i<aA.length;i++){
                aA[i].className = '';
            }

            aA[iNow].className = 'active';

            startMove(oUl,{left : - iNow2 * imgWidth},function () {
                if(iNow==0){
                    aLi[0].style.position = 'static';
                    oUl.style.left = 0;
                    iNow2 = 0;
                }

                run = setInterval(toRun,3000);

            });

            return false;
        });

    })();


    // footer



})

