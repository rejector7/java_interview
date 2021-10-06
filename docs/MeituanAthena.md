# 美团实习——雅典娜系统笔记

**子系统划分**

* 模型训练 （athena-pml-console）
    * 可视化建模
    * 交互式建模
* 模型预测（实时）

## 模型训练子系统

**模块划分**

* 可视化建模
* 交互式建模

**模块架构**

* web：controller
* server：service
* dao：dao
* common：
    * 工具类：编码，日志，时间等
    * 异常
    * 枚举类：常量，响应状态等
  

vo&&dto的区别
* vo：视图层展示的数据
* dto：服务层接收和返回的数据

**流程分析**

以调度notebook任务为例。

配置任务信息：
* 接收notebook任务配置请求 @RestController， 接受视图对象vo。
    * 日志工具
* 调用部署notebook服务类，进行部署配置任务 @Service
    * 创建调度条目
* 调用DAO
    * 插入配置信息
        * 配置信息：主要包括一个cron表达式，用于计算下次执行时间。
    * 插入调度条目
  

调度任务执行：
* 在调度服务中，使用springtask @Scheduled（cron expression）注册调度方法。
* 在方法中
  * 获取所有可调度任务：当前调度状态为 '等到调度' 的任务
  * 执行可调度任务
    * 执行
      * HTTP请求 notebook server执行。
    * 更新状态为：调度中
  * 退出，结束当次执行
  

**业务（类）分析设计**

* 调度配置
  * 多种类型的调度任务：调度类型，配置id，cron表达式，状态，执行时间（由cron表达式计算）。
  * 模型调度、实验调度、notebook调度。关注notebook调度。
* 调度任务（除了公用的配置信息，notebook调度专有的信息）
  * 遍历调度配置，获取调度配置id，分组并判断状态，分组执行。
  * 根据配置id，获取相应的调度任务。
  * 执行调度任务，发送调度请求（任务信息），保存调度结果信息，更新调度配置状态，更新配置执行时间。
  
  * 调度名称，路径等。
  
* 单次调度信息

调度配置信息 + 调度综合信息 + 单次调度信息。


  

