package me.dk.trafficlight

import javafx.geometry.Insets
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import tornadofx.*


class TrafficLight: View() {
    private fun VBox.trafficLightCircle(color: Color) {
        circle {
            vboxConstraints { margin = Insets(5.0) }
            radius = 100.0
            fill = color
            stroke = Color.BLACK
            strokeWidth = 5.0
        }
    }

    override val root = vbox {
        padding = Insets(20.0)

        trafficLightCircle(Color.RED)
        trafficLightCircle(Color.YELLOW)
        trafficLightCircle(Color.GREEN)
    }
}

class TrafficLightApp: App(TrafficLight::class)

fun main(args: Array<String>) {
    launch<TrafficLightApp>(args)
}