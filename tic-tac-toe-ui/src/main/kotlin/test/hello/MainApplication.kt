package test.hello

import react.dom.*
import kotlin.browser.*

class MainApplication : Application {
    override val stateKeys: List<String> = emptyList()

    override fun start(state: Map<String, Any>) {
        //require("bootstrap/dist/css/bootstrap.css")
        //require("bootstrap/dist/js/bootstrap.bundle")

        val rootDiv = document.getElementById("root")

        render(rootDiv) {
            span {
                +"Hello Kotlin World"
            }
        }
    }

    override fun dispose(): Map<String, Any> = emptyMap()
}