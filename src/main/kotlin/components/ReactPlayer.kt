@file:JsModule("react-player")
@file:JsNonModule

package components
import csstype.Height
import csstype.Width
import emotion.sheet.StyleSheet
import react.*
import react.dom.html.StyleHTMLAttributes
import react.dom.html.ReactHTML.div
@JsName("default")
external val ReactPlayer: ComponentClass<ReactPlayerProps>

external interface ReactPlayerProps : Props {
    var url: String
    var controls: Boolean
    var width: Width
    var height: Height
    var style: CSSProperties
}