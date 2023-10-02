---
hide:
  -toc
---

# NaBL

> In Spoofax, name bindings can be specified in NaBL.
NaBL stands for *Name Binding Language* and the acronym is pronounced 'enable'.

> Name binding is specified in NaBL in terms of:

> -  namespaces, 
> -  binding instances (name declarations), 
> -  bound instances (name references),
> -  scopes, and
> -  imports.

The [NaBL documentation][NaBL] explains the details.

NaBL is now deprecated. It was originally superseded by [NaBL2], and both have now been superseded by [Statix].

However, NaBL is still used in Spoofax 2 for specifying the name binding of several meta-languages
(e.g., [SDF3]).

## Syntax

[`syntax/NameBindingLanguage.sdf3`](syntax/NameBindingLanguage.sdf3.md)

The syntax of NaBL is specified in [SDF3].

## Name binding

[`trans/analysis/names.nab`](trans/analysis/names.nab.md)

The name binding of NaBL is specified in NaBL itself.

This example demonstrates generation of a hyperlinked twin from a _bootstrapped_ meta-language definition.

[NaBL]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/nabl.html
[NaBL2]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/index.html
[SDF3]: https://spoofax.dev/references/sdf3/
[Statix]: https://spoofax.dev/references/statix/
