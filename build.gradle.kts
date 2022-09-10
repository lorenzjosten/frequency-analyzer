defaultTasks(":clean", ":build", ":run")

group = "io.github"
version = "1.0"

val clean by tasks.registering {
   dependsOn(gradle.includedBuild("frontend").task(":clean"))
   dependsOn(gradle.includedBuild("backend").task(":clean"))
}

val build by tasks.registering {
   dependsOn(gradle.includedBuild("backend").task(":assemble"))
}

val run by tasks.registering {
   dependsOn(gradle.includedBuild("backend").task(":run"))
}
