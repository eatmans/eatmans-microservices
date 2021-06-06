# eatmans-microservices

```
 _____          _                               
|____ | _ __  _| |  ___ __ _  _ __    __ _  ___ 
  |_  || '_ \|__ | / _ ' _` || '_ \  / _` ||__ \
 ___| || |_) |_| || | | | | || |_) || | | |/ __/
|_____||_.__/|__/ |_| |_| |_||_.__/ |_| |_|\___|
                                                
```

## 介绍

本项目使用到SpringBoot、SpringCloud、MyBatis、SpringBoot-Admin、Redis、JWT等

## 基础环境

| 名称  | 版本   |
| ----- | ------ |
| JDK   | 1.8    |
| MySQL | 8.0.20 |
| Maven | 3.6.3  |



## 服务列表

| 序号 | 服务名称   | 端口 | 地址                  | 备注            |
| ---- | ---------- | ---- | --------------------- | --------------- |
| 1    | em-eureka  | 8801 | http://localhost:8801 | 注册中心        |
| 2    | em-config  | 8802 | http://localhost:8802 | 配置中心        |
| 3    | em-admin   | 8803 | http://localhost:8803 | SpringBootAdmin |
| 4    | em-gateway | 8804 | http://localhost:8804 | 网关            |
| 5    | em-common  |      |                       | 公共使用库      |
| 6    | em-oauth   | 8805 | http://localhost:8805 | 鉴权中心        |
| 7    | em-example | 8806 | http://localhost:8806 | 使用样例        |

## 使用指南



http://127.0.0.1:8803/



输入账号：admin 密码：admin

