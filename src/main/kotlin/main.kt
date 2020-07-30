import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main() {
    document.addEventListener("DOMContentLoaded", { e ->
        val body = document.body!!
        val rect = document.createElement("div") as HTMLDivElement
        rect.style.border = "1px solid black"
        rect.style.apply {
            border = "1px solid black"
            width = "100px"
            height = "100px"
        }

        body.appendChild(rect)
    })
}
