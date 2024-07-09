import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main() {
    println("http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing {
            get("/") {
                call.respondHtml {
                    head {
                        title { +"My Portfolio" }
                        style {
                            +"""
                                body {
                                    font-family: Arial, sans-serif;
                                    background-color: #f4f4f4;
                                    margin: 0;
                                    padding: 0;
                                }
                                .navbar {
                                    background-color: #333;
                                    overflow: hidden;
                                }
                                .navbar-list {
                                    list-style-type: none;
                                    margin: 0;
                                    padding: 0;
                                    display: flex;
                                }
                                .navbar-item {
                                    flex: 1;
                                    text-align: center;
                                }
                                .navbar-link {
                                    display: block;
                                    color: white;
                                    text-align: center;
                                    padding: 14px 16px;
                                    text-decoration: none;
                                }
                                .navbar-link:hover {
                                    background-color: #ddd;
                                    color: black;
                                }
                                .content {
                                    padding: 20px;
                                }
                                .header {
                                    text-align: center;
                                    padding: 50px;
                                    background-color: lightblue;
                                }
                                .header h1 {
                                    margin: 0;
                                    font-size: 2.5em;
                                }
                            """.trimIndent()
                        }
                    }
                    body {
                        nav("navbar") {
                            ul("navbar-list") {
                                li("navbar-item") { a(href = "#", classes = "navbar-link") { +"Home" } }
                                li("navbar-item") { a(href = "#", classes = "navbar-link") { +"About" } }
                                li("navbar-item") { a(href = "#", classes = "navbar-link") { +"Portfolio" } }
                                li("navbar-item") { a(href = "#", classes = "navbar-link") { +"Contact" } }
                            }
                        }
                        div("header") {
                            h1 { +"Welcome to My Portfolio" }
                        }
                        div("content") {
                            p { +"This is a simple portfolio website built using Kotlin and Ktor." }
                            h2 { +"Personal Information" }
                            p { +"Name: Denis Jovith" }
                            p { +"Contact: 0782271431" }
                            p { +"University: Mbeya University Of Science and Technology" }
                            p { +"Age: 21" }
                            p { +"Place of Residence: Mbeya" }
                            h2 { +"Thank You Message" }
                            p { +"I would like to express my heartfelt gratitude to Mr. Andy for giving me the opportunity to learn from him as my trainer in Kotlin. His guidance and expertise have been invaluable in my learning journey." }
                        }
                    }
                }
            }
        }
    }.start(wait = true)
}
