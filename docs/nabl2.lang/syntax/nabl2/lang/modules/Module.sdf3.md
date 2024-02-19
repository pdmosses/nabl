---
title: Module.sdf3
hide:
  - toc
---

# `Module.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3 "The source file on GitHub"

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
31
32
33
34
35
36
37
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/modules/Module_1_8" title="a definition with multiple references" data-urls="../../Main.sdf3/#nabl2/lang/modules/Module line 6_3; ../../../../NaBL2Lang.sdf3/#nabl2/lang/modules/Module line 6_3">nabl2/lang/modules/Module</button>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]

<span class="keyword">context-free syntax</span>

  <a href="../../../../NaBL2Lang.sdf3/#NaBL2-Module_11_3" id="NaBL2-Module_9_3" title="a definition with a single reference">NaBL2-Module</a>.<span class="cons_Constructor"><span id="Module_9_16" title="a definition with no references">Module</span></span> = &lt;
    <span class="cons_String">module</span> &lt;<a href="#NaBL2-ModuleId_27_3" id="NaBL2-ModuleId_10_13" title="a reference to a single-file definition">NaBL2-ModuleId</a>&gt;

    &lt;{<a href="#NaBL2-ModuleSection_15_3" id="NaBL2-ModuleSection_12_7" title="a reference to a single-file definition">NaBL2-ModuleSection</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;
 
  <a href="#NaBL2-ModuleSection_12_7" id="NaBL2-ModuleSection_15_3" title="a definition with a single reference">NaBL2-ModuleSection</a>.<span class="cons_Constructor"><span id="Imports_15_23" title="a definition with no references">Imports</span></span> = &lt;
    <span class="cons_String">imports</span> &lt;<a href="#NaBL2-ImportModule_19_3" id="NaBL2-ImportModule_16_14" title="a reference to a single-file definition">NaBL2-ImportModule</a>*&gt;
  &gt;
 
  <a href="#NaBL2-ImportModule_16_14" id="NaBL2-ImportModule_19_3" title="a definition with a single reference">NaBL2-ImportModule</a>.<span class="cons_Constructor"><span id="Import_19_22" title="a definition with no references">Import</span></span> = &lt;&lt;<a href="#NaBL2-ModuleId_27_3" id="NaBL2-ModuleId_19_33" title="a reference to a single-file definition">NaBL2-ModuleId</a>&gt;&gt; 

<span class="keyword">syntax</span>

  <a href="#NaBL2-ImportModule_16_14" id="NaBL2-ImportModule_23_3" title="a definition with a single reference">NaBL2-ImportModule</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_23_25" title="a definition with no references">ImportWildcard</span></span> = <a href="#NaBL2-ModuleId_27_3" id="NaBL2-ModuleId_23_42" title="a reference to a single-file definition">NaBL2-ModuleId</a><span class="keyword">-CF</span> <span class="cons_Lit">"/-"</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NaBL2-ModuleId_27_3" title="a definition with multiple references" data-urls="#NaBL2-ModuleId line 10_13, 19_33, 23_42, 37_3">NaBL2-ModuleId</button> = {<a href="#NaBL2-ModuleIdPart_28_3" id="NaBL2-ModuleIdPart_27_21" title="a reference to a single-file definition">NaBL2-ModuleIdPart</a> <span class="cons_Lit">"/"</span>}+
  <a href="#NaBL2-ModuleIdPart_27_21" id="NaBL2-ModuleIdPart_28_3" title="a definition with a single reference">NaBL2-ModuleIdPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]*
  <button class="modal-open" id="NaBL2-ModuleId_29_3" title="a definition with multiple references" data-urls="#NaBL2-ModuleId line 10_13, 19_33, 23_42, 37_3">NaBL2-ModuleId</button> = <a href="#NaBL2-SectionKeyword_33_3" id="NaBL2-SectionKeyword_29_20" title="a reference to a single-file definition">NaBL2-SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <span id="NaBL2-RuleId_31_3" title="a definition with no references">NaBL2-RuleId</span> = <a href="#NaBL2-SectionKeyword_33_3" id="NaBL2-SectionKeyword_31_18" title="a reference to a single-file definition">NaBL2-SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <button class="modal-open" id="NaBL2-SectionKeyword_33_3" title="a definition with multiple references" data-urls="#NaBL2-SectionKeyword line 29_20, 31_18">NaBL2-SectionKeyword</button> = <span class="cons_Lit">"imports"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-ModuleId_27_3" id="NaBL2-ModuleId_37_3" title="a reference to a single-file definition">NaBL2-ModuleId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
