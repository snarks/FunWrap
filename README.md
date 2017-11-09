# FunWrap
FunWrap is a Java library that allows you to throw checked exceptions in places you're normally not allowed to.

```java
boolean isValid() throws Exception;
Bar toBar() throws Exception;
void printBaz() throws Exception;
```
```java
import static io.github.snarks.funwrap.FunWrap.*;

stream.filter(predicate(Foo::isValid))
      .map(function(Foo::toBar))
      .forEach(consumer(Bar::printBaz));
```

## What? How is that even possible?!
FunWrap isn't really doing anything particularly fancy. It just ~~abuses~~ takes advantage of Kotlin's ability to do away with checked exceptions entirely.

This is possible because checked exceptions is purely a Java compiler thing. The JVM doesn't really care about checked exceptions at all when it comes to invoking methods.

## Caveat
You still need to use common sense when using this library. Take caution where you're throwing your exceptions - it might not be supposed to be thrown there.

## Documentation
The Javadocs are in [here](https://snarks.github.io/FunWrap/).

## Adding FunWrap to your Project
You can add this project as a dependency via [JitPack](https://jitpack.io/).

```gradle
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}
dependencies {
     compile 'io.github.snarks:FunWrap:1.2.0'
}
```
(_`com.github.snarks` will also work_)
