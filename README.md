# Stu

Displays the output of CLJS compilation in an interactive UI.
The artifact produced is static so it can be viewed without a server and even emailed as an attachment.

[Try it out](http://htmlpreview.github.io/?https://github.com/stevebuik/Stu/blob/master/resources/public/stu-builds.html).
This page was generated by Stu against a few iterations of [Stu's viz app](https://github.com/stevebuik/Stu/blob/master/src/cljs/viz/app.cljs).

Observations you can see in the Stu sample:

* cljs.pprint was used in Stu in early versions. After seeing how much code it generated, it was removed from all app code. compare 0.5 and 0.7
* Stu was code-split, becoming two modules. Code split apps show one treemap for each module. compare 0.8 and 0.9
* Using a minified version of d3 has no effect on overall artifact size. compare 0.9 and 1.0

Stu is invoked using the command line (or the REPL), intended to be run in a CI server.

Initially supports Shadow CLJS but can support any compilation source.

[![Clojars Project](https://img.shields.io/clojars/v/stu.svg)](https://clojars.org/stu)

## Usage

**Prerequisite**

Stu works by scanning a directory for *bundle-info.edn* files and transforming them.
These files are called **snapshots** and can be generated by Shadow CLJS.

Stu assumes you have already generated one or more snapshots. These are typically in the .shadow-cljs/release-snapshots/&lt;app name&gt; directory.
To generate snapshot(s) using Shadow CLJS you invoke:

`(shadow/release-snapshot :app {:tag "0.8"})` with your own tag or...

`(shadow/release-snapshot :app {})` to generate a *latest* snapshot.

In future this manual step [will be automated](https://github.com/stevebuik/Stu/issues/2) into another CLI by some genius developer whose help will be greatly appreciated.

**Illumination** (i.e. static file generation)

Add the Stu dependency `[stu "0.1.0"]`

Then generate the html report, use the *illuminate* CLI.

`lein run -m stu.illuminate` invokes the command line with default args.

`lein run -m stu.illuminate -h` provides docs and default values for args.

Note: using lein to generate may be slowed down by loading your apps deps.
TODO e.g. of running lean via deps.edn

Any other way of invoking *stu.illuminate/-main* is valid e.g. the Shadow CLJS *clj-run* feature.

The CLI will print the location of the generated file.

## Questions Stu can answer

Stu was built to answer questions about your javascript artifacts. All features exist to these questions:

| Question | Feature |
|----------|---------|
|How big are my artifacts and how has they grown?| The bar chart |
|How big are they when gzipped?| The "Uncompressed" toggle|
|What are the largest parts of my java? | The treemap|
|How big are my artifacts when code split?| Multiple treemaps|
|How much does Google Closure reduce the size of my artifacts| The "Compiled" toggle|
|How much does Google Closure affect npm deps?| The "Compiled" toggle|
|How has my artifact grown over the last 10 weeks?| [TODO The snapshot generator](https://github.com/stevebuik/Stu/issues/2)|
|How did that code end up in my artifact?| [TODO path data in tooltip](https://github.com/stevebuik/Stu/issues/4)|
|Your question here?| TODO |

All enhancement issues in this project should be written in terms of Question/Answer to ensure valuable features are added.

## Design

Stu is a reagent component which is passed [protocol impl](https://github.com/stevebuik/Stu/blob/master/src/cljs/stu/app.cljs#L11) to provide data. That data is [checked using a spec](https://github.com/stevebuik/Stu/blob/master/src/cljc/stu/core.cljc) to ensure it's correct.

This provides two benefits:

1. The component can be run in devcards using different/simple impls of the protocol to display different behaviours.
2. The spec allows any other CLJS compiler capable of generating the data to also use Stu. e.g.
    * cljs.main
    * cljs-build

Stu uses [react faux dom](https://github.com/Olical/react-faux-dom) to simplify the use of D3 interop.
Instead of worrying about how to handle D3s mutations vs Reacts purity, this allows the d3 interop code to be copied directly from javascript examples, including mutations.
This makes the d3 charts much simpler to write.

Using Stu on a large app with many snapshots could generate a large dataset.
The generated data is appended to the static output file using a JSON map with the treemap data encoded using transit.
This allows the GlobalsSource to load only one dataset at a time which mimimises memory consumption.
The use of transit reduces the data size due to it's keyword caching.

In practice, these space savings are small compared to the size of the Stu app javascript but that may improve in future as npm deps can be processed by Google Closure.

## Stu Naval Gazing

Since Stu is a CLJS app, it can be used on itself. This is great because it provides a good example (see link above)
but can also be used to test and develop itself. Examples include:

1. The sample app above
2. The development app running with recorded data
3. The (meager) tests can use a "latest" snapshot to ensure a valid transformation

## Development

* start a lein REPL and `(start-dev!)`
* navigate your browser to http://localhost:8280/devcards.html and explore.
* notice the *Run Viz Application* link which runs the full App in dev mode, with hot code-loading, same as devcards

## Roadmap

All new features are [logged as issues](https://github.com/stevebuik/Stu/labels/enhancement) and tagged as enhancements.

Any help would be greatly appreciated.

## Who is Stu?

He was an internet pioneeer who [used technology to bring light](https://www.youtube.com/watch?v=WzuMwNmH9Vo) to the shadows

## License

Copyright © 2018 Steve Buikhuizen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
