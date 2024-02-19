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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/CTerms_1_8" title="a definition with multiple references" data-urls="../Main.sdf3/#nabl2/lang/common/CTerms line 5_3; ../../signatures/Functions.sdf3/#nabl2/lang/common/CTerms line 8_3">nabl2/lang/common/CTerms</button>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#nabl2/shared/common/CTerms_1_8" id="nabl2/shared/common/CTerms_5_3" title="a reference to a single-file definition">nabl2/shared/common/CTerms</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_6_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3/#nabl2/shared/common/ScopeGraph_1_8" id="nabl2/shared/common/ScopeGraph_7_3" title="a reference to a single-file definition">nabl2/shared/common/ScopeGraph</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sets.sdf3/#nabl2/shared/common/Sets_1_8" id="nabl2/shared/common/Sets_8_3" title="a reference to a single-file definition">nabl2/shared/common/Sets</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/constraints/Base.sdf3/#nabl2/shared/constraints/Base_1_8" id="nabl2/shared/constraints/Base_9_3" title="a reference to a single-file definition">nabl2/shared/constraints/Base</a>
  <a href="../Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_10_3" title="a reference to a single-file definition">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-CVar_18_3" title="a definition with no references">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Var_18_14" title="a definition with no references">Var</span></span> = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-VarId_19_3" id="NaBL2-VarId_18_20" title="a reference to a single-file definition">NaBL2-VarId</a>
  <span id="NaBL2-CVar_19_3" title="a definition with no references">NaBL2-CVar</span>.<span class="cons_Constructor"><span id="Wld_19_14" title="a definition with no references">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt;

<span class="keyword">syntax</span>

  <button class="modal-open" id="NaBL2-CTerm_23_3" title="a definition with multiple references" data-urls="#NaBL2-CTerm line 27_27; ../../signatures/Functions.sdf3/#NaBL2-CTerm line 33_27, 33_44">NaBL2-CTerm</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_23_18" title="a definition with no references">Op</span></span>    = <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-OpId_22_3" id="NaBL2-OpId_23_26" title="a reference to a single-file definition">NaBL2-OpId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerms_16_3" id="NaBL2-CTerms_23_56" title="a reference to a single-file definition">NaBL2-CTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="NaBL2-CTerm_27_3" title="a definition with multiple references" data-urls="#NaBL2-CTerm line 27_27; ../../signatures/Functions.sdf3/#NaBL2-CTerm line 33_27, 33_44">NaBL2-CTerm</button>.<span class="cons_Constructor"><span id="Tuple_27_15" title="a definition with no references">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#NaBL2-CTerm_23_3" id="NaBL2-CTerm_27_27" title="a reference to a single-file definition">NaBL2-CTerm</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <button class="modal-open" id="NaBL2-CTerm_29_3" title="a definition with multiple references" data-urls="#NaBL2-CTerm line 27_27; ../../signatures/Functions.sdf3/#NaBL2-CTerm line 33_27, 33_44">NaBL2-CTerm</button>       = <a href="../Terms.sdf3/#NaBL2-IntTerm_32_3" id="NaBL2-IntTerm_29_23" title="a reference to a single-file definition">NaBL2-IntTerm</a>
  <button class="modal-open" id="NaBL2-CTerm_30_3" title="a definition with multiple references" data-urls="#NaBL2-CTerm line 27_27; ../../signatures/Functions.sdf3/#NaBL2-CTerm line 33_27, 33_44">NaBL2-CTerm</button>       = <a href="../Terms.sdf3/#NaBL2-StringTerm_38_3" id="NaBL2-StringTerm_30_23" title="a reference to a single-file definition">NaBL2-StringTerm</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
