# Gradle Demo

> Цель: Научиться пользоваться Gradle и собирать проекты
>
>

## Команды консоли для Gradle:

### Вызов задач*

**Доступные задачи:**

```shell
./gradlew tasks
```

Можно вывести задачи отдельного подпроекта, а ещё с опцией --all будут выведены
все задачи, включая второстепенные.

```shell
./gradlew subprojectName:tasks --all
```

Можно вызвать любую задачу, при этом будут вызваны все задачи, от которых она
зависит.

```shell
./gradlew app:assembleDevelopDebug
```

## Зависимости модулей:

Если database зависит от utils, то

    dependencies {
        implementation project(":common:util")
    }