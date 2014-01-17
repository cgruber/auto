package foo;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MyValueType {
  /** Creates etc... */
  public static MyValueType create(String name, int integer, float foo) {
    return new AutoValue_MyValueType(name, integer, foo);
  }

  MyValueType() {}

  /** Returns etc... */
  public abstract String name();

  /** Returns etc... */
  public abstract int integer();

  public abstract float foo();

}
