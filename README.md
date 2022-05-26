# Snowball-Stemmer

Provides a simple wrapper around the tartarus.org Snowball stemmer.

## Installation

### project.clj

To install, add the following to your project `:dependencies`:

    [snowball-stemmer "0.1.0"]

### deps.edn

To install, add the following to your deps.edn `:deps`

    io.github.carbonlinkfi/snowball-stemmer {:git/tag "0.1.24" :git/sha "3c2b94"}

## Build locally to .m2 repository

    clj -T:build clean
    clj -T:build jar
    clj -T:build install

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
