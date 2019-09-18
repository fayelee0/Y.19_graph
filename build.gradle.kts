plugins {
    java
}

group = "com.fayelee.algs"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    compile("edu.princeton.cs", "algs", "1.0.4")

    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}