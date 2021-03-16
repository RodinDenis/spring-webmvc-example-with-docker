# Простое Spring приложение для обучения 

## Собераем приложение maven-ом

Для сборки выполните команду

`mvn clean package`

## Сборка и запуск Docker образа

Для справки можно посмотреть https://hub.docker.com/r/jboss/wildfly

Для сборки выполните команду

`docker build --tag=sprig-webmvc-example .`

Для запуска Docker образа с админ панелью выполните команду

`sudo docker run -p 8080:8080 -p 9990:9990 -it spring-webmvc-example /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0`

Админ панель будет доступна по адресу http://0.0.0.0:9990/management
