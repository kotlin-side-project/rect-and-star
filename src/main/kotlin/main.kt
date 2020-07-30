import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main() {
    document.addEventListener("DOMContentLoaded", { _ ->
        val body = document.body!!
        val rect = document.createElement("div") as HTMLDivElement
        rect.style.apply {
            border = "1px solid black"
            width = "100px"
            height = "100px"
            boxSizing = "border-box"
            display = "flex"
            flexDirection = "column"
            alignItems = "center"
        }

        body.appendChild(rect)

        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach {
            val child = document.createElement("div") as HTMLDivElement
            val t = document.createTextNode("*".repeat(it))

            child.style.height = "10px"

            child.appendChild(t)
            rect.appendChild(child)
        }
    })
}
