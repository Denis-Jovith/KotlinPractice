package aSoftAssignedTask

import kotlinx.html.*

fun HTML.WebHead(title: String) = head {
    title { +title }
    link(rel = "stylesheet", href = "/styles")
}

fun DIV.WhoBenefitsViewList(whoBenefitsList: List<Who_Benefits>) {
    ol("wh_bnfs_frm_acd_gn_list") {
        for (whoBenefits in whoBenefitsList) {
            li("who_benefits_list") {
                +"${whoBenefits.category}: ${whoBenefits.howIsBenefited}"
            }
        }
    }
}

fun DIV.WhoBenefitsSidePic() = div("whoBenefitsSidePic") {
    img(src = "/images/das.png")
}


