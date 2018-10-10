package controllers

import javax.inject.Inject
import play.api.mvc._


class DemoController @Inject()
(cc: ControllerComponents)
  extends AbstractController(cc) {
  def index = Action {
    Ok(views.html.index2("首页","第一个Play Web应用!"))
  }
}
