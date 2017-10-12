Gson 是 Google 提供的用来在 Java 对象和 JSON 数据之间进行映射的 Java 类库。可以将一个 JSON 字符串转成一个 Java 对象，或者反过来。

## Gson类

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.2</version>
</dependency>
```

### @SerializeName("别名(Alias)")

可以指定生成的JSON字符串中对应的键名

### transient

用transient关键字标记的成员变量不参与序列化过程。即输出的JSON对象忽略该成员变量.

### GsonBuilder类

美化Gson对象.如

setPrettyPrinting()格式化输出json对象

setFieldNamingStrategy()格式化json对象key(如大写)



## gson反向解析成javabean

```java
    File file = new File("src/json/wangxiaoer.json");
    String content = FileUtils.readFileToString(file);
    Gson gson = new Gson();
    People wangxiaoer = gson.fromJson(content, People.class);
```
## gson日期转换

```java
//带日期转换,将此格式"yyyy-MM-dd"装换成Date
Gson gson2 = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
PeopleDate wangxiaoer2 = gson2.fromJson(content, PeopleDate.class);
```
## gson集合类转换

```java
//JavaBean
private List<String> major;//gson可直接读取成

PeopleDate wangxiaoer2 = gson2.fromJson(content, PeopleDate.class);
List<String> major = wangxiaoer2.getMajor();
```

