defaultTasks(":clean", ":run")

group = "io.github"
version = "1.0"

val clean by tasks.registering {
    group = "build"
    dependsOn(gradle.includedBuild("frontend").task(":clean"))
    dependsOn(gradle.includedBuild("backend").task(":clean"))
}

val run by tasks.registering {
    group = "application"
    dependsOn(gradle.includedBuild("backend").task(":bootRun"))
}
