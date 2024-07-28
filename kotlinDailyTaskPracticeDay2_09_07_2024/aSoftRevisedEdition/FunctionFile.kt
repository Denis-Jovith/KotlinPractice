package aSoftRevisedEdition

import kotlinx.html.*

fun HTML.WebHead(title: String) = head {
    title { +title }
    link(rel = "stylesheet", href = "/styles")
    meta {
        name = "viewport"
        content = "width=device-width, initial-scale=1.0"
    }
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
    img( src = "/images/das.png")
}


