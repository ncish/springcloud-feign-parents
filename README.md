# springcloud-feign-parents

#启动服务端口
server.port=1313
#注册到eureka上的名称
spring.application.name=app-feign-consumer
#注册到eureka上的地址
eureka.client.service-url.defaultZone= http://192.168.1.108:1111/eureka/,http://192.168.1.108:4444/eureka/
#该应用为注册中心，不会注册自己
eureka.client.register-with-eureka=true
#是否需要从eureka上获取注册信息
eureka.client.fetch-registry=true

###设置feign客户端超时时间
###SpringCloud默认开启支持ribbon
#建立连接所用的时间，适用于网络状况正常的情况下，两端链接所用的时间
ribbon.ReadTimeout=5000
#建立连接后从服务器读取到可用资源所用的时间
ribbon.ConnectTimeout=5000

###开启Hystrix断路器
feign.hystrix.enabled=true

#hystrix禁止服务超时时间（开发板可以禁掉，部署生产机需要设置超时时间，不能禁止）
hystrix.command.default.execution.timeout.enabled=false

##############创建的目录结构##################
#springcloud-feign-parents  (maven project模式创建)
    #以下创建的所有子项目都需要在父级项目上右键创建
    #springcloud-feign-api-consumer-service-impl  (maven module模式创建)
    #springcloud-feign-api-consumer-provider-impl  (maven module模式创建)
    #springcloud-feign-api-service  (maven module模式创建)
          #springcloud-feign-api-consumer-service  (maven module模式创建)
          #springcloud-feign-api-provider-service  (maven module模式创建)
