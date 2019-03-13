package marko.hooks

import marko.TestFlow
import org.openqa.selenium.WebDriver
import org.scalatest.Reporter
import org.scalatest.events.{Event, TestFailed, TestSucceeded}

class UIReporter extends Reporter {

  def apply(event: Event) = {
    event match {
      case event: TestSucceeded => println(event.testName + "\n...test succeeded")
      case event: TestFailed => {
        println(event.testName + "\n...test failed")
        implicit val webDriver: WebDriver = TestFlow.webDriver
      }
      case _ =>
    }
  }

}


