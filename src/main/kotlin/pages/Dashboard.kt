package pages

import mui.material.Container
import react.FC
import react.Props
import components.*
import csstype.AlignItems
import csstype.Display
import csstype.JustifyContent
import csstype.vh
import mui.system.sx
import data.*

val Dashboard = FC<Props> {

    Container {
        maxWidth = "sm"
        sx {
            height = 100.vh
            display = Display.flex
            alignItems = AlignItems.center
            justifyContent = JustifyContent.center
        }

        Player {
            audios = data
        }
    }
}