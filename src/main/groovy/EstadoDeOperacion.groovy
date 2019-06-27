package consorcios

@groovy.transform.ToString
@groovy.transform.EqualsAndHashCode
class EstadoDeOperacion  {

  // value object
  // Long, Integer, String, BigDecimal, Float, Double, Char, Boolean

  enum Moneda {
    PESOS,
    DOLARES,
  }

  final Moneda moneda
  final BigDecimal monto

  EstadoDeOperacion(Moneda moneda, BigDecimal monto) {
    if (monto < 0) throw new IllegalArgumentException("no")
    this.moneda = moneda
    this.monto = monto
  }

}
