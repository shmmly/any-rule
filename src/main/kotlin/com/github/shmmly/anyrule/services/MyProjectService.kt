package com.github.shmmly.anyrule.services

import com.intellij.openapi.project.Project
import com.github.shmmly.anyrule.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
