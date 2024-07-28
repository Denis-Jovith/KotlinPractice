package WeekendTaskCodeReusabilityClassSplitCodeCompactiness

import kotlinx.html.DIV
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.p

fun DIV.MedicineView(medicine: Medicine) = div(classes = "medicine") {
    h2 { +medicine.name }
    p { +medicine.description }
    div(classes = if (medicine.price > 1500) "price-high" else "") {
        +"Price: TZs ${medicine.price}"
    }
}
