package dayOneHelloKotlin

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.*

//"""On this day I learned how to use an external like stylesheet
// and how to reuse code e.g. navigation bar and how via the function call

fun main() {
    println("http://localhost:8080")
    embeddedServer(CIO, port = 8080) {
        routing {
            get("/") {
                call.respondHtml {
                    head {
                        link(rel = "stylesheet" , href = ("/styles"))
                    }
                    body {
                        NavigationBar()
                        div("content") {
                            h2 { +"About This Website" }
                            p {
                                +""""This portfolio website is designed to showcase my skills, achievements, and background.
                                 Built with Kotlin and Ktor, it demonstrates my ability to create dynamic, server-side applications.""".trimIndent()
                            }

                            h2 { +"Skills" }
                            ul {
                                li { +"Project A: A web application built using Kotlin and Ktor." }
                                li { +"Project B: A mobile app developed using Android and Kotlin." }
                                li { +"Project C: A database management system using MySQL." }
                            }
                        }
                    }
                }
            }

            //AboutPage
            get("/about") {
                call.respondHtml {

                    head {
                        link(rel = "stylesheet" , href = ("/styles"))
                    }

                    body {
                        NavigationBar()
                        div("content") {
                            h2 { +"Who I am" }
                            p {
                                +"""My name is Denis Jovith, a passionate developer with a keen interest in web development,
                                 mobile app development, and database management. I am currently pursuing my degree at 
                                 Mbeya University of Science and Technology.""".trimIndent()
                            }
                            h2 { +"Education BackGround" }
                            ul {
                                li {
                                    +"""Bachelor of Science in Computer Science, 
                                    Mbeya University of Science and Technology (Expected Graduation: 2025)""".trimIndent()
                                }
                                li { +"Advanced Level Certificate, Mbeya Secondary School, 2020" }
                                li { +"Ordinary Level Certificate, Mbeya Secondary School, 2017" }
                            }
                            h2 { +"Achievements" }
                            ul{
                                li { +"Dean's List for Academic Excellence, 2022" }
                                li { +"Winner of the University Coding Challenge, 2021" }
                                li { +"Certification in Kotlin Programming from Coursera" }
                            }
                        }
                    }

                }

            }



            //Portfolio Page
            get("/portfolio"){
                call.respondHtml {
                    head{
                        link(rel = "stylesheet" , href = ("/styles"))
                    }

                    body {
                        NavigationBar()
                        div("content") {
                            h2 { +"Professional Experience" }
                            p { +"I have worked on various projects ranging from web applications to mobile apps. Below are some of the notable projects I have completed." }

                            h2 { +"Projects" }
                            ul {
                                li {
                                    +"Project A: Web Application"
                                    ul {
                                        li { +"Description: A comprehensive web application built with Kotlin and Ktor." }
                                        li { +"Technologies: Kotlin, Ktor, HTML, CSS, JavaScript" }
                                        li { +"Role: Full Stack Developer" }
                                    }
                                }
                                li {
                                    +"Project B: Mobile App"
                                    ul {
                                        li { +"Description: An Android mobile app for managing personal tasks." }
                                        li { +"Technologies: Kotlin, Android SDK, SQLite" }
                                        li { +"Role: Mobile App Developer" }
                                    }
                                }
                                li {
                                    +"Project C: Database Management System"
                                    ul {
                                        li { +"Description: A robust database system for a small business." }
                                        li { +"Technologies: MySQL, Java" }
                                        li { +"Role: Database Administrator" }
                                    }
                                }
                            }

                        }
                    }
                }
            }

            //Contact Page
            get("/contact"){
                call.respondHtml {
                    head{
                        link(rel = "stylesheet" , href = ("/styles"))
                    }
                    body{
                        NavigationBar()
                        div("content") {
                            h2 { +"Connect with Me" }
                            p { +"I am always open to discussing new projects, creative ideas, or opportunities to be part of your vision. Feel free to reach out to me through the contact details below." }

                            h2 { +"Contact Details" }
                            p { +"Email: denisjovitusbuberwa@gmail.com" }
                            p { +"Phone: 0782271431" }

                            h2 { +"Social Media" }
                            p {
                                +"GitHub:"
                                a(href="https://github.com/Denis-Jovith/KotlinPractice.git")
                                {
                                    +"https://github.com/Denis-Jovith/KotlinPractice.git"
                                } }
                            p {
                                +"LinkedIn: "
                                a(href = "https://www.linkedin.com/in/denis-jovith-555b09258") {
                                    +"www.linkedin.com/in/denis-jovith-555b09258"
                                }
                            }
                        }
                    }
                }
            }


            get("styles"){
                call.respondText(contentType = ContentType.Text.CSS){
                    """
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
        }
    }.start(wait = true)
}

fun BODY.NavigationBar() = nav("navbar"){
    nav("navbar") {
        ul("navbar-list") {
            li("navbar-item") { a(href = "/", classes = "navbar-link") { +"Home" } }
            li("navbar-item") { a(href = "/about", classes = "navbar-link") { +"About" } }
            li("navbar-item") { a(href = "/portfolio", classes = "navbar-link") { +"Portfolio" } }
            li("navbar-item") { a(href = "/contact", classes = "navbar-link") { +"Contact" } }
        }
    }
    div("header") {
        h1 { +"Welcome to My Portfolio" }
    }
}