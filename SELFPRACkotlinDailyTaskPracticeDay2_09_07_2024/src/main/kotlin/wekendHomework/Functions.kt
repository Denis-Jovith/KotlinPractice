package wekendHomework

import kotlinx.html.*

fun BODY.Navbar()= nav("navbar"){
    nav("navbar") {
        ul("navbar-list") {
            li("navbar-item") { a(href = "/", classes = "navbar-link") { +"Home" } }
            li("navbar-item") { a(href = "/about", classes = "navbar-link") { +"About" } }
            li("navbar-item") { a(href = "/portfolio", classes = "navbar-link") { +"Portfolio" } }
            li("navbar-item") { a(href = "/contact", classes = "navbar-link") { +"Contact" } }
            li("navbar-item") { a(href = "/service", classes = "navbar-link") { +"Services" } }
        }
    }
}

fun BODY.Footerbar() = div("footer") {
    h3(){+"Copyright © 2024 Denis Jovitus Buberwa"}
}




