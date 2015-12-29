/**
 * Created by zhongjing on 2015/12/28 0028.
 */
function route(handle, pathname,response,postData){
    console.log("关于路由请求:"+ pathname);
    if(typeof handle[pathname]==='function'){
        //return handle[pathname]();
        handle[pathname](response,postData);
    }else{
        console.log("没有发现请求处理程序:"+ pathname);
        //return"404 Not found";

        response.writeHead(404,{"Content-Type":"text/plain"});
        response.write("404 Not found");
        response.end();
    }
}

exports.route = route;
