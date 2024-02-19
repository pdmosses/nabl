---
title: Modules.sdf3
hide:
  - toc
---

# `Modules.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/Modules_1_8" title="a definition with multiple references" data-urls="../Namespaces.sdf3/#core/Modules line 6_3; ../../NameBindingLanguage.sdf3/#core/Modules line 11_3">core/Modules</button>

<span class="keyword">context-free syntax</span>

  <a href="../../NameBindingLanguage.sdf3/#Module_22_11" id="Module_5_3" title="a definition with a single reference">Module</a>.<span class="cons_Constructor"><span id="Module_5_10" title="a definition with no references">Module</span></span> = &lt;<span class="cons_String">module</span> &lt;<a href="#ModuleID_17_3" id="ModuleID_5_28" title="a reference to a single-file definition">ModuleID</a>&gt; 
    
    &lt;<a href="#ModuleSection_9_3" id="ModuleSection_7_6" title="a reference to a single-file definition">ModuleSection</a>*&gt;&gt; 
    
  <a href="#ModuleSection_7_6" id="ModuleSection_9_3" title="a definition with a single reference">ModuleSection</a>.<span class="cons_Constructor"><span id="Imports_9_17" title="a definition with no references">Imports</span></span> = &lt;
    <span class="cons_String">imports</span> &lt;<a href="#ImportModule_12_3" id="ImportModule_10_14" title="a reference to a single-file definition">ImportModule</a>*&gt;&gt; 
    
  <a href="#ImportModule_10_14" id="ImportModule_12_3" title="a definition with a single reference">ImportModule</a>.<span class="cons_Constructor"><span id="ImportWildcard_12_16" title="a definition with no references">ImportWildcard</span></span> = &lt;&lt;<a href="#ModuleID_17_3" id="ModuleID_12_35" title="a reference to a single-file definition">ModuleID</a>&gt;<span class="cons_String">/-</span>&gt; 
  <a href="#ImportModule_10_14" id="ImportModule_13_3" title="a definition with a single reference">ImportModule</a>.<span class="cons_Constructor"><span id="Import_13_16" title="a definition with no references">Import</span></span> = &lt;&lt;<a href="#ModuleID_17_3" id="ModuleID_13_27" title="a reference to a single-file definition">ModuleID</a>&gt;&gt; 

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="ModuleID_17_3" title="a definition with multiple references" data-urls="#ModuleID line 5_28, 12_35, 13_27, 25_3">ModuleID</button> = {<a href="#ModuleIDPart_18_3" id="ModuleIDPart_17_15" title="a reference to a single-file definition">ModuleIDPart</a> <span class="cons_Lit">"/"</span>}+ 
  <a href="#ModuleIDPart_17_15" id="ModuleIDPart_18_3" title="a definition with a single reference">ModuleIDPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* 
  <button class="modal-open" id="ModuleID_19_3" title="a definition with multiple references" data-urls="#ModuleID line 5_28, 12_35, 13_27, 25_3">ModuleID</button> = <a href="#SectionKeyword_21_3" id="SectionKeyword_19_14" title="a reference to a single-file definition">SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#SectionKeyword_19_14" id="SectionKeyword_21_3" title="a definition with a single reference">SectionKeyword</a> = <span class="cons_Lit">"imports"</span> 

<span class="keyword">lexical restrictions</span>

  <a href="#ModuleID_17_3" id="ModuleID_25_3" title="a reference to a single-file definition">ModuleID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
