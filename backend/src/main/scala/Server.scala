import cats.effect.{ExitCode, IO, IOApp}
object Server extends  IOApp{
  override def run(args: List[String]): IO[ExitCode] =
    IO.delay(println("hello dude")).as(ExitCode.Success)
}
