import board.Board
import board.town.Town
import entity.Entity

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readLine

class Player private () {
  val entities: ArrayBuffer[Entity] = ArrayBuffer()

}

object Player {
  val playersArray: ArrayBuffer[Player] = ArrayBuffer()

  def create(): Player = {
    var spawnMessage: String = "Where do you want to spawn ?\nAvailable towns:\n"
    Board.towns.filter((town: Town) => {
      town.entities.isEmpty
    }).foreach((town: Town) => {
      spawnMessage += s"${town.name}\n"
    })

    val startingTown: String = readLine(spawnMessage)
    new Player
  }
}
