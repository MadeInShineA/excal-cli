package entity

import _root_.Player
import board.BoardTile

abstract class Entity() {
  val attack: Int

  var player: Player
  var boardTile: BoardTile

  def spawn(player: Player, boardTile: BoardTile): Unit = {
    player.entities.append(this)

    boardTile.entities.append(this)
    this.player = player
    this.boardTile = boardTile
  }

  def dies(): Unit = {

    assert(this.player.entities.contains(this) && this.boardTile.entities.contains(this))

    this.player.entities.remove(this.player.entities.indexOf(this))
    this.boardTile.entities.remove(this.boardTile.entities.indexOf(this))
  }

}
