<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>平安科技深度学习</title>
    <link rel="stylesheet" href="/PADL_AIaas/Views/css/reset.css">
    <link rel="stylesheet" href="/PADL_AIaas/Views/css/common.css">
    <link href="/PADL_AIaas/Views/css/rxIndex.css" rel="stylesheet">
</head>
<body>
<header>
    <div class="container">
        <div id="navbar" class="navbar fix">
            <div class="brand l">
                <img src="static/images/index/PA-logo.png" alt="PAlogo">
            </div>
            <nav id="navbar-nav" class="menu l">
                <ul class="top-nav fix">
                    <li class="l"><a class="dib tc" href="#">首页</a></li>
                    <li id="api-btn" class="topnav-api l rel">
                        <a class="dib tc" href="#">API</a>
                        <span class="arrow-down abs"></span>
                        <div id="api-menu" class="sub-nav fix abs dn">
                            <ul class="dropdown-menu l">
                                <li class="dropdown-header"><a href="#">车损识别</a></li>
                                <li><a href="#">自动定损</a></li>
                            </ul>
                            <ul class="dropdown-menu img-cognition l">
                                <li class="dropdown-header"><a href="#">图像认知</a></li>
                                <li><a href="#">清晰度检测</a></li>
                                <li><a href="#">焦距检测</a></li>
                                <li><a href="#">车牌识别</a></li>
                                <li><a href="#">同车识别</a></li>
                                <li><a href="#">车型识别</a></li>
                                <li><a href="#">保单号识别</a></li>
                            </ul>
                            <ul class="dropdown-menu l">
                                <li class="dropdown-header"><a href="#">语音认知</a></li>
                                <li><a href="#">声纹识别</a></li>
                                <li><a href="#">语音识别</a></li>
                                <li><a href="#">语音合成</a></li>
                                <li><a href="#">情绪检测</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="l"><a class="dib tc" href="#">关于</a></li>
                </ul>
            </nav>
            <div class="user_center r">
                <span class="user_center-icon">
                    <img src="/PADL_AIaas/Views/image/登录@2x.png" alt="user_center">
                </span>
                <ul class="dn">
                    <li><a href="#">个人中心</a></li>
                    <li><a href="#">账号设置</a></li>
                    <li><a href="#">退出</a></li>
                </ul>
            </div>
            <div class="search-box r rel">
                <input class="search" id="navbar-search" type="search">
                <span class="search-icon abs"></span>
            </div>
        </div>
    </div>
</header>
<main>
    <div id="banner">
        <div id="carousel" class="rel">
            <div id="indicators-btn" class="indicators">
                <a href="javascript:;" class="active"></a>
                <a href="javascript:;"></a>
                <a href="javascript:;"></a>
            </div>
            <ul class="wrap fix abs">
                <li class="item l">
                    <a href="#">
                        <img class="rel" src="/PADL_AIaas/Views/image/banner@2x.png" alt="banner1">
                    </a>
                </li>
                <li class="item l">
                    <a href="#">
                        <img class="rel" src="/PADL_AIaas/Views/image/banner2@2x.jpg" alt="banner2">
                    </a>
                </li>
                <li class="item l">
                    <a href="#">
                        <img class="rel" src="/PADL_AIaas/Views/image/banner3@2x.jpg" alt="banner3">
                    </a>
                </li>
            </ul>
            <a href="#" class="prev abs">
                <img src="/PADL_AIaas/Views/image/左滑@2x.png" alt="prev">
            </a>
            <a href="#" class="next abs">
                <img src="/PADL_AIaas/Views/image/右滑@2x.png" alt="next">
            </a>
        </div>
    </div>
    <div class="container">
        <div id="productDisplay">
            <h2>
                <img src="/PADL_AIaas/Views/image/产品展示@2x.png" alt="products-display">
            </h2>
            <ul class="fix">
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>图像认知</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>语音认知</h3>
                        <p>将语音转换为文本。该API可以直接打开并识别来自麦克风的实时语音，识别其他来源的实时语音或者从文件内获取的音频。在任何情况下，都可以通过实时流将语音传送到服务器，服务器再将部分识别结果传送回来。</p>
                    </a>
                </li>
                <li class="l">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l mr10">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
                <li class="l">
                    <a href="#" class="dib">
                        <h3><i class="dib"></i><br>车损识别</h3>
                        <p>该识别模型可以识别上传的汽车图片是否受损需要喷漆，目前可实现车身五个主要部位的判断：车门、前保险杠、后保险杠、叶子板、车底大边。</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <div id="aboutUs" class="rel">
        <img class="rel" src="/PADL_AIaas/Views/image/map拷贝@2x.png" alt="map">
        <h2 class="abs tc">
            <img src="/PADL_AIaas/Views/image/关于我们@2x.png" alt="about-Us">
        </h2>
        <div class="media abs">
            <div class="media-left l">
                <a href="#">
                    <img src="/PADL_AIaas/Views/image/timg@2x.png" alt="timg">
                </a>
            </div>
            <div class="media-body l rel">
                <h3>轻松使用智能API</h3>
                <p>
                    我们提供人工智能相关的API借口，通过这些API，开发人员能够利用其人工智能和机器学习技术开发自己的智能识别、人脸识别等各种各样的应用。这里列举了3个较为常用的API，其中涉及到图像认知、人体认知两个方面，可点击更多获取所有的API。
                </p>
                <a href="#" class="abs more_btn">了解更多</a>
            </div>
        </div>
    </div>
    <div class="goTop"></div>
</main>
<footer>
    <div class="container">
        <div id="siteInfo">
            <ul class=fix>
                <li class="l">
                    <h3>关于我们</h3>
                    <p>联系我们</p>
                    <p>加入我们</p>
                </li>
                <li class="l">
                    <h3>品牌热线</h3>
                    <p>010-67126778（固话）</p>
                    <p>13910490618（手机）</p>
                </li>
                <li class="l">
                    <h3>服务与声明</h3>
                    <p>声明</p>
                </li>
                <li class="l">
                    <h3>手机版下载</h3>
                    <p><a href="#">Ios版下载</a></p>
                    <p><a href="#">Android下载</a></p>
                </li>
                <li class="l">
                    <h3>关注我们</h3>
                    <p><a href="#">新浪</a> <a href="#">微信</a></p>
                </li>
            </ul>
        </div>
        <p id="copyright" class="tc">版权所有 平安易智云 CopyRight2006-2016 备案号：粤11098765号</p>
    </div>
</footer>
<script src="/PADL_AIaas/js/jquery-1.11.1.min.js"></script>
<script src="/PADL_AIaas/js/move.js"></script>
<script src="/PADL_AIaas/js/rxIndex.js"></script>
</body>
</html>