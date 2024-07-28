package wekendHomework

import WeekendTaskCodeReusabilityClassSplitCodeCompactiness.css
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.*
import weekendHomework.cssa

//"""On this day I learned how to use an external like stylesheet use code spliting technique
// and how to reuse code e.g. navigation bar and how via the function call

fun main() {
    println("http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing {
            static("/static") {
                resources("static")
            }
            get("/") {
                call.respondHtml {
                    WebHead("Home")
                    body {
                        Navbar()
                        homeDirectlyWritten()
                        Footerbar()
                    }
                }
            }

            //AboutPage
            get("/about") {
                call.respondHtml {

                    WebHead("About")

                    body {
                        Navbar()
                        aboutDirectlyWritten()
                        Footerbar()
                    }

                }

            }



            //Portfolio Page
            get("/portfolio"){
                call.respondHtml {
                    WebHead("Portfolio")

                    body {
                        Navbar()
                        portifolioDirectlyWritten()
                        Footerbar()
                    }
                }
            }

            //Contact Page
            get("/contact"){
                call.respondHtml {
                    WebHead("Contact")
                    body{
                        Navbar()
                        contactDirectlyWriten()
                        Footerbar()
                    }
                }
            }


            get("/service"){
                call.respondHtml {
                    WebHead("Services")
                    body{
                        Navbar()
                        serviceDirectlyWriten()
                        Footerbar()
                    }
                }
            }


            get("/styles") {
                call.respondText(cssa, ContentType.Text.CSS)
            }
        }
    }.start(wait = true)
}

