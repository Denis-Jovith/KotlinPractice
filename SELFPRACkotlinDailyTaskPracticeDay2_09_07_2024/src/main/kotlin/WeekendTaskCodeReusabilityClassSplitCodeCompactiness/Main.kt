package WeekendTaskCodeReusabilityClassSplitCodeCompactiness

import io.ktor.http.ContentType
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main() {
    println("Server running at: http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing {
            get("/") {
                call.respondHtml {
                    WebHead("Overwatch")
                    body {
                        h1 { +"Overwatch" }
                        NavigationBar()
                    }
                }
            }

            get("/medicine") {
                call.respondHtml {
                    WebHead("Medicines")
                    body {
                        h1 { +"Medicines" }
                        NavigationBar()
                        div(classes = "container") {
                            for (medicine in medicines) {
                                MedicineView(medicine)
                            }
                        }
                    }
                }
            }

            get("/styles") {
                call.respondText(css, ContentType.Text.CSS)
            }
        }
    }.start(wait = true)
}

// Sample CSS as a string
val css = """
    .container {
        display: inline-block;
        background-color:alice;
    }
    .medicine {
        margin: 10px;
        padding: 10px;
        border: 1px solid #ccc;
    }
    .price-high {
        color: red;
    }
""".trimIndent()

// Sample NavigationBar function
fun FlowContent.NavigationBar() {
    nav {
        ul {
            li { a(href = "/") { +"Home" } }
            li { a(href = "/medicine") { +"Medicines" } }
        }
    }
}

// Sample data
val medicines = listOf(
    Medicine("Paracetamol", 1000, "Common pain reliever"),
    Medicine("Ibuprofen", 1500, "Anti-inflammatory drug"),
    Medicine("Aspirin", 2000, "Pain reliever and blood thinner"),
)
