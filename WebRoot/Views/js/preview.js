$(function () {
    var width= window.innerWidth || (window.document.documentElement.clientWidth || window.document.body.clientWidth);
    // if(width<=435){
    //     $("#palogo").css({"width":"20px","height":"20px"});
    // }
    if(width<=773){
        $(".clearfix").css({"display":"none"});
        $(".module-box").css({"margin-top":"43px","margin-bottom":"0"});
        $(".level1 > a").click(function(){
            $(this).addClass("current").next().toggle().parent().siblings().children("a").removeClass("current").next().hide();   
            return false; 
        });
        $(".upnew img").hide();
    }

});

function loadImageFile() {
    var docObj = document.getElementById("doc");
    var preview = document.getElementById("img_preview");
    var fileList = docObj.files;
    var fileLen=fileList.length;
    if(fileLen!=2){
    	alert("请同时上传两张图片");
    	return false;
    }
    for (var i = 0; i < fileList.length; i++) {

		var imgLeft=140*i;
        //only create img if not exist
        if (!document.getElementById("img"+i)){
            var oImg = document.createElement('img');
            oImg.id = "img" + i;
            preview.appendChild(oImg);
        }

        var imgObjPreview = document.getElementById("img"+i);
        if (docObj.files && docObj.files[i]) {
			imgObjPreview.style.float = "left";
            imgObjPreview.style.left = imgLeft+"px";
            imgObjPreview.style.height = '120px';
            imgObjPreview.src = window.URL.createObjectURL(docObj.files[i]);
            sessionStorage.setItem('img'+i,imgObjPreview.src);
        }else {
            //IE下，使用滤镜
            docObj.select();
            var imgSrc = document.selection.createRange().text;
            var localImagId = document.getElementById("img" + i);
            imgObjPreview.style.float = "left";
            imgObjPreview.style.left = imgLeft+"px";
            localImagId.style.height = "120px";
            try {
                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
            }
            catch (e) {
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }
            imgObjPreview.style.display = 'none';
            document.selection.empty();
        }
    }
    return true;
}



function imgSelect(){
	if(document.getElementById("doc").files.length!=2){
    	alert("请同时上传两张图片");
    	return false;
    }
    else{
    	$('#fileUploadMsg').text('正在检测中，请稍后......');
        document.getElementById("chaupload").submit();
}
}


//for auto damage page**********************

function loadImageFile2() {
    var docObj = document.getElementById("doc");
    var preview = document.getElementById("img_preview");
    var fileList = docObj.files;
    var fileLen=fileList.length;
    var imgcache = [];

    for (var i = 0; i < fileList.length; i++) {

		var imgLeft=140*i;
        //only create img if not exist
        if (!document.getElementById("img"+i)){
            var oImg = document.createElement('img');
            oImg.id = "img" + i;
            preview.appendChild(oImg);
        }

        var imgObjPreview = document.getElementById("img"+i);
        if (docObj.files && docObj.files[i]) {
			imgObjPreview.style.float = "left";
            imgObjPreview.style.left = imgLeft+"px";
            imgObjPreview.style.height = '120px';
            imgObjPreview.src = window.URL.createObjectURL(docObj.files[i]);
            imgcache.push(imgObjPreview.src);
        }else {
            //IE下，使用滤镜
            docObj.select();
            var imgSrc = document.selection.createRange().text;
            var localImagId = document.getElementById("img" + i);
            imgObjPreview.style.float = "left";
            imgObjPreview.style.left = imgLeft+"px";
            localImagId.style.height = "120px";
            try {
                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
            }
            catch (e) {
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }
            imgObjPreview.style.display = 'none';
            document.selection.empty();
        }
    }
    sessionStorage.setItem('img',imgcache);
    return true;
}


function imgSelect2(){
    	$('#fileUploadMsg').text('正在检测中，请稍后......');

    	var imgUrlArr=sessionStorage.getItem('img').split(',');
        var imgName = new Array();
        for(var i=0;i<imgUrlArr.length;i++)
        {
            var dot = imgUrlArr[i].lastIndexOf('/');
            imgName.push(imgUrlArr[i].substring(dot + 1));
        }
        var data = {};
        for(var i = 0; i < imgName.length; i++)
            data[i] = imgName[i];
        var data_json = JSON.stringify(data);
        $("#img_m").val(data_json);

    document.getElementById("chaupload").submit();
}


