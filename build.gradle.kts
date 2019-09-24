plugins {
    java
}

group = "com.fayelee.algs"
version = "0.0.1"

repositories {
    jcenter()
}

dependencies {
    compile("edu.princeton.cs", "algs4", "1.0.4")

    testCompile("org.hamcrest:hamcrest:2.1")
    testCompile("org.hamcrest:hamcrest-library:2.1")
    testCompile("junit:junit:4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}