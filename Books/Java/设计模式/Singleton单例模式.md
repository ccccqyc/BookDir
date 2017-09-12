# 单例模式 *Singleton*

单例模式的作用就是保证在整个应用程序的生命周期中，任何一个时刻，单例类的实例至多存在一个.

**特点**:

- 单例模式使类在程序生命周期的任何时刻都只有一个实例.
- 单例的构造函数是私有的.
- 包含getInstance()静态类方法(Java).
- 外部程序,通过 getInstance()来得到这个单例类的实例。

Java代码示例:

```java
public class SingletonExample{
	private static SingletonExample singleton; 
    private SingletonExample(){}
 	public static SingletonExample getSingletonExample(){
    	if(singleton == null){
            singleton = new SingletonExample();
        }
      	return singleton;
    }
}
```



本示例只是基本的单例模式.当多线程访问单例模式类时需要多加考虑.