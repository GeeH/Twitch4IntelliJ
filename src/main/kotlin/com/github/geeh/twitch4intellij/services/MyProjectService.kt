package com.github.geeh.twitch4intellij.services

import com.intellij.openapi.project.Project
import com.github.geeh.twitch4intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
