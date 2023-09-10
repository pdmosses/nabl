---
title: NoParse.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/NoParse_7_26" title="Not referenced locally, nor via imports">statix/lang/NoParse</span> <span class="layout">// DO NOT INCLUDE IN OTHER SYNTAX FILES</span>

<span class="keyword">imports</span>

  <a href="../Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_79_97" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_100_116" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../Sugar.sdf3#statix/lang/Sugar_7_24" id="statix/lang/Sugar_119_136" title="Defined at ../Sugar.sdf3 line 1">statix/lang/Sugar</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#statix/API_7_17" id="statix/API_140_150" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 1">statix/API</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free syntax</span> <span class="layout">// desugared terms</span>

  <a href="#Term_262_266" id="Term_245_249" title="Referenced at line 17">Term</a>.<span class="cons_Constructor"><span id="Tuple_250_255" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_245_249" id="Term_262_266" title="Defined at line 17, 25, 26, 27">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#SortRef_304_311" id="SortRef_280_287" title="Referenced at line 19">SortRef</a>.<span class="cons_Constructor"><span id="TupleSort_288_297" title="Not referenced locally, nor via imports">TupleSort</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#SortRef_280_287" id="SortRef_304_311" title="Defined at line 19">SortRef</a> <span class="cons_Lit">" * "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#Lift_347_351" id="Lift_326_330" title="Referenced at line 21">Lift</a>.<span class="cons_Constructor"><span id="TupleLift_331_340" title="Not referenced locally, nor via imports">TupleLift</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Lift_326_330" id="Lift_347_351" title="Defined at line 21">Lift</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// runtime terms</span>

  <a href="#Term_262_266" id="Term_403_407" title="Referenced at line 17">Term</a> = <a href="../Core.sdf3#Label_4187_4192" id="Label_410_415" title="Defined at ../Core.sdf3 line 196">Label</a>
  <a href="#Term_262_266" id="Term_418_422" title="Referenced at line 17">Term</a> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#Stx-Scope_109_118" id="Stx-Scope_425_434" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 11">Stx-Scope</a>
  <a href="#Term_262_266" id="Term_437_441" title="Referenced at line 17">Term</a> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#Stx-TermIndex_121_134" id="Stx-TermIndex_444_457" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 12">Stx-TermIndex</a>

  <span id="TermOrTermIndex_461_476" title="Not referenced locally, nor via imports">TermOrTermIndex</span> = <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#Stx-TermIndex_121_134" id="Stx-TermIndex_479_492" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 12">Stx-TermIndex</a>

</code></pre></td></tr></tbody></table></div>