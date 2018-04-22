# Stu

Displays the output of CLJS compilation in an interactive UI.
The artifact produced is static so it can be viewed without a server and even emailed as an attachment.

Invoked using a command line tool intended to be run in a CI server.

Initially supports Shadow CLJS but can support any compilation source.

## Usage

* single vs N

## Design

* Generic so that other (non-shadow) data sources can be used
* snapshots are loaded from transit strings to minimise file size and cljs mem

## Development

* start a lein REPL and `(start-dev!)`
* after each change, please re-generate the viz for this app so that it's current
* if working on the viz.app/GlobalsSource, use (update-sample!) to refresh the sample

## Roadmap

* multi-module viz
* zoom transitions
* toggle between source and js size (shows closure value)
* bar tooltips
* tree box tooltips
* generate and commit viz for this app in CI
* s3 persistence of bundles
* script to generate bundles from git log
* cljs.main generation/illumination
* cljs-build generation/illumination

## Who is Stu?

He was an internet pioneeer who [used technology to bring light](https://www.youtube.com/watch?v=WzuMwNmH9Vo) to the shadows

## License

Copyright © 2018 Steve Buikhuizen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
