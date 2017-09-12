## Spring MVC框架

![Spring-MVC-frame](https://github.com/ccccqyc/BookDir/blob/master/Books/Spring/Image/Spring-MVC-frame.jpeg)

组件:

- DispatcherServlet:前端控制器;

  作用:接收请求,响应结果

- HandlerMapping:处理器映射器;

  根据url 查找Handler;

- HandlerAdapter:处理器适配器;

  按照HandlerAdapter要求规则执行Handler;

- Handler:处理器;(程序员编写);

  按照HandlerAdapter要求去做;

- View Resolver:视图解析器;

  进行视图解析,根据逻辑视图名称解析成真正的视图(view);

- View:视图;(程序员编写);

  View是一个接口,实现类支持不同的View的类型(JSP,pdf,freemarker)