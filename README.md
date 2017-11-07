# FunWrap
```kotlin
from("java.util.function")
    .filter(::commonlyUsed)
    .map(::plusThrowsClause)
    .forEach(::wrapBackToJava8)
```

## Should I Use this Project?
No, not yet.

There are still a few things in our `To Do` list.

## Adding FunWrap to your Project
But if you insist...

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
- [ ] Handle method signature ambiguity for predicates
- [ ] Use cases & examples
- [ ] Quick explanation on how it works
- [ ] Functions list
- [ ] Implement the `default` methods found in the Java 8 counterparts
- [ ] Unit testing
