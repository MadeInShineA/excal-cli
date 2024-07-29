package board.town.towns

import board.town.{Town, TownConnection}

import scala.collection.immutable.HashMap

object Town2 extends Town {
  override val name: String = "Town 2"

  override val waters: Int = 2
  override val fields: Int = 1
  override val forests: Int = 2
  override val pastures: Int = 1

  override val connectedTowns: HashMap[Town, TownConnection] = HashMap((Town1, new TownConnection(3) ))

}
