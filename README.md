# Snowball-Stemmer

Provides a simple wrapper around the tartarus.org Snowball stemmer.

## Getting started

Add the necessary dependencies

### `deps.edn`

    carbonlink/snowball-stemmer {:mvn/version "0.1.25"}

### Source

`:require` snowball-stemmer

    (ns my.ns
      (:require
        [snowball-stemmer "0.1.0"]))

## Building from source

Build locally to .m2 repository

    clj -T:build clean
    clj -T:build jar
    clj -T:build install

### Publish JAR file

TBD

## Usage

```clojure
user=> (require '[stemmer.snowball :as snowball])
nil
user=> (def stemmer (snowball/stemmer :english))
#'user/stemmer
user=> (stemmer "probable")
"probabl"
user=> (stemmer "probably")
"probabl"
user=> (stemmer "loved")
"love"
user=> (stemmer "lovely")
"love"
user=> (stemmer "turtles")
"turtl"
user=> (stemmer "turtle")
"turtl"
```

## License

Distributed under the BSD license.
