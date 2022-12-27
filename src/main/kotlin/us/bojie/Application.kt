package us.bojie

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import us.bojie.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
