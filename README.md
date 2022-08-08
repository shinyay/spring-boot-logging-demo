# Understanding Loggin in Spring Boot

Logging is always important for Applications, for debugging, monitoring and etc.

Spring Boot comes with SLF4J inbuilt, which is an abstraction of logging framework such as log4J, java.util.logging, logback, etc.

## Description

Every logging framework comes with three elements.

`Logger` : capture the messages
`Formatter` : formats the messages captured by the logger
`Handler` : Dispatches the messages by printing them on the console , or storing them in a file , sending an email, etc.

### Logger

#### Log Levels

- `ERROR` — runtime errors
- `DEBUG` — Information about the flow of the system
- `TRACE` — more detailed information about the flow of the system
- `WARNING` — warning for the errors caused due to the usage of deprecated APIs.
- `INFO` — events occurring at the run time

#### Log Format

- **Date and Time** : `2022-08-08 15:42:59.875`
- **Log Level** : `INFO`
- **Process ID** : `38830`
- **Thread name** : `[nio-8080-exec-1]`
- **Logger name** : `o.a.c.c.C.[Tomcat].[localhost].[/]`
- **Log message** : `Initializing Spring DispatcherServlet 'dispatcherServlet'`

#### Output (for console)

To enable colors

```properties
spring.output.ansi.enabled=always
```

Log pattern

| pattern | description      |
|---------|------------------|
| %d      | date             |
| %level  | log level        |
| %c      | class path       |
| %t      | thread executing |
| %m      | message          |
| %n      | new line         |

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
- twitter: https://twitter.com/yanashin18618
