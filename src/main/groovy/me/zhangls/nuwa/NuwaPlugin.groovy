package me.zhangls.nuwa

import org.gradle.api.Plugin
import org.gradle.api.Project

public class NuwaPlugin implements Plugin<Project> {
    void apply(Project project) {
         project.task('hello') << {
            println "Hello World"
        }
    }
}