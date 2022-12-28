package us.bojie.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import us.bojie.models.TicTacToeGame
import us.bojie.socket

fun Application.configureRouting(game: TicTacToeGame) {

    routing {
        socket(game)
    }
}
