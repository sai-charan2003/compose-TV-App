plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.aha"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.aha"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
    buildFeatures {
        compose =true
    }
    composeOptions {
        kotlinCompilerExtensionVersion ="1.4.2"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}



dependencies {
    implementation ("androidx.activity:activity-compose:1.6.1")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.leanback:leanback:1.0.0")
    implementation ("androidx.tv:tv-foundation:1.0.0-alpha10")
    implementation ("androidx.tv:tv-material:1.0.0-alpha10")
    implementation ("io.coil-kt:coil-compose:2.2.2")
    implementation ("androidx.compose.foundation:foundation:1.3.1")
    implementation ("androidx.compose.ui:ui:1.3.3")
    implementation ("androidx.compose.material:material:1.3.1")
    val nav_version = "2.7.2"

    implementation("androidx.navigation:navigation-compose:$nav_version")
    implementation("androidx.navigation:navigation-compose:2.7.2")
    implementation ("com.google.accompanist:accompanist-navigation-animation:0.33.1-alpha")


}