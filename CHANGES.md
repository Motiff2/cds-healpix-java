
v0.30.3 (2024-04-09)
==================

### Bug correction

* See [this issue](https://github.com/cds-astro/cds-healpix-java/issues/18)
    + Newton method failed in a corner case when trying to find a polygon "special point" 
    + We assume there is no specil point in such cases.


v0.30.2 (2021-09-09)
==================

### Bug correction

* See [this issue](https://github.com/cds-astro/cds-healpix-java/issues/17):
    + `HealpixNestedFast.pathAlongCellEdge` was bugged at the pole (NaN),
       and at the Equatorial Region / Polar Cap separation.
    + Add tests to check consistency between `HealpixNestedFast.pathAlongCellEdge` and `HealpixNested.pathAlongCellEdge`


v0.30 (2021-09-07)
==================

### Bug correction

* See [this issue](https://github.com/cds-astro/cds-healpix-java/issues/16):
    + `HealpixNestedFast.vertex` was bugged at the pole, could return negative longitudes, and had too strict asserts.
    + Add tests to check consistency between `HealpixNestedFast.vertex` and `HealpixNested.vertex` 


v0.29 (2021-04-30)
==================

### Build 3 (2021-04-30):

* Change the log level of the message printed when the growable array grows
* The growable array initial capacity now accounts for the fact that more
  cells than the final (B)MOC size have to be temporarily stored.

### Build 2 (2021-04-13): 

* Fix the wrong `buildValue` arguments introduded in `NestedSmallCellApproxedMethod.buildMocRecursively`
  (rogue copy/paste detected by Mark Taylor: no impact on the list of values but wrong BMOC boolean)


### Changes

* Add a growable array in NestedSmallCellApproxedMethod.java to prevent 
  errors in case of too low MOC size upper bound estimat


v0.28 (2021-04-12)
==================

### Changes/Bug correction

* Change the MOC size upperd bound by a more robust estimate
* Change HealpixNestedHashComputer to avoid corner cases


v0.27 (2020-06-21)
==================

### Changes

* Separate tests from benches  (add `make.bench` target in the build.xml)


v0.26 (2020-05-29)
==================

## Added

* Method transforming a range into a list of cells of various depth

## Bug correction

* Fix internal/external edges (now used in Aladin)
* Fix bug on "toRange" method
* Fix assertion (long value instead of int, done by Mark Taylor)
* Increase MOC size in ConeSearch
* Fix a minor issue in query polygon

v0.25 (2019-11-08)
==================

### Added

* Add Decorator to transform a BMOC iterator into a Range iterator (to be tested with Aladin!)

### Changes

* Use a correct and more robust algo for elliptical cones

### Bug correction

* Fix test error due to elliptical cone
* Fix cone search error (not enought space allocated)


v0.24 (2019-07-15)
==================

### Bug correction

* Fix the CLI code (see closed Issue on Github)
* Fix ultra compressed BMOC

### WARNING

* Method "externalEdges" probably bugged: compare restuls with Rust!!
* BMOC logical operation are probably bugged: compare results with Rust!!


v0.23 (2019-03-21)
==================

### Changes

* Change the code of elliptical cone (still to be tested, I am wainting for an implementation in Aladin!)

### Bug correction

* Fix a trivial bug on method toRing

v0.22 (2019-03-04)
==================

### Bug correction

* Now supports longitude lower than 0 or higher than twice PI in polygone vertices

### Added

* Add support for elliptical cone


v0.21 (2019-02-28)
==================

### Bug correction

* Fix the computation of the number of rings when a cone contains a pole.
* Remove dependencies to Java 7 (nio.Files, Double.isFinite).


v0.2 (2019-02-13)
=================

### Bug correction

* Fix the exact cone solution (+ regression tests addded)
* Minimum Enclosing Cone possibly bugged for polygons larger than an hemisphere (replaced by another bounding cone).


### Added

* In polygon, we replaced the Minimum Enclosing Cone by a faster (but less accurate) bounding cone.
* Exact polygon solution (+ regression tests added)
* First version of BMOC logical operations added (but still to be debugged!!)
* Utra compact MOCs added (based on an implicit data-structure)
* First version of a CLI

### WARNINGs

* BMOC logical operations not yet debugged
* The source code is still ALL BUT CLEAN: a lot of cleaning still needed!!


v0.1 (2018-09-04)
=================

- Initial release



