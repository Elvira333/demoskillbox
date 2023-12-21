# Веб-приложение на Spring Boot с Thymeleaf и Hibernate

Это простое веб-приложение на Spring Boot, использующее Thymeleaf в качестве шаблонизатора и Hibernate для сохранения данных в базе данных MySQL. Приложение предоставляет одну страницу с логотипом, полем ввода текста, списком сохраненных строк и кнопкой сохранения.

## Основные возможности

- Отображение страницы с логотипом, полем ввода текста и списком сохраненных строк.
- Валидация вводимого текста с выводом предупреждения, если введенный текст превышает определенную длину или является пустым.
- Сохранение введенного текста в базе данных MySQL с использованием Hibernate.

## Как использовать

1. Запустите приложение с помощью следующей команды:

   ```bash
   java -jar ваше-приложение.jar

2. Откройте http://localhost:8080/app_title в вашем веб-браузере.
3. Введите текст в поле ввода и нажмите кнопку "Сохранить". При нарушении валидации вы увидите соответствующее предупреждение.
4. Просматривайте список сохраненных строк на странице.

## Технологии
- Java
- Spring Boot
- Thymeleaf
- Hibernate
- MySQL

## Как настроить базу данных

Измените настройки базы данных в файле application.properties:
   ```bash
    spring.datasource.url=jdbc:mysql://ваш-хост:ваш-порт/ваша-бд
    spring.datasource.username=ваш-логин
    spring.datasource.password=ваш-пароль
