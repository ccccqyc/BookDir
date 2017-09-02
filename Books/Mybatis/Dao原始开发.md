## Dao原始开发

SqlSessionConfig.xml

UserDao interface

UserDaoImpl.java

* 实现方法 find,insert,delete,update
* 全局变量 sqlSessoinFactory(使用构造函数注入)
* sqlSessionFactory→sqlSession
* sqlSession操纵数据库,并返回值
* 关闭sqlSession

