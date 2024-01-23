---
title: CTerms.sdf3
hide:
  - toc
---

# `CTerms.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/common/CTerms.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/CTerms_1_8" title="Multi-file references" data-urls="../Main.sdf3/#nabl2/lang/common/CTerms_5_3 line 5; ../../signatures/Functions.sdf3/#nabl2/lang/common/CTerms_8_3 line 8">nabl2/lang/common/CTerms</button>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/ScopeGraph</span>
  <span title="External reference">nabl2/shared/common/Sets</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>
  <a href="../Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_10_3" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-CVar_18_3" title="Not referenced">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Var_18_14" title="Not referenced">Var</span></span> = <span title="External reference">NaBL2-VarId</span>
  <span id="NaBL2-CVar_19_3" title="Not referenced">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Wld_19_14" title="Not referenced">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt;

<span class="keyword">syntax</span>

  <button class="modal-open" id="NaBL2-CTerm_23_3" title="Multi-file references" data-urls="#NaBL2-CTerm_27_27 line 27; ../../signatures/Functions.sdf3/#NaBL2-CTerm_33_27 line 33">NaBL2-CTerm</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_23_18" title="Not referenced">Op</span></span>    = <span title="External reference">NaBL2-OpId</span><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span title="External reference">NaBL2-CTerms</span><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="NaBL2-CTerm_27_3" title="Multi-file references" data-urls="#NaBL2-CTerm_27_27 line 27; ../../signatures/Functions.sdf3/#NaBL2-CTerm_33_27 line 33">NaBL2-CTerm</button>.<span class="cons_Constructor"><span id="Tuple_27_15" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#NaBL2-CTerm_23_3" id="NaBL2-CTerm_27_27" title="Defined at line 23, 27, 29, 30">NaBL2-CTerm</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <button class="modal-open" id="NaBL2-CTerm_29_3" title="Multi-file references" data-urls="#NaBL2-CTerm_27_27 line 27; ../../signatures/Functions.sdf3/#NaBL2-CTerm_33_27 line 33">NaBL2-CTerm</button>       = <a href="../Terms.sdf3/#NaBL2-IntTerm_32_3" id="NaBL2-IntTerm_29_23" title="Defined at ../Terms.sdf3 line 32">NaBL2-IntTerm</a>
  <button class="modal-open" id="NaBL2-CTerm_30_3" title="Multi-file references" data-urls="#NaBL2-CTerm_27_27 line 27; ../../signatures/Functions.sdf3/#NaBL2-CTerm_33_27 line 33">NaBL2-CTerm</button>       = <a href="../Terms.sdf3/#NaBL2-StringTerm_38_3" id="NaBL2-StringTerm_30_23" title="Defined at ../Terms.sdf3 line 38">NaBL2-StringTerm</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
