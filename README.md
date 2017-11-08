# FunWrap
Ever wanted to use those fancy lambdaful classes like `Stream` and `Optional` in Java 8?
```java
stream.filter(Foo::isValid)
      .map(Foo::toBar)
      .forEach(Bar::printBaz);
```
_Except_ you can't, because all your methods have that pesky `throws Exception` clause!

No problem! We can just wrap those in `try`-`catch` blocks!
```java
stream.filter(foo -> {
  try {
    return foo.isValid();
  } catch(FooCheckedException e) {
    throw new RuntimeException(e);
  }
}).map(foo -> {
  try {
    return foo.toBar();
/* OOPS NEVERMIND */
```

Well, **Checked Exceptions Are Not Fun.**

What if there's a way to bypass all those checked exceptions? That is exactly what _FunWrap_ is trying to do!

## Usage
_FunWrap_ provides 3 things:

**A set of functions that allows you to throw checked exceptions:**
```java
CheckedFunction<Foo, Bar> fn = foo -> {
  throw new Exception();
};
```

**A way to throw checked exceptions without using a `throws` clause or wrapping it in RuntimeException:**
```java
void doSomething() throws Exception { ... }

void doSomethingElse() {
  FunRunner.run(() -> doSomething())
}
```

**A way to make lambdas without having to wrap them to `try`-`catch` blocks:**
```java
import static io.github.snarks.funwrap.FunWrap.*;

stream.filter(predicate(Foo::isValid))
      .map(function(Foo::toBar))
      .forEach(consumer(Bar::printBaz));
```

## What? How is that even possible?!
_FunWrap_ isn't really doing anything particularly fancy. It just ~~abuses~~ takes advantage of Kotlin's ability to do away with checked exceptions entirely.

This is possible because checked exceptions is purely a Java compiler thing. The JVM doesn't really care about checked exceptions at all when it comes to invoking methods.


## Adding FunWrap to your Project
You can add this project as a dependency via [JitPack](https://jitpack.io/).

```gradle
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}
dependencies {
     compile 'io.github.snarks:FunWrap:1.1.1'
}
```
(_`com.github.snarks` will also work_)
