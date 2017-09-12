##**Java 7 future**



**异常改进**

try-with-resources

这个特性是在JDK7种出现的，我们在之前操作一个流对象的时候大概是这样的：

```java
try {
    // 使用流对象
    stream.read();
    stream.write();
} catch(Exception e){
    // 处理异常
} finally {
    // 关闭流资源
    if(stream != null){
        stream.close();
    }
}
```

这样无疑有些繁琐，而且**finally**块还有可能抛出异常。在JDK7种提出了**try-with-resources**机制，
它规定你操作的类只要是实现了**AutoCloseable**接口就可以在try语句块退出的时候自动调用**close**方法关闭流资源。

```java
public static void tryWithResources() throws IOException {
    try( InputStream ins = new FileInputStream("/home/biezhi/a.txt") ){
        char charStr = (char) ins.read();
        System.out.print(charStr);
    }
}
```

**使用多个资源**

```java
try ( InputStream is  = new FileInputStream("/home/biezhi/a.txt");
      OutputStream os = new FileOutputStream("/home/biezhi/b.txt")
) {
    char charStr = (char) is.read();
    os.write(charStr);
}
```

