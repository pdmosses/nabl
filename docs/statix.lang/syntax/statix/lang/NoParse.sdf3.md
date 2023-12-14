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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/NoParse_1_8" title="Not referenced">statix/lang/NoParse</span> <span class="layout">// DO NOT INCLUDE IN OTHER SYNTAX FILES</span>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_6_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../Sugar.sdf3/#statix/lang/Sugar_1_8" id="statix/lang/Sugar_7_3" title="Defined at ../Sugar.sdf3 line 1">statix/lang/Sugar</a>

  <span title="External reference">statix/API</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free syntax</span> <span class="layout">// desugared terms</span>

  <a href="#Term_17_20" id="Term_17_3" title="Referenced at line 17">Term</a>.<span class="cons_Constructor"><span id="Tuple_17_8" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_17_3" id="Term_17_20" title="Defined at line 17, 25, 26, 27">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#SortRef_19_27" id="SortRef_19_3" title="Referenced at line 19">SortRef</a>.<span class="cons_Constructor"><span id="TupleSort_19_11" title="Not referenced">TupleSort</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#SortRef_19_3" id="SortRef_19_27" title="Defined at line 19">SortRef</a> <span class="cons_Lit">" * "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#Lift_21_24" id="Lift_21_3" title="Referenced at line 21">Lift</a>.<span class="cons_Constructor"><span id="TupleLift_21_8" title="Not referenced">TupleLift</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Lift_21_3" id="Lift_21_24" title="Defined at line 21">Lift</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// runtime terms</span>

  <a href="#Term_17_20" id="Term_25_3" title="Referenced at line 17">Term</a> = <a href="../Core.sdf3/#Label_196_3" id="Label_25_10" title="Defined at ../Core.sdf3 line 196">Label</a>
  <a href="#Term_17_20" id="Term_26_3" title="Referenced at line 17">Term</a> = <span title="External reference">Stx-Scope</span>
  <a href="#Term_17_20" id="Term_27_3" title="Referenced at line 17">Term</a> = <span title="External reference">Stx-TermIndex</span>

  <span id="TermOrTermIndex_29_3" title="Not referenced">TermOrTermIndex</span> = <span title="External reference">Stx-TermIndex</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
