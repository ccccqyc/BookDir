#Java 8新特性

**Lambda表达式**

函数式编程,Lambda允许把函数作为一个方法的参数，或者把代码看成数据。

```java
String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
Arrays.sort(planets, (first, second) -> first.length() - second.length());
```

