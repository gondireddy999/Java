package calc;

import factory.FareStrategy;

public class WeekendFareStrategy implements FareStrategy {

  @Override
  public String getName() {
    return WeekendFareStrategy.class.toGenericString();
  }

  @Override
  public double getFarePerStation() {
    return 5.5;
  }
}