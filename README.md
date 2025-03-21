# -
该项目是一个基于spring boot的房源信息管理平台,旨在帮助用户提供房源信息管理、用户信息管理、租约管理等功能

以开源项目为原型进行实操和修改实现。

项目亮点：
1、基于jwt令牌实现无状态登录认证,结合拦截器统一校验token有效性,支持多角色(管理员/用户)权限隔离
2、调用阿里云短信服务来提供验证码,并通过redis来缓存验证码(ttl5分钟)
3、设置全局异常处理,对异常类型进行扩充
4、房源信息管理模块使用mybatis-plus提高数据库交互效率,简化代码开发
5、通过minio分布式存储管理房源图片
