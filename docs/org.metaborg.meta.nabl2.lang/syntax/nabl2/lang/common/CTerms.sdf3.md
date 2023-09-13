---
title: CTerms.sdf3
---

# `CTerms.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../signatures/Functions.sdf3#nabl2/lang/common/CTerms_145_169" id="nabl2/lang/common/CTerms_7_31" title="Referenced at ../../signatures/Functions.sdf3 line 8">nabl2/lang/common/CTerms</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3#nabl2/shared/common/CTerms_7_33" id="nabl2/shared/common/CTerms_44_70" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3 line 1">nabl2/shared/common/CTerms</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3#nabl2/shared/common/Identifiers_7_38" id="nabl2/shared/common/Identifiers_73_104" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3 line 1">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3#nabl2/shared/common/ScopeGraph_7_37" id="nabl2/shared/common/ScopeGraph_107_137" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3 line 1">nabl2/shared/common/ScopeGraph</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3#nabl2/shared/common/Sets_7_31" id="nabl2/shared/common/Sets_140_164" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3 line 1">nabl2/shared/common/Sets</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/constraints/Base.sdf3#nabl2/shared/constraints/Base_7_36" id="nabl2/shared/constraints/Base_167_196" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/constraints/Base.sdf3 line 1">nabl2/shared/constraints/Base</a>
  <a href="../Terms.sdf3#nabl2/lang/common/Terms_7_30" id="nabl2/lang/common/Terms_199_222" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-CVar_296_306" title="Not referenced locally, nor via imports">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Var_307_310" title="Not referenced locally, nor via imports">Var</span></span> = <span class="keyword">NaB</span>L2-VarId
  <span class="keyword">NaB</span><span id="NaBL2-CVar_327_337" title="Not referenced locally, nor via imports">L2-CVar.Wl</span><span class="keyword">d</span><span class="cons_Constructor"><span id="Wld_338_341" title="Not referenced locally, nor via imports"> = </span></span>&lt;_&gt;
<span class="cons_String">
</span><span class="keyword">syntax</span>

  <span class="keyword">NaB</span><a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_359_370" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">L2-CTerm-CF</a>.<span class="keyword">Op</span> <span class="cons_Constructor"><span id="Op_374_376" title="Not referenced locally, nor via imports">  </span></span> = <span class="keyword">NaB</span><span class="keyword">L</span>2-<span class="keyword">OpI</span>d-LEX "(" <span class="keyword">LAYOU</span><span class="cons_Lit">T?-</span><span class="keyword">CF NaBL</span>2-<span class="keyword">CTe</span><span class="keyword">rms-CF LAYOU</span>T?-CF ")"

c<span class="keyword">ontext-free syn</span><span class="cons_Lit">tax</span>

  <span class="keyword">NaBL</span>2-<span class="keyword">CTerm</span>.<span class="keyword">Tuple</span> = &lt;<a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_467_478" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">(&lt;{NaBL2-CT</a><span class="keyword">e</span><span class="cons_Constructor"><span id="Tuple_479_484" title="Not referenced locally, nor via imports">rm ",</span></span> "}*<span class="cons_String">&gt;</span>)&gt;<a href="#NaBL2-CTerm_359_370" id="NaBL2-CTerm_491_502" title="Defined at line 23, 27, 29, 30">

  NaBL2-C</a><span class="keyword">T</span><span class="cons_Lit">erm </span>   <span class="cons_String"> </span>  = <span class="keyword">N</span><a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_516_527" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">aBL2-IntTer</a><span class="keyword">m</span>
  <span class="keyword">NaBL</span>2<a href="../Terms.sdf3#NaBL2-IntTerm_745_758" id="NaBL2-IntTerm_536_549" title="Defined at ../Terms.sdf3 line 32">-CTerm       </a>= <span class="keyword">N</span><a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_552_563" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">aBL2-String</a>
</code></pre></td></tr></tbody></table></div>