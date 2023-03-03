import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import components.*
import pages.Dashboard
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
        .also { document.body.appendChild(it) }

    val app = App.create()

    createRoot(root)
        .render(app)
}

private val App = FC<Props> {
    ThemeModule {
        Dashboard()
    }
}