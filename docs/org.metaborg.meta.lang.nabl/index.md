# NaBL

> A meta-language for declarative name binding and scope rules

In Spoofax, name bindings can be specified in NaBL.
NaBL stands for *Name Binding Language* and the acronym is pronounced 'enable'.

Name binding is specified in NaBL in terms of:

-  namespaces, 
-  binding instances (name declarations), 
-  bound instances (name references),
-  scopes, and
-  imports.

See the [NaBL] documentation for further details.

NaBL is now deprecated. It was originally superseded by [NaBL2], and both have now been superseded by [Statix].

However, NaBL is still used in Spoofax (v2.5.18) for specifying the name binding of several meta-languages
(e.g., [SDF3]).

[NaBL]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/nabl.html
[NaBL2]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/index.html
[SDF3]: https://spoofax.dev/references/sdf3/
[Statix]: https://spoofax.dev/references/statix/
