---
title: CTerms.sdf3
hide:
  - toc
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

  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sets</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>
  <a href="../Terms.sdf3#nabl2/lang/common/Terms_7_30" id="nabl2/lang/common/Terms_199_222" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-CVar_296_306" title="Not referenced locally, nor via imports">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Var_307_310" title="Not referenced locally, nor via imports">Var</span></span> = <span title="External reference">NaBL2-VarId</span>
  <span id="NaBL2-CVar_327_337" title="Not referenced locally, nor via imports">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Wld_338_341" title="Not referenced locally, nor via imports">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt;

<span class="keyword">syntax</span>

  <a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_359_370" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">NaBL2-CTerm</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_374_376" title="Not referenced locally, nor via imports">Op</span></span>    = <span title="External reference">NaBL2-OpId</span><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span title="External reference">NaBL2-CTerms</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_467_478" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">NaBL2-CTerm</a>.<span class="cons_Constructor"><span id="Tuple_479_484" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#NaBL2-CTerm_359_370" id="NaBL2-CTerm_491_502" title="Defined at line 23, 27, 29, 30">NaBL2-CTerm</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_516_527" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">NaBL2-CTerm</a>       = <a href="../Terms.sdf3#NaBL2-IntTerm_745_758" id="NaBL2-IntTerm_536_549" title="Defined at ../Terms.sdf3 line 32">NaBL2-IntTerm</a>
  <a href="#NaBL2-CTerm_491_502" id="NaBL2-CTerm_552_563" title="Referenced at line 27; ../../signatures/Functions.sdf3 line 33">NaBL2-CTerm</a>       = <a href="../Terms.sdf3#NaBL2-StringTerm_880_896" id="NaBL2-StringTerm_572_588" title="Defined at ../Terms.sdf3 line 38">NaBL2-StringTerm</a>

</code></pre></td></tr></tbody></table></div>