plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    buildFeatures{
        viewBinding = true
    }
    namespace = "com.example.cse225"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.cse225"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation ("com.tbuonomo:dotsindicator:4.3")
//    implementation ("com.github.romandanylyk:PageIndicatorView:1.0.3")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.recyclerview:recyclerview:1.3.1")
    implementation ("androidx.core:core:1.10.1")
    implementation ("com.tbuonomo:dotsindicator:5.1.0")
    implementation ("com.github.GrenderG:Toasty:1.5.2")
//    implementation ("com.android.support:appcompat-v7:28.0.0")
//    implementation ("com.android.support:recyclerview-v7:28.0.0")
//    implementation ("com.android.support:support-core-ui:28.0.0")

}