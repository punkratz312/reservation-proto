version = "1.0.0-SNAPSHOT"
val serialization = "1.9.22"
dependencies {
  implementation(project(":common"))
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization")
}