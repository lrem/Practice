/**
 * Created by zhongjing on 2015/12/29 0029.
 */
/**
 * 上述代码中，我们引入了一个新的Node.js模块，child_process。之所以用它，是为了实现一个既简单又实用的非阻塞操作：exec()。
 *exec()做了什么呢？它从Node.js来执行一个shell命令。在上述例子中，我们用它来获取当前目录下所有的文件（“ls -lah”）,然后，
 * 当/startURL请求的时候将文件信息输出到浏览器中。上述代码是非常直观的： 创建了一个新的变量content（初始值为“empty”），
 * 执行“ls -lah”命令，将结果赋值给content，最后将content返回。
 *
 * @type {exports.exec}
 */
var exec = require("child_process").exec;

function start(response,postData) {
    console.log("请求处理程序被称为'start'");
    //var content = "empty";
    //return content;


    //exec("find /",
    //    {timeout: 10000, maxBuffer: 20000 * 1024},
    //    function (error, stdout, stderr) {
    //        response.writeHead(200, {"Content-Type": "text/plain"});
    //        response.write("111");
    //        response.end();
    //    });

    var body ='<html>'+
        '<head>'+
        '<meta http-equiv="Content-Type" content="text/html; '+
        'charset=UTF-8" />'+
        '</head>'+
        '<body>'+
        '<form action="/upload" method="post">'+
        '<textarea name="text" rows="20" cols="60"></textarea>'+
        '<input type="submit" value="Submit text" />'+
        '</form>'+
        '</body>'+
        '</html>';

    response.writeHead(200,{"Content-Type":"text/html"});
    response.write(body);
    response.end();
}

function upload(response,postData) {
    console.log("请求处理程序被称为'upload'");
    response.writeHead(200, {"Content-Type": "text/plain"});
    response.write(postData);
    response.end();
}

exports.start = start;
exports.upload = upload;