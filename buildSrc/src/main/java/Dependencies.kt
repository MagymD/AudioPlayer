import Version.kotlinVersion
import org.gradle.api.JavaVersion

private const val koinVersion = "1.0.2"

private const val appCompactVersion = "1.1.0-alpha04"
private const val coreKtxVersion = "1.0.1"
private const val materialVersion = "1.1.0-alpha05"
private const val constraintLayoutVersion = "1.1.3"
private const val recyclerVersion = "1.0.0"
private const val navigationVersion = "2.1.0-alpha02"
private const val retrofitVersion = "2.5.0"
private const val retrofitRxAdapterVersion = "2.4.0"
private const val retrofitXmlConverterVersion = "2.3.0"
private const val rxJavaVersion = "2.2.3"
private const val rxKotlinVersion = "2.3.0"
private const val rxAndroidVersion = "2.1.0"
private const val lifecycleVersion = "1.1.1"
private const val roomVersion = "1.1.1"
private const val stethoVersion = "1.5.0"
private const val timeAgoVersion = "3.0.2"
private const val glideVersion = "4.9.0"
private const val photoViewVersion = "2.1.3"

private const val androidTestRunnerVersion = "1.1.2-alpha02"
private const val espressoCoreVersion = "3.2.0-alpha02"
private const val mockVersion = "1.9.2"
private const val mockWebserverVersion = "2.7.5"
private const val archCoreTestVersion = "2.0.0"
private const val junitVersion = "4.12"
private const val androidJunitVersion = "1.1.0"
private const val fragmentTestVersion = "1.1.0-alpha06"

object ApplicationId {
	const val id = "magym.audioplayer"
}

object Module {
	const val app = ":app"
}

object Release {
	const val versionCode = 1
	const val versionName = "1.0"
}

object Version {
	// Language
	val javaVersion = JavaVersion.VERSION_1_8
	const val kotlinVersion = "1.3.31"
	const val gradleVersion = "3.4.1"
	
	// SDK
	const val compileVersion = 28
	const val minVersion = 21
	const val targetVersion = 28
}

object Kotlin {
	const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
}

object Libraries {
	// Support
	const val appCompact = "androidx.appcompat:appcompat:$appCompactVersion"
	const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
	
	// UI
	const val material = "com.google.android.material:material:$materialVersion"
	const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
	const val recycler = "androidx.recyclerview:recyclerview:$recyclerVersion"
	
	// Navigation
	const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
	const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
	
	// DI
	const val koin = "org.koin:koin-androidx-scope:$koinVersion"
	const val koinViewModel = "org.koin:koin-androidx-viewmodel:$koinVersion"
	
	// Network
	const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
	const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitRxAdapterVersion"
	const val retrofitXmlConverter = "com.squareup.retrofit2:converter-simplexml:$retrofitXmlConverterVersion"
	
	// Rx
	const val rxJava = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
	const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion"
	const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"
	
	// Livecycle
	const val lifecycle = "android.arch.lifecycle:extensions:$lifecycleVersion"
	
	// Database
	const val room = "android.arch.persistence.room:runtime:$roomVersion"
	const val roomCompiler = "android.arch.persistence.room:compiler:$roomVersion"
	const val stetho = "com.facebook.stetho:stetho:$stethoVersion"
	
	// Utils
	const val timeAgo = "com.github.marlonlom:timeago:$timeAgoVersion"
	const val glide = "com.github.bumptech.glide:glide:$glideVersion"
	const val photoView = "com.github.chrisbanes:PhotoView:$photoViewVersion"
}

object Test {
	// Android test
	const val androidTestRunner = "androidx.test:runner:$androidTestRunnerVersion"
	const val espresso = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
	const val espressoContrib = "androidx.test.espresso:espresso-contrib:$espressoCoreVersion"
	const val archCoreTest = "androidx.arch.core:core-testing:$archCoreTestVersion"
	const val junit = "androidx.test.ext:junit:$androidJunitVersion"
	const val fragmentNav = "androidx.fragment:fragment-testing:$fragmentTestVersion"
	
	// Koin
	const val koin = "org.koin:koin-test:$koinVersion"
	
	// Mock
	const val mock = "io.mockk:mockk:$mockVersion"
	const val mockAndroid = "io.mockk:mockk-android:$mockVersion"
	const val mockWebServer = "com.squareup.okhttp:mockwebserver:$mockWebserverVersion"
}