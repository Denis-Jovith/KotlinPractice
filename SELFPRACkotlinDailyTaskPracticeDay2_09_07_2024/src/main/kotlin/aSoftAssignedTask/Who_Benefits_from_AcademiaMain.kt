package aSoftAssignedTask

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

fun main() {
    println("http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing {
            static("/images") {
                resources("images")
            }
            get("/") {
                call.respondHtml {
                    WebHead("Who Benefits from Academia")
                    body("wh_bnts_frm_acdma_bdy") {
                        div("container") {
                            div("image_section") {
                                div("schoolManaged") {
                                    div("shool_Managed_circle"){

                                    }
                                    h4{+"203+"}
                                    h5{+"School Managed"}
                                }
                                div("schoolManaged2") {
                                    div("shool_Managed_circle2"){

                                    }
                                    h4{+"1.5M+"}
                                    h5{+"Student Served"}
                                }
                                WhoBenefitsSidePic()
                            }
                            div("content_section") {
                                h1("who_bnfts") { +"Who Benefits from" }
                                h1("Academia"){
                                    span("bluetext1",) {+"A"}
                                    span("bluetext2",) {+"c"}
                                    span("bluetext3",) {+"a"}
                                    span("bluetext4",) {+"d"}
                                    span("bluetext5",) {+"e"}
                                    span("bluetext6",) {+"m"}
                                    span("bluetext7",) {+"i"}
                                    span("bluetext8",) {+"a"}
                                    span("bluetext9",) {+"?"}
                                }
                                div("paragraph") { p { +"""Academia is a comprehensive school management system designed to 
                                    streamline school operations and enhance educational experiences for everyone 
                                    involved.""".trimIndent() }
                                }
                                WhoBenefitsViewList(whoBenefits)
                            }

                        }
                    }
                }
            }
            get("/styles") {
                call.respondText(aSoftAssignedTask.css, ContentType.Text.CSS)
            }
        }
    }.start(wait = true)
}