$(document).ready(function (){
    $('#first').hide(); //打开页面隐藏下拉列表
    $('#second').hide();
    $('#thread').hide();
    $('#fourth').hide();
    $('#fifth').hide();

    $('#showFirst').hover( //鼠标滑过导航栏目时
        function(){
            $('#first').show(); //显示下拉列表
            /**            $('#showFirst').css({'color':'firebrick','background':'khaki'}); //设置导航栏目样式，醒目   */
        },
        function(){
            $('#first').hide(); //鼠标移开后隐藏下拉列表
        }
    );
    $('#showSecond').hover( //鼠标滑过导航栏目时
        function(){
            $('#second').show(); //显示下拉列表
            $('#showSecond').css({'color':'firebrick','background':'khaki'}); //设置导航栏目样式，醒目   */
        },
        function(){
            $('#second').hide(); //鼠标移开后隐藏下拉列表
        }
    );
    $('#showThread').hover( //鼠标滑过导航栏目时
        function(){
            $('#thread').show(); //显示下拉列表
            $('#showThread').css({'color':'firebrick','background':'khaki'}); //设置导航栏目样式，醒目   */
        },
        function(){
            $('#thread').hide(); //鼠标移开后隐藏下拉列表
        }
    );
    $('#showFourth').hover( //鼠标滑过导航栏目时
        function(){
            $('#fourth').show(); //显示下拉列表
            $('#showFourth').css({'color':'firebrick','background':'khaki'}); //设置导航栏目样式，醒目   */
        },
        function(){
            $('#fourth').hide(); //鼠标移开后隐藏下拉列表
        }
    );
    $('#showFifth').hover( //鼠标滑过导航栏目时
        function(){
            $('#fifth').show(); //显示下拉列表
            $('#showFifth').css({'color':'firebrick','background':'khaki'}); //设置导航栏目样式，醒目   */
        },
        function(){
            $('#fifth').hide(); //鼠标移开后隐藏下拉列表
        }
    );

    $('#first').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#first').show();
            $('#showFirst').css({'color':'firebrick','background':'khaki'});
        },
        function(){
            $('#first').hide();
            $('#showFirst').css({'color':'white','background-color':'gray'}); //鼠标移开下拉列表后，导航栏目的样式也清除 */
        }
    );
    $('#second').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#second').show();
        },
        function(){
            $('#second').hide();
            /**         $('#showSecond').css({'color':'white','background-color':'gray'}); //鼠标移开下拉列表后，导航栏目的样式也清除  */
        }
    );
    $('#thread').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#thread').show();
        },
        function(){
            $('#thread').hide();
            /**         $('#showThread').css({'color':'white','background-color':'gray'}); //鼠标移开下拉列表后，导航栏目的样式也清除 */
        }
    );
    $('#fourth').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#fourth').show();
        },
        function(){
            $('#fourth').hide();
            /**        $('#showFourth').css({'color':'white','background-color':'gray'}); //鼠标移开下拉列表后，导航栏目的样式也清除 */
        }
    );
    $('#fifth').hover( //鼠标滑过下拉列表自身也要显示，防止无法点击下拉列表
        function(){
            $('#fifth').show();
        },
        function(){
            $('#fifth').hide();
            /**         $('#showFifth').css({'color':'white','background-color':'gray'}); //鼠标移开下拉列表后，导航栏目的样式也清除 */
        }
    );

    /**
     $('#id.li').hover( //鼠标滑过下拉列表是改变当前栏目样式
     function(){
            $(this).css({'color':'red','background-color':'orange'});
        },
     function(){
            $(this).css({'color':'white','background-color':'gray'});
        }
     );
     */
});
