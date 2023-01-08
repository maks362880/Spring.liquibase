# Gradle Проект Liquibase
Используемые технологии:
- Spring boot starter WEB
- Spring boot starter DATA JPA
- Liquibase
- PostgeSQL


Скрипты Liquibase написаны в *.yaml формате и разделены на группы в соответсвии с Entity ORM JPA.

Модуль Spring boot starter DATA JPA реализован для быстрой проверки соответсвия новой структуры базы данных Liquibase
с текущей реляционной БД (выставить в конфигурационном файле application.properties значение "spring.jpa.hibernate.ddl-auto = validate"




