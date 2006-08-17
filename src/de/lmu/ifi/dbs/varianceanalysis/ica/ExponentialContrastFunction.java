package de.lmu.ifi.dbs.varianceanalysis.ica;

import de.lmu.ifi.dbs.utilities.optionhandling.AbstractParameterizable;

/**
 * Provides the function g(x) = x*exp(-x^2/2) which is the derivative of the
 * function G(x)= -exp(-x^2/2).
 * This function is useful, when the independent components
 * are highly super-Gaussian, or when robustness is very
 * important.
 *
 * @author Elke Achtert (<a href="mailto:achtert@dbs.ifi.lmu.de">achtert@dbs.ifi.lmu.de</a>)
 */
public class ExponentialContrastFunction extends AbstractParameterizable implements ContrastFunction {
  /**
   * @see ContrastFunction#function(double)
   */
  public double function(double x) {
    return (x * Math.exp(-x * x / 2));
  }

  /**
   * @see ContrastFunction#derivative(double)
   */
  public double derivative(double x) {
    return ((1 - x * x) * Math.exp(-x * x / 2));
  }
}
