package board.town

import board.BoardTile
import entity.Entity

import scala.collection.mutable.ArrayBuffer

class TownConnection(numTiles: Int) {
  val boardTiles: Array[BoardTile] = Array.fill(numTiles){new BoardTile}
}
