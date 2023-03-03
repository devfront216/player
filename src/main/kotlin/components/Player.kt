package components

import csstype.Display
import react.*
import mui.system.sx
import csstype.px
import data.Audio
import mui.material.*

external interface PlayerProps: Props {
    var audios: Array<Audio>
}

val Player = FC<PlayerProps> { props ->
    var currentAudioIndex: Int by useState<Int>(0)

    fun handleNextClick() {
        console.log(currentAudioIndex)
        if (currentAudioIndex + 1 == props.audios.size) {
            currentAudioIndex = 0
        } else {
            currentAudioIndex += 1
        }
    }

    fun handlePreviousClick() {
        if (currentAudioIndex > 0) {
            currentAudioIndex -= 1
        }
    }

    Box {
        sx {
            display = Display.flex
        }
        List {
            sx {
                width = 320.px
                marginRight = 20.px
            }
            PlayList {
                audios = props.audios
                currentIndex = currentAudioIndex
                onSelect = {
                    currentAudioIndex = it
                }
            }
        }
        PlayerControl {
            audio = props.audios[currentAudioIndex]
            disabledPrevious = currentAudioIndex == 0
            onPrevious = {
                handlePreviousClick()
            }
            onNext = {
                handleNextClick()
            }
        }
    }
}