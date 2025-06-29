# Changelog

## 0.1.0-alpha.74 (2025-06-27)

Full Changelog: [v0.1.0-alpha.73...v0.1.0-alpha.74](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.73...v0.1.0-alpha.74)

### Bug Fixes

* **ci:** release-doctor — report correct token name ([490c529](https://github.com/OneBusAway/kotlin-sdk/commit/490c5296c64401d6c15b42c9937e867af83e22ab))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([06f036e](https://github.com/OneBusAway/kotlin-sdk/commit/06f036e59faaff24d99e7464726c505cd4079975))

## 0.1.0-alpha.73 (2025-06-17)

Full Changelog: [v0.1.0-alpha.72...v0.1.0-alpha.73](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.72...v0.1.0-alpha.73)

### Chores

* **ci:** enable for pull requests ([05e63f0](https://github.com/OneBusAway/kotlin-sdk/commit/05e63f0e7fecd9d01c787dab0bac8fbf54c35da0))

## 0.1.0-alpha.72 (2025-06-13)

Full Changelog: [v0.1.0-alpha.71...v0.1.0-alpha.72](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.71...v0.1.0-alpha.72)

### Features

* **client:** add a `withOptions` method ([10fb83f](https://github.com/OneBusAway/kotlin-sdk/commit/10fb83fbc9d18ac7965672431fa7ba0d3fc68af5))
* **client:** implement per-endpoint base URL support ([3c2b9e1](https://github.com/OneBusAway/kotlin-sdk/commit/3c2b9e1a1ce967946ffa26d0378fe718318c410a))

## 0.1.0-alpha.71 (2025-05-22)

Full Changelog: [v0.1.0-alpha.70...v0.1.0-alpha.71](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.70...v0.1.0-alpha.71)

### Chores

* **docs:** grammar improvements ([2665fd7](https://github.com/OneBusAway/kotlin-sdk/commit/2665fd73294df5eb9f58773aa2c75ccd0d0e8c7b))

## 0.1.0-alpha.70 (2025-05-21)

Full Changelog: [v0.1.0-alpha.69...v0.1.0-alpha.70](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.69...v0.1.0-alpha.70)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#294](https://github.com/OneBusAway/kotlin-sdk/issues/294))
* **client:** **Migration:** Previously you would access error JSON on an exception via `exception.error()._additionalProperties()`, which would return `Map<String, JsonValue>`. Now you would access this via `exception.body()`, which returns `JsonValue`. You should no longer assume that the returned error JSON is an object. You can check via `exception.body().asObject()`.

### Features

* **api:** updates ([c38b158](https://github.com/OneBusAway/kotlin-sdk/commit/c38b158cfa64ea38643a89adccd4729f4d8e5556))


### Bug Fixes

* **client:** support kotlin 1.8 runtime ([#291](https://github.com/OneBusAway/kotlin-sdk/issues/291)) ([d16a260](https://github.com/OneBusAway/kotlin-sdk/commit/d16a2608439f9e8668debdb758bf5840cfbd3cae))


### Chores

* better phone number examples ([#281](https://github.com/OneBusAway/kotlin-sdk/issues/281)) ([ab7b270](https://github.com/OneBusAway/kotlin-sdk/commit/ab7b2705e7abf9bcb6e6e69f7ec88b11a00e981c))
* **client:** refactor exception structure and methods ([#294](https://github.com/OneBusAway/kotlin-sdk/issues/294)) ([b45ee94](https://github.com/OneBusAway/kotlin-sdk/commit/b45ee944f53b62df0566a6e2673d88886a98236e))
* **internal:** add generated comment ([#285](https://github.com/OneBusAway/kotlin-sdk/issues/285)) ([8947c24](https://github.com/OneBusAway/kotlin-sdk/commit/8947c247fe2d431281e78b407524be3e8ae15c79))
* **internal:** add missing release please block ([#293](https://github.com/OneBusAway/kotlin-sdk/issues/293)) ([57b1869](https://github.com/OneBusAway/kotlin-sdk/commit/57b1869f7e1a518b29a5e274a13999e178f8f77b))
* **internal:** codegen related update ([#280](https://github.com/OneBusAway/kotlin-sdk/issues/280)) ([effb81e](https://github.com/OneBusAway/kotlin-sdk/commit/effb81e13d6fdd6c8d771ee137c945db77667a44))
* **internal:** delete duplicate tests ([023a491](https://github.com/OneBusAway/kotlin-sdk/commit/023a49165c77bd7657e37b1d4b883d71ec86e9d6))
* **internal:** generate more tests ([1c2f123](https://github.com/OneBusAway/kotlin-sdk/commit/1c2f12328af6e4b0abb309cf3e663260ee0bd4ac))
* **internal:** make multipart assertions more robust ([dade503](https://github.com/OneBusAway/kotlin-sdk/commit/dade503e7a1f3f36a4ed579753112fc8a1ea0953))
* **internal:** make test classes internal ([#284](https://github.com/OneBusAway/kotlin-sdk/issues/284)) ([a494918](https://github.com/OneBusAway/kotlin-sdk/commit/a4949186b68a318045384cfec90623a8342c6a56))
* **internal:** refactor enum query param serialization ([#292](https://github.com/OneBusAway/kotlin-sdk/issues/292)) ([0e54b37](https://github.com/OneBusAway/kotlin-sdk/commit/0e54b37ab7b29e5b82d7b45d9169b8050e7e9241))
* **internal:** refactor query param serialization impl and tests ([#287](https://github.com/OneBusAway/kotlin-sdk/issues/287)) ([e297af2](https://github.com/OneBusAway/kotlin-sdk/commit/e297af24c8f907038bbb0e9b21ae1278131be64c))
* **internal:** refactor some test assertions ([023a491](https://github.com/OneBusAway/kotlin-sdk/commit/023a49165c77bd7657e37b1d4b883d71ec86e9d6))
* **internal:** reformat some tests ([#290](https://github.com/OneBusAway/kotlin-sdk/issues/290)) ([1c2f123](https://github.com/OneBusAway/kotlin-sdk/commit/1c2f12328af6e4b0abb309cf3e663260ee0bd4ac))
* **internal:** remove extra empty newlines ([#282](https://github.com/OneBusAway/kotlin-sdk/issues/282)) ([41c7cbf](https://github.com/OneBusAway/kotlin-sdk/commit/41c7cbfe0ff8a3612e14bb37da6b02c77b99159c))
* **internal:** remove unnecessary `assertNotNull` calls ([dade503](https://github.com/OneBusAway/kotlin-sdk/commit/dade503e7a1f3f36a4ed579753112fc8a1ea0953))
* **internal:** remove unnecessary import ([#296](https://github.com/OneBusAway/kotlin-sdk/issues/296)) ([5c17aa7](https://github.com/OneBusAway/kotlin-sdk/commit/5c17aa7e3dedc4795d9b0532c76a673bee26155e))
* **internal:** rename `getPathParam` ([#288](https://github.com/OneBusAway/kotlin-sdk/issues/288)) ([023a491](https://github.com/OneBusAway/kotlin-sdk/commit/023a49165c77bd7657e37b1d4b883d71ec86e9d6))
* **internal:** reorder some params methodsc ([023a491](https://github.com/OneBusAway/kotlin-sdk/commit/023a49165c77bd7657e37b1d4b883d71ec86e9d6))
* **internal:** version bump ([#289](https://github.com/OneBusAway/kotlin-sdk/issues/289)) ([424e5ab](https://github.com/OneBusAway/kotlin-sdk/commit/424e5ab161df883280bd4e39c4c50e6d58e42bf4))


### Documentation

* add `build` method comments ([#286](https://github.com/OneBusAway/kotlin-sdk/issues/286)) ([11ae6b9](https://github.com/OneBusAway/kotlin-sdk/commit/11ae6b900db2157d7aea1d3ab82295ef3b6f84a7))
* deduplicate and refine comments ([#283](https://github.com/OneBusAway/kotlin-sdk/issues/283)) ([04aa38e](https://github.com/OneBusAway/kotlin-sdk/commit/04aa38e0a3504ea31e01c2124729a43ff97199cd))
* minor readme tweak ([#298](https://github.com/OneBusAway/kotlin-sdk/issues/298)) ([c1b531b](https://github.com/OneBusAway/kotlin-sdk/commit/c1b531b276ffba786bc74f121ab7e70a6e2295e7))
* refine comments on multipart params ([#295](https://github.com/OneBusAway/kotlin-sdk/issues/295)) ([dade503](https://github.com/OneBusAway/kotlin-sdk/commit/dade503e7a1f3f36a4ed579753112fc8a1ea0953))
* update readme exception docs ([#297](https://github.com/OneBusAway/kotlin-sdk/issues/297)) ([e6f1ccf](https://github.com/OneBusAway/kotlin-sdk/commit/e6f1ccf575cde5f48a0adc68e8aab88ff4b8b603))

## 0.1.0-alpha.69 (2025-05-15)

Full Changelog: [v0.1.0-alpha.68...v0.1.0-alpha.69](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.68...v0.1.0-alpha.69)

### Chores

* **internal:** codegen related update ([#280](https://github.com/OneBusAway/kotlin-sdk/issues/280)) ([4bf71bf](https://github.com/OneBusAway/kotlin-sdk/commit/4bf71bf23348ca3ab07a7df06a38a3b193d95242))

## 0.1.0-alpha.68 (2025-05-15)

Full Changelog: [v0.1.0-alpha.67...v0.1.0-alpha.68](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.67...v0.1.0-alpha.68)

### Chores

* **internal:** add `.kotlin` to `.gitignore` ([#276](https://github.com/OneBusAway/kotlin-sdk/issues/276)) ([1eb24ad](https://github.com/OneBusAway/kotlin-sdk/commit/1eb24ad47b637a551e3bfe075e8146c707c60019))
* **internal:** codegen related update ([#277](https://github.com/OneBusAway/kotlin-sdk/issues/277)) ([df01249](https://github.com/OneBusAway/kotlin-sdk/commit/df01249a07ee2d58d49e3328dfe024ae5074773a))


### Documentation

* document `JsonValue` construction in readme ([#279](https://github.com/OneBusAway/kotlin-sdk/issues/279)) ([d093175](https://github.com/OneBusAway/kotlin-sdk/commit/d093175f95faf5270b78715ecfe863cfbd665ac7))
* revise readme docs about nested params ([#278](https://github.com/OneBusAway/kotlin-sdk/issues/278)) ([0d9b03e](https://github.com/OneBusAway/kotlin-sdk/commit/0d9b03e374779e83a960842653f4e75734736d23))

## 0.1.0-alpha.67 (2025-05-15)

Full Changelog: [v0.1.0-alpha.66...v0.1.0-alpha.67](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.66...v0.1.0-alpha.67)

### Features

* generate and publish docs ([#274](https://github.com/OneBusAway/kotlin-sdk/issues/274)) ([4aecdbd](https://github.com/OneBusAway/kotlin-sdk/commit/4aecdbdb54266d24cae48500180c6e1903712645))


### Chores

* **internal:** update java toolchain ([ed72b2f](https://github.com/OneBusAway/kotlin-sdk/commit/ed72b2f4944d7ce9ce611d7e0b1830f8761f55bf))

## 0.1.0-alpha.66 (2025-03-07)

Full Changelog: [v0.1.0-alpha.65...v0.1.0-alpha.66](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.65...v0.1.0-alpha.66)

### Features

* **client:** detect binary incompatible jackson versions ([#273](https://github.com/OneBusAway/kotlin-sdk/issues/273)) ([711013a](https://github.com/OneBusAway/kotlin-sdk/commit/711013a6c3ab1376fe3600a750086b8a84b9b032))


### Chores

* **internal:** codegen related update ([#271](https://github.com/OneBusAway/kotlin-sdk/issues/271)) ([991b3d1](https://github.com/OneBusAway/kotlin-sdk/commit/991b3d18b52ee9a65079f8d7485d3458a4596c12))

## 0.1.0-alpha.65 (2025-03-05)

Full Changelog: [v0.1.0-alpha.64...v0.1.0-alpha.65](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.64...v0.1.0-alpha.65)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#267](https://github.com/OneBusAway/kotlin-sdk/issues/267))

### Features

* **client:** allow configuring timeouts granularly ([#264](https://github.com/OneBusAway/kotlin-sdk/issues/264)) ([58f093b](https://github.com/OneBusAway/kotlin-sdk/commit/58f093b598caa63c086519c77e09d9d21248d97a))
* **client:** support raw response access ([#266](https://github.com/OneBusAway/kotlin-sdk/issues/266)) ([d8f53b8](https://github.com/OneBusAway/kotlin-sdk/commit/d8f53b83b0fc037060865cb56327e23960cbfcba))


### Chores

* **client:** refactor multipart formdata impl ([#267](https://github.com/OneBusAway/kotlin-sdk/issues/267)) ([d1c8a94](https://github.com/OneBusAway/kotlin-sdk/commit/d1c8a94c6a52effd233812730e3e1edf7655d74b))


### Documentation

* add raw response readme documentation ([#268](https://github.com/OneBusAway/kotlin-sdk/issues/268)) ([e27352b](https://github.com/OneBusAway/kotlin-sdk/commit/e27352b181501ec0ba64419ce89bf43c255fd53e))
* note required fields in `builder` javadoc ([#269](https://github.com/OneBusAway/kotlin-sdk/issues/269)) ([4135b6a](https://github.com/OneBusAway/kotlin-sdk/commit/4135b6a81eea6a5ab5a3c13d30d6159ca61dc88f))

## 0.1.0-alpha.64 (2025-03-04)

Full Changelog: [v0.1.0-alpha.63...v0.1.0-alpha.64](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.63...v0.1.0-alpha.64)

### Chores

* **client:** use deep identity methods for primitive array types ([#259](https://github.com/OneBusAway/kotlin-sdk/issues/259)) ([3e3498d](https://github.com/OneBusAway/kotlin-sdk/commit/3e3498d2beea5f1bae0c40a8a8fffdad0e7a303a))
* **internal:** add async service tests ([#257](https://github.com/OneBusAway/kotlin-sdk/issues/257)) ([f932317](https://github.com/OneBusAway/kotlin-sdk/commit/f9323176530f458418269598db5d4b86309c1d7e))
* **internal:** improve sync service tests ([f932317](https://github.com/OneBusAway/kotlin-sdk/commit/f9323176530f458418269598db5d4b86309c1d7e))
* **internal:** refactor `ErrorHandlingTest` ([#262](https://github.com/OneBusAway/kotlin-sdk/issues/262)) ([fdb55ed](https://github.com/OneBusAway/kotlin-sdk/commit/fdb55ed46957c7110a7278872299762278c6ae8f))
* **internal:** refactor `ServiceParamsTest` ([#260](https://github.com/OneBusAway/kotlin-sdk/issues/260)) ([1bc085e](https://github.com/OneBusAway/kotlin-sdk/commit/1bc085e8865f79d3ce55173048ace9e17af9d469))


### Documentation

* readme parameter tweaks ([f932317](https://github.com/OneBusAway/kotlin-sdk/commit/f9323176530f458418269598db5d4b86309c1d7e))
* update URLs from stainlessapi.com to stainless.com ([#261](https://github.com/OneBusAway/kotlin-sdk/issues/261)) ([5e68b44](https://github.com/OneBusAway/kotlin-sdk/commit/5e68b4422fae787a9a82ce2aa56961b70593081e))

## 0.1.0-alpha.63 (2025-02-26)

Full Changelog: [v0.1.0-alpha.62...v0.1.0-alpha.63](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.62...v0.1.0-alpha.63)

### Features

* **client:** allow omitting params object when none required ([#254](https://github.com/OneBusAway/kotlin-sdk/issues/254)) ([3e344a3](https://github.com/OneBusAway/kotlin-sdk/commit/3e344a30d07f0103a90ffeb18f1338a7f33bff2d))

## 0.1.0-alpha.62 (2025-02-26)

Full Changelog: [v0.1.0-alpha.61...v0.1.0-alpha.62](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.61...v0.1.0-alpha.62)

### Chores

* **internal:** version bump ([#250](https://github.com/OneBusAway/kotlin-sdk/issues/250)) ([76aa19a](https://github.com/OneBusAway/kotlin-sdk/commit/76aa19af98adb7ab93c5314d9e1ba11b55e203f7))

## 0.1.0-alpha.61 (2025-02-26)

Full Changelog: [v0.1.0-alpha.60...v0.1.0-alpha.61](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.60...v0.1.0-alpha.61)

### Chores

* **internal:** version bump ([#247](https://github.com/OneBusAway/kotlin-sdk/issues/247)) ([3facf47](https://github.com/OneBusAway/kotlin-sdk/commit/3facf47d1f08dfa1fb25c534a28b1435319c03b7))

## 0.1.0-alpha.60 (2025-02-26)

Full Changelog: [v0.1.0-alpha.59...v0.1.0-alpha.60](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.59...v0.1.0-alpha.60)

### Chores

* **internal:** version bump ([#244](https://github.com/OneBusAway/kotlin-sdk/issues/244)) ([8ad6bca](https://github.com/OneBusAway/kotlin-sdk/commit/8ad6bca45b2a6f00c5af5506f27edabb9e458076))

## 0.1.0-alpha.59 (2025-02-26)

Full Changelog: [v0.1.0-alpha.58...v0.1.0-alpha.59](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.58...v0.1.0-alpha.59)

### Chores

* **internal:** version bump ([#241](https://github.com/OneBusAway/kotlin-sdk/issues/241)) ([f0b60c8](https://github.com/OneBusAway/kotlin-sdk/commit/f0b60c8bb6b2dfb202e808947dde5825cbe991dc))

## 0.1.0-alpha.58 (2025-02-25)

Full Changelog: [v0.1.0-alpha.57...v0.1.0-alpha.58](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.57...v0.1.0-alpha.58)

### Features

* **client:** support `JsonField#asX()` for known values ([#233](https://github.com/OneBusAway/kotlin-sdk/issues/233)) ([c62e1cf](https://github.com/OneBusAway/kotlin-sdk/commit/c62e1cffdaed3bcefb5712d8c8f250aeed8c81de))
* **client:** update enum `asX` methods ([#232](https://github.com/OneBusAway/kotlin-sdk/issues/232)) ([5b7cf27](https://github.com/OneBusAway/kotlin-sdk/commit/5b7cf27d98b6dcfbf97d412632df427da69ace88))


### Chores

* **client:** remove checked exception related code ([#236](https://github.com/OneBusAway/kotlin-sdk/issues/236)) ([89cf0b7](https://github.com/OneBusAway/kotlin-sdk/commit/89cf0b72437929fc7a316bca429b525d48e0748c))
* **docs:** add faq to readme ([#237](https://github.com/OneBusAway/kotlin-sdk/issues/237)) ([e779597](https://github.com/OneBusAway/kotlin-sdk/commit/e7795978c8b874f038c4ee67c544de4da48ca66c))
* **docs:** reorganize readme ([#234](https://github.com/OneBusAway/kotlin-sdk/issues/234)) ([6a06da8](https://github.com/OneBusAway/kotlin-sdk/commit/6a06da8de0eac2763949f58a508e7f3f6cd36334))
* **internal:** codegen related update ([#228](https://github.com/OneBusAway/kotlin-sdk/issues/228)) ([827bc48](https://github.com/OneBusAway/kotlin-sdk/commit/827bc482bddcc1461d0ad22367ffd81d90662b3b))
* **internal:** codegen related update ([#235](https://github.com/OneBusAway/kotlin-sdk/issues/235)) ([fec7641](https://github.com/OneBusAway/kotlin-sdk/commit/fec7641e4b5065c15e1e49224d57dc6ff4a0f9cf))
* **internal:** optimize build and test perf ([aeedc21](https://github.com/OneBusAway/kotlin-sdk/commit/aeedc21baa914e2fafce4d5c806e5fdad3e74005))
* **internal:** update formatter ([#231](https://github.com/OneBusAway/kotlin-sdk/issues/231)) ([aeedc21](https://github.com/OneBusAway/kotlin-sdk/commit/aeedc21baa914e2fafce4d5c806e5fdad3e74005))
* **internal:** update some formatting in `Values.kt` ([c62e1cf](https://github.com/OneBusAway/kotlin-sdk/commit/c62e1cffdaed3bcefb5712d8c8f250aeed8c81de))


### Documentation

* add immutability explanation to readme ([#238](https://github.com/OneBusAway/kotlin-sdk/issues/238)) ([166a038](https://github.com/OneBusAway/kotlin-sdk/commit/166a0380b4d108f49ea62cf50fecf8e00225f9fc))
* add more phantom reachability docs ([#230](https://github.com/OneBusAway/kotlin-sdk/issues/230)) ([fbb1f7a](https://github.com/OneBusAway/kotlin-sdk/commit/fbb1f7aede80f6f4df385d94ea4bb371aca3e72f))
* add source file links to readme ([#239](https://github.com/OneBusAway/kotlin-sdk/issues/239)) ([a19163c](https://github.com/OneBusAway/kotlin-sdk/commit/a19163cb7e0ec78919b18fa1f41878ecd28ea831))

## 0.1.0-alpha.57 (2025-01-06)

Full Changelog: [v0.1.0-alpha.56...v0.1.0-alpha.57](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.56...v0.1.0-alpha.57)

### Bug Fixes

* revert to sonatype portal release flow ([ae3856b](https://github.com/OneBusAway/kotlin-sdk/commit/ae3856be69f4dd89f1aa7e43b62e224d81840214))

## 0.1.0-alpha.56 (2025-01-03)

Full Changelog: [v0.1.0-alpha.55...v0.1.0-alpha.56](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.55...v0.1.0-alpha.56)

### Features

* updates ([34909c3](https://github.com/OneBusAway/kotlin-sdk/commit/34909c394eb58bb7fed3a870b73a75f6432588cf))


### Chores

* fix formatting ([6f7d23b](https://github.com/OneBusAway/kotlin-sdk/commit/6f7d23bd2da0ac7607c790fbdb36c5e1a34bed8b))

## 0.1.0-alpha.55 (2025-01-02)

Full Changelog: [v0.1.0-alpha.54...v0.1.0-alpha.55](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.54...v0.1.0-alpha.55)

### Bug Fixes

* correctly generate intersection tests ([#149](https://github.com/OneBusAway/kotlin-sdk/issues/149)) ([a34b53e](https://github.com/OneBusAway/kotlin-sdk/commit/a34b53ef47ffe593c6c8c6c916d3a38ebba2aaf6))


### Chores

* **internal:** codegen related update ([#148](https://github.com/OneBusAway/kotlin-sdk/issues/148)) ([531a52b](https://github.com/OneBusAway/kotlin-sdk/commit/531a52b6fa375d9720a99d178bc20d3e5ad199c6))

## 0.1.0-alpha.54 (2025-01-02)

Full Changelog: [v0.1.0-alpha.53...v0.1.0-alpha.54](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.53...v0.1.0-alpha.54)

### Chores

* **internal:** codegen related update ([#147](https://github.com/OneBusAway/kotlin-sdk/issues/147)) ([d07ce65](https://github.com/OneBusAway/kotlin-sdk/commit/d07ce65042b21e0818527b2a6c93702aa20e74bb))

## 0.1.0-alpha.53 (2025-01-02)

Full Changelog: [v0.1.0-alpha.52...v0.1.0-alpha.53](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.52...v0.1.0-alpha.53)

### Bug Fixes

* correctly generate intersection tests ([#146](https://github.com/OneBusAway/kotlin-sdk/issues/146)) ([f091fae](https://github.com/OneBusAway/kotlin-sdk/commit/f091faec76377427a4d7e5fef35b1a475eed5863))


### Chores

* **internal:** codegen related update ([#145](https://github.com/OneBusAway/kotlin-sdk/issues/145)) ([a9fd99c](https://github.com/OneBusAway/kotlin-sdk/commit/a9fd99c7913d07b169690796d0deb7dea9d4cd3c))

## 0.1.0-alpha.52 (2025-01-02)

Full Changelog: [v0.1.0-alpha.51...v0.1.0-alpha.52](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.51...v0.1.0-alpha.52)

### Chores

* **internal:** codegen related update ([#144](https://github.com/OneBusAway/kotlin-sdk/issues/144)) ([629b182](https://github.com/OneBusAway/kotlin-sdk/commit/629b1826f70c8b1c694086b2eefbeb48d21e49af))

## 0.1.0-alpha.51 (2025-01-02)

Full Changelog: [v0.1.0-alpha.50...v0.1.0-alpha.51](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.50...v0.1.0-alpha.51)

### Chores

* **internal:** codegen related update ([#142](https://github.com/OneBusAway/kotlin-sdk/issues/142)) ([cb21541](https://github.com/OneBusAway/kotlin-sdk/commit/cb2154173e5f42f32b09d71f9ef83df750666f07))

## 0.1.0-alpha.50 (2025-01-02)

Full Changelog: [v0.1.0-alpha.49...v0.1.0-alpha.50](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.49...v0.1.0-alpha.50)

### Bug Fixes

* `List` name conflicts ([81e8bc5](https://github.com/OneBusAway/kotlin-sdk/commit/81e8bc55a785a4245e45e7ca6d406c52a39ed3ab))


### Chores

* reset back to generated code ([36523e5](https://github.com/OneBusAway/kotlin-sdk/commit/36523e5aee5c3d13d56eaea9dff8b7325a67757b))

## 0.1.0-alpha.49 (2024-12-27)

Full Changelog: [v0.1.0-alpha.48...v0.1.0-alpha.49](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.48...v0.1.0-alpha.49)

### ⚠ BREAKING CHANGES

* **client:** switch query params objects to use `QueryParams` ([#141](https://github.com/OneBusAway/kotlin-sdk/issues/141))

### Refactors

* **client:** switch query params objects to use `QueryParams` ([#141](https://github.com/OneBusAway/kotlin-sdk/issues/141)) ([5e5b4ab](https://github.com/OneBusAway/kotlin-sdk/commit/5e5b4ab24462e4e0a7fad1eaf1cc2205f913fe5a))

## 0.1.0-alpha.48 (2024-12-27)

Full Changelog: [v0.1.0-alpha.47...v0.1.0-alpha.48](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.47...v0.1.0-alpha.48)

### Bug Fixes

* correctly generate intersection tests ([#140](https://github.com/OneBusAway/kotlin-sdk/issues/140)) ([86d5a5f](https://github.com/OneBusAway/kotlin-sdk/commit/86d5a5f9bdc01de9615b6164ebcdcffd59dd7aa1))


### Chores

* **internal:** codegen related update ([#139](https://github.com/OneBusAway/kotlin-sdk/issues/139)) ([fe8719f](https://github.com/OneBusAway/kotlin-sdk/commit/fe8719f824635af64814aaa8f649deb994fa825f))

## 0.1.0-alpha.47 (2024-12-27)

Full Changelog: [v0.1.0-alpha.46...v0.1.0-alpha.47](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.46...v0.1.0-alpha.47)

### Chores

* **internal:** codegen related update ([#138](https://github.com/OneBusAway/kotlin-sdk/issues/138)) ([4f6b1c3](https://github.com/OneBusAway/kotlin-sdk/commit/4f6b1c386d6888330585757a1197a24e5d5dbcf7))

## 0.1.0-alpha.46 (2024-12-27)

Full Changelog: [v0.1.0-alpha.45...v0.1.0-alpha.46](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.45...v0.1.0-alpha.46)

### Bug Fixes

* correctly generate intersection tests ([#137](https://github.com/OneBusAway/kotlin-sdk/issues/137)) ([d7c0628](https://github.com/OneBusAway/kotlin-sdk/commit/d7c0628d5bf5a03517b3d6c4a28c00bae0e5077a))


### Chores

* **internal:** codegen related update ([#135](https://github.com/OneBusAway/kotlin-sdk/issues/135)) ([259eb05](https://github.com/OneBusAway/kotlin-sdk/commit/259eb0506222a7fb66ec1a8bfb32af82e70f0d70))
* **internal:** codegen related update ([#136](https://github.com/OneBusAway/kotlin-sdk/issues/136)) ([ec75576](https://github.com/OneBusAway/kotlin-sdk/commit/ec755762ed77125300275677cff78408589d40b2))

## 0.1.0-alpha.45 (2024-12-27)

Full Changelog: [v0.1.0-alpha.44...v0.1.0-alpha.45](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.44...v0.1.0-alpha.45)

### Bug Fixes

* correctly generate intersection tests ([#134](https://github.com/OneBusAway/kotlin-sdk/issues/134)) ([4bff7be](https://github.com/OneBusAway/kotlin-sdk/commit/4bff7beb9831d2168f42e0253aa16e8b8b5b2fa3))


### Chores

* **internal:** codegen related update ([#133](https://github.com/OneBusAway/kotlin-sdk/issues/133)) ([7deb855](https://github.com/OneBusAway/kotlin-sdk/commit/7deb855c469172f7f32bf2ce6e19f8b290cfcfba))

## 0.1.0-alpha.44 (2024-12-24)

Full Changelog: [v0.1.0-alpha.43...v0.1.0-alpha.44](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.43...v0.1.0-alpha.44)

### Chores

* **internal:** codegen related update ([#132](https://github.com/OneBusAway/kotlin-sdk/issues/132)) ([175951f](https://github.com/OneBusAway/kotlin-sdk/commit/175951f9cfca96796a20e67f76d7078395c760e7))

## 0.1.0-alpha.43 (2024-12-24)

Full Changelog: [v0.1.0-alpha.42...v0.1.0-alpha.43](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.42...v0.1.0-alpha.43)

### Bug Fixes

* correctly generate intersection tests ([#131](https://github.com/OneBusAway/kotlin-sdk/issues/131)) ([6a17540](https://github.com/OneBusAway/kotlin-sdk/commit/6a17540516266d3421562603ad176080f6504ea8))


### Chores

* **internal:** codegen related update ([#130](https://github.com/OneBusAway/kotlin-sdk/issues/130)) ([e699144](https://github.com/OneBusAway/kotlin-sdk/commit/e6991443b90d4c843d9550117a14a6db9dbd4fdd))

## 0.1.0-alpha.42 (2024-12-24)

Full Changelog: [v0.1.0-alpha.41...v0.1.0-alpha.42](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.41...v0.1.0-alpha.42)

### Chores

* **internal:** codegen related update ([#129](https://github.com/OneBusAway/kotlin-sdk/issues/129)) ([e11af57](https://github.com/OneBusAway/kotlin-sdk/commit/e11af57399b503d4df57b85a24bdf7c719e2a4cf))

## 0.1.0-alpha.41 (2024-12-24)

Full Changelog: [v0.1.0-alpha.40...v0.1.0-alpha.41](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.40...v0.1.0-alpha.41)

### Bug Fixes

* correctly generate intersection tests ([#128](https://github.com/OneBusAway/kotlin-sdk/issues/128)) ([d1a6d0c](https://github.com/OneBusAway/kotlin-sdk/commit/d1a6d0c289085c7e9b70c5c2e119d1d42a71ed44))


### Chores

* **internal:** codegen related update ([#126](https://github.com/OneBusAway/kotlin-sdk/issues/126)) ([de417b7](https://github.com/OneBusAway/kotlin-sdk/commit/de417b7b2378ccf1b0d637584228e91cfc2159bc))

## 0.1.0-alpha.40 (2024-12-22)

Full Changelog: [v0.1.0-alpha.39...v0.1.0-alpha.40](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.39...v0.1.0-alpha.40)

### Features

* chore: linting and formatting ([f955494](https://github.com/OneBusAway/kotlin-sdk/commit/f955494f1ee7e8f30e8105b40f43fabf7c414148))

## 0.1.0-alpha.39 (2024-12-22)

Full Changelog: [v0.1.0-alpha.38...v0.1.0-alpha.39](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.38...v0.1.0-alpha.39)

### Chores

* **internal:** codegen related update ([#117](https://github.com/OneBusAway/kotlin-sdk/issues/117)) ([e6799fe](https://github.com/OneBusAway/kotlin-sdk/commit/e6799fe5caa1654661763e83233ed5f3cc208a24))

## 0.1.0-alpha.38 (2024-12-22)

Full Changelog: [v0.1.0-alpha.37...v0.1.0-alpha.38](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.37...v0.1.0-alpha.38)

### Chores

* **internal:** codegen related update ([#115](https://github.com/OneBusAway/kotlin-sdk/issues/115)) ([de34afe](https://github.com/OneBusAway/kotlin-sdk/commit/de34afec467cc2061d0f2cdc68523ef2e0b0ac39))

## 0.1.0-alpha.37 (2024-12-21)

Full Changelog: [v0.1.0-alpha.36...v0.1.0-alpha.37](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.36...v0.1.0-alpha.37)

### Chores

* **docs:** fix unused import ([#111](https://github.com/OneBusAway/kotlin-sdk/issues/111)) ([1e8383b](https://github.com/OneBusAway/kotlin-sdk/commit/1e8383b8b56bd8d877548d1eaf44dbbae790009a))

## 0.1.0-alpha.36 (2024-12-19)

Full Changelog: [v0.1.0-alpha.35...v0.1.0-alpha.36](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.35...v0.1.0-alpha.36)

### Features

* chore(example): update build.gradle.kts to use Kotlin JVM plugin ([112a12a](https://github.com/OneBusAway/kotlin-sdk/commit/112a12adc3cdd589e1875c76f76585c48530095a))

## 0.1.0-alpha.35 (2024-12-19)

Full Changelog: [v0.1.0-alpha.34...v0.1.0-alpha.35](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.34...v0.1.0-alpha.35)

### Chores

* **docs:** add example project ([#101](https://github.com/OneBusAway/kotlin-sdk/issues/101)) ([e131f17](https://github.com/OneBusAway/kotlin-sdk/commit/e131f17c22d3642876fa2207991af3eeb5d62c10))
* **internal:** codegen related update ([#103](https://github.com/OneBusAway/kotlin-sdk/issues/103)) ([8951ac1](https://github.com/OneBusAway/kotlin-sdk/commit/8951ac1ca75e9d824bd2630ea715734c0e694b3f))

## 0.1.0-alpha.34 (2024-12-19)

Full Changelog: [v0.1.0-alpha.33...v0.1.0-alpha.34](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.33...v0.1.0-alpha.34)

### Chores

* **docs:** update readme ([#99](https://github.com/OneBusAway/kotlin-sdk/issues/99)) ([2fff1ff](https://github.com/OneBusAway/kotlin-sdk/commit/2fff1ff263f423c9d3a15938e164718dac1acfb2))

## 0.1.0-alpha.33 (2024-12-13)

Full Changelog: [v0.1.0-alpha.32...v0.1.0-alpha.33](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.32...v0.1.0-alpha.33)

### Chores

* **internal:** codegen related update ([#96](https://github.com/OneBusAway/kotlin-sdk/issues/96)) ([8f5d262](https://github.com/OneBusAway/kotlin-sdk/commit/8f5d2621f5bde0fd1c7098d8e736f3d809cced08))

## 0.1.0-alpha.32 (2024-12-12)

Full Changelog: [v0.1.0-alpha.31...v0.1.0-alpha.32](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.31...v0.1.0-alpha.32)

### Chores

* **internal:** codegen related update ([#93](https://github.com/OneBusAway/kotlin-sdk/issues/93)) ([c4409e5](https://github.com/OneBusAway/kotlin-sdk/commit/c4409e5351bae7e9b09a5644d850363980adcc04))

## 0.1.0-alpha.31 (2024-11-30)

Full Changelog: [v0.1.0-alpha.30...v0.1.0-alpha.31](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.30...v0.1.0-alpha.31)

### Features

* **api:** api update ([#86](https://github.com/OneBusAway/kotlin-sdk/issues/86)) ([ac580dc](https://github.com/OneBusAway/kotlin-sdk/commit/ac580dc65a2a8d434fbeb2fad79cfce978e047cd))
* **api:** api update ([#88](https://github.com/OneBusAway/kotlin-sdk/issues/88)) ([6d86e0c](https://github.com/OneBusAway/kotlin-sdk/commit/6d86e0c11aee2ae119509463ff5310b49a847809))

## 0.1.0-alpha.30 (2024-11-28)

Full Changelog: [v0.1.0-alpha.29...v0.1.0-alpha.30](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.29...v0.1.0-alpha.30)

### Chores

* **internal:** codegen related update ([#83](https://github.com/OneBusAway/kotlin-sdk/issues/83)) ([e14a489](https://github.com/OneBusAway/kotlin-sdk/commit/e14a489b48e9ad1527d3f60549664f118f33283e))

## 0.1.0-alpha.29 (2024-11-23)

Full Changelog: [v0.1.0-alpha.28...v0.1.0-alpha.29](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.28...v0.1.0-alpha.29)

### Chores

* **internal:** codegen related update ([#80](https://github.com/OneBusAway/kotlin-sdk/issues/80)) ([9ac39b3](https://github.com/OneBusAway/kotlin-sdk/commit/9ac39b3f01c37c9f177749f185be4e6374b9f469))

## 0.1.0-alpha.28 (2024-11-21)

Full Changelog: [v0.1.0-alpha.27...v0.1.0-alpha.28](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.27...v0.1.0-alpha.28)

### Chores

* **internal:** codegen related update ([#77](https://github.com/OneBusAway/kotlin-sdk/issues/77)) ([51d13c4](https://github.com/OneBusAway/kotlin-sdk/commit/51d13c458bff27fc043dde6fed7cc1b37dd82144))

## 0.1.0-alpha.27 (2024-11-21)

Full Changelog: [v0.1.0-alpha.26...v0.1.0-alpha.27](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.26...v0.1.0-alpha.27)

### Chores

* **deps:** bump jackson to 2.18.1 ([#74](https://github.com/OneBusAway/kotlin-sdk/issues/74)) ([f0c914d](https://github.com/OneBusAway/kotlin-sdk/commit/f0c914d6c7037d0a196d4e013ce88c4cc700d9bb))

## 0.1.0-alpha.26 (2024-11-19)

Full Changelog: [v0.1.0-alpha.25...v0.1.0-alpha.26](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.25...v0.1.0-alpha.26)

### Chores

* rebuild project due to codegen change ([#71](https://github.com/OneBusAway/kotlin-sdk/issues/71)) ([bc705d2](https://github.com/OneBusAway/kotlin-sdk/commit/bc705d2d0f5d54e519556aeed4705b261f9121a6))

## 0.1.0-alpha.25 (2024-11-12)

Full Changelog: [v0.1.0-alpha.24...v0.1.0-alpha.25](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.24...v0.1.0-alpha.25)

### Chores

* rebuild project due to codegen change ([#68](https://github.com/OneBusAway/kotlin-sdk/issues/68)) ([502939b](https://github.com/OneBusAway/kotlin-sdk/commit/502939b34afc0fe6c8337de8657fbc9f3608fcec))

## 0.1.0-alpha.24 (2024-11-07)

Full Changelog: [v0.1.0-alpha.23...v0.1.0-alpha.24](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.23...v0.1.0-alpha.24)

### Chores

* rebuild project due to codegen change ([#65](https://github.com/OneBusAway/kotlin-sdk/issues/65)) ([8d89ea4](https://github.com/OneBusAway/kotlin-sdk/commit/8d89ea431f6d551e04f76491479506b2802ab752))

## 0.1.0-alpha.23 (2024-11-07)

Full Changelog: [v0.1.0-alpha.22...v0.1.0-alpha.23](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.22...v0.1.0-alpha.23)

### Chores

* rebuild project due to codegen change ([#62](https://github.com/OneBusAway/kotlin-sdk/issues/62)) ([9b27780](https://github.com/OneBusAway/kotlin-sdk/commit/9b277806f99b2dde2f99165d68b16f3f75d271b5))

## 0.1.0-alpha.22 (2024-11-05)

Full Changelog: [v0.1.0-alpha.21...v0.1.0-alpha.22](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.21...v0.1.0-alpha.22)

### Chores

* rebuild project due to codegen change ([#59](https://github.com/OneBusAway/kotlin-sdk/issues/59)) ([7da3308](https://github.com/OneBusAway/kotlin-sdk/commit/7da3308fac59822aa0d03a50e51132b031e1ea09))

## 0.1.0-alpha.21 (2024-11-04)

Full Changelog: [v0.1.0-alpha.20...v0.1.0-alpha.21](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.20...v0.1.0-alpha.21)

### Chores

* rebuild project due to codegen change ([#56](https://github.com/OneBusAway/kotlin-sdk/issues/56)) ([b24c9a0](https://github.com/OneBusAway/kotlin-sdk/commit/b24c9a0e55485a09a2b7cee573ab360cd1687681))

## 0.1.0-alpha.20 (2024-11-01)

Full Changelog: [v0.1.0-alpha.19...v0.1.0-alpha.20](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.19...v0.1.0-alpha.20)

### Chores

* rebuild project due to codegen change ([#53](https://github.com/OneBusAway/kotlin-sdk/issues/53)) ([7af656d](https://github.com/OneBusAway/kotlin-sdk/commit/7af656d860b6b26351a2300bb4c115704d83554a))

## 0.1.0-alpha.19 (2024-11-01)

Full Changelog: [v0.1.0-alpha.18...v0.1.0-alpha.19](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.18...v0.1.0-alpha.19)

### Chores

* rebuild project due to codegen change ([#50](https://github.com/OneBusAway/kotlin-sdk/issues/50)) ([6af106c](https://github.com/OneBusAway/kotlin-sdk/commit/6af106c4cc18a6e79a969eb6d92a2eb491546e27))

## 0.1.0-alpha.18 (2024-11-01)

Full Changelog: [v0.1.0-alpha.17...v0.1.0-alpha.18](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.17...v0.1.0-alpha.18)

### Chores

* rebuild project due to codegen change ([#47](https://github.com/OneBusAway/kotlin-sdk/issues/47)) ([5536fba](https://github.com/OneBusAway/kotlin-sdk/commit/5536fbaec7d28dc2e1b63326583a46b1b49de9c9))

## 0.1.0-alpha.17 (2024-10-30)

Full Changelog: [v0.1.0-alpha.16...v0.1.0-alpha.17](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.16...v0.1.0-alpha.17)

### Chores

* rebuild project due to codegen change ([#44](https://github.com/OneBusAway/kotlin-sdk/issues/44)) ([4883281](https://github.com/OneBusAway/kotlin-sdk/commit/48832811676e724db074ddac5edca772397adce3))

## 0.1.0-alpha.16 (2024-10-30)

Full Changelog: [v0.1.0-alpha.15...v0.1.0-alpha.16](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.15...v0.1.0-alpha.16)

### Chores

* rebuild project due to codegen change ([#42](https://github.com/OneBusAway/kotlin-sdk/issues/42)) ([dc5711e](https://github.com/OneBusAway/kotlin-sdk/commit/dc5711e64164718c64ada5f1d6bba3a1ec915487))

## 0.1.0-alpha.15 (2024-10-30)

Full Changelog: [v0.1.0-alpha.14...v0.1.0-alpha.15](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.14...v0.1.0-alpha.15)

### Chores

* rebuild project due to codegen change ([#39](https://github.com/OneBusAway/kotlin-sdk/issues/39)) ([dca6115](https://github.com/OneBusAway/kotlin-sdk/commit/dca6115d710983d7cd2245b2f034add96923e121))

## 0.1.0-alpha.14 (2024-10-28)

Full Changelog: [v0.1.0-alpha.13...v0.1.0-alpha.14](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.13...v0.1.0-alpha.14)

### Chores

* rebuild project due to codegen change ([#36](https://github.com/OneBusAway/kotlin-sdk/issues/36)) ([9c6640d](https://github.com/OneBusAway/kotlin-sdk/commit/9c6640d37b520b4458f461eb297542746871b218))

## 0.1.0-alpha.13 (2024-10-25)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha.13](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.12...v0.1.0-alpha.13)

### Features

* fix: revert custom code override for maven publishing ([12e5007](https://github.com/OneBusAway/kotlin-sdk/commit/12e500760fd1cea679d8b467e3740c9f1e3a9895))

## 0.1.0-alpha.12 (2024-10-25)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### Chores

* rebuild project due to codegen change ([#30](https://github.com/OneBusAway/kotlin-sdk/issues/30)) ([7f08f9f](https://github.com/OneBusAway/kotlin-sdk/commit/7f08f9f3199ac0245f21fb11fbf660c26c57a28d))

## 0.1.0-alpha.11 (2024-10-25)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### Chores

* rebuild project due to codegen change ([#27](https://github.com/OneBusAway/kotlin-sdk/issues/27)) ([8028ed1](https://github.com/OneBusAway/kotlin-sdk/commit/8028ed1c1e5f114e1f846ae927e913c10f11c57a))

## 0.1.0-alpha.10 (2024-10-25)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Chores

* rebuild project due to codegen change ([#24](https://github.com/OneBusAway/kotlin-sdk/issues/24)) ([710636f](https://github.com/OneBusAway/kotlin-sdk/commit/710636fa09c68a46d65cc5c4c117fe18625637dc))

## 0.1.0-alpha.9 (2024-10-23)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Features

* **api:** api update ([#21](https://github.com/OneBusAway/kotlin-sdk/issues/21)) ([1ac5c97](https://github.com/OneBusAway/kotlin-sdk/commit/1ac5c979a294874d13d44b1a3705339e3c2ee0aa))

## 0.1.0-alpha.8 (2024-10-23)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* **api:** api update ([#18](https://github.com/OneBusAway/kotlin-sdk/issues/18)) ([0aa617e](https://github.com/OneBusAway/kotlin-sdk/commit/0aa617e9c4104c91779100241bde9d046f0a2824))

## 0.1.0-alpha.7 (2024-10-22)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** api update ([#15](https://github.com/OneBusAway/kotlin-sdk/issues/15)) ([1fef2a8](https://github.com/OneBusAway/kotlin-sdk/commit/1fef2a8ad8b8a5241a4aff8f4600b9fe7e7f9d22))

## 0.1.0-alpha.6 (2024-10-08)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* refactor: Remove stack trace option from Gradle build ([e39955e](https://github.com/OneBusAway/kotlin-sdk/commit/e39955ec751d7a3658ce8e74171bc7fcd4cd0e81))

## 0.1.0-alpha.5 (2024-10-08)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* refactor: build with --stacktrace ([4916216](https://github.com/OneBusAway/kotlin-sdk/commit/4916216c0c84bd94be49e5622dd35150b477a347))

## 0.1.0-alpha.4 (2024-10-08)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

## 0.1.0-alpha.3 (2024-10-08)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* refactor: build with --stacktrace ([29f63e6](https://github.com/OneBusAway/kotlin-sdk/commit/29f63e657652e07651243c9b6c86aed8059bcdb1))

## 0.1.0-alpha.2 (2024-10-07)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/OneBusAway/kotlin-sdk/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* onebusaway-sdk-kotlin examples ([ce8b134](https://github.com/OneBusAway/kotlin-sdk/commit/ce8b1344ce5dbed960a7e3c652e9ff6e17ebc6d0))

## 0.1.0-alpha.1 (2024-10-07)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/OneBusAway/kotlin-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** manual updates ([d0267a5](https://github.com/OneBusAway/kotlin-sdk/commit/d0267a5f06efcbab817698acb063a9fbea1805c5))
* **api:** OpenAPI spec update via Stainless API ([46aae7e](https://github.com/OneBusAway/kotlin-sdk/commit/46aae7ef7c7a67af16d997c9e17558adb8377e06))
* **api:** OpenAPI spec update via Stainless API ([12a89d3](https://github.com/OneBusAway/kotlin-sdk/commit/12a89d388b5ba7a184dcea6c4947184319228e05))
* **client:** added structured fields to errors ([b2ad442](https://github.com/OneBusAway/kotlin-sdk/commit/b2ad442cff5aee1e35514db58743bdab5dc2d698))


### Bug Fixes

* use kotlin.collections.List instead of List directly ([e475fd4](https://github.com/OneBusAway/kotlin-sdk/commit/e475fd415edbdb7bde7470bda1e88388fd9f730e))


### Chores

* configure new SDK language ([2953eac](https://github.com/OneBusAway/kotlin-sdk/commit/2953eac8695259a185948c25f098a9c2e0a470b3))
* go live ([#1](https://github.com/OneBusAway/kotlin-sdk/issues/1)) ([d7a641b](https://github.com/OneBusAway/kotlin-sdk/commit/d7a641bbc3828e3c3bdac88bc5b86be6a8e9c4da))
* **internal:** codegen related update ([70343ca](https://github.com/OneBusAway/kotlin-sdk/commit/70343ca34bd378681943257c700bd076adf2871a))
* **internal:** codegen related update ([353cd5e](https://github.com/OneBusAway/kotlin-sdk/commit/353cd5e609f5a65b9469e20768a0c8a8f5e7dff0))
* update SDK settings ([7a84601](https://github.com/OneBusAway/kotlin-sdk/commit/7a846012727eb202e0a7f4bc84f8c125ca351835))


### Documentation

* adjust additional properties example ([62b94a1](https://github.com/OneBusAway/kotlin-sdk/commit/62b94a1ddf192c27a495be308100aeb056a57d2e))
