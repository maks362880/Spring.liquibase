# Gradle Проект Liquibase
### Используемые технологии:
- Spring boot starter WEB
- Spring boot starter DATA JPA
- Liquibase
- PostgeSQL

### Описание работы программы:
Скрипты Liquibase написаны в *.yaml формате и разделены на группы в соответсвии с Entity ORM JPA.

Основной скрипт расположен по адресу classpath:changelog/db.changelog-master.yaml и указывает на последовательность выполнения других *.yaml скриптов в которые вносятся добавления/правки/изменеия структуры базы данных.

В модуль Spring boot starter DATA JPA в папке model размещены Entity POJO классы JAVA для быстрой проверки соответсвия предпологаемой структуры базы данных Liquibase
с текущей реляционной БД (выставить в конфигурационном файле application.properties значение "spring.jpa.hibernate.ddl-auto = validate")
