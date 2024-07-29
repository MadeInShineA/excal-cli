package board.town

import scala.collection.immutable
import _root_.Player
import board.{Board, BoardTile}

abstract class Town extends BoardTile {
  val name: String

  val waters: Int
  val fields: Int
  val forests: Int
  val pastures: Int

  var waterMils: Int = 0
  var beeHives: Int = 0
  var forestRangers: Int = 0
  var fishingGuards: Int = 0

  var hasChurch: Boolean = false
  var hasCromlech: Boolean = false

  var isOnFire: Boolean = false
  val connectedTowns: immutable.HashMap[Town, TownConnection]

  var player: Option[Player] = Option[Player]

  Board.towns :+ this

}
