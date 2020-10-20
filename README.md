# Scala compiler bug?

## System Requirements
- Installed [SBT](https://www.scala-sbt.org/download.html)

## How to run
1. You cloned repo and opened bash/command prompt in that folder
2. Run `sbt ";clean;cleanFiles;runMain example.Example"`

## Expected output
```
example.scala.Document.getMember(foo)
```

## Current output
```
C:\repos\compiler-bug>sbt ";clean;cleanFiles;runMain example.Example"
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
[info] welcome to sbt 1.4.1 (Oracle Corporation Java 1.8.0_261)
[info] loading global plugins from C:\Users\User\.sbt\1.0\plugins
[info] loading settings for project compiler-bug-build from plugins.sbt ...
[info] loading project definition from C:\repos\compiler-bug\project
[info] loading settings for project root from build.sbt ...
[info] set current project to compiler-bug (in build file:/C:/repos/compiler-bug/)
[success] Total time: 0 s, completed Oct 20, 2020 6:58:37 PM
[success] Total time: 0 s, completed Oct 20, 2020 6:58:37 PM
[info] compiling 2 Scala sources and 2 Java sources to C:\repos\compiler-bug\target\scala-2.13\classes ...
[info] running example.Example
[error] (run-main-0) java.lang.NoSuchFieldError: document
[error] java.lang.NoSuchFieldError: document
[error]         at example.Example$.main(Example.scala:9)
[error]         at example.Example.main(Example.scala)
[error]         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error]         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error]         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error]         at java.lang.reflect.Method.invoke(Method.java:498)
[error] stack trace is suppressed; run last Compile / bgRunMain for the full output
[error] Nonzero exit code: 1
[error] (Compile / runMain) Nonzero exit code: 1
[error] Total time: 3 s, completed Oct 20, 2020 6:58:39 PM
```

## Environment
- JVM: Oracle JDK 8, jdk-8u261
- Scala: 2.13.3
- OS: Windows 10 x64, v.10.0.18362.1139
