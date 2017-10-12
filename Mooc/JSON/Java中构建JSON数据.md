## JSONObject类

```xml
<dependency>
  <groupId>org.json</groupId>
  <artifactId>json</artifactId>
  <version>20170516</version>
</dependency>

<!--commons-io-->
<!--
提供了许多类使得开发者的常见任务变得简单，同时减少重复（boiler-plate）代码，这些代码可能遍布于每个独立的项目中，你却不得不重复的编写。
Utility classes-提供一些静态方法来完成公共任务．Filters-提供文件过滤器的各种实现．Streams-提供实用的Stream，reader与writer实现． 
-->
<dependency>
  <groupId>commons-io</groupId>
  <artifactId>commons-io</artifactId>
  <version>2.4</version>
</dependency>
```

## JSONObject.put方法

```
JSONObject wangxiaoer = new JSONObject();
wangxiaoer.put("name", "王小二");
```

## HashMap构建JSON(构造函数)

```
HashMap<String,Object> wangxiaoer = new HashMap<>();
new JSONObject(wangxiaoer)
```

## JavaBean构建JSON(构造函数)

```
People wangxiaoer = new People();
new JSONObject(wangxiaoer)
```

## 文件读取(解析JSON数据)

```
String content = FileUtils.readFileToString(path);
JSONObject jsonObject = new JSONObject(content);
jsonObject.getDouble("age")
```

## JSON读取数据空值判断(null)

```
jsonObject.isNull("has_house")
```

