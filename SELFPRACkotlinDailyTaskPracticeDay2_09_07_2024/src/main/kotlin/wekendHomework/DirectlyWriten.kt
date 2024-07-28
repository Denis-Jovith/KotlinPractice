package wekendHomework

import kotlinx.html.*

fun BODY.homeDirectlyWritten()= div {
    div("header") {
        h1 { +"Welcome to My Portfolio" }
    }
    div("content") {
        h2 { +"About This Website" }
        p {
            +"""
                                 This portfolio website is designed to showcase my skills, achievements, and background.
                                 Built with Kotlin and Ktor, it demonstrates my ability to create dynamic, server-side applications.
                                 """.trimIndent()
        }

        h2 { +"Skills" }
        ul {
            li { +"Project A: A web application built using Kotlin and Ktor." }
            li { +"Project B: A mobile app developed using Android and Kotlin." }
            li { +"Project C: A database management system using MySQL." }
        }
    }
}

fun BODY.aboutDirectlyWritten() = div {
    div("header") {
        h1 { +"Who I am" }
    }
    div("content") {
        h2 { +"Who I am" }
        p {
            +"""My name is Denis Jovith, a passionate developer with a keen interest in web development,
                                 mobile app development, and database management. I am currently pursuing my degree at 
                                 Mbeya University of Science and Technology.""".trimIndent()
        }

        img(src = "/static/mimikotlin.jpg", alt = "About Image") {
            style = "width:100%; height:auto;"
        }
        h2 { +"Education BackGround" }
        for(education in educations){
            EducationView(education)
        }
        h2 { +"Achievements" }
        for(achievement in achievements){
            AchievementView(achievement)
        }
    }
}

fun BODY.portifolioDirectlyWritten() = div {

    div("header") {
        h1 { +"Welcome to My Portfolio" }
    }
    div("content") {
        h2 { +"Professional Experience" }
        p { +"I have worked on various projects ranging from web applications to mobile apps. Below are some of the notable projects I have completed." }

        h2 { +"Projects" }
        for(project in projects){
            ProjectView(project)
        }

    }
}

fun BODY.contactDirectlyWriten()=div {

    div("header") {
        h1 { +"My Contact Info" }
    }
    div("content") {
        h2 { +"Connect with Me" }
        p { +"I am always open to discussing new projects, creative ideas, or opportunities to be part of your vision. Feel free to reach out to me through the contact details below." }

        h2 { +"Contact Details" }
        for(contact in contacts){
            ContactView(contact)
        }

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

fun BODY.serviceDirectlyWriten() = div {

    div("header") {
        h1 { +"I Could Be Of Some Service" }
    }
    div("container") {
        for(service in services){
            ServiceView(service)
        }
    }

}