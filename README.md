#### nacos 订阅者：

这个订阅者列表不是指消费者列表，而是指主动向Nacos Server发起事件监听的订阅者，比如健康检查、服务变更等事件监听的订阅者，具体可查看NacosDiscoveryEndpoint.nacosDiscovery()方法中是通过EventDispatcher去获取订阅者列表和发布事件 

而服务的提供者和消费者都在服务列表中# dubbo-integration
