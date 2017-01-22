# Inject-Android

A collection of interfaces to use as the basis of your dagger2 components and assign common interfaces to the apis used and provide some consistency to how you distribute them in your project.

The main goal is to provide base types that can be multibound by dagger2 into maps thus breaking the cyclic dependency between your application class and activities.(and other classes too)

[This bit of Gregory Kick's talk is what I am trying to replicate with these interfaces](https://youtu.be/iwjXqRlEevg?t=28m13s)

### Installation

Step 1. Add the JitPack repository to your build file
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency
```groovy
dependencies {
    ...
    compile 'com.github.trevjonez:Inject-Android:0.3.0'
}
```

### Usage

Extend and/or implement the interfaces in your project.

There is a simple example here: [trevjonez/Dagger2-MultiBinding-Android-Example](https://github.com/trevjonez/Dagger2-MultiBinding-Android-Example)
