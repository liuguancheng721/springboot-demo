# 第一阶段：环境构建;
FROM maven:3.3.9-jdk-8-alpine AS builder
# 指定docker容器的工作目录
WORKDIR /apps
# 复制宿主机的当前目录（当前目录必须有pom.xml文件和src文件夹）的所有内容 到容器的/root/apps/springboot（/app） 目录下
ADD ./ /root/apps

## 运行打包命令
RUN mvn clean package -Dmaven.test.skip=true
# 第二阶段，最小运行时环境，只需要jre
FROM openjdk:8
## 修改时区
#RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo
#'Asia/Shanghai' >/etc/timezone

# 从上一个阶段复制内容
# /root/apps/springboot/target是第一阶段builder中，在容器编译后的target目录
# /root/apps将容器中的/root/apps/springboot/target/*.jar复制到容器的/root/apps目录，并且重命名app.jar
COPY --from=builder /target/*.jar /root/apps/app.jar

EXPOSE 8088

# 运行jar包
CMD ["java","-jar","app.jar"]
