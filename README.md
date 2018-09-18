# Тренинг «Автоматизация тестирования на платформе Java»
21 ак. час.

## Аудитория
- Разработчики, самостоятельно покрывающие свой код модульными и UAT-тестами
- Автоматизированные тестировщики и тест-дизайнеры

## Цели
1.	Разработчики смогут проектировать сфокусированные поддерживаемые модульные и UI-тесты
2.	Разработчики и тестировщики смогут реализовать на Java автономные тесты отдельных компонентов
3.	Разработчики и тестировщики смогут реализовать на Java UI-тесты веб-приложений
4.	Разработчики и тестировщики смогут осознанно выбирать сценарии для покрытия и обеспечивать его обоснованный уровень

## Программа

### Введение в тест-дизайн
- Какие существуют test scopes? В чем разница?
- Критерии востребованности test scopes в зависимости от проектной модели
- Как обеспечить автономность модульного тестирования?
- Какие этапы можно выделить в тестовом сценарии? Какой опциональный этап забыли?
- Что именно покрывает тестовый сценарий?
- Какой наилучший способ расчета покрытия?
- Какая разница между интерфейсом, контрактом и спецификацией?
- Как можно сформулировать признаки тестопригодного дизайна системы?
- Практика: тест-дизайн и обоснованный выбор покрытия для legacy-системы

### [Модульное и интеграционное тестирование на JUnit 4](https://github.com/junit-team/junit4/wiki)
- Как описать тест-кейс?
- Как описать тестовый сценарий?
- [Что забываем как четвертый шаг теста?](https://github.com/junit-team/junit4/wiki/Assumptions-with-assume)
- [Как задать тайм-аут выполнения теста?](https://github.com/junit-team/junit4/wiki/Timeout-for-tests)
- [Как задать альтернативный тестовый сценарий?](https://github.com/junit-team/junit4/wiki/Exception-testing)
- Каковы механизмы расширения функциональности тестов? [Запускальщики](https://github.com/junit-team/junit4/wiki/Test-runners) и [Правила](https://github.com/junit-team/junit4/wiki/Rules)
- Отдельно про @InjectMocks
- [Как сделать параметризованный тестовый сценарий?](https://github.com/junit-team/junit4/wiki/Parameterized-tests)
- [Как группировать тесты в группы?](https://github.com/junit-team/junit4/wiki/aggregating-tests-in-suites)
- [Более гибкий способ группировки тестов](https://github.com/junit-team/junit4/wiki/Categories)
- Как обеспечить упрощение и читабельность проверок? [Hamcrest](https://github.com/junit-team/junit4/wiki/Matchers-and-assertthat) и [FEST](https://github.com/alexruiz/fest-assert-2.x/wiki/One-minute-starting-guide)
- Как обеспечить автономность модульного теста?
- В чем разница между различными видами тест-дублеров?
- Как верифицировать и валидировать сами тесты?
- Практика: обоснованный выбор покрытия и реализация поддерживаемых модульных тестов для legacy-системы с контролем покрытия через Sonar и библиотеку пермутационного тестирования PIT
- Демо: тест-дублирование REST-сервисов в интеграционном тесте – [WireMock](http://wiremock.org/docs/getting-started/) и [MockMVC](http://docs.spring.io/spring-security/site/docs/current/reference/html/test-mockmvc.html)
- Как можно обеспечить повторное использование фикстур? [@BeforeXXX](https://github.com/junit-team/junit4/wiki/Test-fixtures) и FixtureBuilders

### Введение в [JUnit5](https://junit.org/junit5/docs/current/user-guide/)
- [Обзор новых возможностей](https://habr.com/post/337700/)


### Тестопригодность дизайна системы
- Критерии тестопригодности

### Корпоративные тестовые фреймворки
- Что такое собственный фреймворк?
- Ключевые компоненты фреймворка

### Системное UI-тестирование на [Selenium](https://kreisfahrer.gitbooks.io/selenium-webdriver/content/index.html)
- Как можно покрыть тестами UI системы?
- Понятие драйвера. Пример с [Chrome](http://www.kenst.com/2015/03/installing-chromedriver-on-mac-osx/)
- Упрощение работы с драйверами с [webdrivermanager](https://github.com/bonigarcia/webdrivermanager)
- Можно ли не запускать браузер в процессе UI-тестирования?
- Какова типичная структура системного UI-теста?
- Демо: автогенерация Selenium-теста из записи действий пользователя
- [Обзор фич](http://seleniumsimplified.com/2012/08/categorising-webdrivernavigation-interrogation-manipulation/)
- Как обеспечить переход по URL?
- Как обеспечить локализацию элементов на HTML-странице?
- Как обеспечить ввод в HTML-элементы ввода?
- Как работать из теста с асинхронными элементами? [Fluent API for Wait](https://github.com/bonigarcia/webdrivermanager-examples/blob/master/src/test/java/io/github/bonigarcia/wdm/test/PhatomJsTest.java)
- Как обеспечить поддерживаемость тестов: изоляцию от структуры страниц, от переходов между страницам? PageObject [1](https://habrahabr.ru/post/134462/),[2](https://github.com/SeleniumHQ/selenium/wiki/PageFactory) и [StepObject](http://seleniumcamp.com/archive/selenium-camp-2013/materials/step-objects/)
- Практика: обоснованный выбор покрытия и реализация поддерживаемых системных UI-тестов для legacy веб-приложения с контролем покрытия через Sonar
- Надстройки над Selenium: [Serenity](http://www.thucydides.info/#/), [Selenide](http://ru.selenide.org/quick-start.html), [HtmlElements](https://tech.yandex.ru/html-elements/)

### BDD на [Cucumber](https://cucumber.io/docs/reference/jvm)
- Что такое тестовый DSL? И почему BDD не про библиотеки и фреймворки.
- Как тестовый DSL помогает ускорить разработку и поддержку тестов? Или не помогает.
- Как фреймворк может нам помочь в разработке и поддержке тестового DSL?
- Как [писать тест](http://www.dokwork.ru/2015/08/cucumber.html) на Cucumber DSL?
- Как отобразить тестовый Cucumber DSL на java-код?
- Практика: перенос готовых системных UI-тестов на Cucumber BDD

### Введение в нагрузочное тестирование
- Формулировка требований к производительности
- Виды нагрузочного тестирования
- Инструмент [JMH](http://openjdk.java.net/projects/code-tools/jmh/)
- Инструмент [JMeter](https://jmeter.apache.org)
