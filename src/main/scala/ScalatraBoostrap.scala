package presentation

import org.scalatra.LifeCycle
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle{
  override def init(ctx: ServletContext){
    ctx mount(new Presentation, "/lab")
  }

}
