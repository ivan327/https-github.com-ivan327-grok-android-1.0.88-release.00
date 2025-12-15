// Конфигурация, которая применяется ко всем подпроектам
buildscript {
    repositories {
        // Репозиторий Google для зависимостей Android
        google()
        // Основной репозиторий для большинства библиотек
        mavenCentral()
    }
}

plugins {
    // 1. Плагин для работы с Kotlin (нужен, чтобы писать код на Kotlin)
    kotlin("android") version "1.8.10" apply false

    // 2. Плагин для сборки Android-приложения (нужен для модуля :app)
    id("com.android.application") version "8.1.0" apply false
    
    // 3. Плагин для управления библиотеками в Gradle
    // Он часто используется для централизации версий. 
    // Нам пока достаточно просто его объявить.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0" apply false
}

// Конфигурация для всех проектов (корневого и подпроектов)
allprojects {
    repositories {
        // Репозитории, которые будут использоваться при поиске зависимостей в модулях
        google()
        mavenCentral()
    }
}
