package de.company.prototype.woodpecker

import org.junit.jupiter.api.Test

abstract class BDD : Endpoint() {
  @Test
  fun verify() {
    given_()
    when_()
    then_()
  }

  protected open fun given_() {
  }

  protected open fun when_() {
  }

  protected abstract fun then_()
}
