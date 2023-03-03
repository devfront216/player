package components

import data.Audio
import mui.material.*
import react.FC
import react.Props

external interface PlayListProps: Props {
    var audios: Array<Audio>
    var onSelect: (Int) -> Unit
    var currentIndex: Int
}

val PlayList = FC<PlayListProps> { props ->
    props.audios.forEachIndexed { index, audio ->
        ListItem {
            selected = index == props.currentIndex
            onClick = {
                props.onSelect(index)
            }
            ListItemIcon {
                Avatar {
                    src = audio.imageUrl
                }
            }
            ListItemText {
                Typography {
                    +"${audio.title} (${audio.writer})"
                }
            }
        }
        Divider()
    }
}