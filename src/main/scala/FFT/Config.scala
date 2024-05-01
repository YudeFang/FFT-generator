
package FFT

trait HasDataConfig {
  val DataWidth = 32
  val BinaryPoint = 16
}

trait HasElaborateConfig {
  val FFTLength = 4096
  val useGauss = false
  val useBRAM = false
  val depBound = 16
}
