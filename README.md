# FunWrap
```kotlin
from("java.util.function")
    .filter(::commonlyUsed)
    .map(::plusThrowsClause)
    .forEach(::wrapBackToJava8)
```

## Adding FunWrap to your Project

You can add this project as a dependency via [JitPack](https://jitpack.io/).

```gradle
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}
dependencies {
     compile 'io.github.snarks:FunWrap:1.0'
}
```
(_`com.github.snarks` will also work_)

## To Do
- [ ] Use cases & examples
- [ ] Quick explanation on how it works
- [ ] Functions list
- [ ] Implement the `default` methods found in the Java 8 counterparts
- [ ] Unit testing
