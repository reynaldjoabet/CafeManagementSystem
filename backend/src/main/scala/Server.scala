import Routes.Routes
import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.ember.server.EmberServerBuilder
object Server extends  IOApp{
  override def run(args: List[String]): IO[ExitCode] =
    EmberServerBuilder.default[IO]
      .withHttpApp(Routes.routes)
      .build
      .use(_=>IO.never)
      .as(ExitCode.Success)
}
