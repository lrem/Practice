/**
 * Created by zhongjing on 2015/12/28 0028.
 */
var http = require("http");
var url = require("url");

function start(route, handle){
    //function onRequest(request, response){
    //    var pathname = url.parse(request.url).pathname;
    //    console.log("请求"+ pathname +" 收到了");
    //
    //    //response.writeHead(200,{"Content-Type":"text/plain"});
    //    //var content = route(handle, pathname);
    //    //response.write(content);
    //    //response.end();
    //    route(handle, pathname, response);
    //}

    function onRequest(request, response){
        var postData ="";
        var pathname = url.parse(request.url).pathname;
        console.log("请求"+ pathname +" 收到了");

        request.setEncoding("utf8");

        request.addListener("data",function(postDataChunk){
            postData += postDataChunk;
            console.log("Received POST data chunk '"+
            postDataChunk +"'.");
        });

        request.addListener("end",function(){
            route(handle, pathname, response, postData);
        });

    }


    http.createServer(onRequest).listen(8888);
    console.log("服务开始启动……");
}

exports.start = start;
