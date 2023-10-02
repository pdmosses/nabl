---
hide:
  -toc
---

# Statix

> Statix is a meta-language for the specification of static semantics in Spoofax.

> Statix specifications are organised in modules.
In Statix, programs, types and all other data are represented using terms.
Type-checking a program is performed by solving a set of constraints over terms.
In addition to these built-in constraints, specification writers can define their own constraints.

> Type-checking is closely related to, and strongly intertwined with, name resolution.
For that reason, Statix has built-in support for modelling name binding patterns in the form of scope graphs.
During type-checking, names can be resolved using queries.

The [Statix documentation][Statix] explains the details.

Statix supersedes the deprecated [NaBL] and [NaBL2] meta-languages.

Statix has not yet been used in Spoofax 2 for specifying the name binding of *meta*-languages.
It has however been used for specifying languages in the [MetaBorgCube], e.g., [Tiger].

## Syntax

[`syntax/StatixLang.sdf3`](syntax/StatixLang.sdf3.md)

The syntax of Statix is specified in [SDF3].

## Name binding

The name binding of Statix is specified in [NaBL2].[^nabl2]

[^nabl2]: The name binding of NaBL2 definitions has not been specified,
    so browsing them is not supported by hyperlinked twins.

[NaBL]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/nabl.html
[NaBL2]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/index.html
[SDF3]: https://spoofax.dev/references/sdf3/
[Statix]: https://spoofax.dev/references/statix/
[MetaBorgCube]: https://github.com/MetaBorgCube
[Tiger]: https://github.com/MetaBorgCube/metaborg-tiger
