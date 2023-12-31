import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id("kotlin-kapt")
    id("org.jetbrains.kotlin.kapt")
//    id("org.jetbrains.kotlin.android.extensions")
}

android {
    namespace = "amitapps.media.practice"
    compileSdk = 34

    defaultConfig {
        applicationId = "amitapps.media.practice"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    def room_version = "2.2.1”;

//    def lifecycle_version = ("2.0.0”

    // Room and Architectural Components

    implementation ("androidx.room:room-runtime:2.6.1")

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")

    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    implementation ("androidx.room:room-ktx:2.6.1")

    kapt ("androidx.room:room-compiler:2.6.1")

    // Coroutines

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // New Material Design

    implementation ("com.google.android.material:material:1.11.0")

    // ViewModel

    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    kapt ("androidx.lifecycle:lifecycle-compiler:2.6.2")
}