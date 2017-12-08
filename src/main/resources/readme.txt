mybatis使用方法汇总详解：
1、逆向工程（会生成默认的mapper.xml文件）
   还是可以，可以自动生成pojo以及mapper

2、采用直接在方法上面进行注解的方式（无xml文件）
    @Select("select *from signup")
    List<Signup> findAll();
    推荐使用，可以锻炼自己编写sql语句的能力

3.1、tk.mybatis，定制自己的通用mapper，比如MyMapper（具体需要哪些已有的mapper，根据具体情况而定）

3.2、tk.mybatis,分页插件，在spring-boot中已经集成了，可以直接添加依赖之后就开始使用，不需要自己再进行配置。
   <dependency>
	<groupId>com.github.pagehelper</groupId>
	<artifactId>pagehelper-spring-boot-starter</artifactId>
	<version>1.0.0</version>
   </dependency>

4、编写一个基础service接口，用自己编写的通用接口去实现，然后在业务层接口中进行继承

总结：
    1、写到这里mybatis的用法就差不多了，个人比较倾向于用第二种方式，既不需要用第三方接口，又可以达到锻炼自己sql语句编写的能力，并且很简单，不复杂，不需要用到xml来进行配置。
    2、关于分页插件以及第三方接口的用法，参考官网文档即可。
    3、强烈推荐大家用spring-boot来开发项目，真的会事半功倍。当你需要集成第三方接口的时候，请首先查一下spring-boot内部是否已经集成了，如果已经集成了，推荐使用内部集成的，这样可以提高开发效率。
