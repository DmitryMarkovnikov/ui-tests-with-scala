package marko

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

private class TestFlow {
  private lazy val webDriver = new ChromeDriver()
}

object TestFlow {
  private[this] var flow = new TestFlow

  def webDriver: WebDriver = flow.webDriver

  def reset(): Unit = flow = {
    webDriver.close()
    webDriver.quit()
    new TestFlow
  }

  scala.sys.addShutdownHook {
    TestFlow.webDriver.close()
    TestFlow.webDriver.quit()
  }
}
