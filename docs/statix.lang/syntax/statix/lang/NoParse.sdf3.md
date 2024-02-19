---
title: NoParse.sdf3
hide:
  - toc
---

# `NoParse.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/NoParse.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/NoParse.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/NoParse.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/NoParse_1_8" title="a definition with no references">statix/lang/NoParse</span> <span class="layout">// DO NOT INCLUDE IN OTHER SYNTAX FILES</span>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="a reference to a single-file definition">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_6_3" title="a reference to a single-file definition">statix/lang/Core</a>
  <a href="../Sugar.sdf3/#statix/lang/Sugar_1_8" id="statix/lang/Sugar_7_3" title="a reference to a single-file definition">statix/lang/Sugar</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#statix/API_1_8" id="statix/API_9_3" title="a reference to a single-file definition">statix/API</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free syntax</span> <span class="layout">// desugared terms</span>

  <a href="#Term_17_20" id="Term_17_3" title="a definition with a single reference">Term</a>.<span class="cons_Constructor"><span id="Tuple_17_8" title="a definition with no references">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_17_3" id="Term_17_20" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#SortRef_19_27" id="SortRef_19_3" title="a definition with a single reference">SortRef</a>.<span class="cons_Constructor"><span id="TupleSort_19_11" title="a definition with no references">TupleSort</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#SortRef_19_3" id="SortRef_19_27" title="a reference to a single-file definition">SortRef</a> <span class="cons_Lit">" * "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#Lift_21_24" id="Lift_21_3" title="a definition with a single reference">Lift</a>.<span class="cons_Constructor"><span id="TupleLift_21_8" title="a definition with no references">TupleLift</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Lift_21_3" id="Lift_21_24" title="a reference to a single-file definition">Lift</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// runtime terms</span>

  <a href="#Term_17_20" id="Term_25_3" title="a definition with a single reference">Term</a> = <a href="../Core.sdf3/#Label_196_3" id="Label_25_10" title="a reference to a single-file definition">Label</a>
  <a href="#Term_17_20" id="Term_26_3" title="a definition with a single reference">Term</a> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#Stx-Scope_11_3" id="Stx-Scope_26_10" title="a reference to a single-file definition">Stx-Scope</a>
  <a href="#Term_17_20" id="Term_27_3" title="a definition with a single reference">Term</a> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#Stx-TermIndex_12_3" id="Stx-TermIndex_27_10" title="a reference to a single-file definition">Stx-TermIndex</a>

  <span id="TermOrTermIndex_29_3" title="a definition with no references">TermOrTermIndex</span> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#Stx-TermIndex_12_3" id="Stx-TermIndex_29_21" title="a reference to a single-file definition">Stx-TermIndex</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
