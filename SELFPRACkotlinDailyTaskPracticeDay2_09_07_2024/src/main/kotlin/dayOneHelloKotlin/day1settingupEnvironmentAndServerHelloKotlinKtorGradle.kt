package dayOneHelloKotlin//On this day i learned how to configure the jvm and how to ser up the project
//via the Gradle and wrote my first Hello World Program in Kotlin
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.head

fun main(){
    println("http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing{
            get("/") {
                call.respondHtml {
                    head {

                    }
                    body {
                        h1 { +"Hello man" }
                    }
                }
            }
        }
    }.start(wait=true)
}