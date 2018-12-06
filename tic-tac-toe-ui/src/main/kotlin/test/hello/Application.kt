package test.hello

interface Application {
    val stateKeys: List<String>

    fun start(state: Map<String, Any>)
    fun dispose(): Map<String, Any>
}