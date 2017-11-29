;(function (w) {

    var tabshow={};

    //左侧导航函数
    tabshow.tab=function (className) {

        var clA=$(className);
        //一级导航函数
        var firstLi=clA.find('.firstLi');
        
        firstLi.each(function (i) {
            if(firstLi.eq(i).children().hasClass('secondUl')){
                firstLi.eq(i).delegate('li','click', function (e) {
                    e.stopPropagation();
                    var _this=$(this).children('.secondUl');
                    $(this).toggleClass('on');
                    _this.toggle();
                });
            }
        });

        //二级导航
        var secondLi=firstLi.children('.secondUl').children();
        secondLi.each(function (j) {
            if(secondLi.eq(j).children().hasClass('thirdUl')){
                secondLi.eq(j).bind('click',function (e) {
                    e.stopPropagation();
                    var _this=$(this).children('.thirdUl');
                    $(this).toggleClass('on');
                    _this.toggle();
                })
            }else {
                secondLi.bind('click', function (e) {
                    e.stopPropagation();
                })
            }
        });


        //三级导航
        var thirdLi=$('.thirdUl').children();
        console.log(thirdLi);
        thirdLi.bind('click', function (e) {
            e.stopPropagation();
            $(this).parent().show();
        })
    };

    w.tabshow=tabshow;
    return tabshow;
})(window);
