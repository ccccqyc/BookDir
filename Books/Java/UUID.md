# UUID

UUID含义是128位整数(16字节)的全局唯一标识符(Universally Unique Identifier)。

标准的UUID格式为：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx (8-4-4-4-12);其中每个 x 是 0-9 或 a-f 范围内的一个十六进制的数字。

应用在分布式计算环境 (Distributed Computing Environment, DCE) 领域的重要部分。

UUID 的目的是让分布式系统中的所有元素，都能有唯一的辨识资讯，而不需要透过中央控制端来做辨识资讯的指定。

Java中使用UUID:

```java
import java.util.UUID;
public class UTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
}}
```

