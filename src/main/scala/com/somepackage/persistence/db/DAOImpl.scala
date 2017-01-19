package com.somepackage.persistence.db

import com.eigenroute.util.id.UUIDProvider
import com.eigenroute.scalikejdbchelpers.ScalikeJDBCSessionProvider
import com.somepackage.domain.DAO

class DAOImpl(
    scalikeJDBCSessionProvider: ScalikeJDBCSessionProvider,
    uUIDProvider: UUIDProvider)
  extends DAO