import marko.TestFlow
import marko.pages.MainPage
import org.openqa.selenium.WebDriver
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}
import org.scalatest.selenium.WebBrowser

import scala.util.Properties

class TestSearchSpec extends FlatSpec with Matchers with BeforeAndAfterAll with WebBrowser  {

  implicit val host: String = Properties.propOrElse("env.url", "http://www.google.com")
  implicit def webDriver: WebDriver = TestFlow.webDriver

  behavior of "A test suite"
  it should "have Page title to be Google" in {
  val page = new MainPage
    go to page
    page.searchButton

    pageTitle should be("Google") }

}


