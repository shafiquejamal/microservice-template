package com.somepackage.persistence.db

import com.eigenroute.scalikejdbctesthelpers.{CrauthAutoRollback, TestDBConnection}
import org.scalatest.{BeforeAndAfterEach, ShouldMatchers, fixture}

class DAOImplUTest
  extends fixture.FlatSpec
    with ShouldMatchers
    with CrauthAutoRollback
    with BeforeAndAfterEach
    with TestDBConnection
    with Fixture {

    "" should "" in { session =>

    }


  }
