package wekendHomework

import kotlinx.html.HTML
import kotlinx.html.head
import kotlinx.html.link
import kotlinx.html.title

fun HTML.WebHead(title:String)=head{
    title{+title}
    link(href = "/styles", rel = "stylesheet")
}