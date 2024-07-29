import board.Board

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readLine

class Game {

  val board =  new Board()
  val players: ArrayBuffer[Player] = Player.playersArray

  def start(): Unit = {
    var numPlayers = readLine("How many players are there ?")
    while(!numPlayers.forall(_.isDigit) || numPlayers.toInt < 2 || numPlayers.toInt > 6){
      numPlayers = readLine("How many players are there ? (between 2 and 6)")
    }

    for(player: Int <- 0 until numPlayers.toInt){
      players.append(Player.create())
    }
  }

}
