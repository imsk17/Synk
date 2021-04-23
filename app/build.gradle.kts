plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 30
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "tech.imsk17.synk"
        minSdk = 25
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.compose.ui:ui:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.material:material:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.ui:ui-tooling:${rootProject.extra["compose_version"]}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.0-alpha07")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${rootProject.extra["compose_version"]}")

    //For SMS and MMS purposes
    implementation ("com.klinkerapps:android-smsmms:5.2.6")

    // JSON Moment
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0")

    // AndroidX KTX
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation ("androidx.work:work-runtime-ktx:2.6.0-alpha02")

    // Apache - Commons
    implementation ("commons-io:commons-io:2.7")
    implementation ("org.apache.commons:commons-collections4:4.4")
    implementation ("org.apache.commons:commons-lang3:3.11")

    // SSHD - For SSH and Stuff
    implementation ("org.apache.sshd:sshd-core:0.14.0")
    implementation ("org.apache.mina:mina-core:2.0.19")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation( "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")

    // Some Necessary Packages
    implementation ("androidx.collection:collection-ktx:1.1.0")
    implementation ("com.jaredrummler:android-device-names:1.1.9")
    implementation ("com.madgag.spongycastle:bcpkix-jdk15on:1.58.0.0")
}