// Применяем плагины, которые мы объявили в корневом build.gradle.kts
plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    // Указываем пространство имен (package name) для приложения
    namespace = "com.example.grok"
    
    // Настройки компиляции
    compileSdk = 33

    defaultConfig {
        // Минимальная версия Android, которую поддерживает приложение
        minSdk = 21
        // Целевая версия, по которой тестировалось приложение
        targetSdk = 33
        
        // Версия кода и отображаемая версия приложения
        versionCode = 1
        versionName = "1.0"

        // Инструмент для запуска модульных тестов
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // Настройки для сборок (release/debug)
    buildTypes {
        release {
            // Включаем обфускацию и оптимизацию для релизных сборок
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    // Настройка совместимости Kotlin с Java
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Настройка Kotlin
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

// Зависимости приложения
dependencies {
    // Core AndroidX (Базовые функции)
    implementation("androidx.core:core-ktx:1.9.0")
    
    // AppCompat (Поддержка старых версий Android)
    implementation("androidx.appcompat:appcompat:1.6.1")
    
    // Material Design (Внешний вид)
    implementation("com.google.android.material:material:1.8.0")
    
    // ConstraintLayout (Система размещения элементов)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Тестирование
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
