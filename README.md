# Reikai
Reikai (originated from japanese - 霊界, meaning *spiritual world*) is a library for the [Kotlin](https://kotlinlang.org/) programming language. This library is inspired by [φ-calculus](https://arxiv.org/abs/2111.13384), and it's main purpose is to bring [OOP](https://en.wikipedia.org/wiki/Object-oriented_programming) to the language.

The idea is that there is no data types — the only data *type* is `ByteArray`, an arbitrary length amount of bytes. And the objects manipulate the bytes.

<p align="center">
  <a href="https://codecov.io/gh/kerelape/reikai"> 
    <img height="24px" src="https://codecov.io/gh/kerelape/reikai/branch/master/graph/badge.svg?token=3aMJnpv6fu"/> 
  </a>
  <a href="https://github.com/kerelape/reikai/actions/workflows/mvn.yml">
    <img height="24px" src="https://github.com/kerelape/reikai/actions/workflows/mvn.yml/badge.svg" />
  </a>
</p>

## Documentation
Full documentation of this library is available at [GitHub Pages](https://kerelape.github.io/reikai)

<!--
@todo #26 Add usages examples to the README. Show how to use this library in general cases.
-->

<!--
@todo #26 Explain the concept and describe what 'dataization' and why it's better than primitives
-->

<!--
@todo #26 Show inspiring examples of using this library in context of green threads, and compare to Threads
-->

## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Plint
```

You will need Maven 3.3+ and Java 8+.

