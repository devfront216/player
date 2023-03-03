package components

import csstype.AlignItems
import csstype.JustifyContent
import csstype.px
import csstype.rgb
import data.Audio
import mui.icons.material.SkipNext
import mui.icons.material.SkipPrevious
import mui.material.*
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.h5
import js.core.jso

external interface PlayerControlProps: Props {
    var audio: Audio
    var disabledPrevious: Boolean
    var onPrevious: () -> Unit
    var onNext: () -> Unit
}

val PlayerControl = FC<PlayerControlProps> { props ->
    Card {
        sx {
            width = 380.px
        }
        CardMedia {
            component = img
            sx {
                height = 194.px
            }
            image=props.audio.imageUrl
        }
        CardActions {
            sx {
                justifyContent = JustifyContent.center
                marginTop = 20.px
            }
            IconButton {
                disabled=props.disabledPrevious
                onClick={
                    props.onPrevious()
                }
                SkipPrevious()
            }
            IconButton {
                SkipNext()
                onClick={
                    props.onNext()
                }
            }
        }
        CardContent {
            Typography {
                component = h5
                +"Name: ${props.audio.title}"
            }
            Typography {
                +"Writer: ${props.audio.writer}"
            }
            ReactPlayer {
                url = props.audio.audioUrl
                controls = true
                width = 340.px
                height = 50.px
                style = jso {
                    backgroundColor = rgb(255, 255, 255)
                    marginTop = 20.px
                }
            }
        }
    }
}