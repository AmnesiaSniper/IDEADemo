/**
 * Created by w18805 on 2018/07/10.
 */
$(function () {
    //获取所有li，添加移入事件
    $("#nav ul li").mouseenter(function () {
        //设置内部的子元素ul slideDown
        $(this).children("ul").stop().slideDown(600);
    });
    //移出li时，让内部子元素slideUp
    $("#nav ul li").mouseleave(function () {
        $(this).children("ul").stop().slideUp(600);
    });
    //如果当前运动没有完毕，又添加了新的动画，这时新的动画需要等待当前动画执行完毕才会开始
    //如果持续添加。一定会造成动画的积累，这种情况我们称为动画队列
});


