package com.github.wnakiami.golanddebuggerterm.services

import com.intellij.openapi.project.Project
import com.github.wnakiami.golanddebuggerterm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
