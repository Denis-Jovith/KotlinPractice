package wekendHomework

import kotlinx.html.*

fun DIV.ServiceView(service: Service) = div("service") {
    h1 { +service.name }
    p {  +service.description}
        div(classes = if (service.price> 100000) "high-cost" else ""){
            +"Cost TZs ${service.price}"
        }
}

fun DIV.EducationView(education: Education)= ul {
    li {
        +"${education.classLevel},${education.schoolName},${education.yearOfCompletion}"
    }
    }



fun DIV.AchievementView(achievement: Achievement)=ul {
    li{
        +"${achievement.name},${achievement.yearOfAchievement}"
    }
}
fun DIV.ProjectView(project: Project)=ul{
    li{
        +project.name
        ul {
            li{ +project.description }
            li { +project.technologies }
            li{ +project.role }
        }
    }
}

fun DIV.ContactView(contact: Contact)=ul{
    li{
        p{"${+contact.name} ${+contact.contacti}"  }
    }
}

fun DIV.SocialMediaLinkView(socialMediaLinks: SocialMediaLinks)=ul{
    li{
        p {
            """${socialMediaLinks.name}
                ${a(href = socialMediaLinks.link){socialMediaLinks.link}}
            """.trimIndent()

        }
    }
}