# logUtil
此项目适用springboot 项目，用于将日志记录到mongodb数据库中，将此项目打成jar包传到自己的私服服务器上  
1、在application配置中增加mongodb 连接配置如下    
 spring.data.mongodb.uri=mongodb://127.0.0.1:27017/user  
2、启动类上加上以下引入  
 @Import(LogAspect.class)  
3、在方法上加上注解  
  @Log(desc = "发送消息",sysName = "发送系统")  
