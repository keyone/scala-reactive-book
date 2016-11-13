package controllers

import actors.TwitterStreamer

import play.api.Play.current

import play.api.mvc.{Action, Controller, WebSocket}
import play.api.libs.json._

class Application extends Controller {

  def index = Action { implicit request =>
    Ok(views.html.index("Tweets"))
  }

  def tweets = WebSocket.acceptWithActor[String, JsValue] {
    request => out => TwitterStreamer.props(out)
  }
}
