package com.somepackage.persistence.db

import java.util.UUID

import com.eigenroute.util.time.TestTimeProviderImpl
import scalikejdbc._

trait Fixture {

  val now = new TestTimeProviderImpl().now()
  val later = now.plusDays(1)
  val yesterday = now.minusDays(1).plusMillis(1)
  val dayBeforeYesterday = now.minusDays(2)

  val id1 = UUID.fromString("00000000-0000-0000-0000-000000000001")
  val id2 = UUID.fromString("00000000-0000-0000-0000-000000000002")
  val id3 = UUID.fromString("00000000-0000-0000-0000-000000000003")
  val id4 = UUID.fromString("00000000-0000-0000-0000-000000000004")
  val id5 = UUID.fromString("00000000-0000-0000-0000-000000000005")
  val id6 = UUID.fromString("00000000-0000-0000-0000-000000000006")
  val id7 = UUID.fromString("00000000-0000-0000-0000-000000000007")

  val sqlToExecute: Vector[SQL[Nothing, NoExtractor]] = Vector()

}
