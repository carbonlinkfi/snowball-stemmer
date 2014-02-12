# Snowball-Stemmer

Provides a simple wrapper around the tartarus.org Snowball stemmer.

## Installation

To install, add the following to your project `:dependencies`:

    [snowball-stemmer "0.1.0"]

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

Copyright © 2014 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
