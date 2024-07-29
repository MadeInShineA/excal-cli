package board.town.towns

import board.town.{Town, TownConnection}

import scala.collection.immutable.HashMap

object Town1 extends Town {
  override val name: String = "Town 1"

  override val waters: Int = 2
  override val fields: Int = 3
  override val forests: Int = 2
  override val pastures: Int = 1

  override val connectedTowns: HashMap[Town, TownConnection] = HashMap((Town2, new TownConnection(3) ))
}

