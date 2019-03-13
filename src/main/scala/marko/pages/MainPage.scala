package marko.pages


import org.openqa.selenium.WebDriver
import org.scalatest.selenium.WebBrowser._

class MainPage(implicit webdriver: WebDriver, host: String) extends BasePageObject("/", "Google") {

  def searchButton: Option[Element] = find("btnK")
}